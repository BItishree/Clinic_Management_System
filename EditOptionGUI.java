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

public class EditOptionGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	public EditOptionGUI(int id) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 856, 623);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSubmit = new JButton("Address");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                            dispose();
                            AddressEditGUI ae=new AddressEditGUI(id);
                            
			}
		});
		btnSubmit.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSubmit.setBounds(246, 316, 306, 37);
		contentPane.add(btnSubmit);
		
		JButton btnBack = new JButton("Mobile Number");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                            dispose();
                            MobileNumberEditGUI ae=new MobileNumberEditGUI(id);
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnBack.setBounds(246, 219, 290, 37);
		contentPane.add(btnBack);
		
		JButton btnAge = new JButton("Age");
		btnAge.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                            dispose();
                            AgeEditGUI ae=new AgeEditGUI(id);
			}
		});
		btnAge.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnAge.setBounds(246, 96, 290, 37);
		contentPane.add(btnAge);
		
		JButton btnSubmit_1 = new JButton("Back");
                btnSubmit_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                            dispose();
                            EditPatientGUI edit=new EditPatientGUI();
			}
		});
		btnSubmit_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnSubmit_1.setBounds(353, 519, 95, 31);
		contentPane.add(btnSubmit_1);
		
		JLabel label = new JLabel("");
		label.setFont(new Font("Tahoma", Font.BOLD, 10));
		label.setIcon(new ImageIcon("C:\\Users\\hp\\Downloads\\Evening Sunshine.jpg"));
		label.setBounds(0, 0, 842, 586);
		contentPane.add(label);

                this.setVisible(true);	}
}
