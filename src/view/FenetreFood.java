package view;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class FenetreFood extends FenetreSecondaire {
	
	private JLabel labFeculents;
	private JLabel labCake;
	private JLabel labMeat;
	private JLabel labFish;
	private JLabel labLegumes;
	private JLabel labFruits;
	private static final String path = "./src/img/food/";
	private static final int h1=80;;
	private static final int h2=200;
	private static final int h3=320;
	private static final int l1=50;
	private static final int l2=170;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FenetreFood frame = new FenetreFood();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public FenetreFood() {
		super();
		setContentPane(contentPane);
		
		//mettre des images barrées et gris si glycémie trop haute : no_pasta
		labFeculents = new JLabel();
		labFeculents.setBounds(l1, h1, getSize_button(), getSize_button());
		labFeculents.setIcon(new ImageIcon(path+"pasta.png"));
		getContentPane().add(labFeculents);
		
		labCake = new JLabel();
		labCake.setBounds(l2, h1, getSize_button(), getSize_button());
		labCake.setIcon(new ImageIcon(path+"cake.png"));
		getContentPane().add(labCake);
		
		labMeat = new JLabel();
		labMeat.setBounds(l1, h2, getSize_button(), getSize_button());
		labMeat.setIcon(new ImageIcon(path+"meat.png"));
		getContentPane().add(labMeat);
		
		labFish = new JLabel();
		labFish.setBounds(l2, h2, getSize_button(), getSize_button());
		labFish.setIcon(new ImageIcon(path+"fish.png"));
		getContentPane().add(labFish);
		
		labLegumes = new JLabel();
		labLegumes.setBounds(l1, h3, getSize_button(), getSize_button());
		labLegumes.setIcon(new ImageIcon(path+"carot.png"));
		getContentPane().add(labLegumes);
		
		labFruits = new JLabel();
		labFruits.setBounds(l2, h3, getSize_button(), getSize_button());
		labFruits.setIcon(new ImageIcon(path+"fruit.png"));
		getContentPane().add(labFruits);
		
	}

}
