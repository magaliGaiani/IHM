package view;

import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import model.BloodAction;
import model.ButtonAction;

public class HomePanel extends JPanel {
	private static final long serialVersionUID = 1L;
	
	private static JButton btnBlood;
	private static JButton btnPhone;
	private static JButton btnBook;
	private static JButton btnSick;
	private static JButton btnTheme;
	private static JButton btnSettings;
	private static final int s1_blood = 70;
	private static final int s2_blood = 60;
	private static final int h_blood = 418;
	private static final int l_blood = 235;
	private static final int h1 = 90;
	private static final int h2 = 200;
	private static final int h3 = 310;
	private static final int l1 = 45;
	private static final int l2 = 110;
	private static final int l3 = 175;
	private static final String path="./src/img/";
	private static final int F_width = 300;
	private static final int F_height = 500;

	public HomePanel (FrameMM frame, int size) {
		super();
		setSize(F_width,F_height);
		setBounds(0,0,F_width,F_height-22);
		setLayout(null);
		setOpaque(false);
		
		btnBlood = new JButton();
		btnBlood.setIcon(new ImageIcon(path+"sang.png"));
		btnBlood.setBounds(l_blood, h_blood, s1_blood, s2_blood);
		btnBlood.setBorder(null);
		btnBlood.setBackground(null);
		this.add(btnBlood);	
		
		btnPhone = new JButton();
		btnPhone.setIcon(new ImageIcon(path+"phone.png"));
		btnPhone.setBounds(l1, h1, size, size);
		btnPhone.setBorder(null);
		btnPhone.setBackground(null);
		this.add(btnPhone);
		
		btnBook = new JButton();
		btnBook.setIcon(new ImageIcon(path+"book.png"));
		btnBook.setBounds(l3, h1, size, size);
		btnBook.setBorder(null);
		btnBook.setBackground(null);
		this.add(btnBook);
		
		btnSick = new JButton();
		btnSick.setIcon(new ImageIcon(path+"bandage.png"));
		btnSick.setBounds(l2, h2, size, size);
		btnSick.setBorder(null);
		btnSick.setBackground(null);
		this.add(btnSick);
		
		btnTheme = new JButton();
		btnTheme.setIcon(new ImageIcon(path+"theme.png"));
		btnTheme.setBounds(l1, h3, size, size);
		btnTheme.setBorder(null);
		btnTheme.setBackground(null);
		this.add(btnTheme);
		
		btnSettings = new JButton();
		btnSettings.setIcon(new ImageIcon(path+"settings.png"));
		btnSettings.setBounds(l3, h3, size, size);
		btnSettings.setBorder(null);
		btnSettings.setBackground(null);
		this.add(btnSettings);
		
		addBtnBloodAction(new BloodAction(frame,frame.getBloodPanel()));
		addBtnPhoneAction(new ButtonAction(frame,frame.getPhonePanel()));
		addBtnBookAction(new ButtonAction(frame,frame.getHistoryPanel()));
		addBtnSickAction(new ButtonAction(frame,frame.getSickPanel()));
		addBtnThemeAction(new ButtonAction(frame,frame.getThemePanel()));
		addBtnSettingsAction(new ButtonAction(frame,frame.getSettingsPanel()));
	}
	
	public static void addBtnBloodAction(ActionListener a){
		btnBlood.addActionListener(a);
	}
	public static void addBtnPhoneAction(ButtonAction a){
		btnPhone.addActionListener(a);
	}
	public static void addBtnBookAction(ButtonAction a){
		btnBook.addActionListener(a);
	}
	public static void addBtnSickAction(ButtonAction a){
		btnSick.addActionListener(a);
	}
	public static void addBtnThemeAction(ButtonAction a){
		btnTheme.addActionListener(a);
	}
	public static void addBtnSettingsAction(ButtonAction a){
		btnSettings.addActionListener(a);
	}
	
}