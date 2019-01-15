package fenetres;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
//import fenetres.corpsFenetreGestionCompetitions;
import objets.objetCompetitions;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import java.awt.Checkbox;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;
import javax.swing.JProgressBar;
import javax.swing.JSplitPane;

public class fenetreGestionCompetitionsCreationEtape1Generale extends JFrame implements ActionListener {
//	private Fenetre2 fen;
//	private fenetreGestionCompetitionsCreationEtape fenSuivante;
	private JTextField Etp1CreaCompet_NomCompet;
	private JTextField textField;
	private JComboBox textField_1;
	private JComboBox textField_2;

//  private JButton bouton = new JButton("Appel à la corpsFenetreGestionCompetitions");


  public fenetreGestionCompetitionsCreationEtape1Generale()
  {
	  
	  try 
      {
		  UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");

		}
      catch (Exception e) 
      {
		}
	  
  	setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);      

    this.setTitle("GestionBad - Gestion compétition > Création compétition > Étape 1 : Caractéristiques générales Compétition");

    this.setSize(936, 905);

    this.setLocationRelativeTo(null);
    getContentPane().setLayout(null);
    
    JLabel lblNewLabel = new JLabel("Type de la compétition : ");
    lblNewLabel.setBounds(25, 90, 145, 34);
    getContentPane().add(lblNewLabel);
    
    JComboBox comboBox = new JComboBox();
    comboBox.setToolTipText("- Individuelle : compétition dont les participations et résultats sont prises en compte indivuellement pour chaque joueur.\r\nexemple : \r\n- Par équipes : compétition dont les participations et résultats sont prises en compte au niveau de chaque équipe, de portées géographiques définies (clubs/départements-CODEPs/régions-Ligues/pays-fédérations, etc.).\r\nexemple : Championnats inter-clubs départementaux/régionaux/nationaux, inter-CODEPs, etc.\r\n\r\n/!\\ Sauf indication contraire appropriée (exemple : IC D-Loisirs CODEP45 Badminton Loiret), toutes les compétitions officielles sont susceptibles intrinsèquement d'être prises en compte pour les CPPH individuels des joueurs qui y participent.  /!\\\r\n/!\\ À ne pas confondre avec la forme de compétition \"par équipes\" /!\\.\r\n\r\nSi les données sont récupérées de Poona, ce champ est grisé et inactif.");
    comboBox.setModel(new DefaultComboBoxModel(new String[] {"Individuelle", "Par équipe"}));
    comboBox.setBounds(247, 96, 296, 22);
    getContentPane().add(comboBox);
    
    JLabel lblModeDeComptition = new JLabel("Mode de la compétition : ");
    lblModeDeComptition.setBounds(25, 131, 155, 34);
    getContentPane().add(lblModeDeComptition);
    
    JComboBox comboBox_1 = new JComboBox();
    comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Championnat fédéral", "Championnat InterClubs (IC)", "Promobad", "Tournoi"}));
    comboBox_1.setToolTipText("Championnat fédéral\r\nChampionnat InterClubs (IC)\r\nPromobad\r\nTournoi");
    comboBox_1.setBounds(247, 137, 296, 22);
    getContentPane().add(comboBox_1);
    
    JLabel lblNiveauGographique = new JLabel("Portée géographique : ");
    lblNiveauGographique.setBounds(25, 172, 145, 34);
    getContentPane().add(lblNiveauGographique);
    
    JComboBox comboBox_2 = new JComboBox();
    // à passer en énum lorsque l'énum correspondante sera créée dans la bonne classe d'objets
    comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Interne", "Locale", "Départementale", "Inter-départementale", "Régionale", "Inter-régionale", "Nationale", "Continentale", "Internationale"}));
    comboBox_2.setToolTipText("La portée correspond à l'étendue d'influence voulue pour la compétition.\r\n\r\nChoisissez entre :\r\n- Interne (au sein d'un seul club)\r\n- Locale (en France : niveau d'une ou deux ville(s)/club(s))\r\n- Départementale (en France : niveau d'un département (ou CODEP si un CODEP regroupe plusieurs départements administratifs) ; tous les participants sont licenciés dans un seul et même CODEP)\r\n- Inter-départementale : (en France : plusieurs départements/CODEPs, mais pas nécessairement l'équivalent d'une Ligue entière)\r\n- Régionale (en France : niveau d'une région/Ligue ; tous les participants sont licenciés dans une seule et même Ligue)\r\n- Inter-régionale (en France : plusieurs régions/Ligue, mais pas nécessairement l'équivalent du pays tout entier)\r\n- Nationale (en France : niveau du pays/Fédération Française de Badminton (FFBad) ; à l'étranger : niveau d'un pays/d'une fédération nationale)\r\n- Continentale (en France : niveau du continent/Badminton Europe (BE) ; à l'étranger : niveau d'un continent/d'une fédération continentale)\r\n- Internationale (niveau mondial/Badminton World Federation (BWF))");
    comboBox_2.setBounds(247, 178, 296, 22);
    getContentPane().add(comboBox_2);
    
    JLabel lblNatureDeComptition = new JLabel("Nature de la compétition : ");
    lblNatureDeComptition.setBounds(25, 49, 155, 34);
    getContentPane().add(lblNatureDeComptition);
    
    JComboBox comboBox_3 = new JComboBox();
    comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Amicale", "Officielle (comptabilisée dans les CPPH)", "Officielle (non-comptabilisée dans les CPPH)"}));
    comboBox_3.setToolTipText("Amicale (non-officielle/officieuse, pas de recueil ni comptabilisation des résultats pour les classements individuels)\r\nOfficielle - comptant pour les classements individuels (enregistrée dans un ou plusieurs logiciel(s) : BadNet/ICManager, et en base de données : Poona ; exemple : ICD3 CODEP45 Badminton Loiret, etc.)\r\nOfficielle - pas de prise en compte pour les classements individuels (pas enregistrée en base de données : Poona ; exemple : IC D-Loisirs CODEP45 Badminton Loiret)\r\n\r\nSi les données sont récupérées de Poona, ce champ est grisé et inactif.");
    comboBox_3.setBounds(247, 55, 296, 22);
    getContentPane().add(comboBox_3);
    
    JLabel lblFormeDeComptition = new JLabel("Forme de la compétition : ");
    lblFormeDeComptition.setBounds(25, 213, 155, 34);
    getContentPane().add(lblFormeDeComptition);
    
    JComboBox cmboBox_FormeCompet = new JComboBox();
    cmboBox_FormeCompet.setModel(new DefaultComboBoxModel(new String[] {"Ronde suisse", "Ronde italienne", "Poules", "Poules puis élimination directe", "Élimination directe uniquement", "Poule(s) unique(s)"}));
    cmboBox_FormeCompet.setToolTipText("Tournoi\r\nChampionnat");
    cmboBox_FormeCompet.setBounds(247, 219, 296, 22);
    getContentPane().add(cmboBox_FormeCompet);
    
    JLabel lblPublics = new JLabel("Catégorie(s) d'âge autorisée(s) : ");
    lblPublics.setBounds(25, 254, 192, 34);
    getContentPane().add(lblPublics);
    
    JScrollPane scrollPane = new JScrollPane();
    scrollPane.setBounds(247, 254, 296, 114);
    getContentPane().add(scrollPane);
    
    // JList : après l'avoir créée, à surrounder avec un JScrollPane
    JList list = new JList();
    scrollPane.setViewportView(list);
    list.setVisibleRowCount(6);
    list.setModel(new AbstractListModel() {
    	String[] values = new String[] {"Minibad", "Poussins 1", "Poussins 2", "Poussins", "Benjamins 1", "Benjamins 2", "Benjamins", "Minimes 1", "Minimes 2", "Minimes", "Cadets 1", "Cadets 2", "Cadets", "Juniors 1", "Juniors 2", "Juniors", "Seniors", "Vétérans"};
    	public int getSize() {
    		return values.length;
    	}
    	public Object getElementAt(int index) {
    		return values[index];
    	}
    });
    
    JLabel lblCatgoriesDePublics = new JLabel("Catégorie(s) de public(s) autorisée(s) : ");
    lblCatgoriesDePublics.setBounds(25, 381, 228, 34);
    getContentPane().add(lblCatgoriesDePublics);
    
    JScrollPane scrollPane_2 = new JScrollPane();
    scrollPane_2.setBounds(261, 388, 344, 99);
    getContentPane().add(scrollPane_2);
    
    // valeur "Les parabadistes peuvent jouer au sein des valides" à griser et rendre non-sélectionnable si valeur "Les parabadistes ne peuvent pas joueur au sein des valides" sélectionnée
    JList list_1_CategPublicsAutorisees = new JList();
    scrollPane_2.setViewportView(list_1_CategPublicsAutorisees);
    list_1_CategPublicsAutorisees.setVisibleRowCount(4);
    list_1_CategPublicsAutorisees.setBorder(new LineBorder(new Color(0, 0, 0)));
    list_1_CategPublicsAutorisees.setModel(new AbstractListModel() {
    	String[] values = new String[] {"Valides", "Parabad/Handibad", "WH1", "WH2", "SL3", "SL4", "SU5", "SS6", "Les parabadistes peuvent jouer au sein des valides", "Les parabadistes ne peuvent pas joueur au sein des valides"};
    	public int getSize() {
    		return values.length;
    	}
    	public Object getElementAt(int index) {
    		return values[index];
    	}
    });
    
    JLabel lblNomDeComptition = new JLabel("Nom de la compétition : ");
    lblNomDeComptition.setBounds(28, 497, 145, 34);
    getContentPane().add(lblNomDeComptition);
    
    Etp1CreaCompet_NomCompet = new JTextField();
    Etp1CreaCompet_NomCompet.setToolTipText("Nom de la compétition, exemples :\r\n- Xer tournoi BadGestion (pour un 1er tournoi privé)\r\n- Xè tournoi GestionBad (pour un tournoi privé)\r\n- etc.\r\n- tournoi amical Badminton Club Duvillage (pour un tournoi amical interne à un club)\r\n- IC45 D1 2018-2019 (pour un InterClub Départemental)\r\n- etc.\r\n- Championnat Départemental Senior Deteldépartement (pour un championnat fédéral départemental)\r\n- etc.");
    Etp1CreaCompet_NomCompet.setBounds(250, 503, 620, 22);
    getContentPane().add(Etp1CreaCompet_NomCompet);
    Etp1CreaCompet_NomCompet.setColumns(10);
    
    JLabel lblVillesDeLa = new JLabel("Ville(s) de la compétition : ");
    lblVillesDeLa.setBounds(28, 539, 155, 34);
    getContentPane().add(lblVillesDeLa);
    
    textField = new JTextField();
    textField.setToolTipText("Nom de la compétition, exemples :\r\n- Xer tournoi BadGestion (pour un 1er tournoi privé)\r\n- Xè tournoi GestionBad (pour un tournoi privé)\r\n- etc.\r\n- tournoi amical Badminton Club Duvillage (pour un tournoi amical interne à un club)\r\n- IC45 D1 2018-2019 (pour un InterClub Départemental)\r\n- etc.\r\n- Championnat Départemental Senior Deteldépartement (pour un championnat fédéral départemental)\r\n- etc.");
    textField.setColumns(10);
    textField.setBounds(250, 545, 620, 22);
    getContentPane().add(textField);
    
    JLabel lblquipementsDeLa = new JLabel("Équipement(s) de la compétition : ");
    lblquipementsDeLa.setBounds(28, 581, 210, 34);
    getContentPane().add(lblquipementsDeLa);
    
    textField_1 = new JComboBox();
    textField_1.setEditable(true);
    textField_1.setModel(new DefaultComboBoxModel(new String[] {"", "Saisir un équipement non-répertorié"}));
    textField_1.setToolTipText("Équipement (gymnase/lieu de pratique) de la compétition, exemples :\r\n- Gymnase Tartempion\r\n- Salle omnisports Unetelle\r\n- etc.");
    textField_1.setBounds(250, 587, 620, 22);
    getContentPane().add(textField_1);
    
    JLabel lblSallesDeLa = new JLabel("Salle(s) de la compétition : ");
    lblSallesDeLa.setBounds(28, 622, 210, 34);
    getContentPane().add(lblSallesDeLa);
    
    textField_2 = new JComboBox();
    textField_2.setEditable(true);
    textField_2.setModel(new DefaultComboBoxModel(new String[] {"", "Saisir une salle non-répertoriée"}));
    textField_2.setToolTipText("Équipement (gymnase/lieu de pratique) de la compétition, exemples :\r\n- Gymnase Tartempion\r\n- Salle omnisports Unetelle\r\n- etc.\r\nChamp facultatif.");
    textField_2.setBounds(250, 628, 620, 22);
    getContentPane().add(textField_2);
    
    JButton btnSuivant = new JButton("Suivant");
    btnSuivant.addActionListener(this);
    
    JButton btnRetourAccueil = new JButton("Retour accueil");
    btnRetourAccueil.setBounds(247, 761, 113, 25);
    getContentPane().add(btnRetourAccueil);
    btnSuivant.setBounds(430, 761, 113, 25);
    getContentPane().add(btnSuivant);
    
    JLabel label = new JLabel("Progression étape : ");
    label.setBounds(25, 669, 175, 34);
    getContentPane().add(label);
    
    JProgressBar progressBar_Etape = new JProgressBar();
    progressBar_Etape.setToolTipText("Indique la progression du remplissage de l'étape en cours.");
    progressBar_Etape.setStringPainted(true);
    progressBar_Etape.setBounds(247, 676, 296, 22);
    getContentPane().add(progressBar_Etape);
    
    JLabel lblProgressionCrationComptition = new JLabel("Progression création compétition : ");
    lblProgressionCrationComptition.setBounds(25, 706, 210, 34);
    getContentPane().add(lblProgressionCrationComptition);
    
    JProgressBar progressBar_1_Competition = new JProgressBar();
    progressBar_1_Competition.setToolTipText("Indique la progression actuelle de la création de la compétition.");
    progressBar_1_Competition.setStringPainted(true);
    progressBar_1_Competition.setBounds(247, 716, 296, 22);
    getContentPane().add(progressBar_1_Competition);

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
//    //Lorsque nous cliquons sur notre bouton, on passe a l'autre fenétre
    this.dispose();
//    fen = new Fenetre2();
    // dépend des paramètres et en particulier du type de compét' souhaité par l'utilisateur
//    fenSuivante
}

public static void main(String[] args) {
    // TODO Auto-generated method stub
      
	fenetreGestionCompetitionsCreationEtape1Generale fen= new fenetreGestionCompetitionsCreationEtape1Generale();
}
}