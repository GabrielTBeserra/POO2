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
		
		new AutoFill();

		Login login = new Login();
		login.setVisible(true);
	}
}
