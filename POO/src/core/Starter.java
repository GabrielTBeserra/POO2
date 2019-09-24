package core;

import java.util.HashMap;

import beans.Usuario;
import statics.statics;
import telas.Login;

public class Starter {
	public static void main(String[] args) {
		statics.users = new HashMap<String, Usuario>();

		Usuario admin = new Usuario();
		admin.setNome("admin");
		admin.setSenha("admin");
		admin.setUsuario("admin");
		admin.setAdmin(true);

		statics.users.put("admin", admin);

		Usuario teste = new Usuario();
		teste.setNome("teste");
		teste.setSenha("teste");
		teste.setUsuario("teste");
		teste.setAdmin(false);

		statics.users.put("teste", teste);
		
		Login login = new Login();
		login.setVisible(true);
	}
}
