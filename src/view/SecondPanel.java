package view;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class SecondPanel extends JPanel {
	
	private static final String path = "./src/img/";
	private static final int s_door = 60;
	private static final int h_door = 418;
	private static final int l_door = 240;
	private JButton btnDoor;
	private static final int F_width = 300;
	private static final int F_height = 500;

	public SecondPanel (){
		super();
		setSize(F_width,F_height);
		setBounds(0,0,F_width,F_height-22);
		setLayout(null);

		btnDoor = new JButton();
		btnDoor.setIcon(new ImageIcon(path+"door.png"));
		btnDoor.setBounds(l_door, h_door, s_door, s_door);
		btnDoor.setBorder(null);
		btnDoor.setBackground(null);
		this.add(btnDoor);

	}

}
