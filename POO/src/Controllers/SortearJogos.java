package Controllers;

import java.util.Collections;

import javax.swing.JOptionPane;

import STATICS.STATICS;
import beans.Jogo;
import telas.Tabela;

public class SortearJogos {
	public SortearJogos() {
		if (STATICS.TIMES.size() < 8) {
			JOptionPane.showMessageDialog(null, "Limite minimo de times nao atingido", "Error",
					JOptionPane.ERROR_MESSAGE, null);
			return;
		}

		Collections.shuffle(STATICS.TIMES);

		Jogo jogo = new Jogo();
		jogo.setTime1(STATICS.TIMES.get(0));
		jogo.setTime2(STATICS.TIMES.get(1));
		STATICS.JOGOS.add(jogo);
		Jogo jogo2 = new Jogo();
		jogo2.setTime1(STATICS.TIMES.get(2));
		jogo2.setTime2(STATICS.TIMES.get(3));
		STATICS.JOGOS.add(jogo2);
		Jogo jogo3 = new Jogo();
		jogo3.setTime1(STATICS.TIMES.get(4));
		jogo3.setTime2(STATICS.TIMES.get(5));
		STATICS.JOGOS.add(jogo3);
		Jogo jogo4 = new Jogo();
		jogo4.setTime1(STATICS.TIMES.get(6));
		jogo4.setTime2(STATICS.TIMES.get(7));
		STATICS.JOGOS.add(jogo4);

		new Tabela().setVisible(true);

	}
}
