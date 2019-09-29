package Controllers;

import javax.swing.JOptionPane;

import STATICS.STATICS;

public class NomeTorneio {
	public NomeTorneio() {
		if (STATICS.NOME_TORNEIO != null) {
			JOptionPane.showMessageDialog(null, "Nome ja definido!");
			return;
		}

		String nomeDoTorneio = JOptionPane.showInputDialog(null, "Informe o nome torneio");

		STATICS.NOME_TORNEIO = nomeDoTorneio;
		JOptionPane.showMessageDialog(null, "Torneio definido!");
	}
}
