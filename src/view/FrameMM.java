package view;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import model.DoorAction;

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
	private JButton btnSos;
	private JLabel back;
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
		setSize(F_width,F_height);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, F_width, F_height);
		getContentPane().setLayout(null);
		getContentPane().setLayout(null);
		
		blood = new BloodPanel(size_button);
		call = new CallPanel();
		food = new FoodPanel(size_button);
		history = new HistoryPanel();
		phone = new PhonePanel();
		settings = new SettingsPanel();
		sick = new SickPanel();
		sport = new SportPanel(size_button);
		theme = new ThemePanel();
		
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
		
		btnSos = new JButton();
		btnSos.setIcon(new ImageIcon(path+"ambulance.png"));
		btnSos.setBounds(l_sos, h_sos, size_sos, size_sos);
		btnSos.setBorder(null);
		btnSos.setBackground(null);
		getContentPane().add(btnSos);
		
		back = new JLabel();
		back.setIcon(new ImageIcon(paththeme+"minion.png"));
		back.setBounds(0,0,F_width,F_height-marge);
		getContentPane().add(back);
		
		SecondPanel.setBtnDoorAction(new DoorAction(this));

		home.setVisible(home.getPanelVisible());
		blood.setVisible(blood.getPanelVisible());
		call.setVisible(call.getPanelVisible());
		food.setVisible(food.getPanelVisible());
		history.setVisible(history.getPanelVisible());
		phone.setVisible(phone.getPanelVisible());
		settings.setVisible(settings.getPanelVisible());
		sick.setVisible(sick.getPanelVisible());
		sport.setVisible(sport.getPanelVisible());
		//theme.setVisible(theme.getPanelVisible());
		theme.setPanelVisible(true);
		
	}
	
	public HomePanel getHomePanel(){
		if (this.home == null)
			home = new HomePanel(size_button);
		return home;
	}
	public BloodPanel getBloodPanel(){
		if (this.blood == null)
			blood = new BloodPanel(size_button);
		return blood;
	}
	public CallPanel getCallPanel(){
		if (this.call == null)
			call = new CallPanel();
		return call;
	}
	public FoodPanel getFoodPanel(){
		if (this.food == null)
			food = new FoodPanel(size_button);
		return food;
	}
	public HistoryPanel getHistoryPanel(){
		if (this.history == null)
			history = new HistoryPanel();
		return history;
	}
	public PhonePanel getPhonePanel(){
		if (this.phone == null)
			phone = new PhonePanel();
		return phone;
	}
	public SettingsPanel getSettingsPanel(){
		if (this.settings == null)
			settings = new SettingsPanel();
		return settings;
	}
	public SickPanel getSickPanel(){
		if (this.sick == null)
			sick = new SickPanel();
		return sick;
	}
	public SportPanel getSportPanel(){
		if (this.sport == null)
			sport = new SportPanel(size_button);
		return sport;
	}
	public ThemePanel getThemePanel(){
		if (this.theme == null)
			theme = new ThemePanel();
		return theme;
	}


}
