package Controllers;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import STATICS.STATICS;
import beans.Grupo;
import beans.Usuario;

public class AdicionarGrupos {
	public AdicionarGrupos() {
		if (STATICS.GRUPOS.size() == 5) {
			JOptionPane.showMessageDialog(null, "Limite de grupos atingido");
			return;
		}

		String nomeGrupo = JOptionPane.showInputDialog(null, "Informe o nome do grupo " + STATICS.GRUPOS.size());

		Grupo grupo = new Grupo();
		grupo.setUsuario(new ArrayList<Usuario>());
		grupo.setNome(nomeGrupo);

		STATICS.GRUPOS.add(grupo);
		JOptionPane.showMessageDialog(null, "Grupo adicionado com sucesso!");
	}
}
