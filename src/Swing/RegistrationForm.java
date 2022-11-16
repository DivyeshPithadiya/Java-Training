package Swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RegistrationForm extends JFrame {

	private JPanel contentPane;
	private JTextField rollFeild;
	private JTextField nameFeild;
	private JTextField surnameFeild;
	private JTextField ageFeild;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistrationForm frame = new RegistrationForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public RegistrationForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 329);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel title = new JLabel("Registration page");
		title.setFont(new Font("Tahoma", Font.PLAIN, 14));
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setBounds(188, 21, 120, 22);
		contentPane.add(title);
		
		JLabel rollLabel = new JLabel("Roll Number");
		rollLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rollLabel.setBounds(52, 67, 69, 13);
		contentPane.add(rollLabel);
		
		JLabel nameLabel = new JLabel("Name");
		nameLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		nameLabel.setBounds(52, 110, 45, 13);
		contentPane.add(nameLabel);
		
		JLabel surnameLabel = new JLabel("Surname");
		surnameLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		surnameLabel.setBounds(52, 159, 69, 13);
		contentPane.add(surnameLabel);
		
		JLabel ageLabel = new JLabel("Age");
		ageLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		ageLabel.setBounds(52, 208, 45, 13);
		contentPane.add(ageLabel);
		
		rollFeild = new JTextField();
		rollFeild.setBounds(212, 65, 96, 19);
		contentPane.add(rollFeild);
		rollFeild.setColumns(10);
		
		nameFeild = new JTextField();
		nameFeild.setBounds(212, 108, 96, 19);
		contentPane.add(nameFeild);
		nameFeild.setColumns(10);
		
		surnameFeild = new JTextField();
		surnameFeild.setBounds(212, 157, 96, 19);
		contentPane.add(surnameFeild);
		surnameFeild.setColumns(10);
		
		ageFeild = new JTextField();
		ageFeild.setBounds(212, 206, 96, 19);
		contentPane.add(ageFeild);
		ageFeild.setColumns(10);
		
		JButton submit = new JButton("Submit");
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int roll=Integer.valueOf(rollFeild.getText());
				String name=nameFeild.getText();
				String surname=surnameFeild.getText();
				int age = Integer.valueOf(ageFeild.getText());
				
				String query = "insert into student values ("+roll+",'"+name+"','"+surname+"',"+age+");";
				DBOperations dbOperation=new DBOperations();
				dbOperation.insertData(query);
				
			}
		});
		submit.setBounds(212, 248, 85, 21);
		contentPane.add(submit);
	}
}
