package Login_Sys;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import Controls.PlaceholderTextField;
import Inventar.Inventar_Autovehicule;

public class Login_S {

	private JFrame frame;
	private JTextField txtUsername;
	private JPasswordField txtPassword;
	private JFrame frmLoginSystem;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					Login_S window = new Login_S();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login_S() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().setForeground(Color.BLACK);
		frame.setBounds(200, 200, 500, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblLogin = new JLabel("Login");
		lblLogin.setBounds(6, 21, 500, 16);
		lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblLogin);

		JLabel lblUsername = new JLabel("Utilizator");
		lblUsername.setBounds(65, 92, 62, 31);
		frame.getContentPane().add(lblUsername);

		JLabel IblPassword = new JLabel("Parola");
		IblPassword.setBounds(65, 154, 62, 16);
		frame.getContentPane().add(IblPassword);

		txtUsername = new PlaceholderTextField();
		txtUsername.setBounds(193, 92, 230, 31);
		((PlaceholderTextField) txtUsername).setPlaceholder("doamne");
		frame.getContentPane().add(txtUsername);
		txtUsername.setColumns(10);

		txtPassword = new JPasswordField();
		txtPassword.setBounds(193, 147, 230, 31);
		frame.getContentPane().add(txtPassword);

		JButton btnLogn = new JButton("");
		btnLogn.setIcon(new ImageIcon("/Users/apple/Desktop/buton.png"));
		btnLogn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String password = txtPassword.getText();
				String username = txtUsername.getText();

				if (password.equals("admin") && username.equals("admin")) {
					txtPassword.setText(null);
					txtUsername.setText(null);

					Inventar_Autovehicule inventar = new Inventar_Autovehicule();
					// Inventar_Autovehicule.main(null);
					inventar.main(null);

					// JOptionPane.showMessageDialog(null, "Esti logat !");
					;
				} else {
					JOptionPane.showMessageDialog(null, "Datele introduse sunt invalide", "Eroare la login",
							JOptionPane.ERROR_MESSAGE);
					txtPassword.setText(null);
					txtUsername.setText(null);
				}
			}
		});
		btnLogn.setBounds(53, 226, 117, 29);
		frame.getContentPane().add(btnLogn);

		JButton btnReset = new JButton("Resetare");
		btnReset.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				txtUsername.setText(null);
				txtPassword.setText(null);
			}
		});
		btnReset.setBounds(206, 226, 117, 29);
		frame.getContentPane().add(btnReset);

		JButton btnExit = new JButton("Iesi");
		btnExit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				frmLoginSystem = new JFrame("Iesi");
				if (JOptionPane.showConfirmDialog(frmLoginSystem, "Sigur vrei sa iesi", "Atentie !",
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setBounds(351, 226, 117, 29);
		frame.getContentPane().add(btnExit);

		JSeparator separator = new JSeparator();
		separator.setBounds(27, 203, 452, 12);
		frame.getContentPane().add(separator);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(36, 49, 440, 12);
		frame.getContentPane().add(separator_1);

		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBounds(419, 105, 1, 1);
		frame.getContentPane().add(desktopPane);
	}
}
