package view;

import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

import model.SelectMalAction;
import model.ValidateAction;

public class SickPanel extends SecondPanel {
	private static final long serialVersionUID = 1L;
	
	private static final int size_button = 50;
	private static final int borderv = 20;
	private static final int borderh = 50;
	private static final String path = "./src/img/humeur/";
	private static JButton btnMal1;
	private static JButton btnMal2;
	private static JButton btnMal3;
	private static JButton btnMal4;
	private static JButton btnMal5;
	private static JButton btnMal6;
	private static JButton btnMal7;
	private static JButton btnMal8;
	private static JButton btnMal9;
	private static JButton btnMal10;
	private static JButton btnMal11;
	private static JButton btnMal12;
	private static JButton btnOk;
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
		btnMal1.setName("Mal à la tête");
		
		btnMal2 = new JButton();
		btnMal2.setIcon(new ImageIcon(path+"sick.png"));
		btnMal2.setBounds(borderh+75, borderv, size_button, size_button);
		btnMal2.setBorder(null);
		btnMal2.setBackground(null);
		btnMal2.setName("Mal au ventre");
		
		btnMal3 = new JButton();
		btnMal3.setIcon(new ImageIcon(path+"sick.png"));
		btnMal3.setBounds(borderh+150, borderv, size_button, size_button);
		btnMal3.setBorder(null);
		btnMal3.setBackground(null);
		btnMal3.setName("Mal à la gorge");
		
		btnMal4 = new JButton();
		btnMal4.setIcon(new ImageIcon(path+"sick.png"));
		btnMal4.setBounds(borderh, borderv+100, size_button, size_button);
		btnMal4.setBorder(null);
		btnMal4.setBackground(null);
		btnMal4.setName("Faim");
		
		btnMal5 = new JButton();
		btnMal5.setIcon(new ImageIcon(path+"sick.png"));
		btnMal5.setBounds(borderh+75, borderv+100, size_button, size_button);
		btnMal5.setBorder(null);
		btnMal5.setBackground(null);
		btnMal5.setName("Soif");
		
		btnMal6 = new JButton();
		btnMal6.setIcon(new ImageIcon(path+"sick.png"));
		btnMal6.setBounds(borderh+150, borderv+100, size_button, size_button);
		btnMal6.setBorder(null);
		btnMal6.setBackground(null);
		btnMal6.setName("Mal à la tête");
		
		btnMal7 = new JButton();
		btnMal7.setIcon(new ImageIcon(path+"sick.png"));
		btnMal7.setBounds(borderh, borderv+200, size_button, size_button);
		btnMal7.setBorder(null);
		btnMal7.setBackground(null);
		btnMal7.setName("Mal à la tête");
		
		btnMal8 = new JButton();
		btnMal8.setIcon(new ImageIcon(path+"sick.png"));
		btnMal8.setBounds(borderh+75, borderv+200, size_button, size_button);
		btnMal8.setBorder(null);
		btnMal8.setBackground(null);
		btnMal8.setName("Mal à la tête");
		
		btnMal9 = new JButton();
		btnMal9.setIcon(new ImageIcon(path+"sick.png"));
		btnMal9.setBounds(borderh+150, borderv+200, size_button, size_button);
		btnMal9.setBorder(null);
		btnMal9.setBackground(null);
		btnMal9.setName("Mal à la tête");
		
		btnMal10 = new JButton();
		btnMal10.setIcon(new ImageIcon(path+"sick.png"));
		btnMal10.setBounds(borderh, borderv+300, size_button, size_button);
		btnMal10.setBorder(null);
		btnMal10.setBackground(null);
		btnMal10.setName("Mal à la tête");
		
		btnMal11 = new JButton();
		btnMal11.setIcon(new ImageIcon(path+"sick.png"));
		btnMal11.setBounds(borderh+75, borderv+300, size_button, size_button);
		btnMal11.setBorder(null);
		btnMal11.setBackground(null);
		btnMal11.setName("Mal à la tête");
		
		btnMal12 = new JButton();
		btnMal12.setIcon(new ImageIcon(path+"sick.png"));
		btnMal12.setBounds(borderh+150, borderv+300, size_button, size_button);
		btnMal12.setBorder(null);
		btnMal12.setBackground(null);
		btnMal12.setName("Mal à la tête");
		
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
		btnOk.addActionListener(new ValidateAction(frame,selected(btnMal1),selected(btnMal2),selected(btnMal3),selected(btnMal4),selected(btnMal5),selected(btnMal6),selected(btnMal7),selected(btnMal8),selected(btnMal9),selected(btnMal10),selected(btnMal11),selected(btnMal12)));
	
		btnMal1.addActionListener(new SelectMalAction(btnMal1));
		btnMal2.addActionListener(new SelectMalAction(btnMal2));
		btnMal3.addActionListener(new SelectMalAction(btnMal3));
		btnMal4.addActionListener(new SelectMalAction(btnMal4));
		btnMal5.addActionListener(new SelectMalAction(btnMal5));
		btnMal6.addActionListener(new SelectMalAction(btnMal6));
		btnMal7.addActionListener(new SelectMalAction(btnMal7));
		btnMal8.addActionListener(new SelectMalAction(btnMal8));
		btnMal9.addActionListener(new SelectMalAction(btnMal9));
		btnMal10.addActionListener(new SelectMalAction(btnMal10));
		btnMal11.addActionListener(new SelectMalAction(btnMal11));
		btnMal12.addActionListener(new SelectMalAction(btnMal12));
		
	}
	
	public static String selected (JButton b){
		if (getImg(b).equals("./src/img/humeur/sick.png"))
			return "pas mal";
		else
			return b.getName();
	}
	
	/*
	public static String[] getSelectedMal(){
		int i=0;
		String [] list = {};
		if (getImg(btnMal1) == path+"s.png"){
			list[i]=getImg(btnMal1);
			i++;
		}
		if (getImg(btnMal2) == path+"s.png"){
			list[i]=getImg(btnMal2);
			i++;
		}
		if (getImg(btnMal3) == path+"s.png"){
			list[i]=getImg(btnMal3);
			i++;
		}
		if (getImg(btnMal4) == path+"s.png"){
			list[i]=getImg(btnMal4);
			i++;
		}
		if (getImg(btnMal5) == path+"s.png"){
			list[i]=getImg(btnMal5);
			i++;
		}
		if (getImg(btnMal6) == path+"s.png"){
			list[i]=getImg(btnMal6);
			i++;
		}
		if (getImg(btnMal7) == path+"s.png"){
			list[i]=getImg(btnMal7);
			i++;
		}
		if (getImg(btnMal8) == path+"s.png"){
			list[i]=getImg(btnMal8);
			i++;
		}
		if (getImg(btnMal9) == path+"s.png"){
			list[i]=getImg(btnMal9);
			i++;
		}
		if (getImg(btnMal10) == path+"s.png"){
			list[i]=getImg(btnMal10);
			i++;
		}
		if (getImg(btnMal11) == path+"s.png"){
			list[i]=getImg(btnMal11);
			i++;
		}
		if (getImg(btnMal12) == path+"s.png"){
			list[i]=getImg(btnMal12);
			i++;
		}
		return list;
	}
	*/
	
	public static String getImg (JButton b){
		return b.getIcon().toString();
	}
	public static void setImg (JButton b, String img){
		b.setIcon(new ImageIcon(path+img));
	}
	public static JButton getBtnMal1(){
		return btnMal1;
	}
	public static JButton getBtnMal2(){
		return btnMal2;
	}
	public static JButton getBtnMal3(){
		return btnMal3;
	}
	public static JButton getBtnMal4(){
		return btnMal4;
	}
	public static JButton getBtnMal5(){
		return btnMal5;
	}
	public static JButton getBtnMal6(){
		return btnMal6;
	}
	public static JButton getBtnMal7(){
		return btnMal7;
	}
	public static JButton getBtnMal8(){
		return btnMal8;
	}
	public static JButton getBtnMal9(){
		return btnMal9;
	}
	public static JButton getBtnMal10(){
		return btnMal10;
	}
	public static JButton getBtnMal11(){
		return btnMal11;
	}
	public static JButton getBtnMal12(){
		return btnMal12;
	}
	
}
