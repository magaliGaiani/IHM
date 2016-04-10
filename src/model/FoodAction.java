package model;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.FoodPanel;
import view.FrameMM;

public class FoodAction implements ActionListener {
	
	private FrameMM frame;
	private FoodPanel food;

	public FoodAction (FrameMM frame, FoodPanel food){
		super();
		this.frame=frame;
		this.food=food;
	}
	
	public void actionPerformed (ActionEvent e){
		//On change les images en fonction du taux de glycémie
		float n = BloodAction.getFRate();
		if (n>0.7 && n<1.4){
			food.setFeculents(true);
			food.setMeat(true);
			food.setFish(true);
			food.setLegumes(true);
			food.setFruits(true);
			food.setCake(true);
		}
		else {
			if(n>0.5 && n>2.0){
				food.setFeculents(false);
				food.setMeat(true);
				food.setFish(true);
				food.setLegumes(true);
				food.setFruits(false);
				food.setCake(false);
			}
			else {
				food.setFeculents(false);
				food.setMeat(false);
				food.setFish(false);
				food.setLegumes(false);
				food.setFruits(false);
				food.setCake(false);
			}
		}
		
		//On rend non visible le panel qui est visible
		frame.getVisiblePanel().setVisible(false);
				
		//On rend visible le panel food
		food.setVisible(true);
		
	}

}
