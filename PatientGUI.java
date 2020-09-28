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
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class PatientGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JLabel lblAddedSuccessfully ;

	public PatientGUI() {
		
					setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1265, 745);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRegistrationForm = new JLabel("Patient Details");
		lblRegistrationForm.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblRegistrationForm.setBounds(512, 24, 374, 78);
		contentPane.add(lblRegistrationForm);
		
		JLabel lblName = new JLabel("NAME");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblName.setBounds(387, 163, 151, 28);
		contentPane.add(lblName);
		
		
		
		textField = new JTextField();
		
		textField.setBounds(699, 158, 228, 37);
                textField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(textField);
		textField.setColumns(10);
                
                JLabel lblGender = new JLabel("Gender");
		lblGender.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblGender.setBounds(387, 222, 76, 28);
		contentPane.add(lblGender);
                
                JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Choose Category", "Male", "Female"}));
		
		comboBox.setBounds(699, 217, 228, 37);
		contentPane.add(comboBox);
                
		JLabel lblAge = new JLabel("AGE");
		lblAge.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblAge.setBounds(387, 280, 151, 28);
		contentPane.add(lblAge);
		
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(699, 275, 228, 37);
                textField_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(textField_1);
		
                JLabel lblMobileNumber = new JLabel("MOBILE NUMBER");
		lblMobileNumber.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblMobileNumber.setBounds(387, 345, 151, 28);
		contentPane.add(lblMobileNumber);
                
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(699, 340, 228, 37);
                textField_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(textField_2);
                
		JLabel lblAddress = new JLabel("ADDRESS");
		lblAddress.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblAddress.setBounds(387, 430, 151, 28);
		contentPane.add(lblAddress);
		
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(699, 425, 228, 37);
                textField_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(textField_3);
		JButton btnSubmit = new JButton("SUBMIT");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
                            try{
                            String name=textField.getText();
                             String gender=comboBox.getSelectedItem().toString();
                            int age=Integer.parseInt(textField_1.getText());
				String mobNo=textField_2.getText();
                                String address=textField_3.getText();
                                        int id=0;
                                Patient p=new Patient(id,name,gender,age,mobNo,address);
                                Controller c=new Controller();
                                boolean isSuccess=c.addPatient(p);
                                if(isSuccess==true){
                                          
                                 JOptionPane.showMessageDialog(null,"submitted successfully");
                                 dispose();
                                 ReceptionistGUI ri=new ReceptionistGUI();
                            }
                                else{ JOptionPane.showMessageDialog(null,"submission failed");}
                            }catch(Exception e){
                                System.out.println(e);
                            }
			}
		});
		btnSubmit.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnSubmit.setBounds(480, 534, 138, 41);
		contentPane.add(btnSubmit);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
                                    dispose();
			ReceptionistGUI r=new ReceptionistGUI();	
			}
		});
			
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnBack.setBounds(748, 534, 138, 41);
		contentPane.add(btnBack);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\hp\\Downloads\\Noon to Dusk (1).jpg"));
		label.setBounds(0, 0, 1259, 708);
		contentPane.add(label);
				this.setVisible(true);
	}
}

