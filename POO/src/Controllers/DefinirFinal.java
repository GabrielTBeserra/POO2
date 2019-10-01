package Controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JOptionPane;

import STATICS.STATICS;
import beans.Jogo;
import telas.Tabela;

public class DefinirFinal {
	public DefinirFinal() {
		if (STATICS.ELIMINATORIA_FINAL) {
			JOptionPane.showMessageDialog(null, "final ja reportada", "Error", JOptionPane.ERROR_MESSAGE, null);
			return;
		}

		Random valorAleatorio = new Random();

		for (Jogo jogo : STATICS.SEMI_FINAL) {
			jogo.setPontosTime1(valorAleatorio.nextInt(10));
			jogo.setPontosTime2(valorAleatorio.nextInt(10));
		}

		List<String> semi = new ArrayList<String>();

		for (Jogo jogo : STATICS.SEMI_FINAL) {
			if (jogo.getPontosTime1() > jogo.getPontosTime2()) {
				semi.add(jogo.getTime1());
			} else {
				semi.add(jogo.getTime2());
			}
		}

		Jogo jogo = new Jogo();
		jogo.setTime1(semi.get(0));
		jogo.setTime2(semi.get(1));
		STATICS.FINAL.add(jogo);

		STATICS.ELIMINATORIA_FINAL = true;

		new Tabela().setVisible(true);
	}
}
