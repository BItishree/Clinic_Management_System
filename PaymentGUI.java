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
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class PaymentGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	
	public PaymentGUI() {
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 957, 678);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEnterPatientId = new JLabel("Enter Patient  Id");
		lblEnterPatientId.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblEnterPatientId.setBounds(410, 40, 171, 52);
		contentPane.add(lblEnterPatientId);
		
		textField = new JTextField();
                 textField.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField.setBounds(333, 102, 318, 52);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblEnterRecordId_1 = new JLabel("Enter Record  Id");
		lblEnterRecordId_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblEnterRecordId_1.setBounds(410, 164, 171, 52);
		contentPane.add(lblEnterRecordId_1);
		
		textField_2 = new JTextField();
                textField_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField_2.setColumns(10);
		textField_2.setBounds(333, 226, 318, 52);
		contentPane.add(textField_2);
		
				
			JButton btnSubmit = new JButton("Submit");
			btnSubmit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
                                  try{
                                   int id=Integer.parseInt(textField.getText());
                                   int record_id=Integer.parseInt(textField_2.getText());
                                   Controller c=new Controller();
                                  double treatment_fees= c.payment(id,record_id);
                                  dispose();
                                  MakePaymentGUI m=new MakePaymentGUI(record_id,treatment_fees);
				
                                }catch(Exception e3){
                                    System.out.println(e3);
                                            }
                                }
			});
			btnSubmit.setFont(new Font("Tahoma", Font.PLAIN, 20));
			btnSubmit.setBounds(356, 309, 131, 41);
			contentPane.add(btnSubmit);
            
            JButton btnBack = new JButton("Back");
            btnBack.addActionListener(new ActionListener() {
                
            	public void actionPerformed(ActionEvent e) {
                    dispose();
                ReceptionistGUI r=new ReceptionistGUI();
            	}
            });
            btnBack.setFont(new Font("Tahoma", Font.PLAIN, 20));
            btnBack.setBounds(507, 309, 131, 41);
            contentPane.add(btnBack);
            
            JLabel label = new JLabel("");
            label.setIcon(new ImageIcon("C:\\Users\\hp\\Downloads\\Green and Blue.jpg"));
            label.setBounds(0, 0, 950, 631);
            contentPane.add(label);
                        this.setVisible(true);
	}
}

