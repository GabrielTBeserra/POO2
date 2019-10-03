package STATICS;

import java.util.ArrayList;
import java.util.HashMap;

import beans.Aposta;
import beans.Grupo;
import beans.Jogo;
import beans.Usuario;

public class AutoFill {
	public AutoFill() {
		STATICS.USERS = new HashMap<String, Usuario>();
		STATICS.TIMES = new ArrayList<String>();
		STATICS.GRUPOS = new ArrayList<Grupo>();
		STATICS.TIMES = new ArrayList<String>();
		STATICS.JOGOS = new ArrayList<Jogo>();
		STATICS.SEMI_FINAL = new ArrayList<Jogo>();
		STATICS.FINAL = new ArrayList<Jogo>();
		STATICS.ELIMINATORIA = false;
		STATICS.ELIMINATORIA_SEMI = false;
		STATICS.ELIMINATORIA_FINAL = false;
		STATICS.RESULTADO = false;
		STATICS.CAMPEAO = null;
		
		Usuario admin = new Usuario();
		admin.setNome("admin");
		admin.setSenha("admin");
		admin.setUsuario("admin");
		admin.setSemifinal(new ArrayList<Aposta>());
		admin.setEliminatoria(new ArrayList<Aposta>());
		admin.setApostaFinal(new Aposta());
		
		admin.setGrupo(new Grupo());

		STATICS.USERS.put("admin", admin);

		STATICS.TIMES.add("Time 1");
		STATICS.TIMES.add("Time 2");
		STATICS.TIMES.add("Time 3");
		STATICS.TIMES.add("Time 4");
		STATICS.TIMES.add("Time 5");
		STATICS.TIMES.add("Time 6");
		STATICS.TIMES.add("Time 7");
		STATICS.TIMES.add("Time 8");

		STATICS.NOME_TORNEIO = "TORNEIO";
	}
}
