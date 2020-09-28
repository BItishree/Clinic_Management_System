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
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;



public class ViewTreatmentDetailsDoctorGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	public ViewTreatmentDetailsDoctorGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 964, 646);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEnterRecorid = new JLabel("Enter Record-ID");
		lblEnterRecorid.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblEnterRecorid.setBounds(348, 95, 265, 53);
		contentPane.add(lblEnterRecorid);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField.setBounds(265, 169, 446, 53);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
                            try{
                            int record_id=(Integer.parseInt(textField.getText()));
                           Controller c=new Controller();
                           TreatmentDetails t=c.getTreatmentDetails(record_id);
                           
                         ShowTreatmentDetailsDoctorGUI s=new ShowTreatmentDetailsDoctorGUI(t);
                       
                        }
                            catch(Exception e4)
                            {
                                System.out.println(e4);
                            }
                            }
		});
		btnSubmit.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnSubmit.setBounds(354, 256, 107, 37);
		contentPane.add(btnSubmit);
                JButton btnBack_1 = new JButton("Back");
		btnBack_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                            dispose();
                           DoctorGUI r=new DoctorGUI();
			}
		});
		btnBack_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnBack_1.setBounds(517, 256, 107, 37);
		contentPane.add(btnBack_1);
		
            JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("C:\\Users\\hp\\Downloads\\Dark Ocean.jpg"));
		label_2.setBounds(0, 0, 950, 609);
		contentPane.add(label_2);
                this.setVisible(true);
                
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\hp\\Downloads\\Green and Blue.jpg"));
		lblNewLabel.setBounds(0, -27, 950, 636);
		contentPane.add(lblNewLabel);
                this.setVisible(true);
	}
}

