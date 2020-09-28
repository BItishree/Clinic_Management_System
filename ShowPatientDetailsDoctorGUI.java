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
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ShowPatientDetailsDoctorGUI extends JFrame {

	private JPanel contentPane;
        private ArrayList<TreatmentDetails> al=new ArrayList<>();


	public ShowPatientDetailsDoctorGUI(Patient p,ArrayList<TreatmentDetails> al) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1011, 664);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(129, 25, 728, 522);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
                	textArea.setEditable(false);
                	textArea.setFont(new Font("Tahoma", Font.PLAIN, 22));
                textArea.append("\t\tPATIENT INFORMATION\n\t--------------------------------------------------------------------\n");
		 textArea.append("PATIENT ID :"+Integer.toString(p.getId())+"\nNAME : "+p.getName()+"\nGENDER : "+p.getGender()+"\nAGE : "+Integer.toString(p.getAge())+"\nMOBILE NUMBER : "+p.getMobileNo()+"\nADDRESS : "+p.getAddress()+"\n------------------------------------------------------\n");
                int i=0;
                while(i<al.size()){
                     textArea.append("RECORD-"+Integer.toString(i+1)+"\n----------------------\n");
                     textArea.append("RECORD-ID : "+Integer.toString(al.get(i).getRecord_Id())+"\nVISITING DATE : "+al.get(i).getVisiting_date()+"\nTREATMENT REASON : "+al.get(i).getTreatment_reason()+"\nTREATMENT FEES : "+Double.toString(al.get(i).getTreament_fees())+"\nTOTAL PAYMENT : "+Double.toString(al.get(i).getTotal_Payment())+"\n");
                     i++;
                }
                 scrollPane.setViewportView(textArea);
		
		JButton btnPrint = new JButton("Print");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                              JOptionPane.showMessageDialog(null,"Print Successful");
			}
		});
		btnPrint.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnPrint.setBounds(341, 567, 112, 37);
		contentPane.add(btnPrint);
		
		JButton btnHome = new JButton("Home");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                              dispose();
                             DoctorGUI r=new DoctorGUI();
			}
		});
		btnHome.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnHome.setBounds(522, 567, 112, 37);
		contentPane.add(btnHome);
                this.setVisible(true);
	}
}

