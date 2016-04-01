package view;

import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class SickPanel extends SecondPanel {
	private static final long serialVersionUID = 1L;
	
	private static final int size_button = 50;
	private static final int borderv = 20;
	private static final int borderh = 50;
	private static final String path = "./src/img/humeur/";
	private JButton btnMal1;
	private JButton btnMal2;
	private JButton btnMal3;
	private JButton btnMal4;
	private JButton btnMal5;
	private JButton btnMal6;
	private JButton btnMal7;
	private JButton btnMal8;
	private JButton btnMal9;
	private JButton btnMal10;
	private JButton btnMal11;
	private JButton btnMal12;
	private JButton btnOk;
	private static final int size_ok = 60;
	private static final int l_ok = 110;
	private static final int h_ok = 400;
	private JScrollPane scroll;
	private JPanel pBtn;

	public SickPanel (FrameMM frame){
		super(frame);
		
		pBtn = new JPanel();
		scroll = new JScrollPane(pBtn);
		scroll.setViewportBorder(null);
		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scroll.setBounds(0, 80, 295, 310);
		this.add(scroll);
		pBtn.setLocation(0, 100);
		pBtn.setLayout(null);
		pBtn.setAutoscrolls(true);
		pBtn.setPreferredSize(new Dimension(300,400));
		
		btnMal1 = new JButton();
		btnMal1.setIcon(new ImageIcon(path+"sick.png"));
		btnMal1.setBounds(borderh, borderv, size_button, size_button);
		btnMal1.setBorder(null);
		btnMal1.setBackground(null);
		
		btnMal2 = new JButton();
		btnMal2.setIcon(new ImageIcon(path+"sick.png"));
		btnMal2.setBounds(borderh+75, borderv, size_button, size_button);
		btnMal2.setBorder(null);
		btnMal2.setBackground(null);
		
		btnMal3 = new JButton();
		btnMal3.setIcon(new ImageIcon(path+"sick.png"));
		btnMal3.setBounds(borderh+150, borderv, size_button, size_button);
		btnMal3.setBorder(null);
		btnMal3.setBackground(null);
		
		btnMal4 = new JButton();
		btnMal4.setIcon(new ImageIcon(path+"sick.png"));
		btnMal4.setBounds(borderh, borderv+100, size_button, size_button);
		btnMal4.setBorder(null);
		btnMal4.setBackground(null);
		
		btnMal5 = new JButton();
		btnMal5.setIcon(new ImageIcon(path+"sick.png"));
		btnMal5.setBounds(borderh+75, borderv+100, size_button, size_button);
		btnMal5.setBorder(null);
		btnMal5.setBackground(null);
		
		btnMal6 = new JButton();
		btnMal6.setIcon(new ImageIcon(path+"sick.png"));
		btnMal6.setBounds(borderh+150, borderv+100, size_button, size_button);
		btnMal6.setBorder(null);
		btnMal6.setBackground(null);
		
		btnMal7 = new JButton();
		btnMal7.setIcon(new ImageIcon(path+"sick.png"));
		btnMal7.setBounds(borderh, borderv+200, size_button, size_button);
		btnMal7.setBorder(null);
		btnMal7.setBackground(null);
		
		btnMal8 = new JButton();
		btnMal8.setIcon(new ImageIcon(path+"sick.png"));
		btnMal8.setBounds(borderh+75, borderv+200, size_button, size_button);
		btnMal8.setBorder(null);
		btnMal8.setBackground(null);
		
		btnMal9 = new JButton();
		btnMal9.setIcon(new ImageIcon(path+"sick.png"));
		btnMal9.setBounds(borderh+150, borderv+200, size_button, size_button);
		btnMal9.setBorder(null);
		btnMal9.setBackground(null);
		
		btnMal10 = new JButton();
		btnMal10.setIcon(new ImageIcon(path+"sick.png"));
		btnMal10.setBounds(borderh, borderv+300, size_button, size_button);
		btnMal10.setBorder(null);
		btnMal10.setBackground(null);
		
		btnMal11 = new JButton();
		btnMal11.setIcon(new ImageIcon(path+"sick.png"));
		btnMal11.setBounds(borderh+75, borderv+300, size_button, size_button);
		btnMal11.setBorder(null);
		btnMal11.setBackground(null);
		
		btnMal12 = new JButton();
		btnMal12.setIcon(new ImageIcon(path+"sick.png"));
		btnMal12.setBounds(borderh+150, borderv+300, size_button, size_button);
		btnMal12.setBorder(null);
		btnMal12.setBackground(null);
		
		pBtn.add(btnMal1);
		pBtn.add(btnMal2);
		pBtn.add(btnMal3);
		pBtn.add(btnMal4);
		pBtn.add(btnMal5);
		pBtn.add(btnMal6);
		pBtn.add(btnMal7);
		pBtn.add(btnMal8);
		pBtn.add(btnMal9);
		pBtn.add(btnMal10);
		pBtn.add(btnMal11);
		pBtn.add(btnMal12);
		
		btnOk = new JButton();
		btnOk.setIcon(new ImageIcon("./src/img/ok.png"));
		btnOk.setBounds(l_ok, h_ok, size_ok, size_ok);
		btnOk.setBackground(null);
		btnOk.setBorder(null);
		this.add(btnOk);

	}
}
