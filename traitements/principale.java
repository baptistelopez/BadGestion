// http://www.zentut.com/java-swing/simple-login-dialog/

// Third, in the main program, we create a new instance of login dialog LoginDialog. To show login dialog, we use method setVisible(true).
	
package traitements;

//import java.awt.BorderLayout;
//import java.awt.Color;
//import java.awt.Frame;
//import java.awt.GridBagConstraints;
//import java.awt.GridBagLayout;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//import javax.swing.JButton;
//import javax.swing.JDialog;
//import javax.swing.JLabel;
//import javax.swing.JOptionPane;
//import javax.swing.JPanel;
//import javax.swing.JPasswordField;
//import javax.swing.JTextField;
//import javax.swing.border.LineBorder;

//import java.awt.*;
//import java.awt.event.*;
//import javax.swing.*;
//import javax.swing.border.*;
//import traitements.authentification;
import fenetres.fenetreAuthentification;
import fenetres.FenetreAuthentificationLogiciel;
import fenetres.fenetreGestionCompetitionsCreationEtape1Generale;
import fenetres.FenetreAccueil;

import java.awt.FlowLayout;

import javax.swing.JFrame;

//import javax.swing.JFrame;
 
public class principale 
{
    public static void main (String [] args) 
    {
//JFrame fenAccueil = new JFrame("Accueil");
FenetreAuthentificationLogiciel fenAuthentifLogiciel = new FenetreAuthentificationLogiciel();
FenetreAccueil fenAccueil = new FenetreAccueil();
// final : va avec ligne ci-dessous

//final JFrame fenAccueil = new JFrame("Accueil");
//        final JButton btnLogin = new JButton("Click to login");
// 
//        btnLogin.addActionListener(
//                new ActionListener(){
//                    public void actionPerformed(ActionEvent e) {
                        //FenetreAuthentificationLogiciel fenAuthentifLogiciel = new FenetreAuthentificationLogiciel ();
                        fenAuthentifLogiciel.setVisible(true);  
                        fenAuthentifLogiciel.setSize(1280, 800);
                        fenAuthentifLogiciel.setLayout(new FlowLayout());
    
//                        // if logon successfully
//                        if(fenAuthentifLogiciel.isSucceeded())
//                        {
////                            btnLogin.setText ("Hi " + loginDlg.getUsername() + " !");
////                        	fenAccueil = new fenetres.FenetreAccueil ();
////                        	FenetreAccueil fenAccueil = new FenetreAccueil();
//                        	fenAccueil.setVisible(true);
//                        }
                        
                        if ( (authentification.authenticate (fenAuthentifLogiciel.getUsername (), fenAuthentifLogiciel.getPassword ()) ) && (fenAuthentifLogiciel.isSucceeded()) ) 
                        {
//                            JOptionPane.showMessageDialog(FenetreAuthentificationLogiciel.this,
//                                    "Bonjour/bonsoir " + getUsername () + "!",
//                                    "Authentification",
//                                    JOptionPane.INFORMATION_MESSAGE);
//                        	fenAuthentifLogiciel.succeeded = true;
//                          if (isSucceeded())
//                          {
//                            fenAccueil = new fenetres.FenetreAccueil();
                            
                            
                            //fenetres.FenetreAccueil fenAccueil = new fenetres.FenetreAccueil();
                            fenAccueil.setVisible(true);
                            fenAccueil.setSize(800, 600);
                            
                            fenAuthentifLogiciel.dispose ();
                            //frameAuthLogiciel.dispose ();
//                        }
                        }
                        
//    );
                        
//                        fenetreGestionCompetitionsCreationEtape1Generale fen = new fenetreGestionCompetitionsCreationEtape1Generale();
 
    }
    
//  fenetreAuthentificationPoona.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//fenetreAuthentificationPoona.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

  //fenetreAuthentification.getContentPane().add(btnLogin);  
    	
}