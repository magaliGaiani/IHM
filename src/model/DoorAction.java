package model;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.FrameMM;

public class DoorAction implements ActionListener {
	
	private FrameMM frame;
	
	public DoorAction (FrameMM frame){
		super();
		this.frame=frame;
	}
	
	public void actionPerformed (ActionEvent e){
		//On rend non visible le panel qui est visible
		frame.getVisiblePanel().setVisible(false);
		//On rend le panel Home visible
		frame.getHomePanel().setVisible(true);
	}
	
}
