package clinicmanagementsystem;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

public class ShowPrescriptionGUI extends JFrame {

	private JPanel contentPane;

	public ShowPrescriptionGUI(int id,String name,String reason,String medicine) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 892, 643);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		

		
		JTextArea textArea = new JTextArea();
                                	textArea.setFont(new Font("Tahoma", Font.PLAIN, 22));
		textArea.setEditable(false);
                textArea.append("\t \t HOME CLINIC,ShastriNagar,BBSR,759001 \n");
                textArea.append("Record-Id : "+Integer.toString(id)+"\nPatient Name : "+name+"\nTreatment Reason : "+reason+"\nMedicine : "+medicine);
		textArea.setBounds(10, 10, 818, 535);
		contentPane.add(textArea);
		
		JButton btnPrint = new JButton("Print");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                              JOptionPane.showMessageDialog(null,"Print Successful");
			}
		});
		btnPrint.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnPrint.setBounds(208, 560, 144, 36);
		contentPane.add(btnPrint);
		
		JButton btnHome = new JButton("Home");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                               dispose();
                DoctorGUI r=new DoctorGUI();
			}
		});
		btnHome.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnHome.setBounds(405, 555, 144, 36);
		contentPane.add(btnHome);
                this.setVisible(true);
	}

}
