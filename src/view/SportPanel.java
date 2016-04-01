package view;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import model.ButtonAction;

public class SportPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	
	private JLabel labRun;
	private JLabel labBike;
	private JLabel labDance;
	private JLabel labSwim;
	private JLabel labTimeRun;
	private JLabel labTimeBike;
	private JLabel labTimeDance;
	private JLabel labTimeSwim;
	private static JButton btnReturn;
	private static String path = "./src/img/sport/";
	private static String pathreturn = "./src/img/";
	private int size_temps = 60;
	private static final int l_sport = 50;
	private static final int l_time = 160;
	private static final int h1=60;
	private static final int h2=150;
	private static final int h3=240;
	private static final int h4=330;
	private static final int lr=240;
	private static final int hr=418;
	private static final int size_r=60;
	private static final int F_width = 300;
	private static final int F_height = 500;
	private static final int marge = 22;
	
	public SportPanel (FrameMM frame, int size){
		super();
		setSize(F_width,F_height);
		setBounds(0,0,F_width,F_height-marge);
		setLayout(null);
		setOpaque(false);
		
		labRun = new JLabel();
		labRun.setBounds(l_sport, h1, size, size);
		labRun.setIcon(new ImageIcon(path+"run.png"));
		this.add(labRun);
		
		labBike = new JLabel();
		labBike.setBounds(l_sport, h2, size, size);
		labBike.setIcon(new ImageIcon(path+"bike.png"));
		this.add(labBike);
		
		labDance = new JLabel();
		labDance.setBounds(l_sport, h3, size, size);
		labDance.setIcon(new ImageIcon(path+"dance.png"));
		this.add(labDance);
		
		labSwim = new JLabel();
		labSwim.setBounds(l_sport, h4, size, size);
		labSwim.setIcon(new ImageIcon(path+"swim.png"));
		this.add(labSwim);
		
		labTimeRun = new JLabel();
		labTimeRun.setBounds(l_time, h1+10, size_temps, size_temps);
		this.add(labTimeRun);
		
		labTimeBike = new JLabel();
		labTimeBike.setBounds(l_time, h2+10, size_temps, size_temps);
		this.add(labTimeBike);
		
		labTimeDance = new JLabel();
		labTimeDance.setBounds(l_time, h3+10, size_temps, size_temps);
		this.add(labTimeDance);
		
		labTimeSwim = new JLabel();
		labTimeSwim.setBounds(l_time, h4+10, size_temps, size_temps);
		this.add(labTimeSwim);
		
		btnReturn = new JButton();
		btnReturn.setIcon(new ImageIcon(pathreturn+"return.png"));
		btnReturn.setBounds(lr, hr, size_r, size_r);
		btnReturn.setBorder(null);
		btnReturn.setBackground(null);
		this.add(btnReturn);
		
		//addBtnReturnAction(new ButtonAction(frame,frame.getBloodPanel()));
		
	}
	
	public static void addBtnReturnAction(ButtonAction a){
		btnReturn.addActionListener(a);
	}

	public void setTime (JLabel l, int i){
		if (i==0)
			l.setIcon(new ImageIcon(path+"no.png"));
		if (i==1)
			l.setIcon(new ImageIcon(path+"15min.png"));
		if (i==2)
			l.setIcon(new ImageIcon(path+"30min.png"));
		if (i==3)
			l.setIcon(new ImageIcon(path+"45min.png"));
		if (i==4)
			l.setIcon(new ImageIcon(path+"1h.png"));
	}
	public JLabel getRun(){
		return labTimeRun;
	}
	public JLabel getBike(){
		return labTimeBike;
	}
	public JLabel getDance(){
		return labTimeDance;
	}
	public JLabel getSwim(){
		return labTimeSwim;
	}

}
