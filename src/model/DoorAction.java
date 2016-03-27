package model;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import view.FrameMM;
import view.HomePanel;

public class DoorAction extends AbstractAction {
	private static final long serialVersionUID = 1L;
	
	private FrameMM frame;
	
	public DoorAction (FrameMM frame){
		super();
		this.frame=frame;
	}
	
	public void actionPerformed (ActionEvent e){
		frame.getCallPanel().setPanelVisible(false);
		frame.getBloodPanel().setPanelVisible(false);
		frame.getFoodPanel().setPanelVisible(false);
		frame.getHistoryPanel().setPanelVisible(false);
		frame.getPhonePanel().setPanelVisible(false);
		frame.getSettingsPanel().setPanelVisible(false);
		frame.getSickPanel().setPanelVisible(false);
		frame.getSportPanel().setPanelVisible(false);
		frame.getThemePanel().setPanelVisible(false);
		
		frame.getHomePanel().setPanelVisible(true);
	}
	
}
