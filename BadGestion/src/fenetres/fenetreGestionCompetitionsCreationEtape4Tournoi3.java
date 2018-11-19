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
import javax.swing.InputVerifier;
import javax.swing.plaf.basic.BasicComboBoxRenderer;
import javax.swing.plaf.basic.BasicComboBoxEditor;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JSeparator;

public class fenetreGestionCompetitionsCreationEtape4Tournoi3 extends JFrame implements ActionListener {
	private Fenetre2 fen;
	private JTextField textField;

//  private JButton bouton = new JButton("Appel à la corpsFenetreGestionCompetitions");


  public fenetreGestionCompetitionsCreationEtape4Tournoi3()
  {
	  
	  try 
      {
		  UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");

		}
      catch (Exception e) 
      {
		}
	  
  	setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);      

    this.setTitle("GestionBad - Gestion compétition > Création compétition > Étape 4 : Définition tableaux");

    this.setSize(881, 684);

    this.setLocationRelativeTo(null);
    getContentPane().setLayout(null);
    
    JLabel lblNewLabel = new JLabel("Niveaux :");
    lblNewLabel.setBounds(25, 90, 145, 34);
    getContentPane().add(lblNewLabel);
    
    JComboBox comboBox = new JComboBox();
    comboBox.setModel(new DefaultComboBoxModel(new String[] {"NC", "P12", "P11", "P10", "P", "D9", "D8", "D7", "D", "R6", "R5", "R4", "R", "N3", "N2", "N1", "N"}));
    comboBox.setBounds(521, 96, 145, 22);
    getContentPane().add(comboBox);
    
    JLabel lblNumAutorisationCompetition = new JLabel("Intitulé tableau : ");
    lblNumAutorisationCompetition.setBounds(25, 49, 175, 34);
    getContentPane().add(lblNumAutorisationCompetition);
    
    JComboBox comboBox_3 = new JComboBox();
    comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Amicale", "Officielle"}));
    comboBox_3.setToolTipText("Amicale (non-officielle/officieuse)\r\nOfficielle (enregistrée dans un ou plusieurs logiciel(s) : BadNet/ICManager, et en base de données : Poona)");
    comboBox_3.setBounds(370, 350, 296, 22);
    getContentPane().add(comboBox_3);
    
    JLabel lblFormeDeComptition = new JLabel("Forme de compétition : ");
    lblFormeDeComptition.setBounds(25, 303, 145, 34);
    getContentPane().add(lblFormeDeComptition);
    
    JComboBox comboBox_4 = new JComboBox();
    comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"Ronde suisse", "Ronde italienne", "Poules", "Poules puis élimination directe", "Élimination directe uniquement", "Poule(s) unique(s)"}));
    comboBox_4.setToolTipText("Tournoi\r\nChampionnat");
    comboBox_4.setBounds(370, 309, 296, 22);
    getContentPane().add(comboBox_4);
    
    JLabel lblNomDeComptition = new JLabel("Nom de compétition : ");
    lblNomDeComptition.setBounds(25, 344, 145, 34);
    getContentPane().add(lblNomDeComptition);
    
    textField = new JTextField();
    textField.setToolTipText("S'il est déjà existant sous Poona, vous pouvez le saisir.\r\nSinon, s'il n'existe pas encore, le champ est grisé et inactif.");
    textField.setBounds(370, 55, 296, 22);
    getContentPane().add(textField);
    textField.setColumns(10);
    
    JSeparator separator = new JSeparator();
    separator.setBounds(180, 389, 1, 2);
    getContentPane().add(separator);
    
    JButton btnSuivant = new JButton("Suivant");
    btnSuivant.addActionListener(this);
    btnSuivant.setBounds(569, 394, 97, 25);
    getContentPane().add(btnSuivant);
    
    JLabel lblMini = new JLabel("Mini :");
    lblMini.setBounds(370, 90, 145, 34);
    getContentPane().add(lblMini);
    
    JLabel lblMaxi = new JLabel("Maxi :");
    lblMaxi.setBounds(370, 131, 145, 34);
    getContentPane().add(lblMaxi);
    
    JComboBox comboBox_5 = new JComboBox();
    comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"NC", "P12", "P11", "P10", "P", "D9", "D8", "D7", "D", "R6", "R5", "R4", "R", "N3", "N2", "N1", "N"}));
    comboBox_5.setBounds(521, 137, 145, 22);
    getContentPane().add(comboBox_5);

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

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Stub de la méthode généré automatiquement
    //Lorsque nous cliquons sur notre bouton, on passe a l'autre fenétre
    this.dispose();
    fen = new Fenetre2();
}

public static void main(String[] args) {
    // TODO Auto-generated method stub
      
	fenetreGestionCompetitionsCreationEtape4Tournoi3 fen= new fenetreGestionCompetitionsCreationEtape4Tournoi3();
}
}