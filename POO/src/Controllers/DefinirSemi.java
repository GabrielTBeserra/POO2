package Controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JOptionPane;

import STATICS.STATICS;
import beans.Jogo;
import telas.Tabela;

public class DefinirSemi {
	public DefinirSemi() {

		if (STATICS.ELIMINATORIA_SEMI) {
			JOptionPane.showMessageDialog(null, "Semi ja reportada", "Error", JOptionPane.ERROR_MESSAGE, null);
			return;
		}

		if (STATICS.JOGOS.size() < 1) {
			JOptionPane.showMessageDialog(null, "Tabela ainda nao completa", "Error", JOptionPane.ERROR_MESSAGE, null);
			return;
		}

		Random valorAleatorio = new Random();

		for (Jogo jogo : STATICS.JOGOS) {
			jogo.setPontosTime1(valorAleatorio.nextInt(10));
			jogo.setPontosTime2(valorAleatorio.nextInt(10));
		}

		List<String> semi = new ArrayList<String>();

		for (Jogo jogo : STATICS.JOGOS) {
			if (jogo.getPontosTime1() > jogo.getPontosTime2()) {
				semi.add(jogo.getTime1());
			} else {
				semi.add(jogo.getTime2());
			}
		}

		Jogo jogo = new Jogo();
		jogo.setTime1(semi.get(0));
		jogo.setTime2(semi.get(1));
		STATICS.SEMI_FINAL.add(jogo);
		Jogo jogo2 = new Jogo();
		jogo2.setTime1(semi.get(2));
		jogo2.setTime2(semi.get(3));
		STATICS.SEMI_FINAL.add(jogo2);

		STATICS.ELIMINATORIA_SEMI = true;

		Tabela tabela = new Tabela();
		tabela.carregarTabela();
		tabela.abrirTela();
	}
}
