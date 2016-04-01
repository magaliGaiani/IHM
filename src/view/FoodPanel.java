package view;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import model.ButtonAction;

public class FoodPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	
	private JLabel labFeculents;
	private JLabel labCake;
	private JLabel labMeat;
	private JLabel labFish;
	private JLabel labLegumes;
	private JLabel labFruits;
	private static JButton btnReturn;
	private static final String path = "./src/img/food/";
	private static String pathreturn = "./src/img/";
	private static final int h1 = 80;;
	private static final int h2 = 200;
	private static final int h3 = 320;
	private static final int l1 = 50;
	private static final int l2 = 170;
	private static final int lr=240;
	private static final int hr=418;
	private static final int size_r=60;
	private static final int F_width = 300;
	private static final int F_height = 500;
	private static final int marge = 22;

	public FoodPanel(FrameMM frame,int size) {
		super();
		setSize(F_width,F_height);
		setBounds(0,0,F_width,F_height-marge);
		setLayout(null);
		setOpaque(false);
		
		labFeculents = new JLabel();
		labFeculents.setBounds(l1, h1, size, size);
		this.add(labFeculents);
		
		labCake = new JLabel();
		labCake.setBounds(l2, h1, size, size);
		this.add(labCake);
		
		labMeat = new JLabel();
		labMeat.setBounds(l1, h2, size, size);
		this.add(labMeat);
		
		labFish = new JLabel();
		labFish.setBounds(l2, h2, size, size);
		this.add(labFish);
		
		labLegumes = new JLabel();
		labLegumes.setBounds(l1, h3, size, size);
		this.add(labLegumes);
		
		labFruits = new JLabel();
		labFruits.setBounds(l2, h3, size, size);
		this.add(labFruits);
	
		btnReturn = new JButton();
		btnReturn.setIcon(new ImageIcon(pathreturn+"return.png"));
		btnReturn.setBounds(lr, hr, size_r, size_r);
		btnReturn.setBorder(null);
		btnReturn.setBackground(null);
		this.add(btnReturn);
		
		//addBtnReturnAction(new ButtonAction(frame,frame.getBloodPanel()));
		
	}
	
	public static void addBtnReturnAction(ButtonAction a){
		btnReturn.addActionListener(a);
	}
	
	public void setFeculents (boolean b){
		if (b)
			labFeculents.setIcon(new ImageIcon(path+"pasta.png"));
		else
			labFeculents.setIcon(new ImageIcon(path+"no_pasta.png"));
	}
	public void setCake (boolean b){
		if (b)
			labCake.setIcon(new ImageIcon(path+"cake.png"));
		else
			labCake.setIcon(new ImageIcon(path+"no_cake.png"));
	}
	public void setMeat (boolean b){
		if (b)
			labMeat.setIcon(new ImageIcon(path+"meat.png"));
		else
			labMeat.setIcon(new ImageIcon(path+"no_meat.png"));
	}
	public void setFish (boolean b){
		if (b)
			labFish.setIcon(new ImageIcon(path+"fish.png"));
		else
			labFish.setIcon(new ImageIcon(path+"no_fish.png"));
	}
	public void setLegumes (boolean b){
		if (b)
			labLegumes.setIcon(new ImageIcon(path+"carot.png"));
		else
			labLegumes.setIcon(new ImageIcon(path+"no_carot.png"));
	}
	public void setFruits (boolean b){
		if (b)
			labFruits.setIcon(new ImageIcon(path+"fruit.png"));
		else
			labFruits.setIcon(new ImageIcon(path+"no_fruit.png"));
	}
}
