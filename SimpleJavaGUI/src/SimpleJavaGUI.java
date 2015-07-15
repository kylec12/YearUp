import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;


public class SimpleJavaGUI {

	private JFrame frame;
	private JTextField nameTextField;
	private JTextField ageTextField;
	private JLabel lblNewLabel;
	private JButton whoButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SimpleJavaGUI window = new SimpleJavaGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SimpleJavaGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel nameLabel = new JLabel("My name is:");
		nameLabel.setFont(new Font("Trajan Pro 3", Font.PLAIN, 11));
		nameLabel.setBounds(21, 39, 76, 57);
		frame.getContentPane().add(nameLabel);
		
		nameTextField = new JTextField();
		nameTextField.setBackground(Color.DARK_GRAY);
		nameTextField.setForeground(Color.RED);
		nameTextField.setBounds(107, 42, 200, 50);
		frame.getContentPane().add(nameTextField);
		nameTextField.setColumns(10);
		
		JLabel IamLabel = new JLabel("I am:");
		IamLabel.setBounds(46, 118, 46, 14);
		frame.getContentPane().add(IamLabel);
		
		ageTextField = new JTextField();
		ageTextField.setBounds(107, 103, 200, 50);
		frame.getContentPane().add(ageTextField);
		ageTextField.setColumns(10);
		
		lblNewLabel = new JLabel("I am a student of Year Up!");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel.setBounds(117, 164, 175, 35);
		frame.getContentPane().add(lblNewLabel);
		
		JButton whoButton = new JButton ("Who are you?");
		whoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				if (whoButton.getText().equals("Who are you?"))
				{
					nameTextField.setText("Kyle Calloway");
					ageTextField.setText("18");
					whoButton.setText("Clear me!");
				}
				else if (whoButton.getText().equals("Clear me!"))
				{
					nameTextField.setText("");
					ageTextField.setText("");
					whoButton.setText("Who are you?");
				}
			}
		});
		whoButton.setBounds(107, 201, 200, 50);
		frame.getContentPane().add(whoButton);
	}
}
