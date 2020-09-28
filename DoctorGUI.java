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
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class DoctorGUI extends JFrame {

	private JPanel contentPane;


	public DoctorGUI() {
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 884, 641);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GREEN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("SEARCH PATIENT");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
                            dispose();
                            SearchDoctorGUI s=new SearchDoctorGUI();
			}
		});
		btnNewButton.setBounds(288, 124, 306, 45);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("VIEW TREATMENT DETAILS");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
                             dispose();
                            ViewTreatmentDetailsDoctorGUI v=new ViewTreatmentDetailsDoctorGUI();
			}
		});
		btnNewButton_1.setBounds(288, 264, 306, 45);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("CREATE PRESCRIPTION");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
                            dispose();
                            PrescriptionGUI p=new PrescriptionGUI();
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_2.setBounds(288, 404, 306, 45);
		contentPane.add(btnNewButton_2);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\hp\\Downloads\\Green and Blue.jpg"));
		label.setBounds(0, 0, 870, 604);
		contentPane.add(label);
		this.setVisible(true);
	}
}

   
