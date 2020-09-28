package clinicmanagementsystem;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;

public class WritePrescriptionGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	public WritePrescriptionGUI(int record_id,String name,String reason) {
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 897, 655);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblName = new JLabel("Record-ID                   :");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblName.setBounds(179, 44, 248, 37);
		contentPane.add(lblName);
		
		JLabel lblName_1 = new JLabel("Name                            :");
		lblName_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblName_1.setBounds(179, 114, 248, 37);
		contentPane.add(lblName_1);
		
		JLabel lblTreatmentReason = new JLabel("Treatment Reason     :");
		lblTreatmentReason.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblTreatmentReason.setBounds(179, 182, 207, 37);
		contentPane.add(lblTreatmentReason);
		
		textField = new JTextField();
                textField.setText(Integer.toString(record_id));
                textField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField.setEditable(false);
		textField.setBounds(405, 32, 332, 49);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
                textField_1.setText(name);
                textField_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_1.setColumns(10);
		textField_1.setBounds(405, 102, 332, 49);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
                  textField_2.setText(reason);
                textField_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(405, 182, 332, 49);
		contentPane.add(textField_2);
		
		JLabel lblMedicine = new JLabel("Medicine");
		lblMedicine.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblMedicine.setBounds(179, 263, 114, 37);
		contentPane.add(lblMedicine);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(179, 304, 558, 252);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
                                	textArea.setFont(new Font("Tahoma", Font.PLAIN, 22));
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 20));
		scrollPane.setViewportView(textArea);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                            String medicine=textArea.getText();
                            dispose();
                           ShowPrescriptionGUI show=new ShowPrescriptionGUI(record_id,name,reason,medicine);
			}
		});
		btnSubmit.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSubmit.setBounds(295, 566, 107, 42);
		contentPane.add(btnSubmit);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                            dispose();
                            PrescriptionGUI p=new PrescriptionGUI();
                            
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnBack.setBounds(467, 566, 107, 42);
		contentPane.add(btnBack);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\hp\\Downloads\\Delicate.jpg"));
		label.setBounds(10, 0, 863, 618);
		contentPane.add(label);
                this.setVisible(true);
	}
}
