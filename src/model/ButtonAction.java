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
		frame.getVisiblePanel().setVisible(false);
		
		next.setVisible(true);
	}
	
}
