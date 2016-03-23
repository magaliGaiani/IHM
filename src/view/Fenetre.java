package view;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Fenetre extends JFrame {
	//Fenetre crée une fenetre de taille constante et avec un contentPane avec une image de fond (ImagePanel)
	
	private static final int F_width = 300;
	private static final int F_height = 500;
	private static final int size_button = 80;
	private static final int size_sos = 60;
	private static final int h_sos = 0;
	private static final int l_sos = 240;
	private static final String path ="./src/img/";
	private JButton btnSos;
	public ImagePanel contentPane; //essayer de le mettre en private ??

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fenetre frame = new Fenetre();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Fenetre() {
		setSize(F_width,F_height);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, F_width, F_height);
		contentPane = new ImagePanel("minion.png"); //plus tard : mettre FenetreTheme.getTheme()
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnSos = new JButton();
		btnSos.setIcon(new ImageIcon(path+"ambulance.png"));
		btnSos.setBounds(l_sos, h_sos, size_sos, size_sos);
		btnSos.setBorder(null);
		btnSos.setBackground(null);
		contentPane.add(btnSos);
	}

	public int getSize_button (){
		return size_button;
	}

}
