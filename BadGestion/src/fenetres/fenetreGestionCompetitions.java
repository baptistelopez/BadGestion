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

public class fenetreGestionCompetitions extends JFrame {

//  private JButton bouton = new JButton("Appel à la corpsFenetreGestionCompetitions");


  public fenetreGestionCompetitions(){
  	setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);      

    this.setTitle("GestionBad - Gestion compétition > Création compétition > Étape 1 : Choix type compétition");

    this.setSize(881, 684);

    this.setLocationRelativeTo(null);
    getContentPane().setLayout(null);
    
    JLabel lblNewLabel = new JLabel("Type de compétition : ");
    lblNewLabel.setBounds(25, 90, 145, 34);
    getContentPane().add(lblNewLabel);
    
    JComboBox comboBox = new JComboBox();
    comboBox.setModel(new DefaultComboBoxModel(new String[] {"Individuelle", "Par équipe"}));
    comboBox.setBounds(170, 96, 296, 22);
    getContentPane().add(comboBox);
    
    JLabel lblModeDeComptition = new JLabel("Mode de compétition : ");
    lblModeDeComptition.setBounds(25, 131, 145, 34);
    getContentPane().add(lblModeDeComptition);
    
    JComboBox comboBox_1 = new JComboBox();
    comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Championnat", "InterClub (IC)", "Promobad", "Tournoi"}));
    comboBox_1.setToolTipText("Championnat\r\nInterClub (IC)\r\nPromobad\r\nTournoi");
    comboBox_1.setBounds(170, 137, 296, 22);
    getContentPane().add(comboBox_1);
    
    JLabel lblNiveauGographique = new JLabel("Portée géographique : ");
    lblNiveauGographique.setBounds(25, 172, 145, 34);
    getContentPane().add(lblNiveauGographique);
    
    JComboBox comboBox_2 = new JComboBox();
    comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Interne", "Locale", "Départementale", "Régionale", "Nationale", "Continentale", "Internationale"}));
    comboBox_2.setToolTipText("La portée correspond à l'étendue d'influence voulue pour la compétition.\r\n\r\nChoisissez entre :\r\n- Interne (au sein d'un seul club)\r\n- Locale (en France : niveau d'une ville/club)\r\n- Départementale (en France : niveau d'un département/CODEP)\r\n- Régionale (en France : niveau d'une région/Ligue)\r\n- Nationale (en France : niveau du pays/Fédération Française de Badminton (FFBad) ; à l'étranger : niveau d'un pays/d'une fédération nationale)\r\n- Continentale (en France : niveau du continent/Badminton Europe (BE) ; à l'étranger : niveau d'un continent/d'une fédération continentale)\r\n- Internationale (niveau mondial/Badminton World Federation (BWF))");
    comboBox_2.setBounds(170, 178, 296, 22);
    getContentPane().add(comboBox_2);
    
    JLabel lblNatureDeComptition = new JLabel("Nature de compétition : ");
    lblNatureDeComptition.setBounds(25, 49, 145, 34);
    getContentPane().add(lblNatureDeComptition);
    
    JComboBox comboBox_3 = new JComboBox();
    comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Amicale", "Officielle"}));
    comboBox_3.setToolTipText("Amicale (non-officielle/officieuse)\r\nOfficielle (enregistrée dans un ou plusieurs logiciel(s) : BadNet/ICManager, et en base de données : Poona)");
    comboBox_3.setBounds(170, 55, 296, 22);
    getContentPane().add(comboBox_3);
    
    JLabel lblFormeDeComptition = new JLabel("Forme de compétition : ");
    lblFormeDeComptition.setBounds(25, 219, 145, 34);
    getContentPane().add(lblFormeDeComptition);
    
    JComboBox comboBox_4 = new JComboBox();
    comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"Ronde suisse", "Ronde italienne", "Poules", "Poules puis élimination directe", "Élimination directe uniquement", "Poule(s) unique(s)"}));
    comboBox_4.setToolTipText("Tournoi\r\nChampionnat");
    comboBox_4.setBounds(170, 225, 296, 22);
    getContentPane().add(comboBox_4);

//    this.getContentPane().add(bouton);
//
//    bouton.addActionListener(new ActionListener(){
//
//      public void actionPerformed(ActionEvent arg0) {

        corpsFenetreGestionCompetitions zd = new corpsFenetreGestionCompetitions(null, "Coucou les ZérOs", true);

        objetCompetitions zInfo = zd.showcorpsFenetreGestionCompetitions(); 

        JOptionPane jop = new JOptionPane();

        jop.showMessageDialog(null, zInfo.toString(), "Informations personnage", JOptionPane.INFORMATION_MESSAGE);

//      }         

//    });      

    this.setVisible(true);      

  }
}