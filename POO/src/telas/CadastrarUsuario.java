package telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import beans.Usuario;
import statics.statics;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CadastrarUsuario extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsuario;
	private JTextField txtNome;
	private JPasswordField pssUser;
	private JPasswordField passUserConfirm;

	/**
	 * Create the frame.
	 */
	public CadastrarUsuario() {
		setResizable(false);
		setTitle("CADASTRAR USUARIO");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 545, 491);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblCadastrarUsuario = new JLabel("Cadastrar Usuario");
		lblCadastrarUsuario.setFont(new Font("Tahoma", Font.PLAIN, 33));
		lblCadastrarUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		lblCadastrarUsuario.setBounds(10, 11, 509, 42);
		contentPane.add(lblCadastrarUsuario);

		JLabel lblNewLabel = new JLabel("Usuario");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(33, 64, 133, 28);
		contentPane.add(lblNewLabel);

		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNome.setBounds(33, 130, 133, 28);
		contentPane.add(lblNome);

		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSenha.setBounds(33, 196, 133, 28);
		contentPane.add(lblSenha);

		txtUsuario = new JTextField();
		txtUsuario.setBounds(33, 91, 214, 28);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);

		txtNome = new JTextField();
		txtNome.setColumns(10);
		txtNome.setBounds(33, 157, 214, 28);
		contentPane.add(txtNome);

		JLabel pssConfUser = new JLabel("Confirma senha");
		pssConfUser.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pssConfUser.setBounds(33, 274, 133, 28);
		contentPane.add(pssConfUser);

		pssUser = new JPasswordField();
		pssUser.setBounds(33, 235, 214, 28);
		contentPane.add(pssUser);

		passUserConfirm = new JPasswordField();
		passUserConfirm.setBounds(33, 313, 214, 28);
		contentPane.add(passUserConfirm);

		JRadioButton rdbtnAdmin = new JRadioButton("Admin");
		rdbtnAdmin.setBounds(32, 364, 109, 23);
		contentPane.add(rdbtnAdmin);

		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String user = txtUsuario.getText();
				String nome = txtNome.getText();
				String pss = String.valueOf(passUserConfirm.getPassword());
				boolean isAdmin = rdbtnAdmin.isSelected();

				Usuario usuario = new Usuario();
				usuario.setUsuario(user);
				usuario.setNome(nome);
				usuario.setSenha(pss);
				usuario.setAdmin(isAdmin);

				statics.users.put(user, usuario);

				System.out.println(rdbtnAdmin.isSelected());
			}
		});
		btnCadastrar.setBounds(33, 414, 133, 23);
		contentPane.add(btnCadastrar);

	}
}
