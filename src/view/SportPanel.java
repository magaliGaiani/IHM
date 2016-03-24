package view;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class SportPanel extends SecondPanel {
	
	private JLabel labRun;
	private JLabel labBike;
	private JLabel labDance;
	private JLabel labSwim;
	private JLabel labTimeRun;
	private JLabel labTimeBike;
	private JLabel labTimeDance;
	private JLabel labTimeSwim;
	private String path = "./src/img/sport/";
	private int size_temps = 60;
	private static final int l_sport = 50;
	private static final int l_time = 160;
	private static final int h1=60;
	private static final int h2=150;
	private static final int h3=240;
	private static final int h4=330;
	
	public SportPanel(int size) {
		super();
		
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
		labTimeRun.setIcon(new ImageIcon(path+"15min.png"));
		this.add(labTimeRun);
		
		labTimeBike = new JLabel();
		labTimeBike.setBounds(l_time, h2+10, size_temps, size_temps);
		labTimeBike.setIcon(new ImageIcon(path+"30min.png"));
		this.add(labTimeBike);
		
		labTimeDance = new JLabel();
		labTimeDance.setBounds(l_time, h3+10, size_temps, size_temps);
		labTimeDance.setIcon(new ImageIcon(path+"1h.png"));
		this.add(labTimeDance);
		
		labTimeSwim = new JLabel();
		labTimeSwim.setBounds(l_time, h4+10, size_temps, size_temps);
		labTimeSwim.setIcon(new ImageIcon(path+"no.png"));
		this.add(labTimeSwim);
	}

}
