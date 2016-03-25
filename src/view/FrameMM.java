package view;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FrameMM extends JFrame {
	//Fenetre crée une fenetre de taille constante et avec un contentPane avec une image de fond (ImagePanel)
	
	private static final int F_width = 300;
	private static final int F_height = 500;
	private static final int size_button = 80;
	private static final int size_sos = 60;
	private static final int h_sos = 0;
	private static final int l_sos = 240;
	private static final String path ="./src/img/";
	private JButton btnSos;
	private JLabel back;
	private static final String paththeme ="./src/img/theme/";
	
	HomePanel home = new HomePanel(size_button);
	BloodPanel blood = new BloodPanel(size_button);
	CallPanel call = new CallPanel();
	FoodPanel food = new FoodPanel(size_button);
	HistoryPanel history = new HistoryPanel();
	PhonePanel phone = new PhonePanel();
	SettingsPanel settings = new SettingsPanel();
	SickPanel sick = new SickPanel();
	SportPanel sport = new SportPanel(size_button);
	ThemePanel theme = new ThemePanel();
	
	public FrameMM() {
		setSize(F_width,F_height);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, F_width, F_height);
		getContentPane().setLayout(null);
		getContentPane().setLayout(null);
		
		btnSos = new JButton();
		btnSos.setIcon(new ImageIcon(path+"ambulance.png"));
		btnSos.setBounds(l_sos, h_sos, size_sos, size_sos);
		btnSos.setBorder(null);
		btnSos.setBackground(null);
		getContentPane().add(btnSos);
		
		back = new JLabel();
		back.setIcon(new ImageIcon(paththeme+"minion.png"));
		back.setBounds(0,0,F_width,F_height-22);
		getContentPane().add(back);
		
		this.add(home);
		//this.add(blood);
		//this.add(call);
		//this.add(food);
		//this.add(history);
		//this.add(phone);
		//this.add(settings);
		//this.add(sick);
		//this.add(sport);
		//this.add(theme);
		
		home.setVisible(true);
		//blood.setVisible(false);
		//call.setVisible(false);
		//food.setVisible(false);
		//history.setVisible(false);
		//phone.setVisible(false);
		//settings.setVisible(false);
		//sick.setVisible(false);
		//sport.setVisible(false);
		//theme.setVisible(false);
	} 

}
