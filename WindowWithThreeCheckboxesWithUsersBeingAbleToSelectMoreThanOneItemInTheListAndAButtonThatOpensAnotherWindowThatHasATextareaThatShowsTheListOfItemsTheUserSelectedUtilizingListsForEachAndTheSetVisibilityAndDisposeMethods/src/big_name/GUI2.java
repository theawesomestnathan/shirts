package big_name;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class GUI2 {
	private JFrame frame;
	
	private JTextArea textarea;
	
	private JButton btn;
	
	GUI2(List<Boolean> status) {
		frame = new JFrame();
		
		textarea = new JTextArea();
		textarea.setBounds(10, 5, 100, 100);
		
		for (Boolean result : status) {
			textarea.setText(textarea.getText() + "Bria\n");
		}
		
		btn = new JButton("Back");
		btn.setBounds(10, 120, 150, 59);
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

			}
		});
		
		frame.add(textarea);
		frame.add(btn);
		frame.setLayout(null);
		frame.setSize(325, 400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("epic application");
	}
}
