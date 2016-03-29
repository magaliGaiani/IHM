package model;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import view.FrameMM;

public class ButtonAction implements ActionListener {
	
	private FrameMM frame;
	private JPanel next;
	
	public ButtonAction (FrameMM frame, JPanel next){
		super();
		this.frame=frame;
		this.next=next;
	}
	
	public void actionPerformed (ActionEvent e){
		//On rend non visible le panel qui est visible
		frame.getVisiblePanel().setVisible(false);
		
		//On rend visible le panel voulu (suivant le bouton)
		next.setVisible(true);
	}
	
}
