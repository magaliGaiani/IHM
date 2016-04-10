package view;

import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

import model.SelectMalAction;
import model.ValidateSickAction;

public class SickPanel extends SecondPanel {
	private static final long serialVersionUID = 1L;
	
	private static final int size_button = 100;
	private static final int borderv = 20;
	private static final int borderh = 30;
	private static final String path = "./src/img/sick/";
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
		pBtn.setPreferredSize(new Dimension(300,600));
		
		btnMal1 = new JButton();
		btnMal1.setIcon(new ImageIcon(path+"sick1.png"));
		btnMal1.setBounds(borderh, borderv, size_button, size_button);
		btnMal1.setBorder(null);
		btnMal1.setBackground(null);
		btnMal1.setName("Nausées");
		
		btnMal2 = new JButton();
		btnMal2.setIcon(new ImageIcon(path+"sick2.png"));
		btnMal2.setBounds(borderh+120, borderv, size_button, size_button);
		btnMal2.setBorder(null);
		btnMal2.setBackground(null);
		btnMal2.setName("Fièvre");
		
		btnMal3 = new JButton();
		btnMal3.setIcon(new ImageIcon(path+"sick3.png"));
		btnMal3.setBounds(borderh, borderv+120, size_button, size_button);
		btnMal3.setBorder(null);
		btnMal3.setBackground(null);
		btnMal3.setName("Nez bouché");
		
		btnMal4 = new JButton();
		btnMal4.setIcon(new ImageIcon(path+"sick4.png"));
		btnMal4.setBounds(borderh+120, borderv+120, size_button, size_button);
		btnMal4.setBorder(null);
		btnMal4.setBackground(null);
		btnMal4.setName("Ventre noué");
		
		btnMal5 = new JButton();
		btnMal5.setIcon(new ImageIcon(path+"sick5.png"));
		btnMal5.setBounds(borderh, borderv+240, size_button, size_button);
		btnMal5.setBorder(null);
		btnMal5.setBackground(null);
		btnMal5.setName("Courbatures");
		
		btnMal6 = new JButton();
		btnMal6.setIcon(new ImageIcon(path+"sick6.png"));
		btnMal6.setBounds(borderh+120, borderv+240, size_button, size_button);
		btnMal6.setBorder(null);
		btnMal6.setBackground(null);
		btnMal6.setName("Vertiges");
		
		btnMal7 = new JButton();
		btnMal7.setIcon(new ImageIcon(path+"sick7.png"));
		btnMal7.setBounds(borderh, borderv+360, size_button, size_button);
		btnMal7.setBorder(null);
		btnMal7.setBackground(null);
		btnMal7.setName("Faim");
		
		btnMal8 = new JButton();
		btnMal8.setIcon(new ImageIcon(path+"sick.png"));
		btnMal8.setBounds(borderh+120, borderv+360, size_button, size_button);
		btnMal8.setBorder(null);
		btnMal8.setBackground(null);
		btnMal8.setName("Soif");
		
		btnMal9 = new JButton();
		btnMal9.setIcon(new ImageIcon(path+"sick7.png"));
		btnMal9.setBounds(borderh, borderv+480, size_button, size_button);
		btnMal9.setBorder(null);
		btnMal9.setBackground(null);
		btnMal9.setName("Mal tête");
		
		btnMal10 = new JButton();
		btnMal10.setIcon(new ImageIcon(path+"sick.png"));
		btnMal10.setBounds(borderh+120, borderv+480, size_button, size_button);
		btnMal10.setBorder(null);
		btnMal10.setBackground(null);
		btnMal10.setName("Mal gorge");
		
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
		
		btnOk = new JButton();
		btnOk.setIcon(new ImageIcon("./src/img/ok.png"));
		btnOk.setBounds(l_ok, h_ok, size_ok, size_ok);
		btnOk.setBackground(null);
		btnOk.setBorder(null);
		this.add(btnOk);
		btnOk.addActionListener(new ValidateSickAction());
	
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
	}
	
	public static String selected (JButton b){
		if (b==SickPanel.getBtnMal1()){
			if (!getImg(b).equals(path+"sick1.png"))
				return b.getName();
			else
				return (" ");
		}
		if (b==SickPanel.getBtnMal2()){
			if (!getImg(b).equals(path+"sick2.png"))
				return b.getName();
			else
				return (" ");
		}
		if (b==SickPanel.getBtnMal3()){
			if (!getImg(b).equals(path+"sick3.png"))
				return b.getName();
			else
				return (" ");
		}
		if (b==SickPanel.getBtnMal4()){
			if (!getImg(b).equals(path+"sick4.png"))
				return b.getName();
			else
				return (" ");
		}
		if (b==SickPanel.getBtnMal5()){
			if (!getImg(b).equals(path+"sick5.png"))
				return b.getName();
			else
				return (" ");
		}
		if (b==SickPanel.getBtnMal6()){
			if (!getImg(b).equals(path+"sick6.png"))
				return b.getName();
			else
				return (" ");
		}
		if (b==SickPanel.getBtnMal7()){
			if (!getImg(b).equals(path+"sick7.png"))
				return b.getName();
			else
				return (" ");
		}
		if (b==SickPanel.getBtnMal8()){
			if (!getImg(b).equals(path+"sick8.png"))
				return b.getName();
			else
				return (" ");
		}
		if (b==SickPanel.getBtnMal9()){
			if (!getImg(b).equals(path+"sick9.png"))
				return b.getName();
			else
				return (" ");
		}
		else{
			if (!getImg(b).equals(path+"sick10.png"))
				return b.getName();
			else
				return (" ");
		}
	}
	
	public static String getImg (JButton b){
		return b.getIcon().toString();
	}
	public static void setImg (JButton b, String img){
		b.setIcon(new ImageIcon(path+img));
		b.setBorder(null);
		b.setBackground(null);
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
	
}
