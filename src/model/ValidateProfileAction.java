package model;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import view.SettingsPanel;

public class ValidateProfileAction implements ActionListener {
	
	private String nom;
	private String prenom;
	private String age;
	private String sexe;
	private String docteur;
	private String teldocteur;
	private String telmere;
	private String telpere;
	private static SaveProfile iperso;
	
	public ValidateProfileAction (){
		super();
	}
	
	public void actionPerformed (ActionEvent e){
		
		nom=SettingsPanel.getNom();
		prenom=SettingsPanel.getPrenom();
		age=SettingsPanel.getAge();
		sexe=SettingsPanel.getSexe();
		docteur=SettingsPanel.getDocteur();
		teldocteur=SettingsPanel.getTelDocteur();
		telmere=SettingsPanel.getTelMere();
		telpere=SettingsPanel.getTelPere();
		
		try{
			File fichierP = new File("./src/data/dataProfile");
			FileOutputStream fosP = new FileOutputStream (fichierP);
			ObjectOutputStream oosP = new ObjectOutputStream(fosP);
			oosP.writeObject(new SaveProfile(nom,prenom,age,sexe,docteur,teldocteur,telmere,telpere));
			oosP.close();
			
			FileInputStream fisP = new FileInputStream (fichierP);
			ObjectInputStream oisP = new ObjectInputStream(fisP);
			Object infosperso = oisP.readObject();
			iperso = (SaveProfile) infosperso;
			oisP.close();
			
			System.out.println(iperso.getNom());
			System.out.println(iperso.getPrenom());
			System.out.println(iperso.getAge());
			System.out.println(iperso.getSexe());
			System.out.println(iperso.getDocteur());
			System.out.println(iperso.getTelDocteur());
			System.out.println(iperso.getTelMere());
			System.out.println(iperso.getTelPere());
		}
			catch (Exception ex){}
	}

}
