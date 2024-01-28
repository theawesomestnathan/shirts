package big_name;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class GUI {
	private JFrame frame;
	
	private JCheckBox chk1;
	private JCheckBox chk2;
	private JCheckBox chk3;
	
	private JButton btn;
	
	GUI() {
		frame = new JFrame();
		
		chk1 = new JCheckBox("Bria");
		chk1.setBounds(10, 5, 80, 20);
		
		chk2 = new JCheckBox("Nathan");
		chk2.setBounds(10, 25, 80, 20);
		
		chk3 = new JCheckBox("KC");
		chk3.setBounds(10, 45, 80, 20);
		
		btn = new JButton("Go");
		btn.setBounds(10, 70, 150, 59);
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				List<Boolean> status = new ArrayList<Boolean>();
				
				status.add(chk1.isSelected());
				status.add(chk2.isSelected());
				status.add(chk3.isSelected());

				new GUI2(status);
				frame.setVisible(false);
			}
		});
		
		frame.add(chk1);
		frame.add(chk2);
		frame.add(chk3);
		frame.add(btn);
		frame.setLayout(null);
		frame.setSize(325, 400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("epic application");
	}
}
