package controler;

import java.awt.EventQueue;
import view.FrameMM;

public class MainControler {
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameMM myframe = new FrameMM();
					myframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
