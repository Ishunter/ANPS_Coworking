package control;

import javax.swing.JOptionPane;

public class CtrlUtil {

	private static CtrlUtil instance = null;

	private CtrlUtil() {
	}

	public static CtrlUtil getInstance() {
		if (instance == null) {
			instance = new CtrlUtil();
		}
		return instance;
	}

	public boolean PanelYesOrNo(String msg, String title) {
		Object[] options = {"Sim", "Não"};
		int answer = JOptionPane.showOptionDialog(null,
			msg,
			title,
			JOptionPane.DEFAULT_OPTION,
			JOptionPane.QUESTION_MESSAGE,
			null,
			options,
			options[0]);
		return answer == 0;
	}
}
