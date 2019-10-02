package Controllers;

import java.util.ArrayList;

import javax.swing.JList;
import javax.swing.JOptionPane;

import STATICS.STATICS;
import beans.Aposta;
import beans.Usuario;

public class CadastrarUsuario {

	public CadastrarUsuario(String username, String name, char[] password, char[] password2, JList<String> list) {
		String user = username.trim();
		String nome = name.trim();
		String pss = String.valueOf(password).trim();
		String pssConfirm = String.valueOf(password2).trim();

		if (STATICS.USERS.containsKey(user)) {
			JOptionPane.showMessageDialog(null, "Usuario ja existente!!");
			return;
		}

		if (!pss.equals(pssConfirm) || user.equals("") || pss.equals("") || pssConfirm.equals("") || nome.equals("")
				|| list.getSelectedIndex() == -1) {
			JOptionPane.showMessageDialog(null, "Informe todas informa��es necessarias!!");
			return;
		}

		Usuario usuario = new Usuario();
		usuario.setUsuario(user);
		usuario.setNome(nome);
		usuario.setSenha(pss);
		usuario.setGrupo(STATICS.GRUPOS.get(list.getSelectedIndex()));
		usuario.setEliminatoria(new ArrayList<Aposta>());
		usuario.setSemifinal(new ArrayList<Aposta>());

		STATICS.USERS.put(user, usuario);

		JOptionPane.showMessageDialog(null, "Cadastrado com sucesso");

	}

}
