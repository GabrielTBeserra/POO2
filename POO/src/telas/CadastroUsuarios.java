package telas;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import Controllers.CadastrarUsuario;
import STATICS.STATICS;
import beans.Grupo;

public class CadastroUsuarios extends JFrame {

	private static final long serialVersionUID = -5864495353448233840L;
	private JPanel contentPane;
	private JTextField txtUsuario;
	private JTextField txtNome;
	private JPasswordField pssUser;
	private JPasswordField passUserConfirm;

	public CadastroUsuarios() {
		setResizable(false);
		setTitle("CADASTRAR USUARIO");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 545, 438);
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

		DefaultListModel<String> model = new DefaultListModel<String>();

		List<Grupo> listaDeGrupos = STATICS.GRUPOS;

		for (Grupo grupo : listaDeGrupos) {
			if (!(grupo.getUsuario().size() > 5)) {
				model.addElement(grupo.getNome());
			}
		}

		JList<String> list = new JList<String>();
		list.setModel(model);
		list.setBounds(318, 113, 153, 228);

		contentPane.add(list);

		JLabel lblGruposDisponiveis = new JLabel("Grupos disponiveis");
		lblGruposDisponiveis.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblGruposDisponiveis.setBounds(318, 77, 153, 28);
		contentPane.add(lblGruposDisponiveis);

		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new CadastrarUsuario(txtUsuario.getText() , txtNome.getText() , pssUser.getPassword() , passUserConfirm.getPassword() , list);
				
				txtUsuario.setText("");
				txtNome.setText("");
				pssUser.setText("");
				passUserConfirm.setText("");
			}
		});
		btnCadastrar.setBounds(33, 364, 214, 23);
		contentPane.add(btnCadastrar);

	}
}
