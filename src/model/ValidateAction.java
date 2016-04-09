package model;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import view.HistoryPanel;
import view.SettingsPanel;
import view.SickPanel;

public class ValidateAction implements ActionListener {
	
	private static DataSave i;
	private String nom;
	private String prenom;
	private String age;
	private String sexe;
	private String docteur;
	private String teldocteur;
	private String telmere;
	private String telpere;
	private float rate;
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
	
	public ValidateAction (String nom, String prenom, String age, String sexe, String docteur, String teldocteur, String telmere, String telpere){
		super();
		this.nom = nom;
		this.prenom=prenom;
		this.age= age;
		this.sexe=sexe;
		this.docteur=docteur;
		this.teldocteur=teldocteur;
		this.telmere=telmere;
		this.telpere=telpere;
	}
	public ValidateAction (Float rate, String date){
		super();
		this.rate=rate;
		this.date=date;
	}
	public ValidateAction (String mal1,String mal2,String mal3,String mal4,String mal5,String mal6,String mal7,String mal8,String mal9,String mal10,String mal11,String mal12){
		super();
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
			oos.writeObject(new DataSave(nom,prenom,age,sexe,docteur,teldocteur,telmere,telpere,rate,date,mal1,mal2,mal3,mal4,mal5,mal6,mal7,mal8,mal9,mal10,mal11,mal12));
			oos.close();
			
			FileInputStream fis = new FileInputStream (fichier);
			ObjectInputStream ois = new ObjectInputStream(fis);
			Object infos = ois.readObject();
			i = (DataSave) infos;
			ois.close();
			
			System.out.println(i.getNom());
			System.out.println(i.getPrenom());
			System.out.println(i.getAge());
			System.out.println(i.getSexe());
			System.out.println(i.getDocteur());
			System.out.println(i.getTelDocteur());
			System.out.println(i.getTelMere());
			System.out.println(i.getTelPere());
			System.out.println(i.getRate());
			System.out.println(i.getDate());
			System.out.println(i.getMal1());
			System.out.println(i.getMal2());
			System.out.println(i.getMal3());
			System.out.println(i.getMal4());
			System.out.println(i.getMal5());
			System.out.println(i.getMal6());
			System.out.println(i.getMal7());
			System.out.println(i.getMal8());
			System.out.println(i.getMal9());
			System.out.println(i.getMal10());
			System.out.println(i.getMal11());
			System.out.println(i.getMal12());
		
			HistoryPanel.addRate();
		}
			catch (Exception ex){}
		
		
	}
	
	public static DataSave getInfos (){
		return i;
	}

}
