package fenetres;

import java.awt.*;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

import javax.swing.*;
import javax.swing.AbstractListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListModel;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JSeparator;
import javax.swing.JCheckBox;
import javax.swing.JProgressBar;
import javax.swing.JTabbedPane;
import javax.swing.DefaultListModel;
import javax.swing.AbstractListModel;
import javax.swing.BorderFactory;
import javax.swing.ListCellRenderer;

//import fenetres.corpsFenetreGestionCompetitions;
import objets.objetCompetitions;

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
	private JTabbedPane tabbedPane_1;
	private JPanel panel_1;
	
	private JList sourceList;
	  private SortedListModel sourceListModel;
	  private JList destList;
	  private SortedListModel destListModel;
	  private JButton addButton;
	  private JButton removeButton;

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
    textField_NumeroLicence.setToolTipText("Saisie pour recherche, avec auto-complétion et proposition de résultats (si fond du champ blanc)/affichage (si fond du champ grisé) du prénom du joueur");
    textField_NumeroLicence.setBounds(182, 56, 219, 22);
    getContentPane().add(textField_NumeroLicence);
    textField_NumeroLicence.setColumns(10);
    
    JLabel lblNewLabel = new JLabel("Nom :");
    lblNewLabel.setBounds(25, 90, 77, 34);
    getContentPane().add(lblNewLabel);
    
    JTextField textField_NomJoueur = new JTextField();
    textField_NomJoueur.setToolTipText("Saisie pour recherche, avec auto-complétion et proposition de résultats (si fond du champ blanc)/affichage (si fond du champ grisé) du prénom du joueur");
    textField_NomJoueur.setBounds(182, 96, 219, 22);
    getContentPane().add(textField_NomJoueur);
    
    JLabel lblModeDeComptition = new JLabel("Prénom : ");
    lblModeDeComptition.setBounds(25, 131, 87, 34);
    getContentPane().add(lblModeDeComptition);
    
    JTextField textField1_PrenomJoueur = new JTextField();
    textField1_PrenomJoueur.setToolTipText("Saisie pour recherche, avec auto-complétion et proposition de résultats (si fond du champ blanc)/affichage (si fond du champ grisé) du prénom du joueur");
    textField1_PrenomJoueur.setBounds(182, 137, 219, 22);
    getContentPane().add(textField1_PrenomJoueur);
    
    JLabel lblGenre = new JLabel("Genre : ");
    lblGenre.setBounds(25, 172, 69, 34);
    getContentPane().add(lblGenre);
    
    JComboBox comboBox_2_GenreJoueur = new JComboBox();
    comboBox_2_GenreJoueur.setModel(new DefaultComboBoxModel(new String[] {"F", "H"}));
    comboBox_2_GenreJoueur.setToolTipText("H\r\nF");
    comboBox_2_GenreJoueur.setBounds(182, 178, 219, 22);
    getContentPane().add(comboBox_2_GenreJoueur);
    
    JLabel lblClub = new JLabel("Instance :");
    lblClub.setBounds(25, 243, 69, 34);
    getContentPane().add(lblClub);
    
    JLabel lblLigue = new JLabel("Continent/instance continentale :");
    lblLigue.setBounds(182, 220, 193, 34);
    getContentPane().add(lblLigue);
    
    JComboBox comboBox_5_LigueJoueur = new JComboBox();
    comboBox_5_LigueJoueur.setToolTipText("Sigle + Continent");
    comboBox_5_LigueJoueur.setBounds(182, 256, 219, 22);
    getContentPane().add(comboBox_5_LigueJoueur);
    
    JLabel lblPaysfdration = new JLabel("Pays/fédération :");
    lblPaysfdration.setBounds(182, 279, 104, 34);
    getContentPane().add(lblPaysfdration);
    
    JComboBox comboBox = new JComboBox();
    comboBox.setToolTipText("Sigle + Pays");
    comboBox.setBounds(182, 315, 219, 22);
    getContentPane().add(comboBox);
    
    JLabel label_3 = new JLabel("Ligue :");
    label_3.setBounds(182, 339, 44, 34);
    getContentPane().add(label_3);
    
    JComboBox comboBox_1 = new JComboBox();
    comboBox_1.setToolTipText("Sigle + Région");
    comboBox_1.setBounds(182, 375, 219, 22);
    getContentPane().add(comboBox_1);
    
    JLabel lblDpt = new JLabel("Département :");
    lblDpt.setBounds(420, 220, 87, 34);
    getContentPane().add(lblDpt);
    
    JComboBox comboBox_6 = new JComboBox();
    comboBox_6.setToolTipText("N° + nom département");
    comboBox_6.setBounds(420, 256, 219, 22);
    getContentPane().add(comboBox_6);
    
    JLabel lblVille = new JLabel("Ville :");
    lblVille.setBounds(420, 279, 44, 34);
    getContentPane().add(lblVille);
    
    JComboBox comboBox_7 = new JComboBox();
    comboBox_7.setToolTipText("code postal + ville");
    comboBox_7.setBounds(420, 315, 219, 22);
    getContentPane().add(comboBox_7);
    
    JLabel lblInstance = new JLabel("Instance :");
    lblInstance.setBounds(420, 339, 63, 34);
    getContentPane().add(lblInstance);
    
    JComboBox comboBox_11 = new JComboBox();
    comboBox_11.setToolTipText("sigle + n° d'instance + nom instance");
    comboBox_11.setBounds(420, 375, 219, 22);
    getContentPane().add(comboBox_11);
    
    JLabel lblRangs = new JLabel("Rangs : ");
    lblRangs.setBounds(28, 462, 97, 34);
    getContentPane().add(lblRangs);
    
    JLabel lblSimple = new JLabel("Simple :");
    lblSimple.setBounds(185, 435, 57, 34);
    getContentPane().add(lblSimple);
    
    textField_5 = new JTextField();
    textField_5.setToolTipText("Saisie pour recherche, avec auto-complétion et proposition de résultats (si fond du champ blanc)/affichage (si fond du champ grisé) du prénom du joueur");
    textField_5.setBounds(185, 475, 87, 22);
    getContentPane().add(textField_5);
    
    JLabel lblDouble = new JLabel("Double :");
    lblDouble.setBounds(291, 435, 57, 34);
    getContentPane().add(lblDouble);
    
    textField_6 = new JTextField();
    textField_6.setToolTipText("Saisie (si fond du champ blanc)/affichage (si fond du champ grisé) du prénom du joueur");
    textField_6.setBounds(291, 475, 87, 22);
    getContentPane().add(textField_6);
    
    JLabel lblMixte = new JLabel("Mixte :");
    lblMixte.setBounds(397, 435, 57, 34);
    getContentPane().add(lblMixte);
    
    textField_7 = new JTextField();
    textField_7.setToolTipText("Saisie (si fond du champ blanc)/affichage (si fond du champ grisé) du prénom du joueur");
    textField_7.setBounds(394, 475, 87, 22);
    getContentPane().add(textField_7);
    
    JLabel lblClassements = new JLabel("Classements : ");
    lblClassements.setBounds(28, 507, 87, 34);
    getContentPane().add(lblClassements);
    
    JComboBox comboBox_8 = new JComboBox();
    comboBox_8.setModel(new DefaultComboBoxModel(new String[] {"NC", "P12", "P11", "P10", "P", "D9", "D8", "D7", "D", "R6", "R5", "R4", "R", "N3", "N2", "N1", "N"}));
    comboBox_8.setToolTipText("Sigle + Région");
    comboBox_8.setBounds(185, 520, 87, 22);
    getContentPane().add(comboBox_8);
    
    JComboBox comboBox_9 = new JComboBox();
    comboBox_9.setModel(new DefaultComboBoxModel(new String[] {"NC", "P12", "P11", "P10", "P", "D9", "D8", "D7", "D", "R6", "R5", "R4", "R", "N3", "N2", "N1", "N"}));
    comboBox_9.setToolTipText("N° + nom département");
    comboBox_9.setBounds(291, 520, 87, 22);
    getContentPane().add(comboBox_9);
    
    JComboBox comboBox_10 = new JComboBox();
    comboBox_10.setModel(new DefaultComboBoxModel(new String[] {"NC", "P12", "P11", "P10", "P", "D9", "D8", "D7", "D", "R6", "R5", "R4", "R", "N3", "N2", "N1", "N"}));
    comboBox_10.setToolTipText("Sigle + Région");
    comboBox_10.setBounds(394, 520, 87, 22);
    getContentPane().add(comboBox_10);
    
    JLabel lblCtes = new JLabel("Côtes : ");
    lblCtes.setBounds(28, 551, 104, 34);
    getContentPane().add(lblCtes);
    
    textField_1 = new JTextField();
    textField_1.setBounds(185, 564, 87, 22);
    getContentPane().add(textField_1);
    
    textField_2 = new JTextField();
    textField_2.setBounds(291, 564, 87, 22);
    getContentPane().add(textField_2);
    
    textField_4 = new JTextField();
    textField_4.setBounds(394, 564, 87, 22);
    getContentPane().add(textField_4);
    
    JLabel lblFormeDeComptition = new JLabel("Catégorie d'âge : ");
    lblFormeDeComptition.setBounds(28, 591, 115, 34);
    getContentPane().add(lblFormeDeComptition);
    
    JComboBox comboBox_4 = new JComboBox();
    comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"Minibad", "Poussins 1", "Poussins 2", "Poussins", "Benjamins 1", "Benjamins 2", "Benjamins", "Minimes 1", "Minimes 2", "Minimes", "Cadets 1", "Cadets 2", "Cadets", "Juniors 1", "Juniors 2", "Juniors", "Seniors", "Vétérans"}));
    comboBox_4.setToolTipText("Tournoi\r\nChampionnat");
    comboBox_4.setBounds(185, 598, 193, 22);
    getContentPane().add(comboBox_4);
    
    JButton btnRinitialiserLaRecherche = new JButton("Réinitialiser la recherche du joueur");
    btnRinitialiserLaRecherche.setBounds(25, 653, 312, 34);
    getContentPane().add(btnRinitialiserLaRecherche);
    
    JButton btnSlectionnerLelaJoueurjoueuse = new JButton("Sélectionner le/la joueur/se");
    btnSlectionnerLelaJoueurjoueuse.setBounds(349, 653, 312, 34);
    getContentPane().add(btnSlectionnerLelaJoueurjoueuse);
    
    JSeparator separator = new JSeparator();
    separator.setBackground(new Color(255, 255, 255));
    separator.setForeground(new Color(169, 169, 169));
    separator.setBounds(25, 700, 650, 7);
    getContentPane().add(separator);
    
    // récupère les infos des tableaux créés dans l'étape précéd., adaptées aux infos du joueur sélectionné (H/F, classements/séries tournoi compatibles avec ceux/celles du joueur)
    // 
    
    JLabel label_2 = new JLabel("Catégorie d'âge : ");
    label_2.setBounds(25, 717, 115, 34);
    getContentPane().add(label_2);
    
 // récupère les infos des tableaux créés dans l'étape précéd., 1°) adaptées aux infos du joueur sélectionné (H/F, classements/séries tournoi compatibles avec ceux/celles du joueur)
 // 2°) la valeur sélectionnée par défaut parmi celles proposées doit être la plus corresp. avec le joueur sélectionné

    JComboBox comboBox_2_CategorieAgeInscription = new JComboBox();
    comboBox_2_CategorieAgeInscription.setToolTipText("Tournoi\r\nChampionnat");
    comboBox_2_CategorieAgeInscription.setBounds(182, 724, 138, 22);
    getContentPane().add(comboBox_2_CategorieAgeInscription);
    
    JLabel lblDiscipline = new JLabel("Discipline : ");
    lblDiscipline.setBounds(25, 758, 126, 34);
    getContentPane().add(lblDiscipline);
    
    //... donc (Simple/Double) Hommes si le joueur est un garçon ou un homme, (Simple/Double) Dames si la joueuse est une fille ou une femme
    JComboBox comboBox_5 = new JComboBox();
    comboBox_5.setToolTipText("SH (Simple Hommes)\r\nSD (Simple Dames)\r\nDH (Double Hommes)\r\nDD (Double Dames)\r\nDMx (Double Mixte)\r\n");
    comboBox_5.setBounds(182, 765, 138, 22);
    getContentPane().add(comboBox_5);
    
    JLabel lblSrieDeTableau = new JLabel("Série de tableau : ");
    lblSrieDeTableau.setBounds(25, 799, 126, 34);
    getContentPane().add(lblSrieDeTableau);
    
    JComboBox comboBox_12 = new JComboBox();
    comboBox_12.setToolTipText("D\r\nD9-P10\r\nP11-P12\r\n...");
    comboBox_12.setBounds(182, 806, 138, 22);
    getContentPane().add(comboBox_12);
    
    JLabel label = new JLabel("Progression étape : ");
    label.setBounds(25, 925, 126, 34);
    getContentPane().add(label);
    
    JProgressBar progressBar = new JProgressBar();
    progressBar.setStringPainted(true);
    progressBar.setBounds(182, 934, 296, 22);
    getContentPane().add(progressBar);
    
    JLabel lblprogressionCrationcomptition = new JLabel("<html>Progression création<br>compétition :</html> ");
    lblprogressionCrationcomptition.setBounds(25, 962, 126, 34);
    getContentPane().add(lblprogressionCrationcomptition);
    
    JProgressBar progressBar_1 = new JProgressBar();
    progressBar_1.setStringPainted(true);
    progressBar_1.setBounds(182, 968, 296, 22);
    getContentPane().add(progressBar_1);
    
    JButton button = new JButton("Précédent");
    button.setBounds(182, 1004, 97, 25);
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
        btnSuivant.setBounds(381, 1004, 97, 25);
        getContentPane().add(btnSuivant);
        
        // en ajout inscription lors création compétition : à ne plus afficher une fois 2 inscriptions enregistrées si le joueur/la joueuse est autorisé(e) à s'inscrire sur 2 tabl., une fois 3 inscriptions enregistrées si le joueur/la joueuse est autorisé(e) à s'inscrire sur 3 tabl. (et dans tous les cas puisque maxi)
        JButton button_1 = new JButton("+");
        button_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        button_1.setToolTipText("Ajouter un tableau d'inscription");
        button_1.setBounds(337, 723, 41, 107);
        getContentPane().add(button_1);
        
        
        
        JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
        tabbedPane_1.setBounds(714, 31, 612, 492);
        getContentPane().add(tabbedPane_1);
        
        JPanel panel_inscriptionsjoueurs = new JPanel();
        tabbedPane_1.addTab("Inscriptions joueurs", null, panel_inscriptionsjoueurs, null);
        
     // si la compétition ne comporte que du simple, ne pas afficher onglet 2 Formation des paires (n'afficher qu'onglet 1 Inscriptions joueurs)
        
        JPanel panel_2_formationpaires = new JPanel();
        tabbedPane_1.addTab("Formation des paires", null, panel_2_formationpaires, null);
        panel_2_formationpaires.setLayout(new GridLayout(0, 2, 0, 0));
        
        JPanel panel_3_ebauche = new JPanel();
        panel_2_formationpaires.add(panel_3_ebauche);
        
        JPanel panel_5_joueursseuls = new JPanel();
        panel_3_ebauche.add(panel_5_joueursseuls);
        
        JList list_joueursseuls = new JList();
        panel_5_joueursseuls.add(list_joueursseuls);
        
        JPanel panel_partenairesdispos = new JPanel();
        panel_3_ebauche.add(panel_partenairesdispos);
        
        JPanel panel_pairesproposees = new JPanel();
        panel_3_ebauche.add(panel_pairesproposees);
        
        JPanel panel_4_definitif = new JPanel(new BorderLayout());
        panel_4_definitif.add(new JLabel("Paires définitives :"), BorderLayout.NORTH);
        panel_4_definitif.add(new JScrollPane(destList), BorderLayout.CENTER);
        panel_4_definitif.add(removeButton, BorderLayout.SOUTH);
        panel_2_formationpaires.add(panel_4_definitif);
        
        JPanel panel_recapgeneralinscriptions = new JPanel();
        tabbedPane_1.addTab("Récapitulatif général inscriptions", null, panel_recapgeneralinscriptions, null);
        
        JButton btnSlectionnerUnePartenaire = new JButton("Sélectionner un(e) partenaire");
        btnSlectionnerUnePartenaire.setToolTipText("Ajouter un tableau d'inscription");
        btnSlectionnerUnePartenaire.setBounds(397, 758, 242, 34);
        getContentPane().add(btnSlectionnerUnePartenaire);
        
     // case à cocher "Inscription avec X / en recherche" et bouton "Formation des paires" apparaissent uniquement pour les tableaux de doubles et mixtes
        JCheckBox chckbxInscriptionAvecXen = new JCheckBox("inscription avec X / en recherche de partenaire");
        chckbxInscriptionAvecXen.setToolTipText("Cocher si un(e) joueur/se n'a pas déclaré de partenaire ou si il/elle demande explicitement à l'organisation de lui chercher un(e) partenaire lors de son inscription pour un tableau de double ou mixte.");
        chckbxInscriptionAvecXen.setBounds(179, 850, 304, 25);
        getContentPane().add(chckbxInscriptionAvecXen);
        
        JButton btnFormationDesPaires = new JButton("Formation des paires");
        btnFormationDesPaires.setBounds(182, 884, 296, 34);
        getContentPane().add(btnFormationDesPaires);
        
        

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