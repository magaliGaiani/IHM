package view;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import model.CallAction;

public class PhonePanel extends SecondPanel {
	private static final long serialVersionUID = 1L;
	//changer les images par nos photos
	
	private static final int size_button = 100;
	private static JButton btnMom;
	private static JButton btnDad;
	private static JButton btnDoctor;
	private String path = "./src/img/phone/";
	private static final int h1 = 120;
	private static final int h2 = 280;
	private static final int l1 = 40;
	private static final int l2 = 160;
	private static final int l3 = 100;

	public PhonePanel(FrameMM frame) {
		super(frame);
		
		btnMom = new JButton();
		btnMom.setIcon(new ImageIcon(path+"mom.jpg"));
		btnMom.setBounds(l1, h1, size_button, size_button);
		btnMom.setBorder(null);
		btnMom.setBackground(null);
		this.add(btnMom);
		
		btnDad = new JButton();
		btnDad.setIcon(new ImageIcon(path+"dad.jpg"));
		btnDad.setBounds(l2, h1, size_button, size_button);
		btnDad.setBorder(null);
		btnDad.setBackground(null);
		this.add(btnDad);
		
		btnDoctor = new JButton();
		btnDoctor.setIcon(new ImageIcon(path+"doctor.png"));
		btnDoctor.setBounds(l3, h2, size_button, size_button);
		btnDoctor.setBorder(null);
		btnDoctor.setBackground(null);
		this.add(btnDoctor);
		
		addBtnMomAction(new CallAction(frame,"mom"));
		addBtnDadAction(new CallAction(frame,"dad"));
		addBtnDoctorAction(new CallAction(frame,"doctor"));
		
	}
	
	public static void addBtnMomAction(CallAction a){
		btnMom.addActionListener(a);
	}
	public static void addBtnDadAction(CallAction a){
		btnDad.addActionListener(a);
	}
	public static void addBtnDoctorAction(CallAction a){
		btnDoctor.addActionListener(a);
	}

}
