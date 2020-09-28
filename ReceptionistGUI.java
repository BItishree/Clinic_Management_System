/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicmanagementsystem;


import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class ReceptionistGUI extends JFrame {

	private JPanel contentPane;

	public ReceptionistGUI() {
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 967, 639);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("ADD PATIENT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
                            dispose();
                            PatientGUI p=new PatientGUI();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(174, 120, 271, 46);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("MAKE PAYMENT");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
                            dispose();
                            PaymentGUI p=new PaymentGUI();
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_2.setBounds(174, 379, 276, 46);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("SEARCH PATIENT");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
                            dispose();
                            SearchGUI s=new SearchGUI();
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_3.setBounds(174, 492, 271, 46);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("ADD PATIENT VISIT");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
                             dispose();
                            PatientVisitGUI p=new PatientVisitGUI();
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_4.setBounds(511, 118, 271, 50);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("ADD TREATMENT DETAILS");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
                            dispose();
                            TreatmentDetailsGUI t=new TreatmentDetailsGUI();
			}
		});
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_5.setBounds(174, 249, 271, 46);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("GENERATE BILL");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
                            dispose();
                           BillGenerateGUI b=new BillGenerateGUI();
			}
		});
		btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_6.setBounds(511, 379, 271, 46);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("VIEW TREATMENT DETAILS");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
                            dispose();
                            ViewTreatmentDetailsGUI v=new ViewTreatmentDetailsGUI();
			}
		});
		btnNewButton_7.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_7.setBounds(511, 492, 271, 50);
		contentPane.add(btnNewButton_7);
		
		JButton button = new JButton("Edit Patient");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                            dispose();
                          EditPatientGUI edit=new EditPatientGUI();
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 16));
		button.setBounds(511, 249, 271, 46);
		contentPane.add(button);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\hp\\Downloads\\Evening Sunshine.jpg"));
		lblNewLabel_2.setBounds(10, -10, 953, 612);
		contentPane.add(lblNewLabel_2);		
		this.setVisible(true);
	}
}
