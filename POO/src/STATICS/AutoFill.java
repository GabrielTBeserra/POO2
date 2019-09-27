package STATICS;

import beans.Grupo;
import beans.Usuario;

public class AutoFill {
	public AutoFill() {
		Usuario admin = new Usuario();
		admin.setNome("admin");
		admin.setSenha("admin");
		admin.setUsuario("admin");
		admin.setGrupo(new Grupo());
		
		STATICS.USERS.put("admin", admin);
		
		
		STATICS.TIMES.add("Time 1");
		STATICS.TIMES.add("Time 2");
		STATICS.TIMES.add("Time 3");
		STATICS.TIMES.add("Time 4");
		STATICS.TIMES.add("Time 5");
		STATICS.TIMES.add("Time 6");

		
		System.out.println(STATICS.NOME_TORNEIO);
		
		
		
	}
}
