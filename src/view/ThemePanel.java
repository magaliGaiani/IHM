package view;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class ThemePanel extends SecondPanel {
	private static final long serialVersionUID = 1L;
	
	private JButton btnTheme1;
	private JButton btnTheme2;
	private JButton btnTheme3;
	private JButton btnTheme4;
	private static final int size_button1 = 90;
	private static final int size_button2 = 150;
	private static final int h1 = 80;
	private static final int h2 = 250;
	private static final int l1 = 40;
	private static final int l2 = 170;
	private String path = "./src/img/theme/";

	public ThemePanel (FrameMM frame){
		super(frame);
		
		btnTheme1 = new JButton();
		btnTheme1.setIcon(new ImageIcon(path+"reine_petit.jpg"));
		btnTheme1.setBounds(l1, h1, size_button1, size_button2);
		btnTheme1.setBorder(null);
		btnTheme1.setBackground(null);
		this.add(btnTheme1);
		
		btnTheme2 = new JButton();
		btnTheme2.setIcon(new ImageIcon(path+"cars_petit.jpeg"));
		btnTheme2.setBounds(l2, h1, size_button1, size_button2);
		btnTheme2.setBorder(null);
		btnTheme2.setBackground(null);
		this.add(btnTheme2);
		
		btnTheme3 = new JButton();
		btnTheme3.setIcon(new ImageIcon(path+"minion_petit.jpg"));
		btnTheme3.setBounds(l1, h2, size_button1, size_button2);
		btnTheme3.setBorder(null);
		btnTheme3.setBackground(null);
		this.add(btnTheme3);
		
		btnTheme4 = new JButton();
		btnTheme4.setIcon(new ImageIcon(path+"star_wars_petit.jpg"));
		btnTheme4.setBounds(l2, h2, size_button1, size_button2);
		btnTheme4.setBorder(null);
		btnTheme4.setBackground(null);
		this.add(btnTheme4);	

	}

}
