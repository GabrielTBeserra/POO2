package telas;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controllers.AbrirTabela;
import Controllers.AdicionarGrupos;
import Controllers.AdicionarTimes;
import Controllers.DefinirCampeao;
import Controllers.DefinirFinal;
import Controllers.DefinirSemi;
import Controllers.NomeTorneio;
import Controllers.SortearJogos;
import STATICS.STATICS;
import beans.Aposta;
import beans.Usuario;
import javax.swing.JSpinner;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

public class Menu extends JFrame {

	private JPanel contentPane;
	private JLabel lblEliTime1;
	private JLabel lblEliTime12;
	private JLabel lblEliTime2;
	private JLabel lblEliTime13;
	private JLabel lblEliTime22;
	private JLabel lblEliTime23;
	private JLabel lblEliTime14;
	private JLabel lblEliTIme24;
	private JLabel lblSemiTime1;
	private JLabel lblSimeTime2;
	private JLabel lblSemiTime12;
	private JLabel lblSemiTime22;
	private JLabel lblFinalTime1;
	private JLabel lblFInalTime2;

	public Menu(Usuario usuario) {
		setResizable(false);
		setTitle("MENU");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 519, 618);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnTeste = new JMenu("OP\u00C7\u00D4ES");
		menuBar.add(mnTeste);

		JMenuItem btnAdicionarGrupos = new JMenuItem("Adicionar grupo");
		JMenuItem btnDefinirNomeTorneio = new JMenuItem("Definir nome torneio");
		JMenuItem btnAdicionarTimes = new JMenuItem("Adicionar time");
		JMenuItem btnSortearEliminatoria = new JMenuItem("Eliminatoria");
		JMenuItem btnSortearSemiFinal = new JMenuItem("Semi final");
		JMenuItem btnSair = new JMenuItem("Sair");
		JMenuItem btnTabela = new JMenuItem("Tabela");
		JMenuItem btnResultado = new JMenuItem("Resultado");
		JMenuItem btnSortearFinal = new JMenuItem("Final");
		JMenu abaAdmin = new JMenu("ADMIN");

		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				Login login = new Login();
				login.setVisible(true);
				setVisible(false);
				dispose();
			}
		});

		btnTabela.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				new AbrirTabela(usuario);
			}
		});

		btnAdicionarGrupos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				new AdicionarGrupos();
			}
		});

		btnAdicionarTimes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				new AdicionarTimes();
			}
		});

		btnDefinirNomeTorneio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				new NomeTorneio();
			}
		});

		btnSortearEliminatoria.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				new SortearJogos();
			}
		});

		btnSortearSemiFinal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				new DefinirSemi();
			}
		});

		btnSortearFinal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				new DefinirFinal();

			}
		});

		btnResultado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				new DefinirCampeao();
			}
		});

		abaAdmin.add(btnDefinirNomeTorneio);
		abaAdmin.add(btnAdicionarGrupos);
		abaAdmin.add(btnAdicionarTimes);
		abaAdmin.add(btnSortearEliminatoria);
		abaAdmin.add(btnSortearSemiFinal);
		abaAdmin.add(btnSortearFinal);
		mnTeste.add(btnTabela);
		menuBar.add(abaAdmin);
		abaAdmin.add(btnResultado);
		mnTeste.add(btnSair);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel(usuario.getNome());
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(37, 16, 105, 14);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Ola");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(10, 11, 29, 25);
		contentPane.add(lblNewLabel_1);

		JLabel lblSeuGrupo = new JLabel("Seu grupo:");
		lblSeuGrupo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSeuGrupo.setBounds(10, 45, 87, 25);
		contentPane.add(lblSeuGrupo);

		JLabel lblNewLabel_2 = new JLabel(usuario.getGrupo().getNome());
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(88, 45, 95, 25);
		contentPane.add(lblNewLabel_2);

		// ELIMINATORIA

		try {
			this.lblEliTime1 = new JLabel(STATICS.TIMES.get(0));
			this.lblEliTime2 = new JLabel(STATICS.TIMES.get(1));
			this.lblEliTime12 = new JLabel(STATICS.TIMES.get(2));
			this.lblEliTime22 = new JLabel(STATICS.TIMES.get(3));
			this.lblEliTime13 = new JLabel(STATICS.TIMES.get(4));
			this.lblEliTime23 = new JLabel(STATICS.TIMES.get(5));
			this.lblEliTime14 = new JLabel(STATICS.TIMES.get(6));
			this.lblEliTIme24 = new JLabel(STATICS.TIMES.get(7));
		} catch (Exception e) {
			this.lblEliTime1 = new JLabel("Nao definido");
			this.lblEliTime2 = new JLabel("Nao definido");
			this.lblEliTime12 = new JLabel("Nao definido");
			this.lblEliTime22 = new JLabel("Nao definido");
			this.lblEliTime13 = new JLabel("Nao definido");
			this.lblEliTime23 = new JLabel("Nao definido");
			this.lblEliTime14 = new JLabel("Nao definido");
			this.lblEliTIme24 = new JLabel("Nao definido");
		}

		JLabel lblEliJogo1 = new JLabel("Jogo 1");

		JSpinner eliSpinnerTime1 = new JSpinner();
		JSpinner eliSpinnerTime2 = new JSpinner();

		JLabel lblEliJogo2 = new JLabel("Jogo 2");

		JSpinner eliSpinnerTime12 = new JSpinner();
		JSpinner eliSpinnerTime22 = new JSpinner();

		JLabel lblEliJogo3 = new JLabel("Jogo 3");

		JSpinner eliSpinnerTime13 = new JSpinner();
		JSpinner eliSpinnerTime23 = new JSpinner();

		JLabel lblEliJogo4 = new JLabel("Jogo 4");

		JSpinner eliSpinnerTime14 = new JSpinner();
		JSpinner eliSpinnerTime24 = new JSpinner();

		lblEliJogo1.setBounds(12, 105, 66, 15);
		lblEliTime1.setBounds(12, 132, 66, 15);
		lblEliTime2.setBounds(139, 132, 66, 15);
		eliSpinnerTime1.setBounds(12, 156, 56, 20);
		eliSpinnerTime2.setBounds(139, 156, 56, 20);
		lblEliJogo2.setBounds(275, 105, 66, 15);
		lblEliTime12.setBounds(275, 132, 66, 15);
		eliSpinnerTime12.setBounds(275, 156, 56, 20);
		eliSpinnerTime22.setBounds(402, 156, 56, 20);
		lblEliTime22.setBounds(402, 132, 66, 15);
		lblEliJogo3.setBounds(10, 205, 66, 15);
		lblEliTime13.setBounds(10, 232, 66, 15);
		eliSpinnerTime13.setBounds(10, 256, 56, 20);
		eliSpinnerTime23.setBounds(137, 256, 56, 20);
		lblEliTime23.setBounds(137, 232, 66, 15);
		lblEliJogo4.setBounds(275, 205, 66, 15);
		lblEliTime14.setBounds(275, 232, 66, 15);
		eliSpinnerTime14.setBounds(275, 256, 56, 20);
		eliSpinnerTime24.setBounds(402, 256, 56, 20);
		lblEliTIme24.setBounds(402, 232, 66, 15);

		contentPane.add(lblEliTime1);
		contentPane.add(lblEliJogo1);
		contentPane.add(lblEliTime2);
		contentPane.add(eliSpinnerTime1);
		contentPane.add(eliSpinnerTime2);
		contentPane.add(lblEliJogo2);
		contentPane.add(lblEliTime12);
		contentPane.add(lblEliTime12);
		contentPane.add(eliSpinnerTime12);
		contentPane.add(lblEliTIme24);
		contentPane.add(eliSpinnerTime22);
		contentPane.add(eliSpinnerTime24);
		contentPane.add(eliSpinnerTime14);
		contentPane.add(lblEliTime14);
		contentPane.add(lblEliTime22);
		contentPane.add(lblEliJogo3);
		contentPane.add(lblEliTime13);
		contentPane.add(eliSpinnerTime23);
		contentPane.add(eliSpinnerTime13);
		contentPane.add(lblEliTime23);
		contentPane.add(lblEliJogo4);

		if (!STATICS.ELIMINATORIA == !STATICS.ELIMINATORIA_SEMI) {
			eliSpinnerTime1.setEnabled(false);
			eliSpinnerTime2.setEnabled(false);
			eliSpinnerTime12.setEnabled(false);
			eliSpinnerTime22.setEnabled(false);
			eliSpinnerTime13.setEnabled(false);
			eliSpinnerTime23.setEnabled(false);
			eliSpinnerTime14.setEnabled(false);
			eliSpinnerTime24.setEnabled(false);
		}

		// SEMI FINAL

		try {
			this.lblSemiTime1 = new JLabel(STATICS.SEMI_FINAL.get(0).getTime1());
			this.lblSimeTime2 = new JLabel(STATICS.SEMI_FINAL.get(0).getTime2());
			this.lblSemiTime12 = new JLabel(STATICS.SEMI_FINAL.get(1).getTime1());
			this.lblSemiTime22 = new JLabel(STATICS.SEMI_FINAL.get(1).getTime2());
		} catch (Exception e) {
			this.lblSemiTime1 = new JLabel("Nao definido");
			this.lblSimeTime2 = new JLabel("Nao definido");
			this.lblSemiTime12 = new JLabel("Nao definido");
			this.lblSemiTime22 = new JLabel("Nao definido");
		}

		JLabel lblSemiJogo1 = new JLabel("SEMI 1");

		JLabel lblSemiJogo2 = new JLabel("SEMI 2");

		JSpinner semiSpinnerTime1 = new JSpinner();
		JSpinner semiSpinnerTime12 = new JSpinner();
		JSpinner semiSpinnerTime2 = new JSpinner();

		JSpinner semiSpinnerTime22 = new JSpinner();

		lblSemiJogo1.setBounds(10, 327, 66, 15);
		lblSemiTime1.setBounds(10, 354, 66, 15);
		semiSpinnerTime1.setBounds(10, 378, 56, 20);
		lblSimeTime2.setBounds(137, 354, 66, 15);
		semiSpinnerTime2.setBounds(137, 378, 56, 20);
		lblSemiJogo2.setBounds(265, 327, 66, 15);
		lblSemiTime12.setBounds(265, 354, 66, 15);
		semiSpinnerTime12.setBounds(265, 378, 56, 20);
		lblSemiTime22.setBounds(392, 354, 66, 15);
		semiSpinnerTime22.setBounds(392, 378, 56, 20);

		if (!STATICS.ELIMINATORIA_SEMI == !STATICS.ELIMINATORIA_FINAL) {
			semiSpinnerTime1.setEnabled(false);
			semiSpinnerTime2.setEnabled(false);
			semiSpinnerTime12.setEnabled(false);
			semiSpinnerTime22.setEnabled(false);
		}

		contentPane.add(lblSemiJogo1);
		contentPane.add(lblSemiTime1);
		contentPane.add(semiSpinnerTime1);
		contentPane.add(lblSimeTime2);
		contentPane.add(semiSpinnerTime2);
		contentPane.add(lblSemiJogo2);
		contentPane.add(lblSemiTime12);
		contentPane.add(semiSpinnerTime12);
		contentPane.add(lblSemiTime22);
		contentPane.add(semiSpinnerTime22);

		// FINAL

		try {
			this.lblFinalTime1 = new JLabel(STATICS.FINAL.get(0).getTime1());
			this.lblFInalTime2 = new JLabel(STATICS.FINAL.get(0).getTime2());
		} catch (Exception e) {
			this.lblFinalTime1 = new JLabel("Nao definido");
			this.lblFInalTime2 = new JLabel("Nao definido");
		}

		JLabel lblFinal = new JLabel("FINAL");

		JSpinner finalSpinner1 = new JSpinner();

		JSpinner finalSpinner2 = new JSpinner();

		lblFinal.setBounds(208, 430, 66, 17);
		lblFinalTime1.setBounds(148, 459, 66, 15);
		finalSpinner1.setBounds(148, 483, 56, 20);
		lblFInalTime2.setBounds(275, 459, 66, 15);
		finalSpinner2.setBounds(275, 483, 56, 20);

		if (!STATICS.ELIMINATORIA_FINAL) {
			finalSpinner1.setEnabled(false);
			finalSpinner2.setEnabled(false);
		}

		contentPane.add(lblFinal);
		contentPane.add(lblFinalTime1);
		contentPane.add(finalSpinner1);
		contentPane.add(lblFInalTime2);
		contentPane.add(finalSpinner2);

		JButton btnApostar = new JButton("Apostar");
		btnApostar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				if ((!STATICS.ELIMINATORIA != !STATICS.ELIMINATORIA_SEMI) && usuario.getEliminatoria().size() < 4) {
					Aposta aposta = new Aposta();
					aposta.setJogo("Time A vs Time B");
					aposta.setNomeTime1("Time A");
					aposta.setNomeTime2("Time B");
					aposta.setPlacar1((Integer) eliSpinnerTime1.getValue());
					aposta.setPlacar2((Integer) eliSpinnerTime2.getValue());

					Aposta aposta2 = new Aposta();
					aposta2.setJogo("Time A vs Time B");
					aposta2.setNomeTime1("Time A");
					aposta2.setNomeTime2("Time B");
					aposta2.setPlacar1((Integer) eliSpinnerTime12.getValue());
					aposta2.setPlacar2((Integer) eliSpinnerTime22.getValue());

					Aposta aposta3 = new Aposta();
					aposta3.setJogo("Time A vs Time B");
					aposta3.setNomeTime1("Time A");
					aposta3.setNomeTime2("Time B");
					aposta3.setPlacar1((Integer) eliSpinnerTime13.getValue());
					aposta3.setPlacar2((Integer) eliSpinnerTime23.getValue());

					Aposta aposta4 = new Aposta();
					aposta4.setJogo("Time A vs Time B");
					aposta4.setNomeTime1("Time A");
					aposta4.setNomeTime2("Time B");
					aposta4.setPlacar1((Integer) eliSpinnerTime14.getValue());
					aposta4.setPlacar2((Integer) eliSpinnerTime24.getValue());

					usuario.getEliminatoria().add(aposta);
					usuario.getEliminatoria().add(aposta2);
					usuario.getEliminatoria().add(aposta3);
					usuario.getEliminatoria().add(aposta4);

				} else if ((!STATICS.ELIMINATORIA_SEMI != !STATICS.ELIMINATORIA_FINAL)
						&& usuario.getSemifinal().size() < 2) {
					Aposta aposta = new Aposta();
					aposta.setJogo("Time A vs Time B");
					aposta.setNomeTime1("Time A");
					aposta.setNomeTime2("Time B");
					aposta.setPlacar1((Integer) semiSpinnerTime1.getValue());
					aposta.setPlacar2((Integer) semiSpinnerTime2.getValue());

					Aposta aposta2 = new Aposta();
					aposta2.setJogo("Time A vs Time B");
					aposta2.setNomeTime1("Time A");
					aposta2.setNomeTime2("Time B");
					aposta2.setPlacar1((Integer) semiSpinnerTime12.getValue());
					aposta2.setPlacar2((Integer) semiSpinnerTime22.getValue());

					usuario.getSemifinal().add(aposta);
					usuario.getSemifinal().add(aposta2);
				} else if (STATICS.ELIMINATORIA_FINAL && usuario.getApostaFinal() != null) {
					Aposta aposta = new Aposta();
					aposta.setJogo("Time A vs Time B");
					aposta.setNomeTime1("Time A");
					aposta.setNomeTime2("Time B");
					aposta.setPlacar1((Integer) finalSpinner1.getValue());
					aposta.setPlacar2((Integer) finalSpinner2.getValue());

					usuario.setApostaFinal(aposta);
				}

			}
		});

		if (STATICS.ELIMINATORIA || STATICS.ELIMINATORIA_SEMI || STATICS.ELIMINATORIA_FINAL) {
			btnApostar.setEnabled(true);
		} else {
			btnApostar.setEnabled(false);
		}

		btnApostar.setBounds(188, 530, 114, 25);
		contentPane.add(btnApostar);

	}
}
