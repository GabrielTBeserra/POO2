package telas;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import STATICS.STATICS;
import beans.Usuario;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Create the frame.
	 */

	public Login() {
		setTitle("Login");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 237, 334);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsuario.setBounds(10, 11, 211, 47);
		contentPane.add(lblUsuario);

		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setHorizontalAlignment(SwingConstants.CENTER);
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSenha.setBounds(10, 118, 211, 47);
		contentPane.add(lblSenha);

		textField = new JTextField();
		textField.setBounds(10, 60, 211, 32);
		contentPane.add(textField);
		textField.setColumns(10);

		passwordField = new JPasswordField();
		passwordField.setBounds(10, 155, 211, 32);
		contentPane.add(passwordField);

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.exit(0);
			}
		});
		btnCancelar.setBounds(10, 226, 89, 23);
		contentPane.add(btnCancelar);

		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String password = String.valueOf(passwordField.getPassword());
				String usuario = textField.getText();
				Map<String, Usuario> user = STATICS.USERS;

				if (user.containsKey(usuario) && user.get(usuario).getSenha().equals(password)) {
					Menu menu = new Menu(user.get(usuario));
					menu.setVisible(true);
					setVisible(false);
					dispose();
				} else {
					if (STATICS.USERS.size() == 26) {
						JOptionPane.showMessageDialog(null, "Limite de cadastros excedido!");
						return;
					}
					CadastroUsuarios cadastrar = new CadastroUsuarios();
					cadastrar.setVisible(true);
				}

			}
		});
		btnEntrar.setBounds(132, 226, 89, 23);
		contentPane.add(btnEntrar);

	}
}
