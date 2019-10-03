package telas;

import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

import STATICS.STATICS;
import beans.Usuario;

public class Tabela extends JFrame {
	public Tabela() {
	}

	private Usuario usuario;

	private JPanel contentPane;

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public void abrirTela() {
		this.setVisible(true);
	}

	public void carregarTabela() {
		List<String> times = STATICS.TIMES;

		setResizable(false);
		setTitle("TABELA");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 766, 438);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JTextPane time1 = new JTextPane();
		time1.setEditable(false);
		time1.setBounds(10, 30, 77, 20);
		contentPane.add(time1);
		time1.setText(times.get(0));

		JTextPane time2 = new JTextPane();
		time2.setEditable(false);
		time2.setBounds(10, 61, 77, 20);
		contentPane.add(time2);
		time2.setText(times.get(1));

		JLabel lblX = new JLabel("X");
		lblX.setBounds(45, 50, 20, 14);
		contentPane.add(lblX);

		JTextPane time3 = new JTextPane();
		time3.setEditable(false);
		time3.setBounds(10, 111, 77, 20);
		contentPane.add(time3);
		time3.setText(times.get(2));

		JLabel label_1 = new JLabel("X");
		label_1.setBounds(45, 131, 20, 14);
		contentPane.add(label_1);

		JTextPane time4 = new JTextPane();
		time4.setEditable(false);
		time4.setBounds(10, 142, 77, 20);
		contentPane.add(time4);
		time4.setText(times.get(3));

		JTextPane time5 = new JTextPane();
		time5.setEditable(false);
		time5.setBounds(10, 261, 77, 20);
		contentPane.add(time5);
		time5.setText(times.get(4));

		JLabel label_2 = new JLabel("X");
		label_2.setBounds(45, 281, 20, 14);
		contentPane.add(label_2);

		JTextPane time6 = new JTextPane();
		time6.setEditable(false);
		time6.setBounds(10, 292, 77, 20);
		contentPane.add(time6);
		time6.setText(times.get(5));

		JTextPane time7 = new JTextPane();
		time7.setEditable(false);
		time7.setBounds(10, 339, 77, 20);
		contentPane.add(time7);
		time7.setText(times.get(6));

		JLabel label_3 = new JLabel("X");
		label_3.setBounds(45, 359, 20, 14);
		contentPane.add(label_3);

		JTextPane time8 = new JTextPane();
		time8.setEditable(false);
		time8.setBounds(10, 370, 77, 20);
		contentPane.add(time8);
		time8.setText(times.get(7));

		JLabel label_5 = new JLabel("X");
		label_5.setBounds(171, 100, 12, 14);
		contentPane.add(label_5);

		try {
			JTextPane semi1 = new JTextPane();
			semi1.setEditable(false);
			semi1.setBounds(136, 80, 77, 20);
			contentPane.add(semi1);
			semi1.setText(STATICS.SEMI_FINAL.get(0).getTime1());

			JTextPane semi2 = new JTextPane();
			semi2.setEditable(false);
			semi2.setBounds(136, 111, 77, 20);
			contentPane.add(semi2);
			semi2.setText(STATICS.SEMI_FINAL.get(0).getTime2());

			JTextPane semi3 = new JTextPane();
			semi3.setEditable(false);
			semi3.setBounds(136, 308, 77, 20);
			contentPane.add(semi3);
			semi3.setText(STATICS.SEMI_FINAL.get(1).getTime1());

			JTextPane semi4 = new JTextPane();
			semi4.setEditable(false);
			semi4.setBounds(136, 339, 77, 20);
			contentPane.add(semi4);
			semi4.setText(STATICS.SEMI_FINAL.get(1).getTime2());

		} catch (Exception e) {
			JTextPane semi1 = new JTextPane();
			semi1.setEditable(false);
			semi1.setBounds(136, 80, 77, 20);
			contentPane.add(semi1);
			semi1.setText("");

			JTextPane semi2 = new JTextPane();
			semi2.setEditable(false);
			semi2.setBounds(136, 111, 77, 20);
			contentPane.add(semi2);
			semi2.setText("");

			JTextPane semi3 = new JTextPane();
			semi3.setEditable(false);
			semi3.setBounds(136, 308, 77, 20);
			contentPane.add(semi3);
			semi3.setText("");

			JTextPane semi4 = new JTextPane();
			semi4.setEditable(false);
			semi4.setBounds(136, 339, 77, 20);
			contentPane.add(semi4);
			semi4.setText("");
		}
		JLabel label_4 = new JLabel("X");
		label_4.setBounds(291, 208, 12, 14);
		contentPane.add(label_4);

		JLabel label_6 = new JLabel("X");
		label_6.setBounds(171, 328, 12, 14);
		contentPane.add(label_6);

		JLabel label_12 = new JLabel("New label");
		label_12.setBounds(10, 370, 77, 20);
		contentPane.add(label_12);

		try {
			JTextPane final1 = new JTextPane();
			final1.setEditable(false);
			final1.setBounds(256, 219, 77, 20);
			contentPane.add(final1);
			final1.setText(STATICS.FINAL.get(0).getTime2());

			JTextPane final2 = new JTextPane();
			final2.setEditable(false);
			final2.setBounds(256, 188, 77, 20);
			contentPane.add(final2);
			final2.setText(STATICS.FINAL.get(0).getTime1());

		} catch (Exception e) {
			JTextPane final1 = new JTextPane();
			final1.setEditable(false);
			final1.setBounds(256, 219, 77, 20);
			contentPane.add(final1);
			final1.setText("");

			JTextPane final2 = new JTextPane();
			final2.setEditable(false);
			final2.setBounds(256, 188, 77, 20);
			contentPane.add(final2);
			final2.setText("");
		}

		try {
			JTextPane campeao = new JTextPane();
			campeao.setText((String) null);
			campeao.setEditable(false);
			campeao.setBounds(504, 208, 77, 20);
			contentPane.add(campeao);
			campeao.setText(STATICS.CAMPEAO);
		} catch (Exception e) {
			JTextPane campeao = new JTextPane();
			campeao.setText((String) null);
			campeao.setEditable(false);
			campeao.setBounds(391, 202, 77, 20);
			contentPane.add(campeao);
			campeao.setText("");
		}

		System.out.println(usuario);
		if (this.usuario != null && STATICS.ELIMINATORIA_SEMI) {

			JLabel lblNewLabel = new JLabel(gerarPLacar(0));
			lblNewLabel.setBounds(93, 50, 210, 14);
			contentPane.add(lblNewLabel);

			JLabel label = new JLabel(gerarPLacar(1));
			label.setBounds(97, 131, 210, 14);
			contentPane.add(label);

			JLabel label_7 = new JLabel(gerarPLacar(2));
			label_7.setBounds(93, 281, 210, 14);
			contentPane.add(label_7);

			JLabel label_8 = new JLabel(gerarPLacar(3));
			label_8.setBounds(93, 359, 210, 14);
			contentPane.add(label_8);

		}

		if (this.usuario != null && STATICS.ELIMINATORIA_FINAL) {
			JLabel label_10 = new JLabel(gerarPLacarSemi(0));
			label_10.setBounds(279, 95, 210, 14);
			contentPane.add(label_10);

			JLabel label_11 = new JLabel(gerarPLacarSemi(1));
			label_11.setBounds(279, 323, 210, 14);
			contentPane.add(label_11);

		}

		if (this.usuario != null && STATICS.RESULTADO) {
			JLabel label_9 = new JLabel(gerarPLacarFinal(0));
			label_9.setBounds(332, 208, 210, 14);
			contentPane.add(label_9);
		}

	}

	private String gerarPLacar(int index) {
		int resul1 = STATICS.JOGOS.get(index).getPontosTime1();
		int resul2 = STATICS.JOGOS.get(index).getPontosTime2();
		int aposta1 = usuario.getEliminatoria().get(index).getPlacar1();
		int aposta2 = usuario.getEliminatoria().get(index).getPlacar2();

		atualizarPontos(resul1, resul2, aposta1, aposta2);
		return "Resultado: " + resul1 + " X " + resul2 + " Aposta: " + aposta1 + "X" + aposta2;
	}

	private String gerarPLacarSemi(int index) {
		int resul1 = STATICS.SEMI_FINAL.get(index).getPontosTime1();
		int resul2 = STATICS.SEMI_FINAL.get(index).getPontosTime2();
		int aposta1 = usuario.getSemifinal().get(index).getPlacar1();
		int aposta2 = usuario.getSemifinal().get(index).getPlacar2();

		atualizarPontos(resul1, resul2, aposta1, aposta2);

		return "Resultado: " + resul1 + " X " + resul2 + " Aposta: " + aposta1 + "X" + aposta2;

	}

	private String gerarPLacarFinal(int index) {
		int resul1 = STATICS.FINAL.get(index).getPontosTime1();
		int resul2 = STATICS.FINAL.get(index).getPontosTime2();
		int aposta1 = usuario.getApostaFinal().getPlacar1();
		int aposta2 = usuario.getApostaFinal().getPlacar2();

		atualizarPontos(resul1, resul2, aposta1, aposta2);
		return "Resultado: " + resul1 + " X " + resul2 + " Aposta: " + aposta1 + "X" + aposta2;

	}

	private void atualizarPontos(int resul1, int resul2, int aposta1, int aposta2) {
		
		if (resul1 == aposta1 && resul2 == aposta2) {
			int pontos = usuario.getPontuacao();
			usuario.setPontuacao(pontos += 10);
		}
		
		if(resul1 > resul2) {
			if(aposta1 > aposta2) {
				int pontos = usuario.getPontuacao();
				usuario.setPontuacao(pontos += 5);
			}
		}
		if(resul2 > resul1) {
			if(aposta2 > aposta1) {
				int pontos = usuario.getPontuacao();
				usuario.setPontuacao(pontos += 5);
			}
		}
		
	}
}
