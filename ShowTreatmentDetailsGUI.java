package clinicmanagementsystem;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
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

public class ShowTreatmentDetailsGUI extends JFrame {

	private JPanel contentPane;

	public ShowTreatmentDetailsGUI(TreatmentDetails t) {
		
		
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				setBounds(100, 100, 917, 678);
				contentPane = new JPanel();
				contentPane.setBackground(Color.WHITE);
				contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
				setContentPane(contentPane);
				contentPane.setLayout(null);
					
					JLabel lblVisitingDate = new JLabel("Visiting date          :  ");
					lblVisitingDate.setFont(new Font("Tahoma", Font.BOLD, 20));
					lblVisitingDate.setBounds(227, 144, 210, 25);
					contentPane.add(lblVisitingDate);
					
					JLabel lblTreatmentFees = new JLabel("Treatment Fees      :");
					lblTreatmentFees.setFont(new Font("Tahoma", Font.BOLD, 20));
					lblTreatmentFees.setBounds(227, 291, 205, 25);
					contentPane.add(lblTreatmentFees);
					
					JLabel lblTotalPayment = new JLabel("Total Payment        :");
					lblTotalPayment.setFont(new Font("Tahoma", Font.BOLD, 20));
					lblTotalPayment.setBounds(232, 365, 205, 25);
					contentPane.add(lblTotalPayment);
					
					JButton btnPrint = new JButton("Print");
					btnPrint.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
                                                    JOptionPane.showMessageDialog(null,"Print Successful");
						}
					});
					btnPrint.setFont(new Font("Tahoma", Font.PLAIN, 20));
					btnPrint.setBounds(276, 503, 131, 41);
					contentPane.add(btnPrint);
					
					JButton btnHome = new JButton("Home");
					btnHome.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
                                                    dispose();
                                                    ReceptionistGUI r=new ReceptionistGUI();
						}
					});
					btnHome.setFont(new Font("Tahoma", Font.PLAIN, 20));
					btnHome.setBounds(493, 503, 131, 41);
					contentPane.add(btnHome);
					
					JLabel lblRecordid = new JLabel("Record-Id             :");
					lblRecordid.setFont(new Font("Tahoma", Font.BOLD, 20));
					lblRecordid.setBounds(227, 79, 210, 25);
					contentPane.add(lblRecordid);
					
					JLabel lblNewLabel_1 = new JLabel(t.getVisiting_date());
					lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
					lblNewLabel_1.setBounds(422, 143, 445, 36);
					contentPane.add(lblNewLabel_1);
					
					JLabel label = new JLabel(Double.toString(t.getTotal_Payment()));
                                        label.setFont(new Font("Tahoma", Font.PLAIN, 18));
					label.setBounds(447, 356, 445, 41);
					contentPane.add(label);
					
					JLabel label_1 = new JLabel(t.getTreatment_reason());
                                        label_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
					label_1.setBounds(432, 201, 445, 41);
					contentPane.add(label_1);
					
					JLabel label_7 = new JLabel(Integer.toString(t.getRecord_Id()));
					label_7.setFont(new Font("Tahoma", Font.PLAIN, 18));
					 
					label_7.setBounds(426, 79, 445, 32);
					contentPane.add(label_7);
					
					JLabel lblTreatmentReason = new JLabel("Treatment Reason :");
					lblTreatmentReason.setFont(new Font("Tahoma", Font.BOLD, 20));
					lblTreatmentReason.setBounds(227, 208, 205, 25);
					contentPane.add(lblTreatmentReason);
					
					JLabel label_2 = new JLabel(Double.toString(t.getTreament_fees()));
					label_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
					label_2.setBounds(442, 291, 445, 32);
					contentPane.add(label_2);
                                        this.setVisible(true);
			}
		

	

}
