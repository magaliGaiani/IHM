package view;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class FenetreSecondaire extends Fenetre {
	
	private static final String path = "./IHM/src/img/";
	private static final int s_door = 60;
	private static final int h_door = 418;
	private static final int l_door = 240;
	private JButton btnDoor;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FenetreSecondaire frame = new FenetreSecondaire();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public FenetreSecondaire() {
		super();
		setContentPane(contentPane);
		
		btnDoor = new JButton();
		btnDoor.setIcon(new ImageIcon(path+"door.png"));
		btnDoor.setBounds(l_door, h_door, s_door, s_door);
		btnDoor.setBorder(null);
		btnDoor.setBackground(null);
		contentPane.add(btnDoor);
	}

}
