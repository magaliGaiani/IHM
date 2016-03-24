package model;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JPanel;

import view.FrameMM;

public class NextJPanelAction extends AbstractAction {

	
	private FrameMM frame; 
	private JPanel next;
	
	public NextJPanelAction(FrameMM frame,JPanel p) {
		super();
		
		this.frame = frame;
		next=p;
	}

	public void actionPerformed(ActionEvent arg0) {
		// On cr�� une variable locale pour la visibilit� des JPanel
		// Elle a vrai (true) par d�faut
		boolean visible = true;
		
		// Si le premier JPanel est visible, on change la valeur de visible � faux (false)
		// Sinon, elle reste vrai (true)
		if (this.isVisible()) {
			visible = false;
		}
		
		// La visibilit� de myJPanel1 est celle de la variable locale visible
		this.frame.getMyJPanel1().setVisible(visible);
		// La visibilit� de myJPanel2 est l'oppos� de la variable locale visible
		this.frame.getMyJPanel2().setVisible(!visible);
	}
}