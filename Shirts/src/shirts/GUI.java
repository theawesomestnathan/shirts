package shirts;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class GUI {
	JFrame frame;
	
	JLabel lbl1;
	JLabel lbl2;
	JComboBox cmb1;
	JLabel lbl3;
	JRadioButton rbn1;
	JRadioButton rbn2;
	JRadioButton rbn3;
	JButton btn1;
	JTextField tfd1;
	JButton btn2;
	JButton btn3;
	JCheckBox chk1;
	
	GUI() {
		frame = new JFrame();
		
		lbl1 = new JLabel("Customize Shirt");
		lbl1.setBounds(4, 0, 900, 40);
		
		lbl2 = new JLabel("Color");
		lbl2.setBounds(4, 30, 900, 40);
		
		String[] items = {"Red", "Blue", "Yellow", "Violet", "Indigo", "Green", "Purple", "Black"};
		cmb1 = new JComboBox(items);
		cmb1.setBounds(4, 70, 120, 30);
		
		lbl3 = new JLabel("Size");
		lbl3.setBounds(4, 100, 900, 40);
		
		rbn1 = new JRadioButton("Small");
		rbn1.setBounds(4, 130, 70, 30);
		
		rbn2 = new JRadioButton("Medium");
		rbn2.setBounds(80, 130, 100, 30);
		
		rbn3 = new JRadioButton("Large");
		rbn3.setBounds(177, 130, 70, 30);
		
		ButtonGroup btg = new ButtonGroup();
		btg.add(rbn1);
		btg.add(rbn2);
		btg.add(rbn3);

		btn1 = new JButton("Done");
		btn1.setBounds(4, 170, 120, 30);
		
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String color = (String) cmb1.getSelectedItem();
				String size = rbn1.isSelected() ? "Small" : rbn2.isSelected() ? "Medium" : "Large";
				
				JOptionPane.showMessageDialog(null, "Color: " + color + "\nSize: " + size, "Your Shirt", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		
		tfd1 = new JTextField();
		tfd1.setBounds(4, 210, 200, 30);
		
		btn2 = new JButton("Add");
		btn2.setBounds(4, 245, 120, 30);
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cmb1.addItem(tfd1.getText());
			}
		});
		
		btn3 = new JButton("Remove");
		btn3.setBounds(130, 245, 120, 30);
		btn3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cmb1.removeItem(tfd1.getText());
			}
		});
		
		chk1 = new JCheckBox("Admin Access");
		chk1.setBounds(4, 275, 120, 30);
		
		chk1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (chk1.isSelected()) {
					tfd1.setEnabled(true);
					btn2.setEnabled(true);
					btn3.setEnabled(true);
				}
				else {
					tfd1.setEnabled(false);
					btn2.setEnabled(false);
					btn3.setEnabled(false);
				}
			}
		});
		
		tfd1.setEnabled(false);
		btn2.setEnabled(false);
		btn3.setEnabled(false);
		
		frame.add(lbl1);
		frame.add(lbl2);
		frame.add(cmb1);
		frame.add(lbl3);
		frame.add(rbn1);
		frame.add(rbn2);
		frame.add(rbn3);
		frame.add(btn1);
		frame.add(tfd1);
		frame.add(btn2);
		frame.add(btn3);
		frame.add(chk1);
		frame.setLayout(null);
		frame.setTitle("Shirts");
		frame.setSize(300, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
