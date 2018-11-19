package fenetres;

import java.awt.EventQueue;
import java.awt.FlowLayout;

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

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.border.LineBorder;

import traitements.authentification;

import javax.swing.AbstractListModel;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.JCheckBox;

public class fenetreAuthentificationLogiciel extends JDialog {

	private JFrame frameAuthLogiciel;
	private JPasswordField pwdFldAuthLogicielMdp;
	private JTextField txtFldAuthLogicielNomUtilisateur;
	// à l'origine : private boolean succeeded
    private boolean succeeded;
    public boolean b;
    public FenetreAccueil fenAccueil;

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
	public fenetreAuthentificationLogiciel() 
	{
		initialize();
		
		try 
        {
  		  UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");

  		}
        catch (Exception e) 
        {
  		}
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frameAuthLogiciel = new JFrame();
		frameAuthLogiciel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameAuthLogiciel.setVisible(true);
		frameAuthLogiciel.setTitle("GestionBad - Logiciel > Authentification");
		frameAuthLogiciel.setName("Fenêtre authentification");
		frameAuthLogiciel.getContentPane().setLocale(Locale.FRANCE);
		frameAuthLogiciel.setLocale(Locale.FRANCE);
		frameAuthLogiciel.setBounds(100, 100, 581, 585);
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
		pwdFldAuthLogicielMdp.setToolTipText("Entrez votre mot de passe ; si vous voulez accéder en local (à l'application en elle-même) : votre mot de passe défini lors de la création de votre compte sur l'application / si vous voulez accéder à un compte \"à distance\" (comme Poona, ICManager, BadNet, etc.) : votre mot de passe habituel pour l'accès au compte en question.");
		pwdFldAuthLogicielMdp.setBounds(180, 61, 336, 22);
		frameAuthLogiciel.getContentPane().add(pwdFldAuthLogicielMdp);
		
		txtFldAuthLogicielNomUtilisateur = new JTextField();
		txtFldAuthLogicielNomUtilisateur.setAutoscrolls(false);
		txtFldAuthLogicielNomUtilisateur.setName("Nom utilisateur");
		txtFldAuthLogicielNomUtilisateur.setToolTipText("Entrez votre nom d'utilisateur défini pour l'accès à l'application.");
		txtFldAuthLogicielNomUtilisateur.setBounds(180, 13, 336, 22);
		frameAuthLogiciel.getContentPane().add(txtFldAuthLogicielNomUtilisateur);
		txtFldAuthLogicielNomUtilisateur.setColumns(10);
		
		JButton btnAuthLogicielValider = new JButton("Valider");
		btnAuthLogicielValider.setToolTipText("Valide et envoie la saisie");
		btnAuthLogicielValider.setName("Valider");
		btnAuthLogicielValider.setMnemonic(KeyEvent.VK_ACCEPT);
		btnAuthLogicielValider.setBounds(180, 503, 97, 25);
		// ajout action btn valider
		btnAuthLogicielValider.addActionListener(new ActionListener() 
        {
 
            public void actionPerformed(ActionEvent e) 
            {
                if ( (authentification.authenticate (getUsername (), getPassword ()) )) 
                {
//                    JOptionPane.showMessageDialog(fenetreAuthentificationLogiciel.this,
//                            "Bonjour/bonsoir " + getUsername () + "!",
//                            "Authentification",
//                            JOptionPane.INFORMATION_MESSAGE);
                	succeeded = true;
//                  if (isSucceeded())
//                  {
                    fenAccueil = new fenetres.FenetreAccueil();
                    fenAccueil.setVisible(true);
                    fenAccueil.setSize(800, 600);
                    frameAuthLogiciel.dispose ();
//                }
                } 
                else 
                {
                    JOptionPane.showMessageDialog 
                    (fenetreAuthentificationLogiciel.this,
                            "Nom d'utilisateur et/ou mot de passe invalide",
                            "Authentification",
                            JOptionPane.ERROR_MESSAGE);
                    // reset username and password
                    txtFldAuthLogicielNomUtilisateur.setText ("");
                    pwdFldAuthLogicielMdp.setText ("");
                    succeeded = false;
 
                }
             // if logon successfully
//                if (isSucceeded())
//                {
//              btnLogin.setText ("Hi " + loginDlg.getUsername() + " !");
//          	fenAccueil = new fenetres.FenetreAccueil ();
//          	FenetreAccueil fenAccueil = new FenetreAccueil();
          	// (sinon, dans le if "authentification.authentificate)
          	

//                }
            }
        }
        );
		frameAuthLogiciel.getContentPane().add(btnAuthLogicielValider);
		
		JButton btnAuthLogicielAnnuler = new JButton("Annuler");
		btnAuthLogicielAnnuler.setToolTipText("Vide les champs et revient à la fenêtre ouverte en cours, ou la dernière ouverte dans son dernier état sauvegardé");
		btnAuthLogicielAnnuler.setName("Annuler");
		btnAuthLogicielAnnuler.setMnemonic(KeyEvent.VK_CANCEL);
		btnAuthLogicielAnnuler.setBounds(419, 503, 97, 25);
		btnAuthLogicielAnnuler.addActionListener(new ActionListener() {
			 
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
		frameAuthLogiciel.getContentPane().add(btnAuthLogicielAnnuler);
		
		JLabel lblRleprofil = new JLabel("Rôle(s)/profil(s) :");
		lblRleprofil.setPreferredSize(new Dimension(36, 16));
		lblRleprofil.setMinimumSize(new Dimension(6, 16));
		lblRleprofil.setMaximumSize(new Dimension(48, 16));
		lblRleprofil.setLocale(Locale.FRANCE);
		lblRleprofil.setHorizontalAlignment(SwingConstants.CENTER);
		lblRleprofil.setAlignmentX(1.0f);
		lblRleprofil.setBounds(0, 144, 138, 48);
		frameAuthLogiciel.getContentPane().add(lblRleprofil);
		
		JList list = new JList();
		list.setSelectedIndices(new int[] {1});
		list.setToolTipText("Choisissez le(s) rôle(s)/profil(s) pour le(s)quel(s) vous souhaitez utiliser le logiciel.\r\nCela peut être un/des rôle(s) dont vous relevez, dans le cas d'autorisation(s) dûment accordée(s) par une/des instance(s).\r\nLes menus disponibles dans le logiciel sont alors ceux correspondant au(x) rôle(s) sélectionné(s).\r\nLa sélection multiple se fait en maintenant la touche Ctrl + clic gauche de la souris.\r\nSi aucun rôle n'est sélectionné, vous aurez tous les menus disponibles pour le(s) rôle(s) correspondant à vos identifiants, enregistré(s) dans la base de données du logiciel.\r\nQuelle que soit le compte auquel vous vous connectez (logiciel (\"en local\"), ou compte \"à distance\" (Poona, ICManager, BadNet, etc.), les rôles qui ne correspondent pas et/ou qui vous sont inaccessibles seront grisés lors de l'actualisation après la saisie de vos informations de connexion (utilisateur + mot de passe).");
		list.setVisibleRowCount(12);
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"Arbitre/Juge de Service (JdS)", "Capitaine d'équipe IC", "Dirigeant d'instance", "Encadrant", "Formateur/évaluateur Arbitrage", "Formateur/évaluateur Juge-Arbitrage", "Formateur/évaluateur Juges de Ligne", "Juge-Arbitre (JA)", "Juge de Ligne (JdL)", "Organisateur de Compétitions (OC)", "Responsable/Coordinateur Juges de Ligne"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setForeground(Color.BLACK);
		list.setBorder(new LineBorder(UIManager.getColor("MenuBar.shadow")));
		list.setBackground(Color.WHITE);
		list.setBounds(180, 157, 336, 242);
		frameAuthLogiciel.getContentPane().add(list);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Afficher le mot de passe saisi");
		chckbxNewCheckBox.setBounds(180, 108, 336, 25);
		frameAuthLogiciel.getContentPane().add(chckbxNewCheckBox);
		
		JCheckBox chckbxPremireConnexion = new JCheckBox("<html>Première connexion ?<br>\r\n--> enregistrer l'utilisateur et le mot de passe<br>\r\ndans le gestionnaire de comptes du logiciel</html>");
		chckbxPremireConnexion.setBounds(180, 418, 336, 57);
		frameAuthLogiciel.getContentPane().add(chckbxPremireConnexion);
	}

	public void setVisible(boolean b) {
		// TODO Stub de la méthode généré automatiquement
		
	}

	public void setSize(int i, int j) {
		// TODO Stub de la méthode généré automatiquement
		
	}

	public void setLayout(FlowLayout flowLayout) {
		// TODO Stub de la méthode généré automatiquement
		
	}
	
//	public String getUsername () 
//    {
//        return tfUsername.getText ().trim ();
//    }
 
//	public String getPassword() {
//		return new String(pfPassword.getPassword());
//	}

	/**
	 * @return le pwdFldAuthLogicielMdp (getPassword)
	 */
	public String getPassword() {
		return new String (pwdFldAuthLogicielMdp.getPassword());
	}

	/**
	 * @param pwdFldAuthLogicielMdp le pwdFldAuthLogicielMdp à définir
	 */
	public void setPwdFldAuthLogicielMdp(JPasswordField pwdFldAuthLogicielMdp) {
		this.pwdFldAuthLogicielMdp = pwdFldAuthLogicielMdp;
	}

	/**
	 * @return le txtFldAuthLogicielNomUtilisateur (getUsername)
	 */
	public String getUsername() {
		return txtFldAuthLogicielNomUtilisateur.getText ().trim ();
	}

	/**
	 * @param txtFldAuthLogicielNomUtilisateur le txtFldAuthLogicielNomUtilisateur à définir
	 */
	public void setTxtFldAuthLogicielNomUtilisateur(JTextField txtFldAuthLogicielNomUtilisateur) {
		this.txtFldAuthLogicielNomUtilisateur = txtFldAuthLogicielNomUtilisateur;
	}

	/**
	 * @return le succeeded
	 */
	// à l'origine : public boolean isSucceeded
	public boolean isSucceeded() {
		return succeeded;
	}

//	/**
//	 * @param succeeded le succeeded à définir
//	 */
//	public void setSucceeded(boolean succeeded) {
//		this.succeeded = succeeded;
//	}

	/**
	 * @return le b
	 */
	public boolean isB() {
		return b;
	}

	/**
	 * @param b le b à définir
	 */
	public void setB(boolean b) {
		this.b = b;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (b ? 1231 : 1237);
		result = prime * result + (succeeded ? 1231 : 1237);
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof fenetreAuthentificationLogiciel)) {
			return false;
		}
		fenetreAuthentificationLogiciel other = (fenetreAuthentificationLogiciel) obj;
		if (b != other.b) {
			return false;
		}
		if (succeeded != other.succeeded) {
			return false;
		}
		return true;
	}

//	/* (non-Javadoc)
//	 * @see java.lang.Object#toString()
//	 */
//	@Override
//	public String toString() {
//		return "fenetreAuthentificationLogiciel [succeeded=" + succeeded + ", b=" + b + ", getPwdFldAuthLogicielMdp()="
//				+ getPassword() + ", getTxtFldAuthLogicielNomUtilisateur()="
//				+ getUsername() + ", isSucceeded()=" + isSucceeded() + ", isB()=" + isB()
//				+ ", hashCode()=" + hashCode() + ", getClass()=" + getClass() + ", toString()=" + super.toString()
//				+ "]";
//	}
	
}
