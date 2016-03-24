package view;

import java.awt.EventQueue;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;

public class HistoryPanel extends SecondPanel {


	public HistoryPanel() {
	super();
		
		JLabel label = new JLabel("15 - 02 - 2016");
		label.setForeground(Color.BLACK);
		label.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		label.setBounds(66, 40, 160, 30);
		this.add(label);
		label.setBackground(Color.white);
		label.setOpaque(true);
		
		JLabel lblNewLabel = new JLabel("10H00          1,2 g/L");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(45, 82, 212, 30);
		this.add(lblNewLabel);
		lblNewLabel.setBackground(Color.white);
		lblNewLabel.setOpaque(true);
		
		JLabel lblhGl = new JLabel("12H00          1,8 g/L");
		lblhGl.setHorizontalAlignment(SwingConstants.CENTER);
		lblhGl.setBounds(45, 118, 212, 30);
		this.add(lblhGl);
		lblhGl.setBackground(Color.white);
		lblhGl.setOpaque(true);
		
		JLabel lblhGl_1 = new JLabel("15H00          0,8 g/L");
		lblhGl_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblhGl_1.setBounds(45, 154, 212, 30);
		this.add(lblhGl_1);
		lblhGl_1.setBackground(Color.white);
		lblhGl_1.setOpaque(true);
		
		JLabel label_1 = new JLabel("15 - 02 - 2016");
		label_1.setForeground(Color.BLACK);
		label_1.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		label_1.setBounds(66, 219, 160, 30);
		this.add(label_1);
		label_1.setBackground(Color.white);
		label_1.setOpaque(true);
		
		JLabel label_2 = new JLabel("10H00          1,2 g/L");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setBounds(45, 265, 212, 30);
		this.add(label_2);
		label_2.setBackground(Color.white);
		label_2.setOpaque(true);
		
		JLabel label_3 = new JLabel("12H00          1,8 g/L");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setBounds(45, 299, 212, 30);
		this.add(label_3);
		label_3.setBackground(Color.white);
		label_3.setOpaque(true);
		
		JLabel label_4 = new JLabel("15H00          0,8 g/L");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setBounds(45, 335, 212, 30);
		this.add(label_4);
		label_4.setBackground(Color.white);
		label_4.setOpaque(true);
		
		
		
	}

}
