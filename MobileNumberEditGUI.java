/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicmanagementsystem;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
public class MobileNumberEditGUI extends JFrame{
    
   private JPanel contentPane;
	private JTextField textField;
public MobileNumberEditGUI(int id){
   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 856, 623);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSubmit_1 = new JButton("Back");
		btnSubmit_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                            dispose();
                            EditOptionGUI edit=new EditOptionGUI(id);
			}
		});
		btnSubmit_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnSubmit_1.setBounds(412, 327, 95, 31);
		contentPane.add(btnSubmit_1);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                            Controller c=new Controller();
                            String mobNo=textField.getText();
                            c.mobUpdate(mobNo,id);
			}
		});
		btnSubmit.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnSubmit.setBounds(259, 327, 95, 31);
		contentPane.add(btnSubmit);
		
		JLabel lblEnterNewAge = new JLabel("Enter New Mobile Number");
		lblEnterNewAge.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblEnterNewAge.setBounds(241, 134, 365, 38);
		contentPane.add(lblEnterNewAge);
		
		textField = new JTextField();
                textField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField.setBounds(241, 197, 310, 52);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel label = new JLabel("");
		label.setFont(new Font("Tahoma", Font.BOLD, 10));
		label.setIcon(new ImageIcon("C:\\Users\\hp\\Downloads\\Evening Sunshine.jpg"));
		label.setBounds(0, -31, 842, 617);
		contentPane.add(label);
                  this.setVisible(true);
}
}

    

