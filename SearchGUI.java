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

public class SearchGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	public SearchGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 953, 655);
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
                            ShowPatientDetailsGUI s=new ShowPatientDetailsGUI(p,al);
			}catch(Exception e4){
                            System.out.println(e4);
                        }
                            
                        }
		});
		btnSubmit.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnSubmit.setBounds(328, 259, 113, 49);
		contentPane.add(btnSubmit);
		
            JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                            dispose();
                            ReceptionistGUI r=new ReceptionistGUI();
                            
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnBack.setBounds(497, 259, 113, 49);
		contentPane.add(btnBack);
		
            JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon("C:\\Users\\hp\\Downloads\\Green and Blue.jpg"));
		label_3.setBounds(0, 0, 974, 626);
		contentPane.add(label_3);
                this.setVisible(true);
	}
}
