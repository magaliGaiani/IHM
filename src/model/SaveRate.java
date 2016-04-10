package model;

import java.io.Serializable;

public class SaveRate implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String rate;
	private String date;
	
	public SaveRate (String rate, String date){
		super();
		this.rate=rate;
		this.date=date;
	}
	
	public String getRate(){
		return rate;
	}
	public String getDate(){
		return date;
	}
}
