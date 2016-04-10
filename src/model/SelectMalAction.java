package model;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import view.SickPanel;

public class SelectMalAction implements ActionListener {
	
	private JButton b;
	private static final String path = "./src/img/sick/";
	
	public SelectMalAction (JButton b){
		super();
		this.b=b;
	}
	
	public void actionPerformed (ActionEvent e){
		String image = SickPanel.getImg(b);
		
		if (b==SickPanel.getBtnMal1()){
			if (image.equals(path+"sick1.png"))
				SickPanel.setImg(b,"sick1_v.png");
			else
				SickPanel.setImg(b,"sick1.png");
		}
		if (b==SickPanel.getBtnMal2()){
			if (image.equals(path+"sick2.png"))
				SickPanel.setImg(b,"sick2_v.png");
			else
				SickPanel.setImg(b,"sick2.png");
		}
		if (b==SickPanel.getBtnMal3()){
			if (image.equals(path+"sick3.png"))
				SickPanel.setImg(b,"sick3_v.png");
			else
				SickPanel.setImg(b,"sick3.png");
		}
		if (b==SickPanel.getBtnMal4()){
			if (image.equals(path+"sick4.png"))
				SickPanel.setImg(b,"sick4_v.png");
			else
				SickPanel.setImg(b,"sick4.png");
		}
		if (b==SickPanel.getBtnMal5()){
			if (image.equals(path+"sick5.png"))
				SickPanel.setImg(b,"sick5_v.png");
			else
				SickPanel.setImg(b,"sick5.png");
		}
		if (b==SickPanel.getBtnMal6()){
			if (image.equals(path+"sick6.png"))
				SickPanel.setImg(b,"sick6_v.png");
			else
				SickPanel.setImg(b,"sick6.png");
		}
		if (b==SickPanel.getBtnMal7()){
			if (image.equals(path+"sick7.png"))
				SickPanel.setImg(b,"sick7_v.png");
			else
				SickPanel.setImg(b,"sick7.png");
		}
		if (b==SickPanel.getBtnMal8()){
			if (image.equals(path+"sick8.png"))
				SickPanel.setImg(b,"sick8_v.png");
			else
				SickPanel.setImg(b,"sick8.png");
		}
		if (b==SickPanel.getBtnMal9()){
			if (image.equals(path+"sick9.png"))
				SickPanel.setImg(b,"sick9_v.png");
			else
				SickPanel.setImg(b,"sick9.png");
		}
		if (b==SickPanel.getBtnMal10()){
			if (image.equals(path+"sick10.png"))
				SickPanel.setImg(b,"sick10_v.png");
			else
				SickPanel.setImg(b,"sick10.png");
		}
	}	
}
