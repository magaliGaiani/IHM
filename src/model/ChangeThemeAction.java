package model;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.FrameMM;

public class ChangeThemeAction implements ActionListener {

	private FrameMM frame;
	private String img;
	
	public ChangeThemeAction (FrameMM frame, String img){
		super();
		this.frame=frame;
		this.img=img;
	}
	
	public void actionPerformed (ActionEvent e){
		//On modifie le fond d'écran suivant le theme cliqué
		if (img=="reine")
			frame.setBack("reine_neiges.png");
		if (img=="minion")
			frame.setBack("minion.png");
		if (img=="cars")
			frame.setBack("cars.png");
		if (img=="starwars")
			frame.setBack("star_wars.png");
	}
	
}
