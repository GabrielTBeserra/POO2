package telas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controllers.FinalizarJogos;
import Controllers.SortearJogos;
import STATICS.STATICS;
import beans.Grupo;
import beans.Usuario;

import java.awt.Font;
import javax.swing.JComboBox;

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

		JMenuItem mntmSair = new JMenuItem("Sair");
		mntmSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				Login login = new Login();
				login.setVisible(true);
				setVisible(false);
				dispose();
			}
		});
		mnTeste.add(mntmSair);

		JMenu mnAdmin = new JMenu("ADMIN");
		menuBar.add(mnAdmin);

		JMenuItem novoUsuario = new JMenuItem("Adicionar grupo");
		novoUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				if (STATICS.GRUPOS.size() == 5) {
					JOptionPane.showMessageDialog(null, "Limite de grupos atingido");
					return;
				}

				String nomeGrupo = JOptionPane.showInputDialog(null,
						"Informe o nome do grupo " + STATICS.GRUPOS.size());

				Grupo grupo = new Grupo();
				grupo.setUsuario(new ArrayList<Usuario>());
				grupo.setNome(nomeGrupo);

				STATICS.GRUPOS.add(grupo);
				JOptionPane.showMessageDialog(null, "Grupo adicionado com sucesso!");

			}
		});

		JMenuItem definirNomeTorneio = new JMenuItem("Definir nome torneio");
		JMenuItem mntmAdicionarTime = new JMenuItem("Adicionar time");
		JMenuItem mntmSortearTimes = new JMenuItem("Sortear times");
		JMenuItem mntmFinalizarJogos = new JMenuItem("Finalizar jogos");

		mntmAdicionarTime.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				if (STATICS.NOME_TORNEIO == null) {
					JOptionPane.showMessageDialog(null, "Necessario definir o torneio");
					return;
				}

				if (STATICS.TIMES.size() == 8) {
					JOptionPane.showMessageDialog(null, "Limite de times atingido");
					return;
				}
				String nomeTime = null;
				try {
					nomeTime = JOptionPane.showInputDialog(null, "Informe o nome do time " + STATICS.TIMES.size())
							.trim();
				} catch (Exception e) {
					System.err.println(e.getMessage());
				}

				if (nomeTime.equals("") || nomeTime == null) {
					return;
				}

				STATICS.TIMES.add(nomeTime);

				JOptionPane.showMessageDialog(null, "Time adicionado com sucesso!");
			}
		});

		definirNomeTorneio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				if (STATICS.NOME_TORNEIO != null) {
					JOptionPane.showMessageDialog(null, "Nome ja definido!");
					return;
				}

				String nomeDoTorneio = JOptionPane.showInputDialog(null, "Informe o nome torneio");

				STATICS.NOME_TORNEIO = nomeDoTorneio;
				JOptionPane.showMessageDialog(null, "Torneio definido!");
			}
		});

		mntmSortearTimes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				new SortearJogos();
			}
		});

		mntmFinalizarJogos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				new FinalizarJogos();
			}
		});

		mnAdmin.add(definirNomeTorneio);
		mnAdmin.add(novoUsuario);
		mnAdmin.add(mntmAdicionarTime);
		mnAdmin.add(mntmSortearTimes);
		mnAdmin.add(mntmFinalizarJogos);

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
