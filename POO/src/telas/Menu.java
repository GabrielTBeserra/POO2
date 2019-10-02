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
import beans.Usuario;
import javax.swing.JSpinner;
import javax.swing.JButton;

public class Menu extends JFrame {

	private JPanel contentPane;

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
				new AbrirTabela();
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
		JLabel lblEliJogo1 = new JLabel("Jogo 1");
		JLabel lblEliTime1 = new JLabel("TIME 1");
		JLabel lblEliTime2 = new JLabel("TIME 2");

		lblEliJogo1.setBounds(12, 105, 66, 15);

		lblEliTime1.setBounds(12, 132, 66, 15);
	
	
		lblEliTime2.setBounds(139, 132, 66, 15);
		
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(12, 156, 56, 20);
		
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBounds(139, 156, 56, 20);
		
		
		JLabel label = new JLabel("Jogo 1");
		label.setBounds(275, 105, 66, 15);
		
		
		JLabel label_1 = new JLabel("TIME 1");
		label_1.setBounds(275, 132, 66, 15);
		
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setBounds(275, 156, 56, 20);
		
		
		JSpinner spinner_3 = new JSpinner();
		spinner_3.setBounds(402, 156, 56, 20);
		
		
		JLabel label_2 = new JLabel("TIME 2");
		label_2.setBounds(402, 132, 66, 15);
		
		
		JLabel label_3 = new JLabel("Jogo 1");
		label_3.setBounds(10, 205, 66, 15);
		
		
		JLabel label_4 = new JLabel("TIME 1");
		label_4.setBounds(10, 232, 66, 15);
		
		
		JSpinner spinner_4 = new JSpinner();
		spinner_4.setBounds(10, 256, 56, 20);
		
		
		JSpinner spinner_5 = new JSpinner();
		spinner_5.setBounds(137, 256, 56, 20);
		
		
		JLabel label_5 = new JLabel("TIME 2");
		label_5.setBounds(137, 232, 66, 15);
		
		
		JLabel label_6 = new JLabel("Jogo 1");
		label_6.setBounds(275, 205, 66, 15);
		
		
		JLabel label_7 = new JLabel("TIME 1");
		label_7.setBounds(275, 232, 66, 15);
		
		
		JSpinner spinner_6 = new JSpinner();
		spinner_6.setBounds(275, 256, 56, 20);
		
		
		JSpinner spinner_7 = new JSpinner();
		spinner_7.setBounds(402, 256, 56, 20);
		
		
		JLabel label_8 = new JLabel("TIME 2");
		label_8.setBounds(402, 232, 66, 15);
		
		
		
		
		
		contentPane.add(lblEliTime1);
		contentPane.add(lblEliJogo1);
		contentPane.add(lblEliTime2);
		contentPane.add(spinner);
		contentPane.add(spinner_1);
		contentPane.add(label);
		contentPane.add(label_1);
		contentPane.add(label_1);
		contentPane.add(spinner_2);
		contentPane.add(label_8);
		contentPane.add(spinner_3);
		contentPane.add(spinner_7);
		contentPane.add(spinner_6);
		contentPane.add(label_7);
		contentPane.add(label_2);
		contentPane.add(label_3);
		contentPane.add(label_4);
		contentPane.add(spinner_5);
		contentPane.add(spinner_4);
		contentPane.add(label_5);
		contentPane.add(label_6);
		
		
		
		
		
		
		// SEMI FINAL
		
		JLabel lblSemi = new JLabel("SEMI 1");
		lblSemi.setBounds(10, 327, 66, 15);
		contentPane.add(lblSemi);
		
		JLabel label_10 = new JLabel("TIME 1");
		label_10.setBounds(10, 354, 66, 15);
		contentPane.add(label_10);
		
		JSpinner spinner_8 = new JSpinner();
		spinner_8.setBounds(10, 378, 56, 20);
		contentPane.add(spinner_8);
		
		JLabel label_11 = new JLabel("TIME 2");
		label_11.setBounds(137, 354, 66, 15);
		contentPane.add(label_11);
		
		JSpinner spinner_9 = new JSpinner();
		spinner_9.setBounds(137, 378, 56, 20);
		contentPane.add(spinner_9);
		
		JLabel lblSemi_1 = new JLabel("SEMI 2");
		lblSemi_1.setBounds(265, 327, 66, 15);
		contentPane.add(lblSemi_1);
		
		JLabel label_12 = new JLabel("TIME 1");
		label_12.setBounds(265, 354, 66, 15);
		contentPane.add(label_12);
		
		JSpinner spinner_10 = new JSpinner();
		spinner_10.setBounds(265, 378, 56, 20);
		contentPane.add(spinner_10);
		
		JLabel label_13 = new JLabel("TIME 2");
		label_13.setBounds(392, 354, 66, 15);
		contentPane.add(label_13);
		
		JSpinner spinner_11 = new JSpinner();
		spinner_11.setBounds(392, 378, 56, 20);
		contentPane.add(spinner_11);
		
		// FINAL
		JLabel lblFinal = new JLabel("FINAL");
		lblFinal.setBounds(208, 430, 66, 17);
		contentPane.add(lblFinal);
		
		JLabel label_14 = new JLabel("TIME 1");
		label_14.setBounds(148, 459, 66, 15);
		contentPane.add(label_14);
		
		JSpinner spinner_12 = new JSpinner();
		spinner_12.setBounds(148, 483, 56, 20);
		contentPane.add(spinner_12);
		
		JLabel label_15 = new JLabel("TIME 2");
		label_15.setBounds(275, 459, 66, 15);
		contentPane.add(label_15);
		
		JSpinner spinner_13 = new JSpinner();
		spinner_13.setBounds(275, 483, 56, 20);
		contentPane.add(spinner_13);
		
		JButton btnApostar = new JButton("Apostar");
		btnApostar.setBounds(188, 530, 114, 25);
		contentPane.add(btnApostar);
	}
}
