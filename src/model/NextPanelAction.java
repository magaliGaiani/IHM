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
		// On créé une variable locale pour la visibilité des JPanel
		// Elle a vrai (true) par défaut
		boolean visible = true;
		
		// Si le premier JPanel est visible, on change la valeur de visible à faux (false)
		// Sinon, elle reste vrai (true)
		if (this.isVisible()) {
			visible = false;
		}
		
		// La visibilité de myJPanel1 est celle de la variable locale visible
		this.frame.getMyJPanel1().setVisible(visible);
		// La visibilité de myJPanel2 est l'opposé de la variable locale visible
		this.frame.getMyJPanel2().setVisible(!visible);
	}
}