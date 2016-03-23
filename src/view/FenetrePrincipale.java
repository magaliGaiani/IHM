package view;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class FenetrePrincipale extends Fenetre {
	
	private JButton btnBlood;
	private JButton btnPhone;
	private JButton btnBook;
	private JButton btnSick;
	private JButton btnTheme;
	private JButton btnSettings;
	private static final int s1_blood = 70;
	private static final int s2_blood = 60;
	private static final int h_blood = 418;
	private static final int l_blood = 242;
	private static final int h1 = 90;
	private static final int h2 = 200;
	private static final int h3 = 310;
	private static final int l1 = 45;
	private static final int l2 = 110;
	private static final int l3 = 175;
	private static final String path="./src/img/";
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FenetrePrincipale frame = new FenetrePrincipale();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public FenetrePrincipale() {
		super();
		setContentPane(contentPane);
		
		btnBlood = new JButton();
		btnBlood.setIcon(new ImageIcon(path+"sang.png"));
		btnBlood.setBounds(l_blood, h_blood, s1_blood, s2_blood);
		btnBlood.setBorder(null);
		btnBlood.setBackground(null);
		contentPane.add(btnBlood);
		
		btnPhone = new JButton();
		btnPhone.setIcon(new ImageIcon(path+"phone.png"));
		btnPhone.setBounds(l1, h1, getSize_button(), getSize_button());
		btnPhone.setBorder(null);
		btnPhone.setBackground(null);
		contentPane.add(btnPhone);
		
		btnBook = new JButton();
		btnBook.setIcon(new ImageIcon(path+"book.png"));
		btnBook.setBounds(l3, h1, getSize_button(), getSize_button());
		btnBook.setBorder(null);
		btnBook.setBackground(null);
		contentPane.add(btnBook);
		
		btnSick = new JButton();
		btnSick.setIcon(new ImageIcon(path+"bandage.png"));
		btnSick.setBounds(l2, h2, getSize_button(), getSize_button());
		btnSick.setBorder(null);
		btnSick.setBackground(null);
		contentPane.add(btnSick);
		
		btnTheme = new JButton();
		btnTheme.setIcon(new ImageIcon(path+"theme.png"));
		btnTheme.setBounds(l1, h3, getSize_button(), getSize_button());
		btnTheme.setBorder(null);
		btnTheme.setBackground(null);
		contentPane.add(btnTheme);
		
		btnSettings = new JButton();
		btnSettings.setIcon(new ImageIcon(path+"settings.png"));
		btnSettings.setBounds(l3, h3, getSize_button(), getSize_button());
		btnSettings.setBorder(null);
		btnSettings.setBackground(null);
		contentPane.add(btnSettings);
	}
	

	
}
