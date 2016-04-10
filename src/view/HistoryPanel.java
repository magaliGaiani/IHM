package view;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;

public class HistoryPanel extends SecondPanel {
	private static final long serialVersionUID = 1L;
	
	private static JLabel date1;
	private static int h = 20;
	private static JScrollPane scroll;
	private static JPanel pane;
	//private static final String path = "./src/img/sick/";
	//private static final int size_button = 50;

	public HistoryPanel (FrameMM frame){
		super(frame);
		
		pane = new JPanel();
		scroll = new JScrollPane(pane);
		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scroll.setViewportBorder(null);
		scroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scroll.setBounds(0, 80, 300, 310);
		this.add(scroll);
		pane.setLocation(0,0);
		pane.setLayout(null);
		pane.setAutoscrolls(true);
		pane.setPreferredSize(new Dimension(300,300));
	}
	
	public static void setDate1(String s){
		date1.setText(s);
	}
	
	public static JLabel addDate (String date){
		JLabel l = new JLabel(date);
		l.setHorizontalAlignment(SwingConstants.CENTER);
		l.setBounds(30, h, 150, 30);
		l.setBackground(Color.white);
		l.setOpaque(true);
		setPane(h);
		return l;
	}

	public static JLabel addRate (String rate){
		JLabel l = new JLabel(rate);
		l.setHorizontalAlignment(SwingConstants.CENTER);
		l.setBounds(170, h, 80, 30);
		l.setBackground(Color.white);
		l.setOpaque(true);
		setPane(h);
		h=h+40;
		return l;
	}
	
	public static JLabel addSick(String mal){
		JLabel l = new JLabel();
		//Image ne fonctionne pas !
		//l.setIcon(new ImageIcon(path+"sick.png"));
		l.setHorizontalAlignment(SwingConstants.CENTER);
		l.setBounds(170, h, 80, 30);
		//l.setBounds(170, h, size_button, size_button);
		l.setBackground(Color.white);
		l.setOpaque(true);
		setPane(h);
		h=h+40;
		return l;
	}
	
	public static JPanel getPane(){
		return pane;
	}
	public static void setPane(int h){
		pane.setPreferredSize(new Dimension(300,h+50));
	}
	
}
