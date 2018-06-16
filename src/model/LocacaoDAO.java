package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class LocacaoDAO {

	private static LocacaoDAO instance = null;

	private LocacaoDAO() {
	}

	public static LocacaoDAO getInstance() {
		if (instance == null) {
			instance = new LocacaoDAO();
		}
		return instance;
	}

	public void create(Locacao locacao) {
		Connection conn = control.ConexaoBD.getConnection();
		
		String sql = "INSERT INTO public.locacao(datafinal, datainicial, qtdestacoeslocadas, funcionario, cliente, ambiente) VALUES (?, ?, ?, ?, ?, ?)";
		try (PreparedStatement query = conn.prepareStatement(sql)) {
			query.setString(1, locacao.getDataFinal());
			query.setString(2, locacao.getDataInicial());
			query.setInt(3, locacao.getQtdEstacoesLocadas());
			query.setInt(4, locacao.getFuncionario().getLogin());
			query.setString(5, locacao.getCliente().getCpf());
			query.setString(6, locacao.getAmbiente().getNome());
			query.execute();
			if (!locacao.getRecurso().isEmpty()) {
				RlRecursosCreate(locacao);
			}
		} catch (SQLException ex) {
			RlRecursosDelete(locacao);
			System.err.println("LocacaoDAO.create() -> " + ex.getMessage());
			JOptionPane.showMessageDialog(null, "Problema ao inserir locação no banco.");
		}
	}

	public Locacao read(String cliente, String ambiente) {
		Connection conn = control.ConexaoBD.getConnection();

		String sql = "SELECT * FROM public.locacao WHERE cliente = ? and ambiente = ?";
		try (PreparedStatement query = conn.prepareStatement(sql)) {
			query.setString(1, cliente);
			query.setString(2, ambiente);
			ResultSet rs = query.executeQuery();
			if (rs.next()) {
				Locacao l = new Locacao();
				l.setDataFinal(rs.getString("datafinal"));
				l.setDataInicial(rs.getString("datainicial"));
				l.setQtdEstacoesLocadas(rs.getInt("qtdestacoeslocadas"));
				l.setFuncionario(FuncionarioDAO.getInstance().read(rs.getInt("funcionario")));
				l.setCliente(ClienteDAO.getInstance().read(rs.getString("cliente")));
				l.setAmbiente(AmbienteDAO.getInstance().read(rs.getString("ambiente")));
				l.setRecurso(RlRecursosGetAll(cliente,ambiente));
				return l;
			}
		} catch (SQLException ex) {
			System.err.println("LocacaoDAO.read() -> " + ex.getMessage());
			JOptionPane.showMessageDialog(null, "Problema ao ler locação do banco.");
		}
		return null;
	}

	public void update(Locacao locacao) {
		Connection conn = control.ConexaoBD.getConnection();

		String sql = "UPDATE public.locacao SET datafinal=?, datainicial=?, qtdestacoeslocadas=?, funcionario=? WHERE cliente=? and ambiente=?";
		try (PreparedStatement query = conn.prepareStatement(sql)) {
			query.setString(1, locacao.getDataFinal());
			query.setString(2, locacao.getDataInicial());
			query.setInt(3, locacao.getQtdEstacoesLocadas());
			query.setInt(4, locacao.getFuncionario().getLogin());
			query.setString(5, locacao.getCliente().getCpf());
			query.setString(6, locacao.getAmbiente().getNome());
			query.execute();
			RlRecursosDelete(locacao);
			RlRecursosCreate(locacao);
		} catch (SQLException ex) {
			System.err.println("LocacaoDAO.update() -> " + ex.getMessage());
			JOptionPane.showMessageDialog(null, "Problema ao atualizar locação no banco.");
		}
	}

	public ArrayList<Locacao> getAll() {
		Connection conn = control.ConexaoBD.getConnection();
		ArrayList<Locacao> r = new ArrayList<>();

		String sql = "SELECT (cliente, ambiente) FROM public.locacao";
		try (PreparedStatement query = conn.prepareStatement(sql)) {
			ResultSet rs = query.executeQuery();
			while (rs.next()) {
				r.add(this.read(rs.getString("cliente"), rs.getString("ambiente")));
			}
		} catch (SQLException ex) {
			System.err.println("LocacaoDAO.getAll() -> " + ex.getMessage());
			JOptionPane.showMessageDialog(null, "Problema ao listar todos locação do banco.");
		}
		return r;
	}
	
	private void RlRecursosCreate(Locacao locacao) {
		// TODO: fazer uma query - pode gerar incosistencia se der pau em uma transação no meio
		Connection conn = control.ConexaoBD.getConnection();
		for (Recurso r : locacao.getRecurso()) {
			String sql = "INSERT INTO public.rl_recursos (cliente, ambiente, recurso) VALUES (?, ?, ?)";
			try (PreparedStatement queryRecursos = conn.prepareStatement(sql)) {
				queryRecursos.setString(1, locacao.getCliente().getCpf());
				queryRecursos.setString(2, locacao.getAmbiente().getNome());
				queryRecursos.setString(3, r.getNome());
				queryRecursos.execute();
			} catch (SQLException ex) {
				System.err.println("LocacaoDAO.RlRecursosCreate() -> " + ex.getMessage());
				JOptionPane.showMessageDialog(null, "Problema ao inserir no banco.");
			}
		}
	}
	
	private void RlRecursosDelete(Locacao locacao){
		// TODO: fazer uma query
		Connection conn = control.ConexaoBD.getConnection();
		for (Recurso r : locacao.getRecurso()) {
			String sql = "DELETE FROM public.rl_recursos WHERE cliente=? and ambiente=? and recurso=?";
			try (PreparedStatement queryRecursos = conn.prepareStatement(sql)) {
				queryRecursos.setString(1, locacao.getCliente().getCpf());
				queryRecursos.setString(2, locacao.getAmbiente().getNome());
				queryRecursos.setString(3, r.getNome());
			} catch (SQLException ex) {
				System.err.println("LocacaoDAO.RlRecursosDelete() -> " + ex.getMessage());
				JOptionPane.showMessageDialog(null, "Problema ao deletar do banco.");
			}
		}
	}
	
	private ArrayList<Recurso> RlRecursosGetAll(String cliente, String ambiente){
		Connection conn = control.ConexaoBD.getConnection();
        ArrayList<Recurso> r = new ArrayList<>();

        String sql = "SELECT * FROM public.rl_recursos WHERE cliente=? and ambiente=? ";
        try (PreparedStatement queryRecursos = conn.prepareStatement(sql)) {
			queryRecursos.setString(1, cliente);
			queryRecursos.setString(2, ambiente);
            ResultSet rs = queryRecursos.executeQuery();
            while (rs.next()) {
                r.add(RecursoDAO.getInstance().read(rs.getString("recurso")));
            }
        } catch (SQLException ex) {
            System.err.println("locacaoDAO.RlRecursosGetAll() -> " + ex.getMessage());
            JOptionPane.showMessageDialog(null, "Problema ao ler recurso do banco.");
        }
        return r;
	}
}
