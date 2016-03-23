package view;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class FenetreSettings extends FenetreSecondaire {
	
	private JLabel lblNom;
	private JLabel lblPrenom;
	private JLabel lblAge;
	private JLabel lblSexe;
	private JLabel lblDocteur;
	private JLabel lblTelDocteur;
	private JLabel lblTelMere;
	private JLabel lblTelPere;
	private JLabel lblPhotoDoctor;
	private JLabel lblPhotoMere;
	private JLabel lblPhotoPere;
	private JTextField txtNom;
	private JTextField txtPrenom;
	private JTextField txtAge;
	private JTextField txtDocteur;
	private JTextField txtTeldocteur;
	private JTextField txtTelmere;
	private JTextField txtTelpere;
	private JTextField txtPhotodocteur;
	private JTextField txtPhotomere;
	private JTextField txtPhotopere;
	private JRadioButton rdbtnF;
	private JRadioButton rdbtnM;
	private JButton btnOk;
	private static final int size_ok = 60;
	private static final int l_ok = 110;
	private static final int h_ok = 400;
	private static final String path = "./src/img/";

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FenetreSettings frame = new FenetreSettings();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public FenetreSettings() {
		super();
		setContentPane(contentPane);
		
		lblNom = new JLabel("Nom");
		lblNom.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblNom.setBounds(30, 84, 61, 16);
		contentPane.add(lblNom);
		
		lblPrenom = new JLabel("Prénom");
		lblPrenom.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblPrenom.setBounds(30, 112, 61, 16);
		contentPane.add(lblPrenom);
		
		lblAge = new JLabel("Age");
		lblAge.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblAge.setBounds(30, 140, 61, 16);
		getContentPane().add(lblAge);
		
		lblSexe = new JLabel("Sexe");
		lblSexe.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblSexe.setBounds(30, 168, 61, 16);
		getContentPane().add(lblSexe);
		
		lblDocteur = new JLabel("Docteur");
		lblDocteur.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblDocteur.setBounds(30, 196, 61, 16);
		getContentPane().add(lblDocteur);
		
		lblTelDocteur = new JLabel("Tel Docteur");
		lblTelDocteur.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblTelDocteur.setBounds(30, 224, 80, 16);
		getContentPane().add(lblTelDocteur);
		
		lblTelMere = new JLabel("Tel Mère");
		lblTelMere.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblTelMere.setBounds(30, 252, 80, 16);
		getContentPane().add(lblTelMere);
		
		lblTelPere = new JLabel("Tel Père");
		lblTelPere.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblTelPere.setBounds(30, 280, 80, 16);
		getContentPane().add(lblTelPere);
		
		lblPhotoDoctor = new JLabel("Photo Docteur");
		lblPhotoDoctor.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblPhotoDoctor.setBounds(30, 308, 97, 16);
		getContentPane().add(lblPhotoDoctor);
		
		lblPhotoMere = new JLabel("Photo Mère");
		lblPhotoMere.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblPhotoMere.setBounds(30, 336, 97, 16);
		getContentPane().add(lblPhotoMere);
		
		lblPhotoPere = new JLabel("Photo Père");
		lblPhotoPere.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblPhotoPere.setBounds(30, 364, 97, 16);
		getContentPane().add(lblPhotoPere);
		
		txtNom = new JTextField();
		txtNom.setBounds(137, 79, 130, 26);
		getContentPane().add(txtNom);
		txtNom.setColumns(10);
		
		txtPrenom = new JTextField();
		txtPrenom.setBounds(137, 107, 130, 26);
		getContentPane().add(txtPrenom);
		txtPrenom.setColumns(10);
		
		txtAge = new JTextField();
		txtAge.setBounds(137, 135, 130, 26);
		getContentPane().add(txtAge);
		txtAge.setColumns(10);
		
		txtDocteur = new JTextField();
		txtDocteur.setBounds(137, 191, 130, 26);
		getContentPane().add(txtDocteur);
		txtDocteur.setColumns(10);
		
		txtTeldocteur = new JTextField();
		txtTeldocteur.setBounds(137, 219, 130, 26);
		getContentPane().add(txtTeldocteur);
		txtTeldocteur.setColumns(10);
		
		txtTelmere = new JTextField();
		txtTelmere.setBounds(137, 247, 130, 26);
		getContentPane().add(txtTelmere);
		txtTelmere.setColumns(10);
		
		txtTelpere = new JTextField();
		txtTelpere.setBounds(137, 275, 130, 26);
		getContentPane().add(txtTelpere);
		txtTelpere.setColumns(10);
		
		txtPhotodocteur = new JTextField();
		txtPhotodocteur.setBounds(137, 303, 130, 26);
		getContentPane().add(txtPhotodocteur);
		txtPhotodocteur.setColumns(10);
		
		txtPhotomere = new JTextField();
		txtPhotomere.setBounds(137, 331, 130, 26);
		getContentPane().add(txtPhotomere);
		txtPhotomere.setColumns(10);
		
		txtPhotopere = new JTextField();
		txtPhotopere.setBounds(137, 359, 130, 26);
		getContentPane().add(txtPhotopere);
		txtPhotopere.setColumns(10);
		
		rdbtnF = new JRadioButton("F");
		rdbtnF.setBounds(145, 164, 45, 23);
		getContentPane().add(rdbtnF);
		
		rdbtnM = new JRadioButton("M");
		rdbtnM.setBounds(202, 164, 45, 23);
		getContentPane().add(rdbtnM);
		
		btnOk = new JButton();
		btnOk.setIcon(new ImageIcon(path+"ok.png"));
		btnOk.setBounds(l_ok, h_ok, size_ok, size_ok);
		btnOk.setBackground(null);
		btnOk.setBorder(null);
		getContentPane().add(btnOk);
		
	}
}
