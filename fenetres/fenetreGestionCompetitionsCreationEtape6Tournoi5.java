package fenetres;

import java.awt.FlowLayout;
import java.awt.*;
import javax.swing.*;
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
import javax.swing.JSeparator;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

public class fenetreGestionCompetitionsCreationEtape6Tournoi5 extends JFrame 
//implements ActionListener 
{
	public fenetreGestionCompetitionsCreationEtape6Tournoi5() {
	}
	/*
	
	public fenetreGestionCompetitionsCreationEtape6Tournoi5() {
	}
	
	
	
//	private Fenetre2 fen;
	private JTextField textField;

//  private JButton bouton = new JButton("Appel à la corpsFenetreGestionCompetitions");


  public fenetreGestionCompetitionsCreationEtape6Tournoi5()
  {
	  
	  try 
      {
		  UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");

		}
      catch (Exception e) 
      {
		}
	  
  	setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);      

    this.setTitle("GestionBad - Gestion compétition > Création compétition > Étape 5 : Composition tableaux - Poules");

    this.setSize(881, 684);

    this.setLocationRelativeTo(null);
    getContentPane().setLayout(null);
    
    JLabel lblNewLabel = new JLabel("Limitation Têtes de Série (TdS) :");
    lblNewLabel.setBounds(25, 90, 195, 34);
    getContentPane().add(lblNewLabel);
    
    JLabel lblNumAutorisationCompetition = new JLabel("N° dossier d'autorisation : ");
    lblNumAutorisationCompetition.setBounds(25, 49, 175, 34);
    getContentPane().add(lblNumAutorisationCompetition);
    
    JComboBox comboBox_3 = new JComboBox();
    comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Amicale", "Officielle"}));
    comboBox_3.setToolTipText("Amicale (non-officielle/officieuse)\r\nOfficielle (enregistrée dans un ou plusieurs logiciel(s) : BadNet/ICManager, et en base de données : Poona)");
    comboBox_3.setBounds(265, 348, 296, 22);
    getContentPane().add(comboBox_3);
    
    JLabel lblFormeDeComptition = new JLabel("Forme de compétition : ");
    lblFormeDeComptition.setBounds(25, 301, 145, 34);
    getContentPane().add(lblFormeDeComptition);
    
    JComboBox comboBox_4 = new JComboBox();
    comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"Ronde suisse", "Ronde italienne", "Poules", "Poules puis élimination directe", "Élimination directe uniquement", "Poule(s) unique(s)"}));
    comboBox_4.setToolTipText("Tournoi\r\nChampionnat");
    comboBox_4.setBounds(265, 307, 296, 22);
    getContentPane().add(comboBox_4);
    
    JLabel lblNomDeComptition = new JLabel("Nom de compétition : ");
    lblNomDeComptition.setBounds(25, 342, 145, 34);
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
    btnSuivant.setBounds(464, 392, 97, 25);
    getContentPane().add(btnSuivant);
    
    JCheckBox chckbxNewCheckBox = new JCheckBox("");
    chckbxNewCheckBox.setToolTipText("par défaut : non (case non-cochée)");
    chckbxNewCheckBox.setBounds(367, 95, 296, 25);
    getContentPane().add(chckbxNewCheckBox);
    
    JLabel label = new JLabel("Gestion ex-aequo (à fin de phase de poules) : ");
    label.setBounds(25, 129, 278, 34);
    getContentPane().add(label);
    
    JComboBox comboBox = new JComboBox();
    comboBox.setToolTipText("Rappel (cf Documentation bad > Compétitions > Règlement Général des Compétitions (RGC) pour plus de précisions) : en France, le RGC définit le départage des joueurs ou paires en dernier recours à l'âge ; dans le cas d'un tournoi hors vétérans, c'est au bénéfice du joueur le plus jeune, dans le cas d'un tournoi vétérans, c'est au bénéfice du joueur le plus âgé. ");
    comboBox.setBounds(370, 135, 296, 22);
    getContentPane().add(comboBox);
    
    JLabel label_1 = new JLabel("Sortie de poule : ");
    label_1.setBounds(25, 170, 145, 34);
    getContentPane().add(label_1);
    
    JComboBox comboBox_5 = new JComboBox();
    comboBox_5.setToolTipText("Phase de définition des sorties de poule vers les tableaux finaux (à l'issue du dernier match de la poule).\r\nRappels RGC :\r\n- Le tirage intégral correspond à un tirage au sort total du placement dans les tableaux finaux des joueurs/paires non-TdS à l'origine et/ou non-TdS en sortie de poules, les TdS étant placées ordinalement de haut en bas dans les tableaux finaux (système actuellement utilisé).\r\n- 1er(s)/1ère(s) de poule contre 2ème(s) de poule : le(s) joueurs/paires arrivé(e)(s) 1er(s)/1ère(s)  de poule rencontrent les joueurs/paires arrivé(e)(s) 2ème(s) d'une autre poule (ancien système).");
    comboBox_5.setBounds(370, 176, 296, 22);
    getContentPane().add(comboBox_5);
    
    JButton button = new JButton("Précédent");
    button.setBounds(265, 392, 97, 25);
    getContentPane().add(button);

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
}

public static void main(String[] args) {
    // TODO Auto-generated method stub
      
	//fenetreGestionCompetitionsCreationEtape6Tournoi5 fen= new fenetreGestionCompetitionsCreationEtape6Tournoi5();
}

*/

//début ajout https://stackoverflow.com/questions/19223366/moving-selected-data-between-two-jlist#
public static void main(String ... args) {
    JFrame frame = new JFrame("Test");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    DefaultListModel<String> defaultListModel = new DefaultListModel<String>();
    defaultListModel.addElement("Bla bla bla");
    defaultListModel.addElement("Ble ble ble");
    defaultListModel.addElement("Blo blo blo");

    final JList<String> list = new JList<String>();
    list.setPreferredSize(new Dimension(400, 200));
    list.setModel(defaultListModel);

    JButton button = new JButton("Add");
    button.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            ((DefaultListModel<String>)list.getModel()).addElement("New one added");
        }
    });

    frame.getContentPane().setLayout(new BorderLayout(5, 5));
    frame.getContentPane().add(new JScrollPane(list), BorderLayout.NORTH);
    frame.getContentPane().add(button, BorderLayout.SOUTH);
    frame.pack();
    frame.setVisible(true);
}
//fin ajout
}