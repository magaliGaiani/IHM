package model;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.FrameMM;
import view.SportPanel;

public class SportAction implements ActionListener {
	
	private FrameMM frame;
	private SportPanel sport;

	public SportAction (FrameMM frame, SportPanel sport){
		super();
		this.frame=frame;
		this.sport=sport;
	}
	
	public void actionPerformed (ActionEvent e){
		//On change les temps en fonction du taux de glycémie
		// 0 : no / 1 : 15min / 2 : 30min / 3 : 45min / 4 : 1h
		float n = BloodAction.getFRate();
		if (n>0.7 && n<1.4){
			sport.setTime(sport.getRun(),4);
			sport.setTime(sport.getBike(),4);
			sport.setTime(sport.getDance(),4);
			sport.setTime(sport.getSwim(),4);
		}
		else {
			if(n>0.5 && n>2.0){
				sport.setTime(sport.getRun(),2);
				sport.setTime(sport.getBike(),3);
				sport.setTime(sport.getDance(),3);
				sport.setTime(sport.getSwim(),2);
			}
			else {
				sport.setTime(sport.getRun(),0);
				sport.setTime(sport.getBike(),0);
				sport.setTime(sport.getDance(),1);
				sport.setTime(sport.getSwim(),0);
			}
		}
		
		//On rend non visible le panel qui est visible
		frame.getVisiblePanel().setVisible(false);
				
		//On rend visible le panel food
		sport.setVisible(true);
		
	}

}
