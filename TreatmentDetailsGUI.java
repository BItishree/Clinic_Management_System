/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicmanagementsystem;

/**
 *
 * @author hp
 */
import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class TreatmentDetailsGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	public TreatmentDetailsGUI() {
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1009, 673);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTreatmentDetails = new JLabel("TREATMENT DETAILS");
		lblTreatmentDetails.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblTreatmentDetails.setBounds(290, 26, 536, 52);
		contentPane.add(lblTreatmentDetails);
		
		JLabel lblId = new JLabel("Record-ID");
		lblId.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblId.setBounds(248, 187, 221, 46);
		contentPane.add(lblId);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField.setBounds(479, 192, 261, 45);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblTreatmentReason = new JLabel("Treatment Reason");
		lblTreatmentReason.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblTreatmentReason.setBounds(248, 292, 203, 46);
		contentPane.add(lblTreatmentReason);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_1.setColumns(10);
		textField_1.setBounds(479, 292, 261, 45);
		contentPane.add(textField_1);
		
		JLabel lblFees = new JLabel("Fees");
		lblFees.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblFees.setBounds(248, 392, 156, 46);
		contentPane.add(lblFees);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_2.setColumns(10);
		textField_2.setBounds(479, 382, 261, 45);
		contentPane.add(textField_2);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                             try{
                            int id=Integer.parseInt(textField.getText());
                            String reason=textField_1.getText();
                            double fees=Double.parseDouble(textField_2.getText());
                            Controller c=new Controller();
                           c.addTreatmentDetails(id,reason,fees);
			}catch(Exception e2){
                            System.out.println(e2);
                        }
			}
		});
		btnSubmit.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSubmit.setBounds(346, 484, 123, 39);
		contentPane.add(btnSubmit);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                           dispose();
                              
			ReceptionistGUI r=new ReceptionistGUI();
                        }
		});
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnBack.setBounds(563, 484, 123, 39);
		contentPane.add(btnBack);
		
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\hp\\Downloads\\Evening Sunshine.jpg"));
		label.setBounds(10, 0, 953, 636);
		contentPane.add(label);
                this.setVisible(true);
	}
}
