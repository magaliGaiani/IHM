package view;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import model.ButtonAction;
import model.DoorAction;

public class FoodPanel extends SecondPanel {
	private static final long serialVersionUID = 1L;
	
	private JLabel labFeculents;
	private JLabel labCake;
	private JLabel labMeat;
	private JLabel labFish;
	private JLabel labLegumes;
	private JLabel labFruits;
	private static final String path = "./src/img/food/";
	private static final int h1 = 80;;
	private static final int h2 = 200;
	private static final int h3 = 320;
	private static final int l1 = 50;
	private static final int l2 = 170;

	public FoodPanel(FrameMM frame,int size) {
		super(frame);
		
		//mettre des images barrées et gris si glycémie trop haute : no_pasta
		labFeculents = new JLabel();
		labFeculents.setBounds(l1, h1, size, size);
		labFeculents.setIcon(new ImageIcon(path+"pasta.png"));
		this.add(labFeculents);
		
		labCake = new JLabel();
		labCake.setBounds(l2, h1, size, size);
		labCake.setIcon(new ImageIcon(path+"cake.png"));
		this.add(labCake);
		
		labMeat = new JLabel();
		labMeat.setBounds(l1, h2, size, size);
		labMeat.setIcon(new ImageIcon(path+"meat.png"));
		this.add(labMeat);
		
		labFish = new JLabel();
		labFish.setBounds(l2, h2, size, size);
		labFish.setIcon(new ImageIcon(path+"fish.png"));
		this.add(labFish);
		
		labLegumes = new JLabel();
		labLegumes.setBounds(l1, h3, size, size);
		labLegumes.setIcon(new ImageIcon(path+"carot.png"));
		this.add(labLegumes);
		
		labFruits = new JLabel();
		labFruits.setBounds(l2, h3, size, size);
		labFruits.setIcon(new ImageIcon(path+"fruit.png"));
		this.add(labFruits);
		
		//removeBtnDoorAction(getBtnDoorAction());
		//addBtnDoorAction(new ButtonAction(frame,frame.getBloodPanel()));
		
	}

}
