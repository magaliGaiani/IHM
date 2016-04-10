package model;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import view.FrameMM;
import view.SickPanel;

public class ButtonAction implements ActionListener {
	
	private FrameMM frame;
	private JPanel next;
	
	public ButtonAction (FrameMM frame, JPanel next){
		super();
		this.frame=frame;
		this.next=next;
	}
	
	public void actionPerformed (ActionEvent e){
		//On rend non visible le panel qui est visible
		frame.getVisiblePanel().setVisible(false);
		
		//On rend visible le panel voulu (suivant le bouton)
		next.setVisible(true);
		
		//On initialise tous les boutons de SickPanel à "non cliqué"
		if (next==frame.getSickPanel()){
			SickPanel.setImg(SickPanel.getBtnMal1(),"sick.png");
			SickPanel.setImg(SickPanel.getBtnMal2(),"sick.png");
			SickPanel.setImg(SickPanel.getBtnMal3(),"sick.png");
			SickPanel.setImg(SickPanel.getBtnMal4(),"sick.png");
			SickPanel.setImg(SickPanel.getBtnMal5(),"sick.png");
			SickPanel.setImg(SickPanel.getBtnMal6(),"sick.png");
			SickPanel.setImg(SickPanel.getBtnMal7(),"sick.png");
			SickPanel.setImg(SickPanel.getBtnMal8(),"sick.png");
			SickPanel.setImg(SickPanel.getBtnMal9(),"sick.png");
			SickPanel.setImg(SickPanel.getBtnMal10(),"sick.png");
			SickPanel.setImg(SickPanel.getBtnMal11(),"sick.png");
			SickPanel.setImg(SickPanel.getBtnMal12(),"sick.png");
		}
		/*
		if (next==frame.getHistoryPanel()){
			try{
				FileInputStream fis = new FileInputStream ("./src/data");
				ObjectInputStream ois = new ObjectInputStream(fis);
				Object infos = ois.readObject();
				HistoryPanel.setI((DataSave) infos);
				ois.close();
				JLabel l =HistoryPanel.addRate();
				frame.getHistoryPanel().add(l);
			}
			catch (Exception a){};
		}
		*/
			
	}
	
}