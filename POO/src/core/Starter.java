package core;

import java.util.ArrayList;
import java.util.HashMap;

import STATICS.AutoFill;
import STATICS.STATICS;
import beans.Grupo;
import beans.Jogo;
import beans.Usuario;
import telas.Login;

public class Starter {
	public static void main(String[] args) {
		STATICS.USERS = new HashMap<String, Usuario>();
		STATICS.TIMES = new ArrayList<String>();
		STATICS.GRUPOS = new ArrayList<Grupo>();
		STATICS.TIMES = new ArrayList<String>();
		STATICS.JOGOS = new ArrayList<Jogo>();
		STATICS.SEMI_FINAL = new ArrayList<Jogo>();
		
		new AutoFill();
		
		Login login = new Login();
		login.setVisible(true);
	}
}
