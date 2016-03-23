package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class FenetreTaux extends FenetreSecondaire {

	private JButton btnEat;
	private JButton btnSport;
	private JLabel labGlycemie;
	private JLabel labInjection;
	private JLabel lblSeringue;
	private static final String path = "./src/img/";

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FenetreTaux frame = new FenetreTaux();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public FenetreTaux() {
		super();
		setContentPane(contentPane);
		
		btnEat = new JButton();
		btnEat.setIcon(new ImageIcon(path+"plate.png"));
		btnEat.setBounds(45, 200, getSize_button(), getSize_button());
		btnEat.setBorder(null);
		btnEat.setBackground(null);
		contentPane.add(btnEat);
		
		btnSport = new JButton();
		btnSport.setIcon(new ImageIcon(path+"sport.png"));
		btnSport.setBounds(175, 200, getSize_button(), getSize_button());
		btnSport.setBorder(null);
		btnSport.setBackground(null);
		contentPane.add(btnSport);
		
		//a mettre visible que si glycémie trop haute ou basse
		lblSeringue = new JLabel();
		lblSeringue.setIcon(new ImageIcon(path+"seringue.png"));
		lblSeringue.setBounds(70, 315, getSize_button(), getSize_button());
		btnSport.setBorder(null);
		btnSport.setBackground(null);
		contentPane.add(lblSeringue);
		
		//a simuler : random
		labGlycemie = new JLabel("1,4 g/L");
		labGlycemie.setHorizontalAlignment(SwingConstants.CENTER);
		labGlycemie.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		labGlycemie.setBounds(82, 90, 135, 66);
		labGlycemie.setBorder(BorderFactory.createLineBorder(Color.black));
		labGlycemie.setBackground(Color.white);
		labGlycemie.setOpaque(true);
		contentPane.add(labGlycemie);
		
		//a mettre visible que si glycémie trop haute ou basse et calculer le nombre d'unités d'insuline
		labInjection = new JLabel("2 u");
		labInjection.setForeground(Color.BLACK);
		labInjection.setHorizontalAlignment(SwingConstants.CENTER);
		labInjection.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		labInjection.setBounds(149, 328, 96, 51);
		labInjection.setBorder(BorderFactory.createLineBorder(Color.black));
		labInjection.setBackground(Color.white);
		labInjection.setOpaque(true);
		contentPane.add(labInjection);
		
	}
}
