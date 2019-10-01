package Controllers;

import javax.swing.JOptionPane;

import STATICS.STATICS;
import telas.Tabela;

public class AbrirTabela {
	public AbrirTabela() {
		if (!STATICS.ELIMINATORIA) {
			JOptionPane.showMessageDialog(null, "Tabela ainda nao definida", "Error", JOptionPane.ERROR_MESSAGE, null);
			return;
		}
		new Tabela().setVisible(true);
	}
}
