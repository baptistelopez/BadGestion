package fenetres;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
//import fenetres.corpsFenetreGestionCompetitions;
import objets.objetCompetitions;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JSeparator;
import javax.swing.JCheckBox;
import javax.swing.JProgressBar;
import java.awt.Color;

public class fenetreGestionCompetitionsCreationEtape3Tournoi2 extends JFrame implements ActionListener {
//	private Fenetre2 fen;
	private fenetreGestionCompetitionsCreationEtape2Tournoi1 etapePrecedente;
	private fenetreGestionCompetitionsCreationEtape4Tournoi3 etapeSuivante;
	private JTextField textField_NumeroLicence;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;

//  private JButton bouton = new JButton("Appel à la corpsFenetreGestionCompetitions");


  public fenetreGestionCompetitionsCreationEtape3Tournoi2()
  {
	  
	  try 
      {
		  UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");

		}
      catch (Exception e) 
      {
		}
	  
  	setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);      

    this.setTitle("GestionBad - Gestion compétition > Création compétition > Étape 3 : Inscription de joueurs");

    this.setSize(1356, 1219);

    this.setLocationRelativeTo(null);
    getContentPane().setLayout(null);
    
    JLabel lblNumAutorisationCompetition = new JLabel("N° de licence : ");
    lblNumAutorisationCompetition.setBounds(25, 49, 104, 34);
    getContentPane().add(lblNumAutorisationCompetition);
    
    textField_NumeroLicence = new JTextField();
    textField_NumeroLicence.setToolTipText("S'il est déjà existant sous Poona, vous pouvez le saisir.\r\nSinon, s'il n'existe pas encore, le champ est grisé et inactif.");
    textField_NumeroLicence.setBounds(231, 61, 219, 22);
    getContentPane().add(textField_NumeroLicence);
    textField_NumeroLicence.setColumns(10);
    
    JLabel lblNewLabel = new JLabel("Nom :");
    lblNewLabel.setBounds(25, 90, 145, 34);
    getContentPane().add(lblNewLabel);
    
    JTextField textField_NomJoueur = new JTextField();
    textField_NomJoueur.setBounds(231, 102, 219, 22);
    getContentPane().add(textField_NomJoueur);
    
    JLabel lblModeDeComptition = new JLabel("Prénom : ");
    lblModeDeComptition.setBounds(25, 131, 145, 34);
    getContentPane().add(lblModeDeComptition);
    
    JTextField textField1_PrenomJoueur = new JTextField();
    textField1_PrenomJoueur.setToolTipText("Saisie (si fond du champ blanc)/affichage (si fond du champ grisé) du prénom du joueur");
    textField1_PrenomJoueur.setBounds(231, 143, 219, 22);
    getContentPane().add(textField1_PrenomJoueur);
    
    JLabel lblGenre = new JLabel("Genre : ");
    lblGenre.setBounds(25, 172, 175, 34);
    getContentPane().add(lblGenre);
    
    JComboBox comboBox_2_GenreJoueur = new JComboBox();
    comboBox_2_GenreJoueur.setModel(new DefaultComboBoxModel(new String[] {"F", "H"}));
    comboBox_2_GenreJoueur.setToolTipText("Tournoi\r\nChampionnat");
    comboBox_2_GenreJoueur.setBounds(231, 184, 219, 22);
    getContentPane().add(comboBox_2_GenreJoueur);
    
    JLabel lblClub = new JLabel("Instance :");
    lblClub.setBounds(25, 243, 145, 34);
    getContentPane().add(lblClub);
    
    JLabel lblLigue = new JLabel("Continent/instance continentale :");
    lblLigue.setBounds(231, 219, 193, 34);
    getContentPane().add(lblLigue);
    
    JComboBox comboBox_5_LigueJoueur = new JComboBox();
    comboBox_5_LigueJoueur.setToolTipText("Sigle + Région");
    comboBox_5_LigueJoueur.setBounds(231, 255, 219, 22);
    getContentPane().add(comboBox_5_LigueJoueur);
    
    JLabel lblPaysfdration = new JLabel("Pays/fédération :");
    lblPaysfdration.setBounds(231, 278, 104, 34);
    getContentPane().add(lblPaysfdration);
    
    JComboBox comboBox = new JComboBox();
    comboBox.setToolTipText("Sigle + Région");
    comboBox.setBounds(231, 314, 219, 22);
    getContentPane().add(comboBox);
    
    JLabel label_3 = new JLabel("Ligue :");
    label_3.setBounds(231, 338, 44, 34);
    getContentPane().add(label_3);
    
    JComboBox comboBox_1 = new JComboBox();
    comboBox_1.setToolTipText("Sigle + Région");
    comboBox_1.setBounds(231, 374, 219, 22);
    getContentPane().add(comboBox_1);
    
    JLabel lblDpt = new JLabel("Département :");
    lblDpt.setBounds(469, 219, 87, 34);
    getContentPane().add(lblDpt);
    
    JComboBox comboBox_6 = new JComboBox();
    comboBox_6.setToolTipText("N° + nom département");
    comboBox_6.setBounds(469, 255, 219, 22);
    getContentPane().add(comboBox_6);
    
    JLabel lblVille = new JLabel("Ville :");
    lblVille.setBounds(469, 278, 44, 34);
    getContentPane().add(lblVille);
    
    JComboBox comboBox_7 = new JComboBox();
    comboBox_7.setToolTipText("code postal + ville");
    comboBox_7.setBounds(469, 314, 219, 22);
    getContentPane().add(comboBox_7);
    
    JLabel lblInstance = new JLabel("Instance :");
    lblInstance.setBounds(469, 338, 63, 34);
    getContentPane().add(lblInstance);
    
    JComboBox comboBox_11 = new JComboBox();
    comboBox_11.setToolTipText("sigle + n° d'instance + nom instance");
    comboBox_11.setBounds(469, 374, 219, 22);
    getContentPane().add(comboBox_11);
    
    JLabel lblRangs = new JLabel("Rangs : ");
    lblRangs.setBounds(28, 462, 145, 34);
    getContentPane().add(lblRangs);
    
    JLabel lblSimple = new JLabel("Simple :");
    lblSimple.setBounds(234, 434, 57, 34);
    getContentPane().add(lblSimple);
    
    textField_5 = new JTextField();
    textField_5.setBounds(234, 474, 87, 22);
    getContentPane().add(textField_5);
    
    JLabel lblDouble = new JLabel("Double :");
    lblDouble.setBounds(340, 434, 57, 34);
    getContentPane().add(lblDouble);
    
    textField_6 = new JTextField();
    textField_6.setBounds(340, 474, 87, 22);
    getContentPane().add(textField_6);
    
    JLabel lblMixte = new JLabel("Mixte :");
    lblMixte.setBounds(446, 434, 57, 34);
    getContentPane().add(lblMixte);
    
    textField_7 = new JTextField();
    textField_7.setBounds(443, 474, 87, 22);
    getContentPane().add(textField_7);
    
    JLabel lblClassements = new JLabel("Classements : ");
    lblClassements.setBounds(28, 507, 145, 34);
    getContentPane().add(lblClassements);
    
    JComboBox comboBox_8 = new JComboBox();
    comboBox_8.setModel(new DefaultComboBoxModel(new String[] {"NC", "P12", "P11", "P10", "P", "D9", "D8", "D7", "D", "R6", "R5", "R4", "R", "N3", "N2", "N1", "N"}));
    comboBox_8.setToolTipText("Sigle + Région");
    comboBox_8.setBounds(234, 519, 87, 22);
    getContentPane().add(comboBox_8);
    
    JComboBox comboBox_9 = new JComboBox();
    comboBox_9.setModel(new DefaultComboBoxModel(new String[] {"NC", "P12", "P11", "P10", "P", "D9", "D8", "D7", "D", "R6", "R5", "R4", "R", "N3", "N2", "N1", "N"}));
    comboBox_9.setToolTipText("N° + nom département");
    comboBox_9.setBounds(340, 519, 87, 22);
    getContentPane().add(comboBox_9);
    
    JComboBox comboBox_10 = new JComboBox();
    comboBox_10.setModel(new DefaultComboBoxModel(new String[] {"NC", "P12", "P11", "P10", "P", "D9", "D8", "D7", "D", "R6", "R5", "R4", "R", "N3", "N2", "N1", "N"}));
    comboBox_10.setToolTipText("Sigle + Région");
    comboBox_10.setBounds(443, 519, 87, 22);
    getContentPane().add(comboBox_10);
    
    JLabel lblCtes = new JLabel("Côtes : ");
    lblCtes.setBounds(28, 551, 145, 34);
    getContentPane().add(lblCtes);
    
    textField_1 = new JTextField();
    textField_1.setBounds(234, 563, 87, 22);
    getContentPane().add(textField_1);
    
    textField_2 = new JTextField();
    textField_2.setBounds(340, 563, 87, 22);
    getContentPane().add(textField_2);
    
    textField_4 = new JTextField();
    textField_4.setBounds(443, 563, 87, 22);
    getContentPane().add(textField_4);
    
    JLabel lblFormeDeComptition = new JLabel("Catégorie d'âge : ");
    lblFormeDeComptition.setBounds(28, 591, 145, 34);
    getContentPane().add(lblFormeDeComptition);
    
    JComboBox comboBox_4 = new JComboBox();
    comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"Minibad", "Poussins 1", "Poussins 2", "Poussins", "Benjamins 1", "Benjamins 2", "Benjamins", "Minimes 1", "Minimes 2", "Minimes", "Cadets 1", "Cadets 2", "Cadets", "Juniors 1", "Juniors 2", "Juniors", "Seniors", "Vétérans"}));
    comboBox_4.setToolTipText("Tournoi\r\nChampionnat");
    comboBox_4.setBounds(234, 597, 216, 22);
    getContentPane().add(comboBox_4);
    
    JButton btnRinitialiserLaRecherche = new JButton("Réinitialiser la recherche du joueur");
    btnRinitialiserLaRecherche.setBounds(25, 653, 312, 34);
    getContentPane().add(btnRinitialiserLaRecherche);
    
    JButton btnSlectionnerLelaJoueurjoueuse = new JButton("Sélectionner le/la joueur/se");
    btnSlectionnerLelaJoueurjoueuse.setBounds(543, 653, 312, 34);
    getContentPane().add(btnSlectionnerLelaJoueurjoueuse);
    
    JSeparator separator = new JSeparator();
    separator.setBackground(new Color(255, 255, 255));
    separator.setForeground(new Color(169, 169, 169));
    separator.setBounds(25, 700, 830, 7);
    getContentPane().add(separator);
    
    // récupère les infos des tableaux créés dans l'étape précéd., adaptées aux infos du joueur sélectionné (H/F, classements/séries tournoi compatibles avec ceux/celles du joueur)
    // 
    
    JLabel label_2 = new JLabel("Catégorie d'âge : ");
    label_2.setBounds(25, 717, 145, 34);
    getContentPane().add(label_2);
    
 // récupère les infos des tableaux créés dans l'étape précéd., 1°) adaptées aux infos du joueur sélectionné (H/F, classements/séries tournoi compatibles avec ceux/celles du joueur)
 // 2°) la valeur sélectionnée par défaut parmi celles proposées doit être la plus corresp. avec le joueur sélectionné

    JComboBox comboBox_2_CategorieAgeInscription = new JComboBox();
    comboBox_2_CategorieAgeInscription.setToolTipText("Tournoi\r\nChampionnat");
    comboBox_2_CategorieAgeInscription.setBounds(231, 723, 138, 22);
    getContentPane().add(comboBox_2_CategorieAgeInscription);
    
    JLabel lblDiscipline = new JLabel("Discipline : ");
    lblDiscipline.setBounds(25, 758, 145, 34);
    getContentPane().add(lblDiscipline);
    
    //... donc (Simple/Double) Hommes si le joueur est un garçon ou un homme, (Simple/Double) Dames si la joueuse est une fille ou une femme
    JComboBox comboBox_5 = new JComboBox();
    comboBox_5.setToolTipText("SH (Simple Hommes)\r\nSD (Simple Dames)\r\nDH (Double Hommes)\r\nDD (Double Dames)\r\nDMx (Double Mixte)\r\n");
    comboBox_5.setBounds(231, 764, 138, 22);
    getContentPane().add(comboBox_5);
    
    JLabel lblSrieDeTableau = new JLabel("Série de tableau : ");
    lblSrieDeTableau.setBounds(25, 799, 145, 34);
    getContentPane().add(lblSrieDeTableau);
    
    JComboBox comboBox_12 = new JComboBox();
    comboBox_12.setToolTipText("SH (Simple Hommes)\r\nSD (Simple Dames)\r\nDH (Double Hommes)\r\nDD (Double Dames)\r\nDMx (Double Mixte)\r\n");
    comboBox_12.setBounds(231, 805, 138, 22);
    getContentPane().add(comboBox_12);
    
    JLabel label = new JLabel("Progression étape : ");
    label.setBounds(25, 925, 175, 34);
    getContentPane().add(label);
    
    JProgressBar progressBar = new JProgressBar();
    progressBar.setStringPainted(true);
    progressBar.setBounds(231, 933, 296, 22);
    getContentPane().add(progressBar);
    
    JLabel label_1 = new JLabel("Progression création compétition : ");
    label_1.setBounds(25, 962, 203, 34);
    getContentPane().add(label_1);
    
    JProgressBar progressBar_1 = new JProgressBar();
    progressBar_1.setStringPainted(true);
    progressBar_1.setBounds(231, 968, 296, 22);
    getContentPane().add(progressBar_1);
    
    JButton button = new JButton("Précédent");
    button.setBounds(231, 1003, 97, 25);
    getContentPane().add(button);
    
    // en cliquant sur Suivant, l'inscription doit être horodatée, et un historique des modifications doit être tenu (peut entrer en ligne de compte pour l'établissement de liste d'attente)
    JButton btnSuivant = new JButton("Suivant");
    //    btnSuivant.addActionListener(this);
        btnSuivant.addActionListener(new ActionListener() 
        {
        	@Override
        public void actionPerformed(ActionEvent e) 
        	{
        	// TODO Stub de la méthode généré automatiquement
            //Lorsque nous cliquons sur notre bouton, on passe a l'autre fenétre
    //        this.dispose();
        		dispose();
    //        fen = new Fenetre2();
            etapeSuivante = new fenetreGestionCompetitionsCreationEtape4Tournoi3();
        }
        }
        		);
        btnSuivant.setBounds(430, 1003, 97, 25);
        getContentPane().add(btnSuivant);
        
        // en ajout inscription lors création compétition : à ne plus afficher une fois 2 inscriptions enregistrées si le joueur/la joueuse est autorisé(e) à s'inscrire sur 2 tabl., une fois 3 inscriptions enregistrées si le joueur/la joueuse est autorisé(e) à s'inscrire sur 3 tabl. (et dans tous les cas puisque maxi)
        JButton button_1 = new JButton("+");
        button_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        button_1.setToolTipText("Ajouter un tarif");
        button_1.setBounds(383, 722, 41, 107);
        getContentPane().add(button_1);

//    this.getContentPane().add(bouton);
//
//    bouton.addActionListener(new ActionListener(){
//
//      public void actionPerformed(ActionEvent arg0) {

//        corpsFenetreGestionCompetitions zd = new corpsFenetreGestionCompetitions(null, "Coucou les ZérOs", true);
//
//        objetCompetitions zInfo = zd.showcorpsFenetreGestionCompetitions(); 
//
//        JOptionPane jop = new JOptionPane();
//
//        jop.showMessageDialog(null, zInfo.toString(), "Informations personnage", JOptionPane.INFORMATION_MESSAGE);

//      }         

//    });      

    this.setVisible(true);      

  }

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Stub de la méthode généré automatiquement
    //Lorsque nous cliquons sur notre bouton, on passe a l'autre fenétre
    this.dispose();
//    fen = new Fenetre2();
    etapePrecedente = new fenetreGestionCompetitionsCreationEtape2Tournoi1();
    etapeSuivante = new fenetreGestionCompetitionsCreationEtape4Tournoi3();
}

public static void main(String[] args) {
    // TODO Auto-generated method stub
      
	fenetreGestionCompetitionsCreationEtape3Tournoi2 fen= new fenetreGestionCompetitionsCreationEtape3Tournoi2();
}
}