package model;

import java.io.Serializable;

public class SaveProfile implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String nom;
	private String prenom;
	private String age;
	private String sexe;
	private String docteur;
	private String teldocteur;
	private String telmere;
	private String telpere;
	
	public SaveProfile (String nom, String prenom, String age, String sexe, String docteur, String teldocteur, String telmere, String telpere){
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
	
	public String getNom(){
		return nom;
	}
	public String getPrenom(){
		return prenom;
	}
	public String getAge(){
		return age;
	}
	public String getSexe(){
		return sexe;
	}
	public String getDocteur(){
		return docteur;
	}
	public String getTelDocteur(){
		return teldocteur;
	}
	public String getTelMere(){
		return telmere;
	}
	public String getTelPere(){
		return telpere;
	}

}
