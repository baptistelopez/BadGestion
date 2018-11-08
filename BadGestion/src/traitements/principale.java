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
import fenetres.fenetreGestionCompetitionsCreationEtape1Generale;

import java.awt.FlowLayout;

//import javax.swing.JFrame;

import fenetres.FenetreAccueil;
 
public class principale 
{
    public static void main (String [] args) 
    {
//final JFrame fnAccueil = new JFrame("Accueil");
//        final JButton btnLogin = new JButton("Click to login");
// 
//        btnLogin.addActionListener(
//                new ActionListener(){
//                    public void actionPerformed(ActionEvent e) {
                        fenetreAuthentification fenAuthentif = new fenetres.fenetreAuthentification (null);
                        fenAuthentif.setVisible(true);  
                        fenAuthentif.setSize(300, 100);
                        fenAuthentif.setLayout(new FlowLayout());
    
                        // if logon successfully
                        if(fenAuthentif.isSucceeded())
                        {
//                            btnLogin.setText ("Hi " + loginDlg.getUsername() + " !");
                        	fenetres.FenetreAccueil fenAccueil = new fenetres.FenetreAccueil ();
                        	fenAccueil.setVisible(true);
                        }
                        
//    );
                        
                        fenetreGestionCompetitionsCreationEtape1Generale fen = new fenetreGestionCompetitionsCreationEtape1Generale();
 
    }
    
//  fenetreAuthentificationPoona.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//fenetreAuthentificationPoona.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

  //fenetreAuthentification.getContentPane().add(btnLogin);  
    	
}