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
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class MakePaymentGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
        private double total_payment;


	public MakePaymentGUI(int record_id,double treatment_fees) {
            
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 601);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTreatmentFees = new JLabel("Treatment Fees");
		lblTreatmentFees.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTreatmentFees.setBounds(187, 104, 238, 40);
		contentPane.add(lblTreatmentFees);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField.setBounds(422, 100, 292, 57);
              textField.setText(Double.toString(treatment_fees));
               textField.setEditable(false);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblVisitingFees = new JLabel("Visiting Fees");
		lblVisitingFees.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblVisitingFees.setBounds(187, 229, 238, 40);
		contentPane.add(lblVisitingFees);
		
		textField_1 = new JTextField();
	
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
                 textField_1.setEditable(false);
                textField_1.setText(Double.toString(300.0));
                   
		textField_1.setColumns(10);
		textField_1.setBounds(422, 223, 292, 57);
		contentPane.add(textField_1);
               
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTotal.setBounds(187, 333, 238, 40);
		lblTotal.setVisible(false);
		contentPane.add(lblTotal);
		
		textField_2 = new JTextField();
                        textField_2.setEditable(false);
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_2.setColumns(10);
                
		textField_2.setBounds(422, 316, 292, 57);
		textField_2.setVisible(false);
               
		contentPane.add(textField_2);
		
		JButton btnProceedToPay = new JButton("Proceed To Pay");
		btnProceedToPay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                            try{
                            double visiting_fee=Double.parseDouble(textField_1.getText());
                             
                          Controller c=new Controller();
                          lblTotal.setVisible(true);
                          textField_2.setVisible(true);
                          textField_2.setText(Double.toString(treatment_fees+visiting_fee));
                            c.makePayment(record_id,(treatment_fees+visiting_fee));
                            
                        }catch(Exception e1){
                    System.out.print(e1);
                }
                        }
		});
		btnProceedToPay.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnProceedToPay.setBounds(353, 421, 245, 48);
		contentPane.add(btnProceedToPay);
		
            JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\hp\\Downloads\\Deep Sea Space.jpg"));
		lblNewLabel.setBounds(0, 0, 986, 564);
		contentPane.add(lblNewLabel);
                this.setVisible(true);
                
	}
}

