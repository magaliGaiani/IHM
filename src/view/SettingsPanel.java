package view;

import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import model.ValidateAction;

public class SettingsPanel extends SecondPanel {
	private static final long serialVersionUID = 1L;
	
	private static JLabel lblNom;
	private static JLabel lblPrenom;
	private static JLabel lblAge;
	private static JLabel lblSexe;
	private static JLabel lblDocteur;
	private static JLabel lblTelDocteur;
	private static JLabel lblTelMere;
	private static JLabel lblTelPere;
	private static JLabel lblPhotoDoctor;
	private static JLabel lblPhotoMere;
	private static JLabel lblPhotoPere;
	private static JTextField txtNom;
	private static JTextField txtPrenom;
	private static JTextField txtAge;
	private static JTextField txtDocteur;
	private static JTextField txtTeldocteur;
	private static JTextField txtTelmere;
	private static JTextField txtTelpere;
	private static JTextField txtPhotodocteur;
	private static JTextField txtPhotomere;
	private static JTextField txtPhotopere;
	private static JRadioButton rdbtnF;
	private static JRadioButton rdbtnM;
	private static ButtonGroup group;
	private static JButton btnOk;
	private static final int size_ok = 60;
	private static final int l_ok = 110;
	private static final int h_ok = 400;
	private static final String path = "./src/img/";

	public SettingsPanel (FrameMM frame){
		super(frame);
		
		lblNom = new JLabel("Nom");
		lblNom.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblNom.setBounds(30, 84, 61, 16);
		this.add(lblNom);
		
		lblPrenom = new JLabel("Prénom");
		lblPrenom.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblPrenom.setBounds(30, 112, 61, 16);
		this.add(lblPrenom);
		
		lblAge = new JLabel("Age");
		lblAge.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblAge.setBounds(30, 140, 61, 16);
		this.add(lblAge);
		
		lblSexe = new JLabel("Sexe");
		lblSexe.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblSexe.setBounds(30, 168, 61, 16);
		this.add(lblSexe);
		
		lblDocteur = new JLabel("Docteur");
		lblDocteur.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblDocteur.setBounds(30, 196, 61, 16);
		this.add(lblDocteur);
		
		lblTelDocteur = new JLabel("Tel Docteur");
		lblTelDocteur.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblTelDocteur.setBounds(30, 224, 80, 16);
		this.add(lblTelDocteur);
		
		lblTelMere = new JLabel("Tel Mère");
		lblTelMere.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblTelMere.setBounds(30, 252, 80, 16);
		this.add(lblTelMere);
		
		lblTelPere = new JLabel("Tel Père");
		lblTelPere.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblTelPere.setBounds(30, 280, 80, 16);
		this.add(lblTelPere);
		
		lblPhotoDoctor = new JLabel("Photo Docteur");
		lblPhotoDoctor.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblPhotoDoctor.setBounds(30, 308, 97, 16);
		this.add(lblPhotoDoctor);
		
		lblPhotoMere = new JLabel("Photo Mère");
		lblPhotoMere.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblPhotoMere.setBounds(30, 336, 97, 16);
		this.add(lblPhotoMere);
		
		lblPhotoPere = new JLabel("Photo Père");
		lblPhotoPere.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblPhotoPere.setBounds(30, 364, 97, 16);
		this.add(lblPhotoPere);
		
		txtNom = new JTextField();
		txtNom.setBounds(137, 79, 130, 26);
		this.add(txtNom);
		txtNom.setColumns(10);
		
		txtPrenom = new JTextField();
		txtPrenom.setBounds(137, 107, 130, 26);
		this.add(txtPrenom);
		txtPrenom.setColumns(10);
		
		txtAge = new JTextField();
		txtAge.setBounds(137, 135, 130, 26);
		this.add(txtAge);
		txtAge.setColumns(10);
		
		txtDocteur = new JTextField();
		txtDocteur.setBounds(137, 191, 130, 26);
		this.add(txtDocteur);
		txtDocteur.setColumns(10);
		
		txtTeldocteur = new JTextField();
		txtTeldocteur.setBounds(137, 219, 130, 26);
		this.add(txtTeldocteur);
		txtTeldocteur.setColumns(10);
		
		txtTelmere = new JTextField();
		txtTelmere.setBounds(137, 247, 130, 26);
		this.add(txtTelmere);
		txtTelmere.setColumns(10);
		
		txtTelpere = new JTextField();
		txtTelpere.setBounds(137, 275, 130, 26);
		this.add(txtTelpere);
		txtTelpere.setColumns(10);
		
		txtPhotodocteur = new JTextField();
		txtPhotodocteur.setBounds(137, 303, 130, 26);
		this.add(txtPhotodocteur);
		txtPhotodocteur.setColumns(10);
		
		txtPhotomere = new JTextField();
		txtPhotomere.setBounds(137, 331, 130, 26);
		this.add(txtPhotomere);
		txtPhotomere.setColumns(10);
		
		txtPhotopere = new JTextField();
		txtPhotopere.setBounds(137, 359, 130, 26);
		this.add(txtPhotopere);
		txtPhotopere.setColumns(10);
		
		rdbtnF = new JRadioButton("F");
		rdbtnF.setBounds(145, 164, 45, 23);
		this.add(rdbtnF);
		
		rdbtnM = new JRadioButton("M");
		rdbtnM.setBounds(202, 164, 45, 23);
		this.add(rdbtnM);
		
		group = new ButtonGroup();
	    group.add(rdbtnF);
	    group.add(rdbtnM);
		
		btnOk = new JButton();
		btnOk.setIcon(new ImageIcon(path+"ok.png"));
		btnOk.setBounds(l_ok, h_ok, size_ok, size_ok);
		btnOk.setBackground(null);
		btnOk.setBorder(null);
		this.add(btnOk);
		btnOk.addActionListener(new ValidateAction(getNom().getText(),getPrenom().getText(),getAge().getText(),getSexe(),getDocteur().getText(),getTelDocteur().getText(),getTelMere().getText(),getTelPere().getText()));
	}
	
	public static String getSexe(){
		if (rdbtnF.isSelected())
			return "F";
		else {
			if (rdbtnM.isSelected())
				return "M";
			else
				return "Inconnu";
		}
	}
	public static JTextField getNom(){
		return txtNom;
	}
	public static JTextField getPrenom(){
		return txtPrenom;
	}
	public static JTextField getAge(){
		return txtAge;
	}
	public static JTextField getDocteur(){
		return txtDocteur;
	}
	public static JTextField getTelDocteur(){
		return txtTeldocteur;
	}
	public static JTextField getTelMere(){
		return txtTelmere;
	}
	public static JTextField getTelPere(){
		return txtTelpere;
	}
	public static JTextField getPhotoDocteur(){
		return txtPhotodocteur;
	}
	public static JTextField getPhotoMere(){
		return txtPhotomere;
	}
	public static JTextField getPhotoPere(){
		return txtPhotopere;
	}


}
