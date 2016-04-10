package model;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.JLabel;

import view.FrameMM;
import view.HistoryPanel;
import view.SettingsPanel;
import view.SickPanel;

public class ValidateAction implements ActionListener {
	
	private FrameMM frame;
	private static DataSave iperso;
	private static DataSave irate;
	private static DataSave isick;
	private String nom;
	private String prenom;
	private String age;
	private String sexe;
	private String docteur;
	private String teldocteur;
	private String telmere;
	private String telpere;
	private String rate;
	private String date;
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
	private String mal11;
	private String mal12;
	
	public ValidateAction (FrameMM frame, String nom, String prenom, String age, String sexe, String docteur, String teldocteur, String telmere, String telpere){
		super();
		this.frame=frame;
		this.nom = nom;
		this.prenom=prenom;
		this.age= age;
		this.sexe=sexe;
		this.docteur=docteur;
		this.teldocteur=teldocteur;
		this.telmere=telmere;
		this.telpere=telpere;
	}
	public ValidateAction (FrameMM frame, String rate, String date){
		super();
		this.frame=frame;
		this.rate=rate;
		this.date=date;
	}
	public ValidateAction (FrameMM frame, String mal1,String mal2,String mal3,String mal4,String mal5,String mal6,String mal7,String mal8,String mal9,String mal10,String mal11,String mal12){
		super();
		this.frame=frame;
		this.mal1=mal1;
		this.mal2=mal2;
		this.mal3=mal3;
		this.mal4=mal4;
		this.mal5=mal5;
		this.mal6=mal6;
		this.mal7=mal7;
		this.mal8=mal8;
		this.mal9=mal9;
		this.mal10=mal10;
		this.mal11=mal11;
		this.mal12=mal12;
	}
	
	public void actionPerformed (ActionEvent e){
		nom=SettingsPanel.getNom().getText();
		prenom=SettingsPanel.getPrenom().getText();
		age=SettingsPanel.getAge().getText();
		sexe=SettingsPanel.getSexe();
		docteur=SettingsPanel.getDocteur().getText();
		teldocteur=SettingsPanel.getTelDocteur().getText();
		telmere=SettingsPanel.getTelMere().getText();
		telpere=SettingsPanel.getTelPere().getText();
		rate=BloodAction.getRate();
		date=BloodAction.getDate();
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
		mal11=SickPanel.selected(SickPanel.getBtnMal11());
		mal12=SickPanel.selected(SickPanel.getBtnMal12());
		
		try{
			System.out.println(date);
			File fichier = new File("./src/data");
			FileOutputStream fos = new FileOutputStream (fichier);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			if (nom!=null)
				oos.writeObject(new DataSave(nom,prenom,age,sexe,docteur,teldocteur,telmere,telpere));
			if (rate!=null)
				oos.writeObject(new DataSave(rate,date));
			if(mal1!=null)
				oos.writeObject(new DataSave(mal1,mal2,mal3,mal4,mal5,mal6,mal7,mal8,mal9,mal10,mal11,mal12));
			oos.close();
			
			FileInputStream fis = new FileInputStream (fichier);
			ObjectInputStream ois = new ObjectInputStream(fis);
			Object infosperso = ois.readObject();
			Object infosrate = ois.readObject();
			Object infossick = ois.readObject();
			iperso = (DataSave) infosperso;
			irate = (DataSave) infosrate;
			isick = (DataSave) infossick;
			ois.close();
			
			System.out.println(iperso.getNom());
			System.out.println(iperso.getPrenom());
			System.out.println(iperso.getAge());
			System.out.println(iperso.getSexe());
			System.out.println(iperso.getDocteur());
			System.out.println(iperso.getTelDocteur());
			System.out.println(iperso.getTelMere());
			System.out.println(iperso.getTelPere());
			System.out.println(irate.getRate());
			System.out.println(irate.getDate());
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
			System.out.println(isick.getMal11());
			System.out.println(isick.getMal12());
			
			JLabel l =HistoryPanel.addRate(irate.getDate(),irate.getRate());
			frame.getHistoryPanel().add(l);
		}
			catch (Exception ex){}
	}
	
}
