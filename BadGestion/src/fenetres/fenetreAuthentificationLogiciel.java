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

public class fenetreAuthentificationLogiciel {

	private JFrame frameAuthLogiciel;
	private JPasswordField pwdFldAuthLogicielMdp;
	private JTextField txtFldAuthLogicielNomUtilisateur;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					fenetreAuthentificationLogiciel window = new fenetreAuthentificationLogiciel();
					window.frameAuthLogiciel.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public fenetreAuthentificationLogiciel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frameAuthLogiciel = new JFrame();
		frameAuthLogiciel.setVisible(true);
		frameAuthLogiciel.setTitle("GestionBad - Logiciel > Authentification");
		frameAuthLogiciel.setName("Fenêtre authentification");
		frameAuthLogiciel.getContentPane().setLocale(Locale.FRANCE);
		frameAuthLogiciel.setLocale(Locale.FRANCE);
		frameAuthLogiciel.setBounds(100, 100, 480, 196);
		frameAuthLogiciel.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frameAuthLogiciel.getContentPane().setLayout(null);
		
		JLabel lblauthlogicielutilisateur = new JLabel("Utilisateur : ");
		lblauthlogicielutilisateur.setLocale(Locale.FRANCE);
		lblauthlogicielutilisateur.setHorizontalAlignment(SwingConstants.CENTER);
		lblauthlogicielutilisateur.setBounds(0, 0, 138, 48);
		lblauthlogicielutilisateur.setMaximumSize(new Dimension(48, 16));
		lblauthlogicielutilisateur.setPreferredSize(new Dimension(36, 16));
		lblauthlogicielutilisateur.setMinimumSize(new Dimension(6, 16));
		lblauthlogicielutilisateur.setAlignmentX(Component.RIGHT_ALIGNMENT);
		frameAuthLogiciel.getContentPane().add(lblauthlogicielutilisateur);
		
		JLabel lblauthlogicielmdp = new JLabel("Mot de passe :");
		lblauthlogicielmdp.setLocale(Locale.FRANCE);
		lblauthlogicielmdp.setPreferredSize(new Dimension(36, 16));
		lblauthlogicielmdp.setMinimumSize(new Dimension(6, 16));
		lblauthlogicielmdp.setMaximumSize(new Dimension(48, 16));
		lblauthlogicielmdp.setHorizontalAlignment(SwingConstants.CENTER);
		lblauthlogicielmdp.setAlignmentX(1.0f);
		lblauthlogicielmdp.setBounds(0, 48, 138, 48);
		frameAuthLogiciel.getContentPane().add(lblauthlogicielmdp);
		
		pwdFldAuthLogicielMdp = new JPasswordField();
		pwdFldAuthLogicielMdp.setAutoscrolls(false);
		pwdFldAuthLogicielMdp.setToolTipText("Entrez votre mot de passe ; si vous voulez accéder en local (à l'application en elle-même) : votre mot de passe défini lors de la création de votre compte sur l'application / si vous voulez accéder à distance à Poona : votre mot de passe habituel pour l'accès à Poona.");
		pwdFldAuthLogicielMdp.setBounds(180, 61, 240, 22);
		frameAuthLogiciel.getContentPane().add(pwdFldAuthLogicielMdp);
		
		txtFldAuthLogicielNomUtilisateur = new JTextField();
		txtFldAuthLogicielNomUtilisateur.setAutoscrolls(false);
		txtFldAuthLogicielNomUtilisateur.setName("Nom utilisateur");
		txtFldAuthLogicielNomUtilisateur.setToolTipText("Entrez votre nom d'utilisateur défini pour l'accès à l'application.");
		txtFldAuthLogicielNomUtilisateur.setBounds(180, 13, 240, 22);
		frameAuthLogiciel.getContentPane().add(txtFldAuthLogicielNomUtilisateur);
		txtFldAuthLogicielNomUtilisateur.setColumns(10);
		
		JButton btnAuthLogicielValider = new JButton("Valider");
		btnAuthLogicielValider.setToolTipText("Valide et envoie la saisie");
		btnAuthLogicielValider.setName("Valider");
		btnAuthLogicielValider.setMnemonic(KeyEvent.VK_ACCEPT);
		btnAuthLogicielValider.setBounds(180, 110, 97, 25);
		frameAuthLogiciel.getContentPane().add(btnAuthLogicielValider);
		
		JButton btnAuthLogicielAnnuler = new JButton("Annuler");
		btnAuthLogicielAnnuler.setToolTipText("Vide les champs et revient à la fenêtre ouverte en cours, ou la dernière ouverte dans son dernier état sauvegardé");
		btnAuthLogicielAnnuler.setName("Annuler");
		btnAuthLogicielAnnuler.setMnemonic(KeyEvent.VK_CANCEL);
		btnAuthLogicielAnnuler.setBounds(323, 110, 97, 25);
		frameAuthLogiciel.getContentPane().add(btnAuthLogicielAnnuler);
	}
}
