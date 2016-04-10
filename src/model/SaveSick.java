package model;

import java.io.Serializable;

public class SaveSick implements Serializable {
	private static final long serialVersionUID = 1L;
	
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
	
	public SaveSick (String date, String mal1,String mal2,String mal3,String mal4,String mal5,String mal6,String mal7,String mal8, String mal9, String mal10){
		super();
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

}
