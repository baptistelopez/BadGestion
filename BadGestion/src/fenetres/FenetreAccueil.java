package fenetres;

import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;
import javax.swing.JPopupMenu;
import javax.swing.JSeparator;
import javax.swing.KeyStroke;
import javax.swing.JCheckBoxMenuItem;

public class FenetreAccueil extends JFrame
{
	public FenetreAccueil() {
		setTitle("BadGestion - Accueil");
		getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 773, 78);
		getContentPane().add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Accueil", null, panel, null);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Club", null, panel_2, null);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Compétitions", null, panel_1, null);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Suivi Activité Arbitrage", null, panel_3, null);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("Suivi Activité Juge-arbitrage", null, panel_4, null);
		
		JPanel panel_5 = new JPanel();
		tabbedPane.addTab("Suivi Activité Juge de ligne", null, panel_5, null);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Fichier");
		mnNewMenu.setMnemonic('F');
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmOuvrir = new JMenuItem("Ouvrir");
		mntmOuvrir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_MASK));
		mnNewMenu.add(mntmOuvrir);
		
		JMenuItem mntmNewMenuItem_34 = new JMenuItem("Importer");
		mntmNewMenuItem_34.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_I, InputEvent.CTRL_MASK));
		mnNewMenu.add(mntmNewMenuItem_34);
		
		JSeparator separator_22 = new JSeparator();
		mnNewMenu.add(separator_22);
		
		JMenu mnEnregistrer = new JMenu("Enregistrer");
		mnNewMenu.add(mnEnregistrer);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Enregistrer l'élément courant");
		mntmNewMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
		mnEnregistrer.add(mntmNewMenuItem);
		
		JMenuItem mntmEnregistrerLensembleDes = new JMenuItem("Enregistrer l'ensemble des éléments courants");
		mntmEnregistrerLensembleDes.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK | InputEvent.SHIFT_MASK));
		mnEnregistrer.add(mntmEnregistrerLensembleDes);
		
		JMenu mnNewMenu_4 = new JMenu("Exporter");
		mnNewMenu.add(mnNewMenu_4);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("BadIC");
		mnNewMenu_4.add(mntmNewMenuItem_6);
		
		JMenuItem mntmNewMenuItem_7 = new JMenuItem("BadNet");
		mnNewMenu_4.add(mntmNewMenuItem_7);
		
		JMenuItem mntmNewMenuItem_8 = new JMenuItem("ICManager");
		mnNewMenu_4.add(mntmNewMenuItem_8);
		
		JMenuItem mntmNewMenuItem_9 = new JMenuItem("Poona");
		mnNewMenu_4.add(mntmNewMenuItem_9);
		
		JSeparator separator_23 = new JSeparator();
		mnNewMenu.add(separator_23);
		
		JMenu mnNewMenu_3 = new JMenu("Impression");
		mnNewMenu.add(mnNewMenu_3);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Aperçu avant impression");
		mnNewMenu_3.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Imprimer");
		mntmNewMenuItem_5.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, InputEvent.CTRL_MASK));
		mnNewMenu_3.add(mntmNewMenuItem_5);
		
		JMenu mnNewMenu_17 = new JMenu("Saisie");
		mnNewMenu_17.setMnemonic('S');
		menuBar.add(mnNewMenu_17);
		
		JMenuItem mntmAnnuler = new JMenuItem("Annuler");
		mntmAnnuler.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, InputEvent.CTRL_MASK));
		mnNewMenu_17.add(mntmAnnuler);
		
		JMenuItem mntmRtablir = new JMenuItem("Rétablir");
		mntmRtablir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Y, InputEvent.CTRL_MASK));
		mnNewMenu_17.add(mntmRtablir);
		
		JSeparator separator_10 = new JSeparator();
		mnNewMenu_17.add(separator_10);
		
		JMenuItem mntmNewMenuItem_33 = new JMenuItem("Sélectionner tout");
		mntmNewMenuItem_33.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, InputEvent.CTRL_MASK));
		mnNewMenu_17.add(mntmNewMenuItem_33);
		
		JSeparator separator_12 = new JSeparator();
		mnNewMenu_17.add(separator_12);
		
		JMenuItem mntmNewMenuItem_35 = new JMenuItem("Supprimer");
		mntmNewMenuItem_35.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_DELETE, 0));
		mnNewMenu_17.add(mntmNewMenuItem_35);
		
		JSeparator separator_13 = new JSeparator();
		mnNewMenu_17.add(separator_13);
		
		JMenuItem mntmCouper = new JMenuItem("Couper");
		mntmCouper.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_MASK));
		mnNewMenu_17.add(mntmCouper);
		
		JMenuItem mntmCopier = new JMenuItem("Copier");
		mntmCopier.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_MASK));
		mnNewMenu_17.add(mntmCopier);
		
		JMenuItem mntmColler = new JMenuItem("Coller");
		mntmColler.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, InputEvent.CTRL_MASK));
		mnNewMenu_17.add(mntmColler);
		
		JSeparator separator_11 = new JSeparator();
		mnNewMenu_17.add(separator_11);
		
		JMenuItem mntmRechercher = new JMenuItem("Rechercher");
		mnNewMenu_17.add(mntmRechercher);
		
		JMenuItem mntmNewMenuItem_25 = new JMenuItem("Remplacer");
		mnNewMenu_17.add(mntmNewMenuItem_25);
		
		JMenu mnNewMenu_1 = new JMenu("Onglets");
		mnNewMenu_1.setMnemonic('O');
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmAccueil = new JMenuItem("Accueil");
		mnNewMenu_1.add(mntmAccueil);
		
		JSeparator separator_2 = new JSeparator();
		mnNewMenu_1.add(separator_2);
		
		JMenu mnNewMenu_2 = new JMenu("Compétitions");
		mnNewMenu_1.add(mnNewMenu_2);
		
		JSeparator separator_5 = new JSeparator();
		mnNewMenu_2.add(separator_5);
		
		JMenu mnNewMenu_21 = new JMenu("Organisateur(s)");
		mnNewMenu_2.add(mnNewMenu_21);
		
		JMenuItem mntmListe = new JMenuItem("Liste");
		mnNewMenu_21.add(mntmListe);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Créer");
		mnNewMenu_21.add(mntmNewMenuItem_4);
		
		JMenuItem mntmModifier = new JMenuItem("Modifier");
		mnNewMenu_21.add(mntmModifier);
		
		JMenuItem mntmSupprimer = new JMenuItem("Supprimer");
		mnNewMenu_21.add(mntmSupprimer);
		
		JMenu mnNewMenu_7 = new JMenu("Officiel(s) technique(s)");
		mnNewMenu_2.add(mnNewMenu_7);
		
		JMenu mnNewMenu_15 = new JMenu("Arbitres/Juges de Service (JdS)");
		mnNewMenu_7.add(mnNewMenu_15);
		
		JMenuItem mntmNewMenuItem_20 = new JMenuItem("Feuilles de score vierges");
		mnNewMenu_15.add(mntmNewMenuItem_20);
		
		JMenuItem mntmNewMenuItem_28 = new JMenuItem("Feuilles de score pré-remplies");
		mnNewMenu_15.add(mntmNewMenuItem_28);
		
		JSeparator separator_6 = new JSeparator();
		mnNewMenu_7.add(separator_6);
		
		JMenu mnNewMenu_16 = new JMenu("Juges-Arbitres (JA)");
		mnNewMenu_7.add(mnNewMenu_16);
		
		JSeparator separator_7 = new JSeparator();
		mnNewMenu_7.add(separator_7);
		
		JMenu mnNewMenu_14 = new JMenu("Juges de Ligne (JdL)");
		mnNewMenu_7.add(mnNewMenu_14);
		
		JMenuItem mntmNewMenuItem_26 = new JMenuItem("Dispositions terrain");
		mnNewMenu_14.add(mntmNewMenuItem_26);
		
		JMenuItem mntmNewMenuItem_27 = new JMenuItem("Grilles de rotation");
		mnNewMenu_14.add(mntmNewMenuItem_27);
		
		JMenu mnNewMenu_26 = new JMenu("Joueur(s)");
		mnNewMenu_2.add(mnNewMenu_26);
		
		JMenuItem mntmListe_2 = new JMenuItem("Liste");
		mnNewMenu_26.add(mntmListe_2);
		
		JMenuItem mntmSinscrire = new JMenuItem("Inscription");
		mnNewMenu_26.add(mntmSinscrire);
		
		JMenuItem mntmModifierUneInscription = new JMenuItem("Modifier une inscription");
		mnNewMenu_26.add(mntmModifierUneInscription);
		
		JMenuItem mntmDsinscription = new JMenuItem("Désinscription");
		mnNewMenu_26.add(mntmDsinscription);
		
		JSeparator separator_3 = new JSeparator();
		mnNewMenu_1.add(separator_3);
		
		JMenu mnNewMenu_5 = new JMenu("Gestion instance");
		mnNewMenu_1.add(mnNewMenu_5);
		
		JMenuItem mntmCompositionBureau = new JMenuItem("Composition bureau/Conseil d'Administration (CA)");
		mnNewMenu_5.add(mntmCompositionBureau);
		
		JSeparator separator_17 = new JSeparator();
		mnNewMenu_5.add(separator_17);
		
		JMenu mnNewMenu_10 = new JMenu("Adhérents / Licenciés");
		mnNewMenu_5.add(mnNewMenu_10);
		
		JMenuItem mntmListe_1 = new JMenuItem("Liste");
		mnNewMenu_10.add(mntmListe_1);
		
		JMenuItem mntmNewMenuItem_16 = new JMenuItem("Ajouter");
		mnNewMenu_10.add(mntmNewMenuItem_16);
		
		JMenuItem mntmNewMenuItem_17 = new JMenuItem("Modifier");
		mnNewMenu_10.add(mntmNewMenuItem_17);
		
		JMenuItem mntmNewMenuItem_18 = new JMenuItem("Supprimer");
		mnNewMenu_10.add(mntmNewMenuItem_18);
		
		JSeparator separator_16 = new JSeparator();
		mnNewMenu_5.add(separator_16);
		
		JMenu mnNewMenu_6 = new JMenu("Comptabilité / Trésorerie");
		mnNewMenu_5.add(mnNewMenu_6);
		
		JMenuItem mntmNewMenuItem_12 = new JMenuItem("Bilan / Compte de résultat");
		mnNewMenu_6.add(mntmNewMenuItem_12);
		
		JMenuItem mntmNewMenuItem_14 = new JMenuItem("Compte-rendu AG");
		mnNewMenu_6.add(mntmNewMenuItem_14);
		
		JSeparator separator_18 = new JSeparator();
		mnNewMenu_6.add(separator_18);
		
		JMenuItem mntmNewMenuItem_13 = new JMenuItem("Budget prévisionnel");
		mnNewMenu_6.add(mntmNewMenuItem_13);
		
		JSeparator separator_19 = new JSeparator();
		mnNewMenu_6.add(separator_19);
		
		JMenuItem mntmAttestationsDePaiement = new JMenuItem("Attestations de paiement");
		mnNewMenu_6.add(mntmAttestationsDePaiement);
		
		JSeparator separator_20 = new JSeparator();
		mnNewMenu_6.add(separator_20);
		
		JMenuItem mntmRib = new JMenuItem("RIB");
		mnNewMenu_6.add(mntmRib);
		
		JSeparator separator_4 = new JSeparator();
		mnNewMenu_5.add(separator_4);
		
		JMenu mnNewMenu_20 = new JMenu("Secrétariat");
		mnNewMenu_5.add(mnNewMenu_20);
		
		JMenuItem mntmAttestations = new JMenuItem("Attestations");
		mnNewMenu_20.add(mntmAttestations);
		
		JMenu mnNewMenu_22 = new JMenu("Assemblée Générale (AG)");
		mnNewMenu_20.add(mnNewMenu_22);
		
		JMenuItem mntmNewMenuItem_36 = new JMenuItem("Préparation");
		mnNewMenu_22.add(mntmNewMenuItem_36);
		
		JMenuItem mntmNewMenuItem_37 = new JMenuItem("Procès-Verbal (PV)");
		mnNewMenu_22.add(mntmNewMenuItem_37);
		
		JSeparator separator_15 = new JSeparator();
		mnNewMenu_1.add(separator_15);
		
		JMenu mnNewMenu_25 = new JMenu("Feuille Activité Officiels Techniques");
		mnNewMenu_1.add(mnNewMenu_25);
		
		JMenuItem mntmArbitrejugeDeService = new JMenuItem("Arbitre/Juge de Service (JdS)");
		mnNewMenu_25.add(mntmArbitrejugeDeService);
		
		JMenuItem mntmNewMenuItem_45 = new JMenuItem("Juge-Arbitre (JA)");
		mnNewMenu_25.add(mntmNewMenuItem_45);
		
		JMenuItem mntmNewMenuItem_46 = new JMenuItem("Juge de Ligne (JdL)");
		mnNewMenu_25.add(mntmNewMenuItem_46);
		
		JMenu mnNewMenu_28 = new JMenu("Gestion formations");
		mnNewMenu_1.add(mnNewMenu_28);
		
		JMenu mnNewMenu_18 = new JMenu("Recherche");
		mnNewMenu_18.setMnemonic('R');
		menuBar.add(mnNewMenu_18);
		
		JMenuItem mntmAdhrentslicencis = new JMenuItem("Adhérent(s)/Licencié(s)");
		mnNewMenu_18.add(mntmAdhrentslicencis);
		
		JSeparator separator_24 = new JSeparator();
		mnNewMenu_18.add(separator_24);
		
		JMenu mnNewMenu_24 = new JMenu("Chiffres et statistiques");
		mnNewMenu_18.add(mnNewMenu_24);
		
		JMenuItem mntmBadza = new JMenuItem("Badzaï");
		mnNewMenu_24.add(mntmBadza);
		
		JMenuItem mntmComptitions = new JMenuItem("Compétitions");
		mnNewMenu_24.add(mntmComptitions);
		
		JMenuItem mntmInstancesEtOrganisations = new JMenuItem("Instances et organisations");
		mnNewMenu_24.add(mntmInstancesEtOrganisations);
		
		JSeparator separator_9 = new JSeparator();
		mnNewMenu_18.add(separator_9);
		
		JMenu mnNewMenu_23 = new JMenu("Formations");
		mnNewMenu_18.add(mnNewMenu_23);
		
		JMenuItem mntmNewMenuItem_38 = new JMenuItem("Animation");
		mnNewMenu_23.add(mntmNewMenuItem_38);
		
		JMenuItem mntmNewMenuItem_39 = new JMenuItem("Entraînement");
		mnNewMenu_23.add(mntmNewMenuItem_39);
		
		JSeparator separator_21 = new JSeparator();
		mnNewMenu_18.add(separator_21);
		
		JMenuItem mntmNewMenuItem_30 = new JMenuItem("Fournisseur(s)");
		mnNewMenu_18.add(mntmNewMenuItem_30);
		
		JSeparator separator_8 = new JSeparator();
		mnNewMenu_18.add(separator_8);
		
		JMenu mnNewMenu_19 = new JMenu("Instance(s)");
		mnNewMenu_18.add(mnNewMenu_19);
		
		JMenuItem mntmClubs = new JMenuItem("Club(s)");
		mnNewMenu_19.add(mntmClubs);
		
		JMenuItem mntmNewMenuItem_29 = new JMenuItem("CODEP(s)");
		mnNewMenu_19.add(mntmNewMenuItem_29);
		
		JMenuItem mntmFdrales = new JMenuItem("Fédérale(s)");
		mnNewMenu_19.add(mntmFdrales);
		
		JMenuItem mntmLigues = new JMenuItem("Ligue(s)");
		mnNewMenu_19.add(mntmLigues);
		
		JSeparator separator_25 = new JSeparator();
		mnNewMenu_18.add(separator_25);
		
		JMenu mnNewMenu_27 = new JMenu("Matériel(s)");
		mnNewMenu_18.add(mnNewMenu_27);
		
		JMenuItem mntmNewMenuItem_44 = new JMenuItem("Chaussures");
		mnNewMenu_27.add(mntmNewMenuItem_44);
		
		JMenuItem mntmNewMenuItem_31 = new JMenuItem("Filets");
		mnNewMenu_27.add(mntmNewMenuItem_31);
		
		JMenuItem mntmGrips = new JMenuItem("Grips");
		mnNewMenu_27.add(mntmGrips);
		
		JMenuItem mntmMotricit = new JMenuItem("Motricité/physio/ergonomique");
		mnNewMenu_27.add(mntmMotricit);
		
		JMenuItem mntmPoteaux = new JMenuItem("Poteaux");
		mnNewMenu_27.add(mntmPoteaux);
		
		JMenuItem mntmNewMenuItem_42 = new JMenuItem("Raquettes");
		mnNewMenu_27.add(mntmNewMenuItem_42);
		
		JMenuItem mntmSurgrips = new JMenuItem("Surgrips");
		mnNewMenu_27.add(mntmSurgrips);
		
		JMenuItem mntmTapis = new JMenuItem("Tapis");
		mnNewMenu_27.add(mntmTapis);
		
		JMenuItem mntmTextile = new JMenuItem("Textile");
		mnNewMenu_27.add(mntmTextile);
		
		JMenuItem mntmNewMenuItem_43 = new JMenuItem("Volants");
		mnNewMenu_27.add(mntmNewMenuItem_43);
		
		JSeparator separator_14 = new JSeparator();
		mnNewMenu_18.add(separator_14);
		
		JMenuItem mntmNewMenuItem_32 = new JMenuItem("Partenaire(s)");
		mnNewMenu_18.add(mntmNewMenuItem_32);
		
		JMenu mnDivers = new JMenu("Divers");
		mnDivers.setMnemonic('D');
		menuBar.add(mnDivers);
		
		JMenuItem mntmParamtres = new JMenuItem("Paramètres");
		mnDivers.add(mntmParamtres);
		
		JMenuItem mntmMisesJour = new JMenuItem("Mises à jour");
		mnDivers.add(mntmMisesJour);
		
		JSeparator separator_1 = new JSeparator();
		mnDivers.add(separator_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Aide");
		mnDivers.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_10 = new JMenuItem("Raccourcis clavier et souris");
		mnDivers.add(mntmNewMenuItem_10);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("À propos");
		mnDivers.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_21 = new JMenuItem("Signaler un problème sur le logiciel");
		mnDivers.add(mntmNewMenuItem_21);
		
		JMenuItem mntmNewMenuItem_11 = new JMenuItem("Suggestions d'amélioration du logiciel");
		mnDivers.add(mntmNewMenuItem_11);
		
		JSeparator separator = new JSeparator();
		mnDivers.add(separator);
		
		JMenu mnNewMenu_8 = new JMenu("Documentation bad");
		mnDivers.add(mnNewMenu_8);
		
		JMenu mnComptitions = new JMenu("Compétitions");
		mnNewMenu_8.add(mnComptitions);
		
		JMenuItem mntmClassementsEtFonctionnement = new JMenuItem("Classements et fonctionnement classement");
		mnComptitions.add(mntmClassementsEtFonctionnement);
		
		JMenuItem mntmNewMenuItem_40 = new JMenuItem("Règlement Général des Compétitions (RGC)");
		mnComptitions.add(mntmNewMenuItem_40);
		
		JMenuItem mntmDicoglossaire = new JMenuItem("Dico/glossaire");
		mnNewMenu_8.add(mntmDicoglossaire);
		
		JMenu mnNewMenu_9 = new JMenu("IC");
		mnNewMenu_8.add(mnNewMenu_9);
		
		JMenuItem mntmNewMenuItem_15 = new JMenuItem("Règlements");
		mnNewMenu_9.add(mntmNewMenuItem_15);
		
		JMenu mnNewMenu_11 = new JMenu("Règles du bad");
		mnNewMenu_8.add(mnNewMenu_11);
		
		JMenuItem mntmRglesSimplifies = new JMenuItem("Règles simplifiées");
		mnNewMenu_11.add(mntmRglesSimplifies);
		
		JMenuItem mntmNewMenuItem_19 = new JMenuItem("Règles complètes traduites");
		mnNewMenu_11.add(mntmNewMenuItem_19);
		
		JMenuItem mntmNewMenuItem_41 = new JMenuItem("Règles complètes originales");
		mnNewMenu_11.add(mntmNewMenuItem_41);
		
		JMenu mnNewMenu_12 = new JMenu("Contacter la FFBad");
		mnDivers.add(mnNewMenu_12);
		
		JMenuItem mntmSignalerUnProblme = new JMenuItem("Signaler un problème concernant Poona");
		mnNewMenu_12.add(mntmSignalerUnProblme);
		
		JMenuItem mntmCommissionCommunication = new JMenuItem("Commission Communication");
		mnNewMenu_12.add(mntmCommissionCommunication);
		
		JMenuItem mntmCommissionFdraleOfficiels = new JMenuItem("Commission Fédérale Officiels Techniques (CFOT)");
		mnNewMenu_12.add(mntmCommissionFdraleOfficiels);
		
		JMenuItem mntmNewMenuItem_22 = new JMenuItem("Instance dirigeante (Pdt, trésorerie/compta, secrétariat)");
		mnNewMenu_12.add(mntmNewMenuItem_22);
		
		JMenu mnContacterLesInstances = new JMenu("Contacter les instances régionales (Ligue)");
		mnDivers.add(mnContacterLesInstances);
		
		JMenuItem mntmCommissionLigueOfficiels = new JMenuItem("Commission Ligue Officiels Techniques (CLOT)");
		mnContacterLesInstances.add(mntmCommissionLigueOfficiels);
		
		JMenuItem menuItem_1 = new JMenuItem("Conseil d'Administration");
		mnContacterLesInstances.add(menuItem_1);
		
		JMenu mnNewMenu_13 = new JMenu("Contacter les instances départementales (CODEP)");
		mnDivers.add(mnNewMenu_13);
		
		JMenuItem mntmNewMenuItem_23 = new JMenuItem("Commission Départementale Officiels Techniques (CDOT)");
		mnNewMenu_13.add(mntmNewMenuItem_23);
		
		JMenuItem mntmNewMenuItem_24 = new JMenuItem("Conseil d'Administration");
		mnNewMenu_13.add(mntmNewMenuItem_24);
	}
	
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
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}