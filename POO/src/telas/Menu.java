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
import Controllers.DefinirFinal;
import Controllers.DefinirSemi;
import Controllers.NomeTorneio;
import Controllers.SortearJogos;
import beans.Usuario;

public class Menu extends JFrame {

	private JPanel contentPane;

	public Menu(Usuario usuario) {
		setResizable(false);
		setTitle("MENU");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);

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

		abaAdmin.add(btnDefinirNomeTorneio);
		abaAdmin.add(btnAdicionarGrupos);
		abaAdmin.add(btnAdicionarTimes);
		abaAdmin.add(btnSortearEliminatoria);
		abaAdmin.add(btnSortearSemiFinal);
		abaAdmin.add(btnSortearFinal);
		mnTeste.add(btnTabela);
		menuBar.add(abaAdmin);
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
	}
}
