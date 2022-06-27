
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

public class Login2 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1117127049279869930L;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login2 frame = new Login2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login2() {
		setBackground(SystemColor.activeCaption);
		setTitle("LOGIN");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 549, 371);
		contentPane = new JPanel();
		contentPane.setForeground(SystemColor.desktop);
		contentPane.setBackground(SystemColor.desktop);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.activeCaption);
		panel.setBounds(10, 11, 513, 310);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ANIME THEME PARK");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel.setBounds(132, 30, 264, 37);
		panel.add(lblNewLabel);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblUsername.setBounds(92, 132, 86, 23);
		panel.add(lblUsername);
		
		textField = new JTextField();
		textField.setBounds(173, 135, 176, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPassword.setBounds(92, 183, 86, 14);
		panel.add(lblPassword);
		
		JButton btnLogin = new JButton("LOGIN"); {
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String password = passwordField_1.getText();
				String username = textField.getText();
				
				if (password.contains("123") && username.contains("Hawari")) {
					passwordField_1.setText(null);
					textField.setText(null);
				
					WelcomePage1 info = new WelcomePage1(); 
					WelcomePage1.main(null);
					dispose();
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Invalid Login Details","Login Error",JOptionPane.ERROR_MESSAGE);
					passwordField_1.setText(null);
					textField.setText(null);
				 
				}
			}
		});
		btnLogin.setBounds(144, 231, 89, 23);
		panel.add(btnLogin);
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				passwordField_1.setText(null);
				textField.setText(null);
			}
		});
		btnReset.setBounds(259, 231, 89, 23);
		panel.add(btnReset);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(173, 182, 176, 20);
		panel.add(passwordField_1);
		
	 
		}
	 
	}
}

