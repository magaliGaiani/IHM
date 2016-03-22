package view;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class FenetreAppel extends Fenetre {

	private JLabel labPoints;
	private JButton btnRedphone;
	private static final int size_phone = 70;
	private static final int h_phone = 150;
	private static final int l_phone = 370;
	private static final String path = "./IHM/src/img/phone/";
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FenetreAppel frame = new FenetreAppel();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public FenetreAppel() {
		super();
		setContentPane(contentPane);
		contentPane.setImage(path,"mom2.jpg");
		//mettre les photos de nous à la place, suivant qui est appelé dans FenetrePhone
		
		labPoints = new JLabel("...");
		labPoints.setFont(new Font("Lucida Grande", Font.PLAIN, 50));
		labPoints.setHorizontalAlignment(SwingConstants.CENTER);
		labPoints.setBounds(64, 376, 66, 48);
		getContentPane().add(labPoints);
		
		btnRedphone = new JButton();
		btnRedphone.setIcon(new ImageIcon(path+"redphone.png"));
		btnRedphone.setBounds(h_phone, l_phone, size_phone, size_phone);
		getContentPane().add(btnRedphone);
		btnRedphone.setBorder(null);
		btnRedphone.setBackground(null);
	
	}

}