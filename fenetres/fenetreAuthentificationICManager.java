package fenetres;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.SwingConstants;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.util.Locale;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.KeyEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class fenetreAuthentificationICManager {

	private JFrame frameAuth;
	private JPasswordField pwdFldAuthICMMdp;
	private JTextField txtFldAuthICMNomUtilisateur;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					fenetreAuthentificationICManager window = new fenetreAuthentificationICManager();
					window.frameAuth.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public fenetreAuthentificationICManager() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frameAuth = new JFrame();
		frameAuth.setVisible(true);
		frameAuth.setTitle("GestionBad - Authentification");
		frameAuth.setName("Fenêtre authentification");
		frameAuth.getContentPane().setLocale(Locale.FRANCE);
		frameAuth.setLocale(Locale.FRANCE);
		frameAuth.setBounds(100, 100, 480, 243);
		frameAuth.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frameAuth.getContentPane().setLayout(null);
		
		JLabel lblAuthICMutilisateur = new JLabel("Utilisateur : ");
		lblAuthICMutilisateur.setLocale(Locale.FRANCE);
		lblAuthICMutilisateur.setHorizontalAlignment(SwingConstants.CENTER);
		lblAuthICMutilisateur.setBounds(0, 0, 138, 48);
		lblAuthICMutilisateur.setMaximumSize(new Dimension(48, 16));
		lblAuthICMutilisateur.setPreferredSize(new Dimension(36, 16));
		lblAuthICMutilisateur.setMinimumSize(new Dimension(6, 16));
		lblAuthICMutilisateur.setAlignmentX(Component.RIGHT_ALIGNMENT);
		frameAuth.getContentPane().add(lblAuthICMutilisateur);
		
		JLabel lblAuthICMMdp = new JLabel("Mot de passe :");
		lblAuthICMMdp.setLocale(Locale.FRANCE);
		lblAuthICMMdp.setPreferredSize(new Dimension(36, 16));
		lblAuthICMMdp.setMinimumSize(new Dimension(6, 16));
		lblAuthICMMdp.setMaximumSize(new Dimension(48, 16));
		lblAuthICMMdp.setHorizontalAlignment(SwingConstants.CENTER);
		lblAuthICMMdp.setAlignmentX(1.0f);
		lblAuthICMMdp.setBounds(0, 48, 138, 48);
		frameAuth.getContentPane().add(lblAuthICMMdp);
		
		pwdFldAuthICMMdp = new JPasswordField();
		pwdFldAuthICMMdp.setAutoscrolls(false);
		pwdFldAuthICMMdp.setToolTipText("Entrez votre mot de passe ; si vous voulez accéder en local (à l'application en elle-même) : votre mot de passe défini lors de la création de votre compte sur l'application / si vous voulez accéder à distance à Poona : votre mot de passe habituel pour l'accès à Poona.");
		pwdFldAuthICMMdp.setBounds(180, 61, 240, 22);
		frameAuth.getContentPane().add(pwdFldAuthICMMdp);
		
		txtFldAuthICMNomUtilisateur = new JTextField();
		txtFldAuthICMNomUtilisateur.setAutoscrolls(false);
		txtFldAuthICMNomUtilisateur.setName("Nom utilisateur");
		txtFldAuthICMNomUtilisateur.setToolTipText("Entrez votre nom d'utilisateur défini pour l'accès à l'application.");
		txtFldAuthICMNomUtilisateur.setBounds(180, 13, 240, 22);
		frameAuth.getContentPane().add(txtFldAuthICMNomUtilisateur);
		txtFldAuthICMNomUtilisateur.setColumns(10);
		
		JButton btnAuthICMValider = new JButton("Valider");
		btnAuthICMValider.setToolTipText("Valide et envoie la saisie");
		btnAuthICMValider.setName("Valider");
		btnAuthICMValider.setMnemonic(KeyEvent.VK_ACCEPT);
		btnAuthICMValider.setBounds(180, 158, 97, 25);
		frameAuth.getContentPane().add(btnAuthICMValider);
		
		JButton btnAuthICMAnnuler = new JButton("Annuler");
		btnAuthICMAnnuler.setToolTipText("Vide les champs et revient à la fenêtre ouverte en cours, ou la dernière ouverte dans son dernier état sauvegardé");
		btnAuthICMAnnuler.setName("Annuler");
		btnAuthICMAnnuler.setMnemonic(KeyEvent.VK_CANCEL);
		btnAuthICMAnnuler.setBounds(323, 158, 97, 25);
		frameAuth.getContentPane().add(btnAuthICMAnnuler);
		
		JLabel lblAuthICMTypeAcces = new JLabel("Rôle :");
		lblAuthICMTypeAcces.setToolTipText("Choisissez ce à quoi vous voulez accéder : Application si c'est le logiciel en lui-même, Poona si vous souhaitez accéder à Poona à travers l'application.");
		lblAuthICMTypeAcces.setPreferredSize(new Dimension(36, 16));
		lblAuthICMTypeAcces.setMinimumSize(new Dimension(6, 16));
		lblAuthICMTypeAcces.setMaximumSize(new Dimension(48, 16));
		lblAuthICMTypeAcces.setLocale(Locale.FRANCE);
		lblAuthICMTypeAcces.setHorizontalAlignment(SwingConstants.CENTER);
		lblAuthICMTypeAcces.setAlignmentX(1.0f);
		lblAuthICMTypeAcces.setBounds(0, 96, 138, 48);
		frameAuth.getContentPane().add(lblAuthICMTypeAcces);
		
		JComboBox cmbBxAuthICMTypeAcces = new JComboBox();
		cmbBxAuthICMTypeAcces.setToolTipText("Choisissez à quoi vous souhaitez accéder : Local (Application) si vous voulez utiliser l'application en elle-même, ou Distant (Poona) si vous voulez vous connecter sur Poona au travers de l'application.");
		cmbBxAuthICMTypeAcces.setName("Type d'accès ICManager");
		cmbBxAuthICMTypeAcces.setModel(new DefaultComboBoxModel(new String[] {"Capitaine", "Responsable division", "Responsable IC"}));
		cmbBxAuthICMTypeAcces.setLocale(Locale.FRANCE);
		cmbBxAuthICMTypeAcces.setBounds(182, 109, 238, 22);
		frameAuth.getContentPane().add(cmbBxAuthICMTypeAcces);
	}
}
