package Controllers;

import javax.swing.JOptionPane;

import STATICS.STATICS;
import beans.Usuario;
import telas.Tabela;

public class AbrirTabela {
	public AbrirTabela(Usuario usuario) {
		if (!STATICS.ELIMINATORIA) {
			JOptionPane.showMessageDialog(null, "Tabela ainda nao definida", "Error", JOptionPane.ERROR_MESSAGE, null);
			return;
		}
		Tabela tabela = new Tabela();
		tabela.setVisible(true);
		tabela.setUsuario(usuario);
	}
}
