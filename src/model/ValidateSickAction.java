package model;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JLabel;

import view.HistoryPanel;
import view.SickPanel;

public class ValidateSickAction implements ActionListener {
	
	private String mal1;
	private String mal2;
	private String mal3;
	private String mal4;
	private String mal5;
	private String mal6;
	private String mal7;
	private String mal8;
	private String mal9;
	private String mal10;
	private static SaveSick isick;
	private static String date = (new SimpleDateFormat ("dd/MM/yyyy hh:mm")).format(new Date());;
	
	public ValidateSickAction (){
		super();
	}
	
	public void actionPerformed (ActionEvent e){
		
		mal1=SickPanel.selected(SickPanel.getBtnMal1());
		mal2=SickPanel.selected(SickPanel.getBtnMal2());
		mal3=SickPanel.selected(SickPanel.getBtnMal3());
		mal4=SickPanel.selected(SickPanel.getBtnMal4());
		mal5=SickPanel.selected(SickPanel.getBtnMal5());
		mal6=SickPanel.selected(SickPanel.getBtnMal6());
		mal7=SickPanel.selected(SickPanel.getBtnMal7());
		mal8=SickPanel.selected(SickPanel.getBtnMal8());
		mal9=SickPanel.selected(SickPanel.getBtnMal9());
		mal10=SickPanel.selected(SickPanel.getBtnMal10());
		
		try{
			File fichierS = new File("./src/data/dataSick");
			FileOutputStream fosS = new FileOutputStream (fichierS);
			ObjectOutputStream oosS = new ObjectOutputStream(fosS);
			oosS.writeObject(new SaveSick(date,mal1,mal2,mal3,mal4,mal5,mal6,mal7,mal8,mal9,mal10));
			oosS.close();
			
			FileInputStream fisS = new FileInputStream (fichierS);
			ObjectInputStream oisS = new ObjectInputStream(fisS);
			Object infossick = oisS.readObject();
			isick = (SaveSick) infossick;
			oisS.close();
			
			System.out.println(isick.getDate());
			System.out.println(isick.getMal1());
			System.out.println(isick.getMal2());
			System.out.println(isick.getMal3());
			System.out.println(isick.getMal4());
			System.out.println(isick.getMal5());
			System.out.println(isick.getMal6());
			System.out.println(isick.getMal7());
			System.out.println(isick.getMal8());
			System.out.println(isick.getMal9());
			System.out.println(isick.getMal10());
			
			if (! isick.getMal1().equals(" ")){
				JLabel l1 = HistoryPanel.addDate(isick.getDate());
				JLabel l2 = HistoryPanel.addRate(isick.getMal1());
				HistoryPanel.getPane().add(l1);
				HistoryPanel.getPane().add(l2);
			}
			if (! isick.getMal2().equals(" ")){
				JLabel l1 = HistoryPanel.addDate(isick.getDate());
				JLabel l2 = HistoryPanel.addRate(isick.getMal2());
				HistoryPanel.getPane().add(l1);
				HistoryPanel.getPane().add(l2);
			}
			if (! isick.getMal3().equals(" ")){
				JLabel l1 = HistoryPanel.addDate(isick.getDate());
				JLabel l2 = HistoryPanel.addRate(isick.getMal3());
				HistoryPanel.getPane().add(l1);
				HistoryPanel.getPane().add(l2);
			}
			if (! isick.getMal4().equals(" ")){
				JLabel l1 = HistoryPanel.addDate(isick.getDate());
				JLabel l2 = HistoryPanel.addRate(isick.getMal4());
				HistoryPanel.getPane().add(l1);
				HistoryPanel.getPane().add(l2);
			}
			if (! isick.getMal5().equals(" ")){
				JLabel l1 = HistoryPanel.addDate(isick.getDate());
				JLabel l2 = HistoryPanel.addRate(isick.getMal5());
				HistoryPanel.getPane().add(l1);
				HistoryPanel.getPane().add(l2);
			}
			if (! isick.getMal6().equals(" ")){
				JLabel l1 = HistoryPanel.addDate(isick.getDate());
				JLabel l2 = HistoryPanel.addRate(isick.getMal6());
				HistoryPanel.getPane().add(l1);
				HistoryPanel.getPane().add(l2);
			}
			if (! isick.getMal7().equals(" ")){
				JLabel l1 = HistoryPanel.addDate(isick.getDate());
				JLabel l2 = HistoryPanel.addRate(isick.getMal7());
				HistoryPanel.getPane().add(l1);
				HistoryPanel.getPane().add(l2);
			}
			if (! isick.getMal8().equals(" ")){
				JLabel l1 = HistoryPanel.addDate(isick.getDate());
				JLabel l2 = HistoryPanel.addRate(isick.getMal8());
				HistoryPanel.getPane().add(l1);
				HistoryPanel.getPane().add(l2);
			}
			if (! isick.getMal9().equals(" ")){
				JLabel l1 = HistoryPanel.addDate(isick.getDate());
				JLabel l2 = HistoryPanel.addRate(isick.getMal9());
				HistoryPanel.getPane().add(l1);
				HistoryPanel.getPane().add(l2);
			}
			if (! isick.getMal10().equals(" ")){
				JLabel l1 = HistoryPanel.addDate(isick.getDate());
				JLabel l2 = HistoryPanel.addRate(isick.getMal10());
				HistoryPanel.getPane().add(l1);
				HistoryPanel.getPane().add(l2);
			}
		}
			catch (Exception ex){}
	}

	
}
