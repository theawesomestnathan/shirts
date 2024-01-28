package gender_form;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GUI {
	JFrame frame;
	
	JLabel lbl1;
	JTextField tf1;
	
	JLabel lbl2;
	JRadioButton rb1;
	JRadioButton rb2;
	
	JButton btn;
	
	GUI() {
		frame = new JFrame();
		
		lbl1 = new JLabel("Name:");
		lbl1.setBounds(5, 10, 100, 25);
		
		tf1 = new JTextField();
		tf1.setBounds(55, 10, 100, 25);
		
		lbl2 = new JLabel("Gender:");
		lbl2.setBounds(5, 40, 100, 25);
		
		rb1 = new JRadioButton("Male");
		rb1.setBounds(65, 40, 100, 25);
		
		rb2 = new JRadioButton("Female");
		rb2.setBounds(170, 40, 100, 25);
		
		btn = new JButton("Submit");
		btn.setBounds(5, 80, 100, 25);
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, rb1.isSelected() ? "You are a Male" + " and your name is " + tf1.getText() : "You are a Female" + " and your name is " + tf1.getText(), "Gender", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		
		ButtonGroup btg = new ButtonGroup();
		btg.add(rb1);
		btg.add(rb2);
		
		frame.add(lbl1);
		frame.add(tf1);
		frame.add(lbl2);
		frame.add(rb1);
		frame.add(rb2);
		frame.add(btn);
		frame.setLayout(null);
		frame.setTitle("Gender Form");
		frame.setSize(800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
