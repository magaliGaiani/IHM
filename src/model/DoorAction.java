package model;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import view.HomePanel;
import view.SecondPanel;

public class DoorAction extends AbstractAction {

	public SecondPanel Fs;
	public HomePanel Fp;
	
	public DoorAction (SecondPanel fenetre){
		Fs=fenetre;
	}
	
	public void actionPerformed (ActionEvent e){
		Fp.setVisible(false);
		Fs.setVisible(true);
	}
	
}
