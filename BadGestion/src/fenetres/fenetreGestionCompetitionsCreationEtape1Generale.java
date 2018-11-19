package fenetres;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import fenetres.corpsFenetreGestionCompetitions;
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

public class fenetreGestionCompetitionsCreationEtape1Generale extends JFrame implements ActionListener {
	private Fenetre2 fen;
	private JTextField textField;

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

    this.setSize(881, 684);

    this.setLocationRelativeTo(null);
    getContentPane().setLayout(null);
    
    JLabel lblNewLabel = new JLabel("Type de compétition : ");
    lblNewLabel.setBounds(25, 90, 145, 34);
    getContentPane().add(lblNewLabel);
    
    JComboBox comboBox = new JComboBox();
    comboBox.setModel(new DefaultComboBoxModel(new String[] {"Individuelle", "Par équipe"}));
    comboBox.setBounds(229, 97, 296, 22);
    getContentPane().add(comboBox);
    
    JLabel lblModeDeComptition = new JLabel("Mode de compétition : ");
    lblModeDeComptition.setBounds(25, 131, 145, 34);
    getContentPane().add(lblModeDeComptition);
    
    JComboBox comboBox_1 = new JComboBox();
    comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Championnat fédéral", "Championnat InterClubs (IC)", "Promobad", "Tournoi"}));
    comboBox_1.setToolTipText("Championnat fédéral\r\nChampionnat InterClubs (IC)\r\nPromobad\r\nTournoi");
    comboBox_1.setBounds(229, 138, 296, 22);
    getContentPane().add(comboBox_1);
    
    JLabel lblNiveauGographique = new JLabel("Portée géographique : ");
    lblNiveauGographique.setBounds(25, 172, 145, 34);
    getContentPane().add(lblNiveauGographique);
    
    JComboBox comboBox_2 = new JComboBox();
    // à passer en énum lorsque l'énum correspondante sera créée dans la bonne classe d'objets
    comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Interne", "Locale", "Départementale", "Régionale", "Nationale", "Continentale", "Internationale"}));
    comboBox_2.setToolTipText("La portée correspond à l'étendue d'influence voulue pour la compétition.\r\n\r\nChoisissez entre :\r\n- Interne (au sein d'un seul club)\r\n- Locale (en France : niveau d'une ou deux ville(s)/club(s))\r\n- Départementale (en France : niveau d'un département/CODEP)\r\n- Régionale (en France : niveau d'une région/Ligue)\r\n- Nationale (en France : niveau du pays/Fédération Française de Badminton (FFBad) ; à l'étranger : niveau d'un pays/d'une fédération nationale)\r\n- Continentale (en France : niveau du continent/Badminton Europe (BE) ; à l'étranger : niveau d'un continent/d'une fédération continentale)\r\n- Internationale (niveau mondial/Badminton World Federation (BWF))");
    comboBox_2.setBounds(229, 179, 296, 22);
    getContentPane().add(comboBox_2);
    
    JLabel lblNatureDeComptition = new JLabel("Nature de compétition : ");
    lblNatureDeComptition.setBounds(25, 49, 145, 34);
    getContentPane().add(lblNatureDeComptition);
    
    JComboBox comboBox_3 = new JComboBox();
    comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Amicale", "Officielle"}));
    comboBox_3.setToolTipText("Amicale (non-officielle/officieuse)\r\nOfficielle (enregistrée dans un ou plusieurs logiciel(s) : BadNet/ICManager, et en base de données : Poona)");
    comboBox_3.setBounds(229, 56, 296, 22);
    getContentPane().add(comboBox_3);
    
    JLabel lblFormeDeComptition = new JLabel("Forme de compétition : ");
    lblFormeDeComptition.setBounds(25, 213, 145, 34);
    getContentPane().add(lblFormeDeComptition);
    
    JComboBox comboBox_4 = new JComboBox();
    comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"Ronde suisse", "Ronde italienne", "Poules", "Poules puis élimination directe", "Élimination directe uniquement", "Poule(s) unique(s)"}));
    comboBox_4.setToolTipText("Tournoi\r\nChampionnat");
    comboBox_4.setBounds(229, 220, 296, 22);
    getContentPane().add(comboBox_4);
    
    JLabel lblNomDeComptition = new JLabel("Nom de compétition : ");
    lblNomDeComptition.setBounds(25, 295, 145, 34);
    getContentPane().add(lblNomDeComptition);
    
    textField = new JTextField();
    textField.setToolTipText("Nom de la compétition, exemples :\r\n- Xer tournoi BadGestion (pour un 1er tournoi privé)\r\n- Xè tournoi GestionBad (pour un tournoi privé)\r\n- etc.\r\n- tournoi amical Badminton Club Duvillage (pour un tournoi amical interne à un club)\r\n- IC45 D1 2018-2019 (pour un InterClub Départemental)\r\n- etc.\r\n- Championnat Départemental Senior Deteldépartement (pour un championnat fédéral départemental)\r\n- etc.");
    textField.setBounds(229, 302, 296, 22);
    getContentPane().add(textField);
    textField.setColumns(10);
    
    JSeparator separator = new JSeparator();
    separator.setBounds(180, 389, 1, 2);
    getContentPane().add(separator);
    
    JButton btnSuivant = new JButton("Suivant");
    btnSuivant.addActionListener(this);
    btnSuivant.setBounds(428, 352, 97, 25);
    getContentPane().add(btnSuivant);
    
    JLabel lblPublics = new JLabel("Catégorie(s) d'âge autorisée(s) : ");
    lblPublics.setBounds(25, 254, 192, 34);
    getContentPane().add(lblPublics);
    
    JComboBox comboBox_5 = new JComboBox();
    comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"Minibad et Poussins", "Jeunes (Benjamins à Minimes inclus)", "Jeunes (Cadets à Juniors inclus)", "Seniors", "Vétérans"}));
    comboBox_5.setToolTipText("Il est possible de sélectionner plusieurs catégories d'âge avec Ctrl + clic gauche.");
    comboBox_5.setBounds(229, 261, 296, 22);
    getContentPane().add(comboBox_5);

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
    fen = new Fenetre2();
}

public static void main(String[] args) {
    // TODO Auto-generated method stub
      
	fenetreGestionCompetitionsCreationEtape1Generale fen= new fenetreGestionCompetitionsCreationEtape1Generale();
}
}