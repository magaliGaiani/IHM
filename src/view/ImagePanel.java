package view;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class ImagePanel extends JPanel {	
	//ImagePanel crée un JPanel avec une image de fond passée en argument
	
	private Image img = null;
	private String path = "./src/img/theme/";
	
	public ImagePanel(String img) {
		this.img = new ImageIcon(path+img).getImage();
	}

	public void paintComponent(Graphics g){
		g.drawImage(img,0,0,null);
	}
	
	public void setImage(String s){
		img = new ImageIcon(path+s).getImage();
		repaint();
	}
	
	public void setImage(String path, String s){
		img = new ImageIcon(path+s).getImage();
		repaint();
	}
	
}
