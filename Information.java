import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Information extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Information frame = new Information();
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
	public Information() {
		setFont(new Font("Arial", Font.BOLD, 20));
		setTitle("INFORMATION TICKET");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 620, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.activeCaption);
		panel.setBounds(10, 11, 586, 442);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblinformation = new JLabel("INFORMATION TICKET ");
		lblinformation.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblinformation.setBounds(145, 11, 322, 47);
		panel.add(lblinformation);
		
		JLabel lblPriceTicket = new JLabel("PRICE FOR THE TICKET");
		lblPriceTicket.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPriceTicket.setBounds(204, 114, 235, 33);
		panel.add(lblPriceTicket);
		
		JButton btnReturn = new JButton("BACK");
		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				WelcomePage1 info = new WelcomePage1(); //Connect WelcomePage1 Frame
				WelcomePage1.main(null);
				dispose(); 
			}
		});
		btnReturn.setBounds(487, 408, 89, 23);
		panel.add(btnReturn);
		
		JButton btnNext = new JButton("NEXT");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				EntranceTicket mn = new EntranceTicket(); 
				mn.setVisible(true);
				dispose();
			}
		});
		btnNext.setBounds(378, 408, 89, 23);
		panel.add(btnNext);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(102, 102, 255));
		panel_1.setBounds(10, 158, 566, 238);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblStandard = new JLabel("Standard");
		lblStandard.setBounds(37, 21, 103, 22);
		panel_1.add(lblStandard);
		lblStandard.setBackground(new Color(240, 230, 140));
		lblStandard.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		
		JLabel lblFastLane = new JLabel("FastLane");
		lblFastLane.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblFastLane.setBounds(37, 93, 128, 33);
		panel_1.add(lblFastLane);
		
		JLabel lblAdult_1 = new JLabel("Adult");
		lblAdult_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblAdult_1.setBounds(197, 22, 64, 22);
		panel_1.add(lblAdult_1);
		
		JLabel lblAdult_2 = new JLabel("Adult");
		lblAdult_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblAdult_2.setBounds(197, 103, 75, 14);
		panel_1.add(lblAdult_2);
		
		JLabel lblPriceAdult_1 = new JLabel("RM45");
		lblPriceAdult_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPriceAdult_1.setBounds(197, 55, 46, 14);
		panel_1.add(lblPriceAdult_1);
		
		JLabel lblPriceAdult_2 = new JLabel("RM55");
		lblPriceAdult_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPriceAdult_2.setBackground(new Color(240, 240, 240));
		lblPriceAdult_2.setBounds(197, 128, 160, 22);
		panel_1.add(lblPriceAdult_2);
		
		JLabel lblKids_1 = new JLabel("KIDS(below)13");
		lblKids_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblKids_1.setBounds(296, 15, 137, 37);
		panel_1.add(lblKids_1);
		
		JLabel lblKids_2 = new JLabel("KIDS(below13)");
		lblKids_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblKids_2.setBounds(296, 92, 137, 37);
		panel_1.add(lblKids_2);
		
		JLabel lblPriceKids_1 = new JLabel("RM35");
		lblPriceKids_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPriceKids_1.setBounds(326, 55, 46, 14);
		panel_1.add(lblPriceKids_1);
		
		JLabel lblPriceAdult_2_1 = new JLabel("RM45");
		lblPriceAdult_2_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPriceAdult_2_1.setBackground(SystemColor.menu);
		lblPriceAdult_2_1.setBounds(332, 128, 160, 22);
		panel_1.add(lblPriceAdult_2_1);
		
		JLabel lblNewLabel = new JLabel("MEMBERSHIP  =  YOU WILL GET 15%");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(150, 166, 379, 33);
		panel_1.add(lblNewLabel);
		
		JLabel lblCitizens = new JLabel("MEMBERSHIP");
		lblCitizens.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblCitizens.setBounds(10, 189, 130, 33);
		panel_1.add(lblCitizens);
		
		JLabel lblForeignerBasic = new JLabel("NOT MEMBERSHIP =  BASIC PRICE");
		lblForeignerBasic.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblForeignerBasic.setBounds(150, 201, 322, 33);
		panel_1.add(lblForeignerBasic);
				
	}
}
