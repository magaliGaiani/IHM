package view;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class HistoryPanel extends SecondPanel {
	private static final long serialVersionUID = 1L;
	
	private static JLabel date1;
	private static int h = 80;

	public HistoryPanel (FrameMM frame){
		super(frame);
	}
	
	public static void setDate1(String s){
		date1.setText(s);
	}

	public static JLabel addRate (String date, String rate){
		JLabel l = new JLabel(date+"     "+rate);
		l.setHorizontalAlignment(SwingConstants.CENTER);
		l.setBounds(45, h, 212, 30);
		l.setBackground(Color.white);
		l.setOpaque(true);
		h=h+40;
		return l;
	}
	
}
