package model;

import java.io.Serializable;


public class DataSave implements Serializable {
	private static final long serialVersionUID = 1L;
	
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
	
	public DataSave (String n, String p, String a, String s, String d, String td, String tm, String tp, float rate, String date, String mal1,String mal2,String mal3,String mal4,String mal5,String mal6,String mal7,String mal8,String mal9,String mal10,String mal11,String mal12){
		this.nom=n;
		this.prenom=p;
		this.age=a;
		this.sexe=s;
		this.docteur=d;
		this.teldocteur=td;
		this.telmere=tm;
		this.telpere=tp;
		this.rate=rate;
		this.date=date;
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
	public float getRate(){
		return rate;
	}
	public String getDate(){
		return date;
	}
	public String getMal1(){
		return mal1;
	}
	
	public String getMal2(){
		return mal2;
	}
	public String getMal3(){
		return mal3;
	}
	public String getMal4(){
		return mal4;
	}
	public String getMal5(){
		return mal5;
	}
	public String getMal6(){
		return mal6;
	}
	public String getMal7(){
		return mal7;
	}
	public String getMal8(){
		return mal8;
	}
	public String getMal9(){
		return mal9;
	}
	public String getMal10(){
		return mal10;
	}
	public String getMal11(){
		return mal11;
	}
	public String getMal12(){
		return mal12;
	}
	
}
