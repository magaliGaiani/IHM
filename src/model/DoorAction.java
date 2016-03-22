package model;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import view.FenetrePrincipale;
import view.FenetreSecondaire;

public class DoorAction extends AbstractAction {

	public FenetreSecondaire Fs;
	public FenetrePrincipale Fp;
	
	public DoorAction (FenetreSecondaire fenetre){
		Fs=fenetre;
	}
	
	public void actionPerformed (ActionEvent e){
		Fp.setVisible(false);
		Fs.setVisible(true);
	}
	
}
