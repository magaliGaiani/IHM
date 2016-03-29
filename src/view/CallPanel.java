package view;

import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import model.DoorAction;

public class CallPanel extends JPanel {
	private static final long serialVersionUID = 1L;

	private FrameMM frame;
	private static JLabel labPoints;
	private static JButton btnRedphone;
	private static final int size_phone = 70;
	private static final int h_phone = 150;
	private static final int l_phone = 370;
	private static final String path = "./src/img/phone/";
	private static final int F_width = 300;
	private static final int F_height = 500;
	private static final int marge = 22;
	private JLabel back;
	private static boolean panelVisible = false;
	
	public CallPanel (FrameMM frame){
		super();
		this.frame=frame;
		setSize(F_width,F_height);
		setBounds(0,0,F_width,F_height-22);
		setLayout(null);
		setOpaque(false);
		//mettre les photos de nous à la place, suivant qui est appelé dans FenetrePhone ou image de ambulance
		
		labPoints = new JLabel("...");
		labPoints.setFont(new Font("Lucida Grande", Font.PLAIN, 50));
		labPoints.setHorizontalAlignment(SwingConstants.CENTER);
		labPoints.setBounds(64, 376, 66, 48);
		this.add(labPoints);
		
		btnRedphone = new JButton();
		btnRedphone.setIcon(new ImageIcon(path+"redphone.png"));
		btnRedphone.setBounds(h_phone, l_phone, size_phone, size_phone);
		this.add(btnRedphone);
		btnRedphone.setBorder(null);
		btnRedphone.setBackground(null);
	
		back = new JLabel();
		back.setIcon(new ImageIcon(path+"mom2.jpg"));
		back.setBounds(0,0,F_width,F_height-marge);
		this.add(back);
		
		addBtnRedphoneAction(new DoorAction(frame));
		
	}
	
	public static void addBtnRedphoneAction(DoorAction a){
		btnRedphone.addActionListener(a);
	}
	
	public void setBack(String img){
		back.setIcon(new ImageIcon(path+img));
	}
	
	public void setPanelVisible(boolean b){
		panelVisible=b;
	}
	public boolean getPanelVisible(){
		return panelVisible;
	}

}
