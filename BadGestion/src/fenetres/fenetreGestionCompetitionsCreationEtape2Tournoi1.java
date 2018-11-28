package fenetres;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import fenetres.corpsFenetreGestionCompetitions;
import objets.objetCompetitions;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JSeparator;
import javax.swing.JCheckBox;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import org.jdatepicker.JDatePanel;
import org.jdatepicker.JDatePicker;
import org.jdatepicker.UtilDateModel;

public class fenetreGestionCompetitionsCreationEtape2Tournoi1 extends JFrame implements ActionListener, ItemListener {
	private Fenetre2 fen;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JDatePicker textField_7;

//  private JButton bouton = new JButton("Appel à la corpsFenetreGestionCompetitions");


  public fenetreGestionCompetitionsCreationEtape2Tournoi1()
  {
	  
	  try 
      {
		  UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");

		}
      catch (Exception e) 
      {
		}
	  
  	setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);      

    this.setTitle("GestionBad - Gestion compétition > Création compétition > Étape 2 : Caractéristiques générales Tournoi");

    this.setSize(881, 684);

    this.setLocationRelativeTo(null);
    getContentPane().setLayout(null);
    
    JLabel lblNewLabel = new JLabel("Scoring :");
    lblNewLabel.setBounds(25, 90, 145, 34);
    getContentPane().add(lblNewLabel);
    
    JComboBox comboBox = new JComboBox();
    comboBox.setToolTipText("par défaut : 3 sets de 21 points (3x21), scoring actuel en France et à l'international");
    comboBox.setModel(new DefaultComboBoxModel(new String[] {"1 set de 11 points (1x11)", "1 set de 21 points (1x21)", "3 sets de 15 points (3x15)", "3 sets de 21 points (3x21)", "5 sets de 11 points (5x11) - sans tie break", "5 sets de 11 points (5x11) - avec tie break"}));
    comboBox.setSelectedIndex(3);
    comboBox.setBounds(265, 96, 296, 22);
    getContentPane().add(comboBox);
    
    JLabel lblModeDeComptition = new JLabel("Temps de repos : ");
    lblModeDeComptition.setBounds(25, 131, 145, 34);
    getContentPane().add(lblModeDeComptition);
    
    JLabel lblNumAutorisationCompetition = new JLabel("N° dossier d'autorisation : ");
    lblNumAutorisationCompetition.setBounds(25, 49, 175, 34);
    getContentPane().add(lblNumAutorisationCompetition);
    
    JLabel lblFormeDeComptition = new JLabel("Forme de la compétition : ");
    lblFormeDeComptition.setBounds(25, 172, 156, 34);
    getContentPane().add(lblFormeDeComptition);
    
    JComboBox comboBox_4 = new JComboBox();
    comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"Ronde suisse", "Ronde italienne", "Poules", "Poules puis élimination directe", "Élimination directe uniquement", "Poule(s) unique(s)", "Rencontres entre équipes"}));
    comboBox_4.setToolTipText("Tournoi\r\nChampionnat");
    comboBox_4.setBounds(265, 178, 296, 22);
    getContentPane().add(comboBox_4);
    
    JLabel lblNomDeComptition = new JLabel("Organisateur(s) de la compétition : ");
    lblNomDeComptition.setBounds(25, 213, 206, 34);
    getContentPane().add(lblNomDeComptition);
    
    textField = new JTextField();
    textField.addKeyListener(new KeyAdapter() {
    	@Override
    	public void keyPressed(KeyEvent arg0) {
    	}
    });
    textField.setToolTipText("S'il est déjà existant sous Poona mais pas encore répertorié dans le logiciel (première modification via le logiciel d'une compétition dont le dossier existe déjà sur Poona), vous pouvez le saisir puis valider avec Entrée pour le rechercher, si le n° est reconnu cela remplira automatiquement ceux des champs de formulaires restants qui sont partagés entre le logiciel et Poona.\r\nS'il est déjà existant et répertorié dans le logiciel, le champ sera rempli, grisé et inactif.\r\nSinon, s'il n'existe pas encore, le champ est vide. \r\nLe n° correspondant sera créé automatiquement à la fin du processus, lors de la transmission des informations saisies à Poona.");
    textField.setBounds(265, 55, 296, 22);
    getContentPane().add(textField);
    textField.setColumns(10);
    
    JSeparator separator = new JSeparator();
    separator.setBounds(180, 389, 1, 2);
    getContentPane().add(separator);
    
    JButton btnSuivant = new JButton("Suivant");
    btnSuivant.addActionListener(this);
    btnSuivant.setBounds(464, 421, 97, 25);
    getContentPane().add(btnSuivant);
    
    textField_1 = new JTextField();
    textField_1.setText("20");
    textField_1.setToolTipText("En minutes ; voir le RGC (onglet Divers > Documentation bad > Compétitions > RGC) pour plus de précisions règlementaires.");
    textField_1.setColumns(10);
    textField_1.setBounds(265, 137, 45, 22);
    getContentPane().add(textField_1);
    
    JCheckBox chckbxDiffTpsReposDisciplines = new JCheckBox("Différencié");
chckbxDiffTpsReposDisciplines.addItemListener
(new ItemListener () 
{
	@Override
	public void itemStateChanged(ItemEvent item) 
	{
	int status = item.getStateChange();
	if (status == ItemEvent.SELECTED) 
	{
//	showStatus("choix selectionne");
		
		textField_1.setVisible(false);
		
		JLabel lblSimples = new JLabel("Simples : ");
	    lblSimples.setBounds(426, 131, 63, 34);
	    lblSimples.setVisible(true);
	    getContentPane().add(lblSimples);
		
		textField_2 = new JTextField();
	    textField_2.setToolTipText("En minutes ; voir le RGC (onglet Divers > Documentation bad > Compétitions > RGC) pour plus de précisions règlementaires.");
	    textField_2.setText("");
	    textField_2.setColumns(10);
	    textField_2.setBounds(501, 137, 45, 22);
	    textField_2.setVisible(true);
	    getContentPane().add(textField_2);
	    
	    JLabel lblDoubles = new JLabel("Doubles : ");
	    lblDoubles.setBounds(558, 131, 63, 34);
	    lblDoubles.setVisible(true);
	    getContentPane().add(lblDoubles);
	    
	    textField_3 = new JTextField();
	    textField_3.setToolTipText("En minutes ; voir le RGC (onglet Divers > Documentation bad > Compétitions > RGC) pour plus de précisions règlementaires.");
	    textField_3.setText("");
	    textField_3.setColumns(10);
	    textField_3.setBounds(633, 137, 45, 22);
	    textField_3.setVisible(true);
	    getContentPane().add(textField_3);
	    
	    JLabel lblMixtes = new JLabel("Mixtes : ");
	    lblMixtes.setBounds(690, 131, 63, 34);
	    lblMixtes.setVisible(true);
	    getContentPane().add(lblMixtes);
	    
	    textField_4 = new JTextField();
	    textField_4.setToolTipText("En minutes ; voir le RGC (onglet Divers > Documentation bad > Compétitions > RGC) pour plus de précisions règlementaires.");
	    textField_4.setText("");
	    textField_4.setColumns(10);
	    textField_4.setBounds(765, 137, 45, 22);
	    textField_3.setVisible(true);
	    getContentPane().add(textField_4);
	}


//    if (chckbxNewCheckBox.isSelected())
//	{


    		

//	}
	
	else
	
	{
		textField_1.setVisible(true);
		textField_2.setVisible(false);
		textField_3.setVisible(false);
		textField_4.setVisible(false);
	}
	}
}
		);
    chckbxDiffTpsReposDisciplines.setBounds(318, 136, 99, 25);
    getContentPane().add(chckbxDiffTpsReposDisciplines);
    
    textField_5 = new JTextField();
    textField_5.setToolTipText("S'il est déjà existant sous Poona mais pas encore répertorié dans le logiciel (première modification via le logiciel d'une compétition dont le dossier existe déjà sur Poona), vous pouvez le saisir, cela remplira automatiquement ceux des champs de formulaires restants qui sont partagés entre le logiciel et Poona.\r\nS'il est déjà existant et répertorié dans le logiciel, le champ sera rempli, grisé et inactif.\r\nSinon, s'il n'existe pas encore, le champ est vide. \r\nLe n° correspondant sera créé automatiquement à la fin du processus, lors de la transmission des informations saisies à Poona.");
    textField_5.setColumns(10);
    textField_5.setBounds(265, 219, 296, 22);
    getContentPane().add(textField_5);
    
    JLabel lblJugesarbitresDeLa = new JLabel("Juge(s)-Arbitre(s) de la compétition : ");
    lblJugesarbitresDeLa.setBounds(25, 254, 228, 34);
    getContentPane().add(lblJugesarbitresDeLa);
    
    textField_6 = new JTextField();
    textField_6.setToolTipText("S'il est déjà existant sous Poona mais pas encore répertorié dans le logiciel (première modification via le logiciel d'une compétition dont le dossier existe déjà sur Poona), vous pouvez le saisir.\r\nS'il est déjà existant et répertorié dans le logiciel, le champ sera rempli, grisé et inactif.\r\nSinon, s'il n'existe pas encore, le champ est vide.");
    textField_6.setColumns(10);
    textField_6.setBounds(265, 260, 296, 22);
    getContentPane().add(textField_6);
    
    JButton btnPrecedent = new JButton("Précédent");
    btnPrecedent.setBounds(265, 421, 97, 25);
    getContentPane().add(btnPrecedent);
    
    JLabel lblDatesDeLa = new JLabel("Date(s) de la compétition : ");
    lblDatesDeLa.setBounds(25, 295, 228, 34);
    getContentPane().add(lblDatesDeLa);
    
//    textField_7 = new JDatePicker();
//    textField_7.getButton().addActionListener(new ActionListener() {
//    	public void actionPerformed(ActionEvent arg0) {
//    	}
//    });
//    textField_7.setToolTipText("S'il est déjà existant sous Poona mais pas encore répertorié dans le logiciel (première modification via le logiciel d'une compétition dont le dossier existe déjà sur Poona), vous pouvez le saisir.\r\nS'il est déjà existant et répertorié dans le logiciel, le champ sera rempli, grisé et inactif.\r\nSinon, s'il n'existe pas encore, le champ est vide.");
//    textField_7.setBounds(265, 301, 296, 22);
//    UtilDateModel model = new UtilDateModel();
//    JDatePanel datePanel = new JDatePanel(model);
//    JDatePicker datePicker = new JDatePicker(datePanel);
//     
//    frame.add(datePicker);
    getContentPane().add(textField_7);
    
    

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
      
	fenetreGestionCompetitionsCreationEtape2Tournoi1 fen= new fenetreGestionCompetitionsCreationEtape2Tournoi1();
}

@Override
public void itemStateChanged(ItemEvent e) {
	// TODO Stub de la méthode généré automatiquement
	
}
}