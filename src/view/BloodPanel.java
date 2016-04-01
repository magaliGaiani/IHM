package view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import model.FoodAction;
import model.SportAction;

public class BloodPanel extends SecondPanel {
	private static final long serialVersionUID = 1L;

	private static JButton btnEat;
	private static JButton btnSport;
	private static JLabel labGlycemie;
	private static JLabel labInjection;
	private static JLabel lblSeringue;
	private static final String path = "./src/img/";

	public BloodPanel(FrameMM frame, int size) {
		super(frame);
		
		btnEat = new JButton();
		btnEat.setIcon(new ImageIcon(path+"plate.png"));
		btnEat.setBounds(45, 200, size, size);
		btnEat.setBorder(null);
		btnEat.setBackground(null);
		this.add(btnEat);
		
		btnSport = new JButton();
		btnSport.setIcon(new ImageIcon(path+"sport.png"));
		btnSport.setBounds(175, 200, size, size);
		btnSport.setBorder(null);
		btnSport.setBackground(null);
		this.add(btnSport);
		
		lblSeringue = new JLabel();
		lblSeringue.setIcon(new ImageIcon(path+"seringue.png"));
		lblSeringue.setBounds(60, 315, size, size);
		btnSport.setBorder(null);
		btnSport.setBackground(null);
		this.add(lblSeringue);
		
		labGlycemie = new JLabel();
		labGlycemie.setHorizontalAlignment(SwingConstants.CENTER);
		labGlycemie.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		labGlycemie.setBounds(75, 90, 150, 70);
		labGlycemie.setBorder(BorderFactory.createLineBorder(Color.black));
		labGlycemie.setBackground(Color.white);
		labGlycemie.setOpaque(true);
		this.add(labGlycemie);
		
		labInjection = new JLabel();
		labInjection.setForeground(Color.BLACK);
		labInjection.setHorizontalAlignment(SwingConstants.CENTER);
		labInjection.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		labInjection.setBounds(150, 328, 80, 50);
		labInjection.setBorder(BorderFactory.createLineBorder(Color.black));
		labInjection.setBackground(Color.white);
		labInjection.setOpaque(true);
		this.add(labInjection);
		
		addBtnEatAction(new FoodAction(frame,frame.getFoodPanel()));
		addBtnSportAction(new SportAction(frame,frame.getSportPanel()));
		
	}
	
	public void setRate(String s){
		labGlycemie.setText(s);
	}
	public int getRate (){
		String s = labGlycemie.getText();
		s=s.substring(0,s.indexOf(".")+3);
		int r = Integer.parseInt(s);
		return r;
	}
	public void setBack(Color c){
		labGlycemie.setBackground(c);;
	}
	public void setInjection (boolean b){
		labInjection.setVisible(b);
		lblSeringue.setVisible(b);
	}
	public void setDose (String d){
		labInjection.setText(d);
	}
	public static void addBtnEatAction(FoodAction a){
		btnEat.addActionListener(a);
	}
	public static void addBtnSportAction(SportAction a){
		btnSport.addActionListener(a);
	}
	
}
