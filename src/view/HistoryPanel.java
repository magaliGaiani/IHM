package view;

import java.awt.Color;
import java.awt.Font;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

import model.DataSave;

public class HistoryPanel extends SecondPanel {
	private static final long serialVersionUID = 1L;
	
	private static JLabel date1;
	private static int nbDate = 0;
	private static int nbRate = 0;
	private static DataSave i;
	private static JLabel lblhGl;

	public HistoryPanel (FrameMM frame){
		super(frame);
		
		try{
		FileInputStream fis = new FileInputStream ("./src/data");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object infos = ois.readObject();
		i = (DataSave) infos;
		ois.close();
		
		if (nbDate == 0){
			JLabel date1 = new JLabel(i.getDate().split(" ")[0]);
			date1.setHorizontalAlignment(SwingConstants.CENTER);
			date1.setBounds(45, 82, 212, 30);
			this.add(date1);
			date1.setBackground(Color.white);
			date1.setOpaque(true);
			/*
			if (nbRate > 0){
				JLabel lblhGl = new JLabel(i.getDate().split(" ")[1]+"          "+i.getRate());
				lblhGl.setHorizontalAlignment(SwingConstants.CENTER);
				lblhGl.setBounds(45, 118, 212, 30);
				this.add(lblhGl);
				lblhGl.setBackground(Color.white);
				lblhGl.setOpaque(true);
			}
			if (nbRate > 1){
				JLabel lblhGl_1 = new JLabel(i.getDate().split(" ")[1]+"          "+i.getRate());
				lblhGl_1.setHorizontalAlignment(SwingConstants.CENTER);
				lblhGl_1.setBounds(45, 154, 212, 30);
				this.add(lblhGl_1);
				lblhGl_1.setBackground(Color.white);
				lblhGl_1.setOpaque(true);
			}
			*/
		}
		}
		catch (Exception e){};
		
		JLabel label_1 = new JLabel("15 - 02 - 2016");
		label_1.setForeground(Color.BLACK);
		label_1.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		label_1.setBounds(66, 219, 160, 30);
		this.add(label_1);
		label_1.setBackground(Color.white);
		label_1.setOpaque(true);
		
		JLabel label_2 = new JLabel("10H00          1,2 g/L");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setBounds(45, 265, 212, 30);
		this.add(label_2);
		label_2.setBackground(Color.white);
		label_2.setOpaque(true);
		
		JLabel label_3 = new JLabel("12H00          1,8 g/L");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setBounds(45, 299, 212, 30);
		this.add(label_3);
		label_3.setBackground(Color.white);
		label_3.setOpaque(true);
		
		JLabel label_4 = new JLabel("15H00          0,8 g/L");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setBounds(45, 335, 212, 30);
		this.add(label_4);
		label_4.setBackground(Color.white);
		label_4.setOpaque(true);
		
		if (lblhGl!=null)
			this.add(lblhGl);
	}
	
	public static void setDate1(String s){
		date1.setText(s);
	}
	public static void addDate (){
		nbDate ++;
	}
	public static void addRate (){
		nbRate ++;
		lblhGl = new JLabel(i.getDate().split(" ")[1]+"          "+i.getRate());
		lblhGl.setHorizontalAlignment(SwingConstants.CENTER);
		lblhGl.setBounds(45, 118, 212, 30);
		lblhGl.setBackground(Color.white);
		lblhGl.setOpaque(true);
	}

}
