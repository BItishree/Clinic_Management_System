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
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

public class LoginGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
        private JLabel lblNewLabel_1;

	public LoginGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1213, 740);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblClinicManagementSystem = new JLabel("CLINIC MANAGEMENT SYSTEM");
		lblClinicManagementSystem.setForeground(new Color(0, 0, 128));
		lblClinicManagementSystem.setIconTextGap(10);
		lblClinicManagementSystem.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblClinicManagementSystem.setBounds(33, 0, 808, 108);
		contentPane.add(lblClinicManagementSystem);
		
		JLabel lblCategory = new JLabel("CATEGORY");
		lblCategory.setForeground(Color.BLACK);
		lblCategory.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblCategory.setBounds(266, 161, 120, 35);
		contentPane.add(lblCategory);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Choose Category", "Doctor", "Receptionist"}));
		comboBox.setBounds(522, 155, 259, 46);
		contentPane.add(comboBox);
		
		JLabel lblUserName = new JLabel("User Name");
		lblUserName.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblUserName.setBounds(266, 280, 127, 35);
		contentPane.add(lblUserName);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField.setBounds(522, 272, 259, 51);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblPas = new JLabel("Password");
		lblPas.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPas.setBounds(266, 399, 127, 35);
		contentPane.add(lblPas);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String user_name=textField.getText();
			        String password=passwordField.getText();
			         String category=comboBox.getSelectedItem().toString();
			        Controller c=new Controller();

			         if(user_name.equals("")){
			         JOptionPane.showMessageDialog(rootPane, "user name should not be empty");
			         return;
			     }
			       if(password.equals("")){
			         JOptionPane.showMessageDialog(rootPane, "password should not be empty");
			         return;
			       }
			       
			       
			       
			         try{
			             if(category.equalsIgnoreCase("DOCTOR"))
			        {
			          
			            boolean isLoginD=c.isLogin(category,user_name,password);
			           
			           
			            
			            if(isLoginD==true)
			            {
			                dispose();
			                DoctorGUI di=new DoctorGUI();
			             
			            }
			            else{
			            	 lblNewLabel_1.setVisible(true);
			            }
			        }
			             else
			             {
			             
			                 boolean isLoginR=c.isLogin("Receptionist",user_name,password);
			           
			            
			            if(isLoginR==true)
			            {
			                dispose();
			                ReceptionistGUI ri=new ReceptionistGUI();
			               
			            }
                                  
			             else{
			            	 lblNewLabel_1.setVisible(true);
			            }
			             }
			        } catch(Exception e1)
			                {
			                System.out.println(e1);
			                
			}
				
			}
		});
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.BOLD, 18));
		passwordField.setBounds(522, 394, 259, 51);
		contentPane.add(passwordField);
		
	        lblNewLabel_1 = new JLabel("Invalid User Name/Password");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setBounds(542, 447, 250, 34);
                lblNewLabel_1.setVisible(false);
		contentPane.add(lblNewLabel_1);
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnLogin.setBounds(380, 534, 137, 46);
		contentPane.add(btnLogin);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                            dispose();
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnExit.setBounds(580, 534, 137, 46);
		contentPane.add(btnExit);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setForeground(new Color(25, 25, 112));
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\hp\\Downloads\\landing-banner.jpg"));
		lblNewLabel.setBounds(0, -29, 1208, 738);
		
		contentPane.add(lblNewLabel);
	}
}
