package clinicmanagementsystem;

import clinicmanagementsystem.TreatmentDetails;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

public class ShowBillGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;

	
	public ShowBillGUI(TreatmentDetails t,Patient p) {
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 917, 678);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
			
			JLabel lblName = new JLabel("Patient Name        :");
			lblName.setFont(new Font("Tahoma", Font.BOLD, 20));
			lblName.setBounds(227, 131, 210, 25);
			contentPane.add(lblName);
			
			JLabel lblGender = new JLabel("Gender                  :");
			lblGender.setFont(new Font("Tahoma", Font.BOLD, 20));
			lblGender.setBounds(227, 177, 210, 25);
			contentPane.add(lblGender);
			
			JLabel lblAge = new JLabel("Age                        :");
			lblAge.setFont(new Font("Tahoma", Font.BOLD, 20));
			lblAge.setBounds(227, 226, 210, 25);
			contentPane.add(lblAge);
			
			JLabel lblMobileNumber = new JLabel("Mobile Number     :");
			lblMobileNumber.setFont(new Font("Tahoma", Font.BOLD, 20));
			lblMobileNumber.setBounds(227, 276, 210, 25);
			contentPane.add(lblMobileNumber);
			
			JLabel lblAddress = new JLabel("Address                 :");
			lblAddress.setFont(new Font("Tahoma", Font.BOLD, 20));
			lblAddress.setBounds(227, 328, 210, 25);
			contentPane.add(lblAddress);
			
			JLabel lblVisitingDate = new JLabel("Visiting date          :  ");
			lblVisitingDate.setFont(new Font("Tahoma", Font.BOLD, 20));
			lblVisitingDate.setBounds(227, 374, 210, 25);
			contentPane.add(lblVisitingDate);
			
			JLabel lblTreatmentFees = new JLabel("Treatment Fees      :");
			lblTreatmentFees.setFont(new Font("Tahoma", Font.BOLD, 20));
			lblTreatmentFees.setBounds(227, 468, 205, 25);
			contentPane.add(lblTreatmentFees);
			
			JLabel lblTotalPayment = new JLabel("Total Payment        :");
			lblTotalPayment.setFont(new Font("Tahoma", Font.BOLD, 20));
			lblTotalPayment.setBounds(227, 516, 205, 25);
			contentPane.add(lblTotalPayment);
			
			JButton btnPrint = new JButton("Print");
			btnPrint.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
                                    JOptionPane.showMessageDialog(null,"Print Successful");
				}
			});
			btnPrint.setFont(new Font("Tahoma", Font.PLAIN, 20));
			btnPrint.setBounds(281, 590, 131, 41);
			contentPane.add(btnPrint);
			
			JButton btnHome = new JButton("Home");
			btnHome.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
                                    dispose();
                                    ReceptionistGUI r=new ReceptionistGUI();
				}
			});
			btnHome.setFont(new Font("Tahoma", Font.PLAIN, 20));
			btnHome.setBounds(499, 590, 131, 41);
			contentPane.add(btnHome);
			
			JLabel lblRecordid = new JLabel("Record-Id             :");
			lblRecordid.setFont(new Font("Tahoma", Font.BOLD, 20));
			lblRecordid.setBounds(227, 79, 210, 25);
			contentPane.add(lblRecordid);
			
			JLabel lblNewLabel_1 = new JLabel(p.getName());
                        	lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
			lblNewLabel_1.setBounds(422, 131, 445, 32);
			contentPane.add(lblNewLabel_1);
			
			JLabel label = new JLabel(p.getGender());
			label.setBounds(422, 177, 445, 32);
			contentPane.add(label);
			
			JLabel label_1 = new JLabel(Integer.toString(p.getAge()));
                        	label_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
			label_1.setBounds(426, 226, 445, 32);
			contentPane.add(label_1);
			
			JLabel label_2 = new JLabel(p.getMobileNo());
                        	label_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
			label_2.setBounds(422, 276, 445, 32);
			contentPane.add(label_2);
			
			JLabel label_3 = new JLabel(p.getAddress());
                        	label_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
			label_3.setBounds(426, 332, 445, 32);
			contentPane.add(label_3);
			
			JLabel label_4 = new JLabel(t.getVisiting_date());
                        	label_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
			label_4.setBounds(422, 374, 445, 32);
			contentPane.add(label_4);
			
			JLabel label_5 = new JLabel(t.Treatment_reason);
                        	label_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
			label_5.setBounds(426, 422, 445, 32);
			contentPane.add(label_5);
			
			JLabel label_6 = new JLabel(Double.toString(t.getTotal_Payment()));
                        	label_6.setFont(new Font("Tahoma", Font.PLAIN, 18));
			label_6.setBounds(422, 509, 445, 32);
			contentPane.add(label_6);
			
			JLabel label_7 = new JLabel(Integer.toString(p.getAge()));;
			 	label_7.setFont(new Font("Tahoma", Font.PLAIN, 18));
			label_7.setBounds(426, 79, 445, 32);
			contentPane.add(label_7);
			
			JLabel lblClinic = new JLabel("CLINIC");
			lblClinic.setFont(new Font("Tahoma", Font.BOLD, 30));
			lblClinic.setBounds(243, 0, 291, 41);
			contentPane.add(lblClinic);
			
			JLabel lblShastrinagarbbsr = new JLabel("ShastriNagar,BBSR,759001");
			lblShastrinagarbbsr.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblShastrinagarbbsr.setBounds(542, 9, 241, 31);
			contentPane.add(lblShastrinagarbbsr);
			
			JLabel lblTreatmentReason = new JLabel("Treatment Reason :");
			lblTreatmentReason.setFont(new Font("Tahoma", Font.BOLD, 20));
			lblTreatmentReason.setBounds(227, 422, 205, 25);
			contentPane.add(lblTreatmentReason);
			
			JLabel label_8 = new JLabel(Double.toString(t.getTreament_fees()));
                        	label_8.setFont(new Font("Tahoma", Font.PLAIN, 18));
			label_8.setBounds(436, 468, 431, 32);
			contentPane.add(label_8);
                        this.setVisible(true);
	}
}
