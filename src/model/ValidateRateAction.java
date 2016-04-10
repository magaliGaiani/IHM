package model;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.JLabel;

import view.HistoryPanel;

public class ValidateRateAction implements ActionListener {
	
	private String rate;
	private String date;
	private static SaveRate irate;
	
	public ValidateRateAction (){
		super();
	}
	
	public void actionPerformed (ActionEvent e){
	
		rate=BloodAction.getRate();
		date=BloodAction.getDate();
		
		try{
			File fichierR = new File("./src/data/dataRate");
			FileOutputStream fosR = new FileOutputStream (fichierR);
			ObjectOutputStream oosR = new ObjectOutputStream(fosR);
			oosR.writeObject(new SaveRate(rate,date));
			oosR.close();
			
			FileInputStream fisR = new FileInputStream (fichierR);
			ObjectInputStream oisR = new ObjectInputStream(fisR);
			Object infosrate = oisR.readObject();
			irate = (SaveRate) infosrate;
			oisR.close();
			
			System.out.println(irate.getRate());
			System.out.println(irate.getDate());
			
			JLabel l1 = HistoryPanel.addDate(irate.getDate());
			JLabel l2 = HistoryPanel.addRate(irate.getRate());
			HistoryPanel.getPane().add(l1);
			HistoryPanel.getPane().add(l2);
		}
			catch (Exception ex){}
	}

}
