package telas;

import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

import STATICS.STATICS;

public class Tabela extends JFrame {

	private JPanel contentPane;

	public Tabela() {
		List<String> times = STATICS.TIMES;

		setResizable(false);
		setTitle("CADASTRAR USUARIO");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 545, 438);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel time1 = new JLabel(times.get(0));
		time1.setBounds(10, 30, 77, 20);
		contentPane.add(time1);

		JLabel time2 = new JLabel(times.get(1));
		time2.setBounds(10, 61, 77, 20);
		contentPane.add(time2);

		JLabel time3 = new JLabel(times.get(2));
		time3.setBounds(10, 111, 77, 20);
		contentPane.add(time3);

		JLabel time4 = new JLabel(times.get(3));
		time4.setBounds(10, 142, 77, 20);
		contentPane.add(time4);

		JLabel time5 = new JLabel(times.get(4));
		time5.setBounds(10, 261, 77, 20);
		contentPane.add(time5);

		JLabel time6 = new JLabel(times.get(5));
		time6.setBounds(10, 292, 77, 20);
		contentPane.add(time6);

		JLabel time7 = new JLabel(times.get(6));
		time7.setBounds(10, 339, 77, 20);
		contentPane.add(time7);

		JLabel time8 = new JLabel(times.get(7));
		time8.setBounds(10, 370, 77, 20);
		contentPane.add(time8);

		try {
			JLabel time1Semi = new JLabel(STATICS.SEMI_FINAL.get(0).getTime1());
			time1Semi.setBounds(136, 80, 77, 20);
			contentPane.add(time1Semi);

			JLabel time2semi = new JLabel(STATICS.SEMI_FINAL.get(0).getTime2());
			time2semi.setBounds(136, 111, 77, 20);
			contentPane.add(time2semi);

			JLabel time3semi = new JLabel(STATICS.SEMI_FINAL.get(1).getTime1());
			time3semi.setBounds(136, 308, 77, 20);
			contentPane.add(time3semi);

			JLabel time4semi = new JLabel(STATICS.SEMI_FINAL.get(1).getTime2());
			time4semi.setBounds(136, 339, 77, 20);
			contentPane.add(time4semi);
		} catch (Exception e) {
			// TODO: handle exception
		}

		JTextPane textPane = new JTextPane();
		textPane.setEditable(false);
		textPane.setBounds(10, 30, 77, 20);
		contentPane.add(textPane);

		JTextPane textPane_1 = new JTextPane();
		textPane_1.setEditable(false);
		textPane_1.setBounds(10, 61, 77, 20);
		contentPane.add(textPane_1);

		JLabel lblX = new JLabel("X");
		lblX.setBounds(45, 50, 20, 14);
		contentPane.add(lblX);

		JTextPane textPane_2 = new JTextPane();
		textPane_2.setEditable(false);
		textPane_2.setBounds(10, 111, 77, 20);
		contentPane.add(textPane_2);

		JLabel label_1 = new JLabel("X");
		label_1.setBounds(45, 131, 20, 14);
		contentPane.add(label_1);

		JTextPane textPane_3 = new JTextPane();
		textPane_3.setEditable(false);
		textPane_3.setBounds(10, 142, 77, 20);
		contentPane.add(textPane_3);

		JTextPane textPane_4 = new JTextPane();
		textPane_4.setEditable(false);
		textPane_4.setBounds(10, 261, 77, 20);
		contentPane.add(textPane_4);

		JLabel label_2 = new JLabel("X");
		label_2.setBounds(45, 281, 20, 14);
		contentPane.add(label_2);

		JTextPane textPane_5 = new JTextPane();
		textPane_5.setEditable(false);
		textPane_5.setBounds(10, 292, 77, 20);
		contentPane.add(textPane_5);

		JTextPane textPane_6 = new JTextPane();
		textPane_6.setEditable(false);
		textPane_6.setBounds(10, 339, 77, 20);
		contentPane.add(textPane_6);

		JLabel label_3 = new JLabel("X");
		label_3.setBounds(45, 359, 20, 14);
		contentPane.add(label_3);

		JTextPane textPane_7 = new JTextPane();
		textPane_7.setEditable(false);
		textPane_7.setBounds(10, 370, 77, 20);
		contentPane.add(textPane_7);

		JTextPane textPane_10 = new JTextPane();
		textPane_10.setEditable(false);
		textPane_10.setBounds(136, 80, 77, 20);
		contentPane.add(textPane_10);

		JLabel label_5 = new JLabel("X");
		label_5.setBounds(171, 100, 12, 14);
		contentPane.add(label_5);

		JTextPane textPane_11 = new JTextPane();
		textPane_11.setEditable(false);
		textPane_11.setBounds(136, 111, 77, 20);
		contentPane.add(textPane_11);

		JTextPane textPane_8 = new JTextPane();
		textPane_8.setEditable(false);
		textPane_8.setBounds(256, 188, 77, 20);
		contentPane.add(textPane_8);

		JLabel label_4 = new JLabel("X");
		label_4.setBounds(291, 208, 12, 14);
		contentPane.add(label_4);

		JTextPane textPane_9 = new JTextPane();
		textPane_9.setEditable(false);
		textPane_9.setBounds(256, 219, 77, 20);
		contentPane.add(textPane_9);

		JTextPane textPane_12 = new JTextPane();
		textPane_12.setEditable(false);
		textPane_12.setBounds(136, 308, 77, 20);
		contentPane.add(textPane_12);

		JLabel label_6 = new JLabel("X");
		label_6.setBounds(171, 328, 12, 14);
		contentPane.add(label_6);

		JTextPane textPane_13 = new JTextPane();
		textPane_13.setEditable(false);
		textPane_13.setBounds(136, 339, 77, 20);
		contentPane.add(textPane_13);

		JLabel label_12 = new JLabel("New label");
		label_12.setBounds(10, 370, 77, 20);
		contentPane.add(label_12);
	}
}
