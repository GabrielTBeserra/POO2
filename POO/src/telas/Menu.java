package telas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import beans.Usuario;

public class Menu extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 * 
	 * @param usuario
	 */
	public Menu(Usuario usuario) {
		setTitle("ADMIN MENU");
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

		JMenuItem mntmNovoUsuario = new JMenuItem("Novo usuario");
		mntmNovoUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				CadastrarUsuario cad = new CadastrarUsuario();
				cad.setVisible(true);
			}
		});
		
		mnAdmin.add(mntmNovoUsuario);
		
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel(usuario.getNome());
		lblNewLabel.setBounds(378, 0, 46, 14);
		contentPane.add(lblNewLabel);
	}
}
