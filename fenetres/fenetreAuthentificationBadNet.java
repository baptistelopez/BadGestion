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

public class fenetreAuthentificationBadNet {

	private JFrame frameAuth;
	private JPasswordField pwdFldAuthMdp;
	private JTextField txtFldAuthNomUtilisateur;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					fenetreAuthentificationBadNet window = new fenetreAuthentificationBadNet();
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
	public fenetreAuthentificationBadNet() {
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
		
		JLabel lblutilisateur = new JLabel("Utilisateur : ");
		lblutilisateur.setLocale(Locale.FRANCE);
		lblutilisateur.setHorizontalAlignment(SwingConstants.CENTER);
		lblutilisateur.setBounds(0, 0, 138, 48);
		lblutilisateur.setMaximumSize(new Dimension(48, 16));
		lblutilisateur.setPreferredSize(new Dimension(36, 16));
		lblutilisateur.setMinimumSize(new Dimension(6, 16));
		lblutilisateur.setAlignmentX(Component.RIGHT_ALIGNMENT);
		frameAuth.getContentPane().add(lblutilisateur);
		
		JLabel lblmdp = new JLabel("Mot de passe :");
		lblmdp.setLocale(Locale.FRANCE);
		lblmdp.setPreferredSize(new Dimension(36, 16));
		lblmdp.setMinimumSize(new Dimension(6, 16));
		lblmdp.setMaximumSize(new Dimension(48, 16));
		lblmdp.setHorizontalAlignment(SwingConstants.CENTER);
		lblmdp.setAlignmentX(1.0f);
		lblmdp.setBounds(0, 48, 138, 48);
		frameAuth.getContentPane().add(lblmdp);
		
		pwdFldAuthMdp = new JPasswordField();
		pwdFldAuthMdp.setAutoscrolls(false);
		pwdFldAuthMdp.setToolTipText("Entrez votre mot de passe ; si vous voulez accéder en local (à l'application en elle-même) : votre mot de passe défini lors de la création de votre compte sur l'application / si vous voulez accéder à distance à Poona : votre mot de passe habituel pour l'accès à Poona.");
		pwdFldAuthMdp.setBounds(180, 61, 240, 22);
		frameAuth.getContentPane().add(pwdFldAuthMdp);
		
		txtFldAuthNomUtilisateur = new JTextField();
		txtFldAuthNomUtilisateur.setAutoscrolls(false);
		txtFldAuthNomUtilisateur.setName("Nom utilisateur");
		txtFldAuthNomUtilisateur.setToolTipText("Entrez votre nom d'utilisateur défini pour l'accès à l'application.");
		txtFldAuthNomUtilisateur.setBounds(180, 13, 240, 22);
		frameAuth.getContentPane().add(txtFldAuthNomUtilisateur);
		txtFldAuthNomUtilisateur.setColumns(10);
		
		JButton btnAuthValider = new JButton("Valider");
		btnAuthValider.setToolTipText("Valide et envoie la saisie");
		btnAuthValider.setName("Valider");
		btnAuthValider.setMnemonic(KeyEvent.VK_ACCEPT);
		btnAuthValider.setBounds(180, 158, 97, 25);
		frameAuth.getContentPane().add(btnAuthValider);
		
		JButton btnAuthAnnuler = new JButton("Annuler");
		btnAuthAnnuler.setToolTipText("Vide les champs et revient à la fenêtre ouverte en cours, ou la dernière ouverte dans son dernier état sauvegardé");
		btnAuthAnnuler.setName("Annuler");
		btnAuthAnnuler.setMnemonic(KeyEvent.VK_CANCEL);
		btnAuthAnnuler.setBounds(323, 158, 97, 25);
		frameAuth.getContentPane().add(btnAuthAnnuler);
		
		JLabel lblAuthTypeAcces = new JLabel("Rôle :");
		lblAuthTypeAcces.setToolTipText("Choisissez ce à quoi vous voulez accéder : Application si c'est le logiciel en lui-même, Poona si vous souhaitez accéder à Poona à travers l'application.");
		lblAuthTypeAcces.setPreferredSize(new Dimension(36, 16));
		lblAuthTypeAcces.setMinimumSize(new Dimension(6, 16));
		lblAuthTypeAcces.setMaximumSize(new Dimension(48, 16));
		lblAuthTypeAcces.setLocale(Locale.FRANCE);
		lblAuthTypeAcces.setHorizontalAlignment(SwingConstants.CENTER);
		lblAuthTypeAcces.setAlignmentX(1.0f);
		lblAuthTypeAcces.setBounds(0, 96, 138, 48);
		frameAuth.getContentPane().add(lblAuthTypeAcces);
		
		JComboBox cmbBxAuthPoonaTypeAcces = new JComboBox();
		cmbBxAuthPoonaTypeAcces.setToolTipText("Choisissez à quoi vous souhaitez accéder : Local (Application) si vous voulez utiliser l'application en elle-même, ou Distant (Poona) si vous voulez vous connecter sur Poona au travers de l'application.");
		cmbBxAuthPoonaTypeAcces.setName("Type d'accès Poona");
		cmbBxAuthPoonaTypeAcces.setModel(new DefaultComboBoxModel(new String[] {"Dirigeant", "Officiel technique", "Officiel technique - GEO"}));
		cmbBxAuthPoonaTypeAcces.setLocale(Locale.FRANCE);
		cmbBxAuthPoonaTypeAcces.setBounds(182, 109, 238, 22);
		frameAuth.getContentPane().add(cmbBxAuthPoonaTypeAcces);
	}
}
