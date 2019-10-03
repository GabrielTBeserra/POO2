package Controllers;

import java.util.Random;

import javax.swing.JOptionPane;

import STATICS.STATICS;
import beans.Jogo;
import telas.Tabela;

public class DefinirCampeao {
	public DefinirCampeao() {
		if (STATICS.RESULTADO) {
			JOptionPane.showMessageDialog(null, "O torneio ja terminou", "Error", JOptionPane.ERROR_MESSAGE, null);
			Tabela tabela = new Tabela();
			tabela.carregarTabela();
			tabela.abrirTela();
			return;
		}

		if (STATICS.FINAL.size() < 1) {
			JOptionPane.showMessageDialog(null, "Tabela ainda nao completa", "Error", JOptionPane.ERROR_MESSAGE, null);
			return;
		}
		Random valorAleatorio = new Random();

		Jogo jogo = STATICS.FINAL.get(0);

		jogo.setPontosTime1(valorAleatorio.nextInt(10));
		jogo.setPontosTime2(valorAleatorio.nextInt(10));

		System.out.println(jogo.getPontosTime1());
		System.out.println(jogo.getPontosTime2());

		if (jogo.getPontosTime1() > jogo.getPontosTime2()) {
			STATICS.CAMPEAO = jogo.getTime1();
		} else {
			STATICS.CAMPEAO = jogo.getTime2();
		}

		STATICS.RESULTADO = true;

		Tabela tabela = new Tabela();
		tabela.carregarTabela();
		tabela.abrirTela();
	}
}
