package view;

import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import model.ButtonAction;

public class FrameMM extends JFrame {
	private static final long serialVersionUID = 1L;
	
	private static final int F_width = 300;
	private static final int F_height = 500;
	private static final int marge = 22;
	private static final int size_button = 80;
	private static final int size_sos = 60;
	private static final int h_sos = 0;
	private static final int l_sos = 240;
	private static final String path ="./src/img/";
	private static JButton btnSos;
	private static JLabel back;
	private static final String paththeme ="./src/img/theme/";
	
	private HomePanel home = null;
	private BloodPanel blood = null;
	private CallPanel call = null;
	private FoodPanel food = null;
	private HistoryPanel history = null;
	private PhonePanel phone = null;
	private SettingsPanel settings = null;
	private SickPanel sick = null;
	private SportPanel sport = null;
	private ThemePanel theme = null;
	
	public FrameMM() {
		//Paramètres de la fenetre
		setSize(F_width,F_height);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, F_width, F_height);
		getContentPane().setLayout(null);
		getContentPane().setLayout(null);
		
		//On crée et on ajoute tous les panels à la fenetre
		this.add(getHomePanel());
		this.add(getBloodPanel());
		this.add(getCallPanel());
		this.add(getFoodPanel());
		this.add(getHistoryPanel());
		this.add(getPhonePanel());
		this.add(getSettingsPanel());
		this.add(getSickPanel());
		this.add(getSportPanel());
		this.add(getThemePanel());
		
		//Bouton SOS (ambulance)
		btnSos = new JButton();
		btnSos.setIcon(new ImageIcon(path+"ambulance.png"));
		btnSos.setBounds(l_sos, h_sos, size_sos, size_sos);
		btnSos.setBorder(null);
		btnSos.setBackground(null);
		getContentPane().add(btnSos);
		addBtnSosAction(new ButtonAction(this,call));
		
		//Fond d'écran
		back = new JLabel();
		back.setIcon(new ImageIcon(paththeme+"minion.png"));
		back.setBounds(0,0,F_width,F_height-marge);
		getContentPane().add(back);
		
		//On initialise tous les jpanel en non visible sauf un (le home panel)
		home.setVisible(true);
		blood.setVisible(false);
		call.setVisible(false);
		food.setVisible(false);
		history.setVisible(false);
		phone.setVisible(false);
		settings.setVisible(false);
		sick.setVisible(false);
		sport.setVisible(false);
		theme.setVisible(false);
		/* ou :
		home.setVisible(home.getPanelVisible());
		blood.setVisible(blood.getPanelVisible());
		call.setVisible(call.getPanelVisible());
		food.setVisible(food.getPanelVisible());
		history.setVisible(history.getPanelVisible());
		phone.setVisible(phone.getPanelVisible());
		settings.setVisible(settings.getPanelVisible());
		sick.setVisible(sick.getPanelVisible());
		sport.setVisible(sport.getPanelVisible());
		theme.setVisible(theme.getPanelVisible());
		*/
		
	}
	
	//Fonction qui retourne le panel qui est visible
	public JPanel getVisiblePanel(){
		JPanel panel = new JPanel();
		if (home.isVisible())
			panel=home;
		if (blood.isVisible())
			panel=blood;
		if (call.isVisible())
			panel=call;
		if (food.isVisible())
			panel=food;
		if (history.isVisible())
			panel=history;
		if (phone.isVisible())
			panel=phone;
		if (settings.isVisible())
			panel=settings;
		if (sick.isVisible())
			panel=sick;
		if (sport.isVisible())
			panel=sport;
		if (theme.isVisible())
			panel=theme;
		return panel;
	}
	
	public static void addBtnSosAction(ActionListener a){
		btnSos.addActionListener(a);
	}
	
	public HomePanel getHomePanel(){
		if (this.home == null)
			home = new HomePanel(this,size_button);
		return home;
	}
	public BloodPanel getBloodPanel(){
		if (this.blood == null)
			blood = new BloodPanel(this,size_button);
		return blood;
	}
	public CallPanel getCallPanel(){
		if (this.call == null)
			call = new CallPanel(this);
		return call;
	}
	public FoodPanel getFoodPanel(){
		if (this.food == null)
			food = new FoodPanel(this,size_button);
		return food;
	}
	public HistoryPanel getHistoryPanel(){
		if (this.history == null)
			history = new HistoryPanel(this);
		return history;
	}
	public PhonePanel getPhonePanel(){
		if (this.phone == null)
			phone = new PhonePanel(this);
		return phone;
	}
	public SettingsPanel getSettingsPanel(){
		if (this.settings == null)
			settings = new SettingsPanel(this);
		return settings;
	}
	public SickPanel getSickPanel(){
		if (this.sick == null)
			sick = new SickPanel(this);
		return sick;
	}
	public SportPanel getSportPanel(){
		if (this.sport == null)
			sport = new SportPanel(this,size_button);
		return sport;
	}
	public ThemePanel getThemePanel(){
		if (this.theme == null)
			theme = new ThemePanel(this);
		return theme;
	}

}
