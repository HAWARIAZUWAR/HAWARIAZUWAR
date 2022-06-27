import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.border.EmptyBorder;

public class Receipt1 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	static String name;
	static String icpass;
	static String age;
	static String ttotal;
	static String citizen;
	static String totalAdult;
	static String qtyAdultStandard;
	static String qtyAdultFastlane;
	static String totalAdultStandard;
	static String membership;
	static String totalAdultFastlane;
	static String qtyKidsStandard;
	static String qtyKidsFastlane;
	static String totalKidsStandard;
	static String totalKidsFastlane;
	static String allpayment;
	static String balance;
	
	DecimalFormat df = new DecimalFormat("#0.00");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Receipt1 frame = new Receipt1(name,icpass,age,ttotal,citizen, membership,qtyAdultStandard,qtyAdultFastlane, 
							qtyAdultStandard,qtyAdultFastlane,qtyKidsStandard,qtyKidsFastlane,qtyKidsStandard,qtyKidsFastlane,allpayment,balance);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @param totalbalance 
	 * @param ttotalpayment 
	 */
	public Receipt1(String name, String icpass, String age, String ttotal, String citizen, String membership, String quantityAdultFastLane, String totalAdultFastLane, String quantityAdultStandard, String totalAdultStandard, 
			String quantityKidsStandard ,String quantityKidsFastlane, String totalkidsStandard, String totalKidsFastlane, String ttotalpayment, String totalbalance ) {
		setTitle("RECEIPT");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 601, 406);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 204, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		df.setMaximumFractionDigits(2);
		
		JLabel Name = new JLabel("NAME");
		Name.setBounds(32, 21, 46, 14);
		contentPane.add(Name);
		
		JLabel icPassport = new JLabel("IC/PASSPORT");
		icPassport.setBounds(32, 51, 82, 14);
		contentPane.add(icPassport);
		
		JLabel Citizens = new JLabel("CITIZENS");
		Citizens.setBounds(32, 101, 82, 14);
		contentPane.add(Citizens);
		
		JLabel Membership = new JLabel("MEMBERSHIP");
		Membership.setBounds(32, 126, 82, 14);
		contentPane.add(Membership);
		
		JLabel Age = new JLabel("AGE");
		Age.setBounds(32, 76, 46, 14);
		contentPane.add(Age);
		
		JLabel TicketAdultStandard = new JLabel("TICKET ADULT STANDARD");
		TicketAdultStandard.setBounds(32, 161, 170, 14);
		contentPane.add(TicketAdultStandard);
		
		JLabel TicketAdultFastLane = new JLabel("TICKET ADULT FAST LANE");
		TicketAdultFastLane.setBounds(32, 186, 185, 14);
		contentPane.add(TicketAdultFastLane);
		
		JLabel TicketKidsStandard = new JLabel("TICKET KIDS STANDARD");
		TicketKidsStandard.setBounds(32, 211, 185, 14);
		contentPane.add(TicketKidsStandard);
		
		JLabel TicketKidsFastLane = new JLabel("TICKET KIDS FAST LANE");
		TicketKidsFastLane.setBounds(32, 236, 170, 14);
		contentPane.add(TicketKidsFastLane);
		
		JLabel Nama = new JLabel("<dynamic>");
		Nama.setBounds(182, 21, 340, 14);
		contentPane.add(Nama);
		Nama.setText(name);
		
		JLabel nokp = new JLabel("<dynamic>");
		nokp.setBounds(182, 51, 210, 14);
		contentPane.add(nokp);
		nokp.setText(icpass);
		
		JLabel umur = new JLabel("<dynamic>");
		umur.setBounds(182, 76, 82, 14);
		contentPane.add(umur);
		umur.setText(age);
		
		JLabel citisen = new JLabel("<dynamic>");
		citisen.setBounds(182, 101, 129, 14);
		contentPane.add(citisen);
		citisen.setText(citizen);
			
		JLabel member = new JLabel("<dynamic>");
		member.setBounds(182, 126, 232, 14);
		contentPane.add(member);
		member.setText(membership);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(32, 126, 1, 2);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(21, 148, 537, 2);
		contentPane.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(32, 261, 526, 2);
		contentPane.add(separator_2);
		
		JLabel lblNewLabel_12_4 = new JLabel("=");
		lblNewLabel_12_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_12_4.setBounds(349, 159, 19, 14);
		contentPane.add(lblNewLabel_12_4);
		
		JLabel lblNewLabel_12_4_1 = new JLabel("=");
		lblNewLabel_12_4_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_12_4_1.setBounds(349, 184, 19, 14);
		contentPane.add(lblNewLabel_12_4_1);
		
		JLabel lblNewLabel_12_4_2 = new JLabel("=");
		lblNewLabel_12_4_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_12_4_2.setBounds(349, 209, 19, 14);
		contentPane.add(lblNewLabel_12_4_2);
		
		JLabel lblNewLabel_12_4_3 = new JLabel("=");
		lblNewLabel_12_4_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_12_4_3.setBounds(349, 234, 19, 14);
		contentPane.add(lblNewLabel_12_4_3);
		
		JLabel lblNewLabel_12_4_4 = new JLabel("RM");
		lblNewLabel_12_4_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_12_4_4.setBounds(378, 159, 36, 14);
		contentPane.add(lblNewLabel_12_4_4);
		
		JLabel lblNewLabel_12_4_4_1 = new JLabel("RM");
		lblNewLabel_12_4_4_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_12_4_4_1.setBounds(378, 184, 36, 14);
		contentPane.add(lblNewLabel_12_4_4_1);
		
		JLabel lblNewLabel_12_4_4_2 = new JLabel("RM");
		lblNewLabel_12_4_4_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_12_4_4_2.setBounds(378, 209, 36, 14);
		contentPane.add(lblNewLabel_12_4_4_2);
		
		JLabel lblNewLabel_12_4_4_3 = new JLabel("RM");
		lblNewLabel_12_4_4_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_12_4_4_3.setBounds(378, 234, 36, 14);
		contentPane.add(lblNewLabel_12_4_4_3);
		
		JLabel lblTotal = new JLabel("Total      : ");
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblTotal.setBounds(32, 286, 292, 25);
		contentPane.add(lblTotal);
		
		JLabel lblBalance = new JLabel("Balance :");
		lblBalance.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblBalance.setBounds(32, 322, 142, 24);
		contentPane.add(lblBalance);
		
		JLabel rm = new JLabel("RM");
		rm.setFont(new Font("Tahoma", Font.BOLD, 25));
		rm.setBounds(242, 286, 62, 25);
		contentPane.add(rm);
		
		JLabel rm_1 = new JLabel("RM");
		rm_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		rm_1.setBounds(242, 322, 62, 25);
		contentPane.add(rm_1);
		
		Double tottal = Double.parseDouble(ttotal);
		JLabel total = new JLabel("0.00");
		total.setFont(new Font("Tahoma", Font.BOLD, 25));
		total.setBounds(331, 286, 129, 25);
		contentPane.add(total);
		total.setText(df.format(tottal));
		
		Double tbalance = Double.parseDouble(totalbalance);
		JLabel Balance = new JLabel("0.00");
		Balance.setFont(new Font("Tahoma", Font.BOLD, 25));
		Balance.setBounds(331, 322, 129, 25);
		contentPane.add(Balance);
		Balance.setText(df.format(tbalance));
		
		JButton btnNewButton = new JButton("EXIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JButton btn = new JButton("Exit");
				if (JOptionPane.showConfirmDialog(btn, "Thank you for your payment. Are you sure want to exit? ", "Anime Theme Park",
						JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION) {
						System.exit(0); }
			}
		});
		btnNewButton.setBounds(469, 329, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblAdultStandard = new JLabel("New label");
		lblAdultStandard.setBounds(229, 161, 82, 14);
		contentPane.add(lblAdultStandard);
		lblAdultStandard.setText(quantityAdultStandard);
		
		JLabel lblAdultFastLane = new JLabel("New label");
		lblAdultFastLane.setBounds(229, 236, 82, 14);
		contentPane.add(lblAdultFastLane);
		lblAdultFastLane.setText(quantityAdultFastLane);
		
		double totKidsStandard = Double.parseDouble(quantityKidsStandard);
		JLabel lblKidsStandard = new JLabel("New label");
		lblKidsStandard.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblKidsStandard.setBounds(434, 161, 72, 14);
		contentPane.add(lblKidsStandard);
		lblKidsStandard.setText(df.format(totKidsStandard));
		
		double totKidsFastLane = Double.parseDouble(quantityKidsFastlane);
		JLabel lblkidsFastLane = new JLabel("New label");
		lblkidsFastLane.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblkidsFastLane.setBounds(434, 186, 46, 14);
		contentPane.add(lblkidsFastLane);
		lblkidsFastLane.setText(df.format(totKidsFastLane));
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(227, 186, 84, 14);
		contentPane.add(lblNewLabel);
		lblNewLabel.setText(totalAdultStandard);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(227, 211, 84, 14);
		contentPane.add(lblNewLabel_1);
		lblNewLabel_1.setText(totalAdultFastLane);
		
		double totAdultStandard = Double.parseDouble(totalkidsStandard);
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(435, 211, 46, 14);
		contentPane.add(lblNewLabel_2);
		lblNewLabel_2.setText(df.format(totAdultStandard));
		
		double totAdultFastLane = Double.parseDouble(totalKidsFastlane);
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(435, 236, 46, 14);
		contentPane.add(lblNewLabel_3);
		lblNewLabel_3.setText(df.format(totAdultFastLane));
		
	}
}
