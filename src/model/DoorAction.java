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
		frame.getVisiblePanel().setVisible(false);
		
		frame.getHomePanel().setVisible(true);
	}
	
}
