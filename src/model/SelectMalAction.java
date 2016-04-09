package model;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import view.SickPanel;

public class SelectMalAction implements ActionListener {
	
	private JButton b;
	
	public SelectMalAction (JButton b){
		super();
		this.b=b;
	}
	
	public void actionPerformed (ActionEvent e){
		String image = SickPanel.getImg(b);
		if (image.equals("./src/img/humeur/sick.png")){
			//System.out.println(image);
			SickPanel.setImg(b,"s.png");
			//System.out.println(SickPanel.getImg(b));
				
		}
		else{
			//System.out.println(image);
			SickPanel.setImg(b,"sick.png");
			//System.out.println(SickPanel.getImg(b));
		}
	}	
}
