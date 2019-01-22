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
import javax.swing.InputVerifier;
import javax.swing.plaf.basic.BasicComboBoxRenderer;
import javax.swing.plaf.basic.BasicComboBoxEditor;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JSeparator;
import javax.swing.JCheckBox;
import javax.swing.JProgressBar;

public class fenetreGestionCompetitionsCreationEtape4Tournoi3 extends JFrame implements ActionListener {
//	private Fenetre2 fen;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

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

    this.setSize(1327, 902);

    this.setLocationRelativeTo(null);
    getContentPane().setLayout(null);
    
    JLabel lblNewLabel = new JLabel("Niveaux de classements :");
    lblNewLabel.setBounds(24, 215, 145, 34);
    getContentPane().add(lblNewLabel);
    
    JComboBox comboBox = new JComboBox();
    comboBox.setModel(new DefaultComboBoxModel(new String[] {"NC", "P12", "P11", "P10", "P", "D9", "D8", "D7", "D", "R6", "R5", "R4", "R", "N3", "N2", "N1", "N"}));
    comboBox.setBounds(520, 221, 145, 22);
    getContentPane().add(comboBox);
    
    JLabel lblNumAutorisationCompetition = new JLabel("Intitulé tableau : ");
    lblNumAutorisationCompetition.setBounds(24, 53, 175, 34);
    getContentPane().add(lblNumAutorisationCompetition);
    
    JLabel lblFormeDeComptition = new JLabel("Côtes : ");
    lblFormeDeComptition.setBounds(24, 302, 145, 34);
    getContentPane().add(lblFormeDeComptition);
    
    JTextField comboBox_4 = new JTextField();
    comboBox_4.setToolTipText("Décimal sous forme xx xxx,yy");
    comboBox_4.setBounds(520, 349, 145, 22);
    getContentPane().add(comboBox_4);
    
    textField = new JTextField();
    textField.setToolTipText("S'il est déjà existant sous Poona, vous pouvez le saisir.\r\nSinon, s'il n'existe pas encore, le champ est grisé et inactif.");
    textField.setBounds(369, 59, 296, 22);
    getContentPane().add(textField);
    textField.setColumns(10);
    
    JSeparator separator = new JSeparator();
    separator.setBounds(179, 429, 1, 2);
    getContentPane().add(separator);
    
    JLabel lblMini = new JLabel("Mini :");
    lblMini.setBounds(369, 215, 145, 34);
    getContentPane().add(lblMini);
    
    JLabel lblMaxi = new JLabel("Maxi :");
    lblMaxi.setBounds(369, 256, 145, 34);
    getContentPane().add(lblMaxi);
    
    JComboBox comboBox_5 = new JComboBox();
    comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"NC", "P12", "P11", "P10", "P", "D9", "D8", "D7", "D", "R6", "R5", "R4", "R", "N3", "N2", "N1", "N"}));
    comboBox_5.setBounds(520, 262, 145, 22);
    getContentPane().add(comboBox_5);
    
    JCheckBox chckbxSiimplesHommessh = new JCheckBox("Simples Hommes (SH)");
    chckbxSiimplesHommessh.setBounds(369, 127, 162, 25);
    getContentPane().add(chckbxSiimplesHommessh);
    
    JCheckBox chckbxSimplesDamessd = new JCheckBox("Simples Dames (SD)");
    chckbxSimplesDamessd.setBounds(535, 126, 153, 25);
    getContentPane().add(chckbxSimplesDamessd);
    
    JCheckBox chckbxDoublesHommesdh = new JCheckBox("Doubles Hommes (DH)");
    chckbxDoublesHommesdh.setBounds(692, 127, 162, 25);
    getContentPane().add(chckbxDoublesHommesdh);
    
    JLabel lblDisciplinesOuvertes = new JLabel("Disciplines ouvertes : ");
    lblDisciplinesOuvertes.setBounds(24, 118, 175, 34);
    getContentPane().add(lblDisciplinesOuvertes);
    
    JCheckBox chckbxDoublesDamesdd = new JCheckBox("Doubles Dames (DD)");
    chckbxDoublesDamesdd.setBounds(858, 127, 153, 25);
    getContentPane().add(chckbxDoublesDamesdd);
    
    JCheckBox chckbxDoublesMixtesdmx = new JCheckBox("Doubles Mixtes (DMx)");
    chckbxDoublesMixtesdmx.setBounds(1015, 127, 153, 25);
    getContentPane().add(chckbxDoublesMixtesdmx);
    
    JLabel lblDlimitationTableaux = new JLabel("Délimitation tableaux : ");
    lblDlimitationTableaux.setBounds(24, 157, 175, 34);
    getContentPane().add(lblDlimitationTableaux);
    
    JCheckBox chckbxClassements = new JCheckBox("Par classements");
    chckbxClassements.setBounds(692, 162, 134, 25);
    getContentPane().add(chckbxClassements);
    
    JCheckBox chckbxCtes = new JCheckBox("Par côtes");
    chckbxCtes.setBounds(535, 162, 153, 25);
    getContentPane().add(chckbxCtes);
    
    textField_1 = new JTextField();
    textField_1.setToolTipText("S'il est déjà existant sous Poona, vous pouvez le saisir.\r\nSinon, s'il n'existe pas encore, le champ est grisé et inactif.");
    textField_1.setColumns(10);
    textField_1.setBounds(369, 90, 296, 22);
    getContentPane().add(textField_1);
    
    JLabel lblIntitulTableauPour = new JLabel("Intitulé tableau pour l'affichage : ");
    lblIntitulTableauPour.setBounds(24, 84, 203, 34);
    getContentPane().add(lblIntitulTableauPour);
    
    JLabel label = new JLabel("Mini :");
    label.setBounds(369, 302, 145, 34);
    getContentPane().add(label);
    
    JLabel label_1 = new JLabel("Maxi :");
    label_1.setBounds(369, 343, 145, 34);
    getContentPane().add(label_1);
    
    textField_2 = new JTextField();
    textField_2.setText("0,00");
    textField_2.setToolTipText("Décimal sous forme xx xxx,yy");
    textField_2.setBounds(520, 308, 145, 22);
    getContentPane().add(textField_2);
    
    JCheckBox chckbxParCatgoriesDge = new JCheckBox("Par catégories d'âge");
    chckbxParCatgoriesDge.setBounds(858, 162, 153, 25);
    getContentPane().add(chckbxParCatgoriesDge);
    
    JLabel lblCatgoriesDge = new JLabel("Catégories d'âge :");
    lblCatgoriesDge.setBounds(24, 384, 145, 34);
    getContentPane().add(lblCatgoriesDge);
    
    JLabel label_3 = new JLabel("Mini :");
    label_3.setBounds(369, 384, 145, 34);
    getContentPane().add(label_3);
    
    JComboBox comboBox_1 = new JComboBox();
    comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Minibad", "Poussins 1", "Poussins 2", "Poussins", "Benjamins 1", "Benjamins 2", "Benjamins", "Minimes 1", "Minimes 2", "Minimes", "Cadets 1", "Cadets 2", "Cadets", "Juniors 1", "Juniors 2", "Juniors", "Seniors", "Vétérans"}));
    comboBox_1.setBounds(520, 390, 145, 22);
    getContentPane().add(comboBox_1);
    
    JLabel label_4 = new JLabel("Maxi :");
    label_4.setBounds(369, 425, 145, 34);
    getContentPane().add(label_4);
    
    JComboBox comboBox_2 = new JComboBox();
    comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Minibad", "Poussins 1", "Poussins 2", "Poussins", "Benjamins 1", "Benjamins 2", "Benjamins", "Minimes 1", "Minimes 2", "Minimes", "Cadets 1", "Cadets 2", "Cadets", "Juniors 1", "Juniors 2", "Juniors", "Seniors", "Vétérans"}));
    comboBox_2.setBounds(520, 431, 145, 22);
    getContentPane().add(comboBox_2);
    
    // en cochant la case (cas de tableau limité à un seul classement), la liste déroul. maxi prend la valeur de la liste déroul. mini, se grise et n'est pas modifiable ==> permet meilleure validation et sécu. saisie
    JCheckBox chckbxMaxiMini = new JCheckBox("Maxi = mini");
    chckbxMaxiMini.setToolTipText("Si un tableau comprend un seul classement ou une seule série de classements (donc si le classement ou la série de classements minimum est aussi celui/celle maximum)");
    chckbxMaxiMini.setBounds(692, 236, 97, 25);
    getContentPane().add(chckbxMaxiMini);
    
    JCheckBox chckbxSiUnTableau = new JCheckBox("Maxi = mini");
    chckbxSiUnTableau.setToolTipText("Si un tableau comprend une seule valeur de côte (donc si la côte minimum est aussi celle maximum)");
    chckbxSiUnTableau.setBounds(692, 325, 97, 25);
    getContentPane().add(chckbxSiUnTableau);
    
    JCheckBox checkBox_1 = new JCheckBox("Maxi = mini");
    checkBox_1.setToolTipText("Si un tableau comprend une seule catégorie d'âge \"déclinée\" ou une seule catégorie d'âge \"générale\" (donc si la catégorie d'âge \"particulière\" ou \"générale\" minimum est aussi celui/celle maximum)");
    checkBox_1.setBounds(692, 406, 97, 25);
    getContentPane().add(checkBox_1);
    
    JLabel lblProgressiontape = new JLabel("Progression étape : ");
    lblProgressiontape.setBounds(24, 586, 175, 34);
    getContentPane().add(lblProgressiontape);
    
    JProgressBar progressBar_Etape = new JProgressBar();
    progressBar_Etape.setStringPainted(true);
    progressBar_Etape.setBounds(369, 592, 296, 22);
    getContentPane().add(progressBar_Etape);
    
    JLabel lblProgressionCrationTournoi = new JLabel("Progression création compétition : ");
    lblProgressionCrationTournoi.setBounds(24, 623, 203, 34);
    getContentPane().add(lblProgressionCrationTournoi);
    
    JProgressBar progressBar_1_Competition = new JProgressBar();
    progressBar_1_Competition.setStringPainted(true);
    progressBar_1_Competition.setBounds(369, 629, 296, 22);
    getContentPane().add(progressBar_1_Competition);
    
    JButton button = new JButton("Précédent");
    button.setBounds(369, 682, 97, 25);
    getContentPane().add(button);
    
    JButton btnSuivant = new JButton("Suivant");
    btnSuivant.addActionListener(this);
    btnSuivant.setBounds(568, 682, 97, 25);
    getContentPane().add(btnSuivant);
    
    JCheckBox chckbxParRangs = new JCheckBox("Par rangs");
    chckbxParRangs.setBounds(369, 162, 153, 25);
    getContentPane().add(chckbxParRangs);
    
    JLabel lblNombreMaxiDe = new JLabel("<html>Capacité maximale de joueurs/<br>paires du tableau :</html>");
    lblNombreMaxiDe.setBounds(24, 461, 189, 48);
    getContentPane().add(lblNombreMaxiDe);
    
    textField_3 = new JTextField();
    textField_3.setToolTipText("Entier sous forme x(xx)");
    textField_3.setText("0");
    textField_3.setBounds(369, 478, 60, 22);
    getContentPane().add(textField_3);
    
    JLabel lbltableauFusionnerouSupprimer = new JLabel("<html>Tableau à fusionner ou<br>supprimer si moins de :</html>");
    lbltableauFusionnerouSupprimer.setBounds(24, 501, 139, 48);
    getContentPane().add(lbltableauFusionnerouSupprimer);
    
    textField_4 = new JTextField();
    textField_4.setToolTipText("Entier sous forme x(xx)");
    textField_4.setText("0");
    textField_4.setBounds(369, 518, 60, 22);
    getContentPane().add(textField_4);
    
    JComboBox comboBox_3 = new JComboBox();
    comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Joueurs", "Paires"}));
    comboBox_3.setBounds(441, 478, 90, 22);
    getContentPane().add(comboBox_3);
    
    JComboBox comboBox_6 = new JComboBox();
    comboBox_6.setModel(new DefaultComboBoxModel(new String[] {"Joueurs", "Paires"}));
    comboBox_6.setBounds(441, 518, 90, 22);
    getContentPane().add(comboBox_6);
    
    JLabel lblInscrites = new JLabel("inscrit(e)s");
    lblInscrites.setBounds(547, 478, 74, 22);
    getContentPane().add(lblInscrites);
    
    JLabel lblInscrites_1 = new JLabel("inscrit(e)s dedans");
    lblInscrites_1.setBounds(547, 518, 118, 22);
    getContentPane().add(lblInscrites_1);

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
      
	fenetreGestionCompetitionsCreationEtape4Tournoi3 fen= new fenetreGestionCompetitionsCreationEtape4Tournoi3();
}
}