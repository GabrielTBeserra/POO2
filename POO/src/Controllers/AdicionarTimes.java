package Controllers;

import javax.swing.JOptionPane;

import STATICS.STATICS;

public class AdicionarTimes {
	public AdicionarTimes() {
		if (STATICS.NOME_TORNEIO == null) {
			JOptionPane.showMessageDialog(null, "Necessario definir o torneio");
			return;
		}

		if (STATICS.TIMES.size() == 8) {
			JOptionPane.showMessageDialog(null, "Limite de times atingido");
			return;
		}
		String nomeTime = null;
		try {
			nomeTime = JOptionPane.showInputDialog(null, "Informe o nome do time " + STATICS.TIMES.size()).trim();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

		if (nomeTime.equals("") || nomeTime == null) {
			return;
		}

		STATICS.TIMES.add(nomeTime);

		JOptionPane.showMessageDialog(null, "Time adicionado com sucesso!");
	}
}
