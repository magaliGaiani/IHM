package model;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import view.BloodPanel;
import view.FrameMM;

public class BloodAction implements ActionListener {
	
	private FrameMM frame;
	private BloodPanel panel;
	private static float n;

	public BloodAction (FrameMM frame, BloodPanel panel){
		super();
		this.frame=frame;
		this.panel=panel;
	}
	
	public void actionPerformed (ActionEvent e){
		//On simule le taux de glycémie
		Random rand = new Random();
		float max = (float)2.60;
		float min = (float)0.30;
		n = rand.nextFloat()*(max - min) + min;
		String s = Float.toString(n);
		String rate =s.substring(0,s.indexOf(".")+3) + " g/L";
		panel.setRate(rate);
		
		//Couleur de fond et on rend visible ou non la seringue et la dose en fonction du taux de glycémie
		if (n>0.7 && n<1.4){
			panel.setBack(Color.green);
			panel.setInjection(false);
		}
		else {
			panel.setInjection(true);
			if(n>0.5 && n>2.0){
				panel.setBack(Color.orange);
				panel.setDose("1 u");
			}
			else {
				panel.setBack(Color.red);
				panel.setDose("2 u");
			}
		}
		
		//On rend non visible le panel qui est visible
		frame.getVisiblePanel().setVisible(false);
				
		//On rend visible le panel blood
		panel.setVisible(true);
	}
	
	public static float getRate (){
		return n;
	}
	
	
}
