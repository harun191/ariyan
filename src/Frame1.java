import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frame1 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 window = new Frame1();
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
	public Frame1() {
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
		
		JButton btnNewButton = new JButton("Add Ball");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(34, 158, 118, 42);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Add Strike");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1.setBounds(178, 158, 130, 42);
		frame.getContentPane().add(btnNewButton_1);
		
		JTextPane txtpnBall = new JTextPane();
		txtpnBall.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtpnBall.setText("Balls: 0");
		txtpnBall.setBounds(10, 36, 72, 31);
		frame.getContentPane().add(txtpnBall);
		
		JTextPane txtpnStrikes = new JTextPane();
		txtpnStrikes.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtpnStrikes.setText("Strikes: 0");
		txtpnStrikes.setBounds(10, 78, 97, 31);
		frame.getContentPane().add(txtpnStrikes);
	}
}
