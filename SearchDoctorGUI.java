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

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.ImageIcon;

public class SearchDoctorGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	public SearchDoctorGUI() {
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 930, 643);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEnterPatientId = new JLabel("Enter Patient ID");
		lblEnterPatientId.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblEnterPatientId.setBounds(340, 105, 319, 42);
		contentPane.add(lblEnterPatientId);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField.setBounds(292, 182, 367, 49);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                            try{
                             int id=(Integer.parseInt(textField.getText()));
                           Controller c=new Controller();
                           Patient p=c.getPatient(id);
                           ArrayList<TreatmentDetails> al=new ArrayList<>();
                                   al=c.getSearchTreatmentDetails(id);
                            ShowPatientDetailsDoctorGUI s=new ShowPatientDetailsDoctorGUI(p,al);
			}catch(Exception e4){
                            System.out.println(e4);
                        }
                            
                        }
		});
		btnSubmit.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnSubmit.setBounds(319, 270, 113, 49);
		contentPane.add(btnSubmit);
		
            JButton btnBack_2 = new JButton("Back");
		btnBack_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                            dispose();
                            DoctorGUI d=new DoctorGUI();
                            
			}
		});
		btnBack_2.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnBack_2.setBounds(483, 270, 113, 49);
		contentPane.add(btnBack_2);
		
            JLabel label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon("C:\\Users\\hp\\Downloads\\Green and Blue.jpg"));
		label_4.setBounds(0, 0, 940, 616);
		contentPane.add(label_4);
		

                this.setVisible(true);
	}
}
