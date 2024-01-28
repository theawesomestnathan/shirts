package payforabasicnessesitybecausecapitalism;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GUI {
	private JFrame frame;
	
	private JLabel label1;
	private JLabel label2;
	private JLabel label3;
	
	private JCheckBox chk1;
	private JCheckBox chk2;
	private JCheckBox chk3;
	
	private JLabel items;
	private JLabel total;
	
	private JButton btn;
	
	GUI() {
		frame = new JFrame();
		
		chk1 = new JCheckBox();
		chk1.setBounds(10, 5, 20, 20);
		
		label1 = new JLabel("Pizza");
		label1.setBounds(35, 0, 50, 30);
		
		chk2 = new JCheckBox();
		chk2.setBounds(10, 25, 20, 20);
		
		label2 = new JLabel("Pie");
		label2.setBounds(35, 20, 50, 30);
		
		chk3 = new JCheckBox();
		chk3.setBounds(10, 45, 20, 20);
		
		label3 = new JLabel("Cake");
		label3.setBounds(35, 40, 50, 30);
		
		btn = new JButton("Add");
		btn.setBounds(10, 70, 150, 59);
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String list = "Items:";
				int totalAmount = 0;
				
				if (chk1.isSelected()){
					list += " Pizza";
					totalAmount += 1000000;
				}
				if (chk2.isSelected()){
					list += " Pie";
					totalAmount += 1;	
				}
				if (chk3.isSelected()){
					list += " Cake";
					totalAmount += 1000000/2;	
				}
				
				items.setText(list);
				total.setText("Total: " + Integer.toString(totalAmount));
			}
		});
		
		items = new JLabel("Items: None");		
		items.setBounds(10, 120, 800, 59);
		
		total = new JLabel("Total: None");		
		total.setBounds(10, 140, 150, 59);
		
		frame.add(chk1);
		frame.add(label1);
		frame.add(chk2);
		frame.add(label2);
		frame.add(chk3);
		frame.add(label3);
		frame.add(btn);
		frame.add(items);
		frame.add(total);
		frame.setTitle("Pay for a basic nessesity (food) because of the capitalistic society we live in. Like seriously, why do we need to pay for food? At least cave men could eat for free. You could argue that I could just go hunting but a gun costs money too.");
		frame.setSize(800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);
	}
}
