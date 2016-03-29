package model;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.FrameMM;

public class CallAction implements ActionListener {

	private FrameMM frame;
	private String img;
	
	public CallAction (FrameMM frame, String img){
		super();
		this.frame=frame;
		this.img=img;
	}
	
	public void actionPerformed (ActionEvent e){
		//On rend non visible le panel qui est visible
			frame.getVisiblePanel().setVisible(false);
				
		//On rend visible le panel voulu (suivant le bouton)
			frame.getCallPanel().setVisible(true);
		
		//On modifie l'image de fond de CallPanel
		if (img=="mom")
			frame.getCallPanel().setBack("mom2.jpg");
		if (img=="dad")
			frame.getCallPanel().setBack("dad2.jpeg");
		if (img=="doctor")
			frame.getCallPanel().setBack("doctor2.png");
	}
	
}
