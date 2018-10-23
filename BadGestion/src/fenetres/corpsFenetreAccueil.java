package fenetres;

import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;

public class corpsFenetreAccueil extends JFrame
{
	
/**
	 * 
	 */
	private static final long serialVersionUID = -984257453029495269L;

public void fnAccueil () 
{
	
	 try {
		  UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");

		} catch (Exception e) {
		  }
	
JFrame fenetreAccueil = new JFrame("Gestion Badminton");

fenetreAccueil.addWindowListener (new WindowAdapter() {
	public void windowClosing (WindowEvent e) {
		System.exit(0);
	}});

// Création d'un panel à onglets
JTabbedPane panelOnglets = new JTabbedPane();

// 1er onglet
JPanel ongletAccueil = new JPanel();
// Définition du titre dans le corps onglet
JLabel labelAccueil = new JLabel("Accueil");
ongletAccueil.add(labelAccueil);
// Implantation de l'onglet
panelOnglets.addTab("Accueil", null, ongletAccueil, "Accueil du logiciel");

// 2è onglet
JPanel ongletGestionClub = new JPanel();
JTextField champTexte = new JTextField(20);
ongletGestionClub.add(champTexte);
panelOnglets.addTab("Gestion club", null, ongletGestionClub, "Gestion de l'univers du club : licenciés, trésorerie, organisation...");

// 3è onglet
JPanel ongletGestionCompets = new JPanel();
JTextField champTexte2 = new JTextField(20);
ongletGestionCompets.add(champTexte2);
panelOnglets.addTab("Gestion compétitions", null, ongletGestionCompets, "Gestion de l'univers des compétitions : compétitions individuelles/par équipes, organisation, compositions...");

// et voila, il faut en plus ajouter le panel à onglet dans le panel principal
Container panelPrincipal = fenetreAccueil.getContentPane();
panelPrincipal.add(panelOnglets);
fenetreAccueil.setVisible(true);
}

public void setVisible(boolean b) {
	// TODO Stub de la méthode généré automatiquement
	
}

}