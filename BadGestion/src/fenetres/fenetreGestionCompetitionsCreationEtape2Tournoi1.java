package fenetres;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.HeadlessException;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.text.DateFormat; 
import java.text.SimpleDateFormat;
import java.text.ParseException;

import java.util.Calendar; 
import java.util.Date;
import java.util.Locale;
import java.util.Properties;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JSeparator;
import javax.swing.JCheckBox;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JFormattedTextField.AbstractFormatter;

import org.jdatepicker.JDatePanel;
import org.jdatepicker.JDatePicker;
//import org.jdatepicker.UtilDateModel;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

//import net.sourceforge.jdatepicker.*; 
//import net.sourceforge.jdatepicker.graphics.*; 
//import net.sourceforge.jdatepicker.impl.*; 
//import net.sourceforge.jdatepicker.util.*;

//import fenetres.corpsFenetreGestionCompetitions;
import objets.objetCompetitions;
import ressources.DatePicker;
import ressources.ObservingTextField;

import javax.swing.ImageIcon;
import org.jdatepicker.util.JDatePickerUtil;

public class fenetreGestionCompetitionsCreationEtape2Tournoi1 extends JFrame implements ActionListener, ItemListener {
//	private Fenetre2 fen;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
//	private JDatePicker textField_7;
	private JDatePicker textField_8;
  JLabel CheckDate; JButton check;
  public UtilDateModel model;
  public JDatePanelImpl datePanel;
  public JDatePickerImpl datePicker;
//  private JTextField textField_7;
  private ObservingTextField textField_7;
//  private JTextField textField_9;
  private ObservingTextField textField_9;

//  private JButton bouton = new JButton("Appel à la corpsFenetreGestionCompetitions");


  public fenetreGestionCompetitionsCreationEtape2Tournoi1()
  {
	  
//	  try 
//      {
//		  UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
//
//		}
//      catch (Exception e) 
//      {
//		}
	  
	  // début https://stackoverflow.com/questions/48915874/how-do-i-insert-date-from-jdatepicker-to-mysql-database-am-using-java-swing
	  
//	  import java.awt.Dimension;
//	  import java.awt.EventQueue;
//	  import java.awt.Graphics;
//	  import java.awt.Graphics2D;
//	  import java.awt.GridBagLayout;
//	  import java.text.ParseException;
//	  import java.text.SimpleDateFormat;
//	  import java.util.Calendar;
//	  import java.util.Properties;
//	  import javax.swing.JFormattedTextField.AbstractFormatter;
//	  import javax.swing.JFrame;
//	  import javax.swing.JPanel;
//	  import javax.swing.UIManager;
//	  import javax.swing.UnsupportedLookAndFeelException;
//	  import org.jdatepicker.impl.JDatePanelImpl;
//	  import org.jdatepicker.impl.JDatePickerImpl;
//	  import org.jdatepicker.impl.UtilDateModel;
	  
//	  public Test() {
	        EventQueue.invokeLater(new Runnable() {
	            @Override
	            public void run() {
	                try {
	                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
	                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
	                    ex.printStackTrace();
	                }

//	                JFrame frame = new JFrame("Testing");
//	                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//	                frame.add(new TestPane());
//	                frame.pack();
//	                frame.setLocationRelativeTo(null);
//	                frame.setVisible(true);
	            }
	        });
//	    }
	        
//	        public class TestPane extends JPanel {
//
//	            private Connection con;
//
//	            public TestPane() throws SQLException {
//	                make();
//
//	                setLayout(new GridBagLayout());
//	                GridBagConstraints gbc = new GridBagConstraints();
//	                gbc.gridx = 0;
//	                gbc.gridy = 0;
//
//	                btn = new JButton("Add");
//
//	                UtilDateModel model = new UtilDateModel();
//	                Properties p = new Properties();
//	                p.put("text.today", "Today");
//	                p.put("text.month", "Month");
//	                p.put("text.year", "Year");
//	                JDatePanelImpl datePanel = new JDatePanelImpl(model, p);
//	                JDatePickerImpl datePicker = new JDatePickerImpl(datePanel, new DateLabelFormatter());
//
//	                JPanel top = new JPanel();
//
//	                top.add(datePicker);
//	                top.add(btn);
//
//	                add(top, gbc);
//
//	                input = new JLabel("---");
//	                output = new JLabel("---");
//
//	                JPanel bottom = new JPanel();
//	                bottom.add(input);
//	                bottom.add(output);
//
//	                gbc.gridx = 0;
//	                gbc.gridy = 1;
//	                add(bottom, gbc);
//
//	                btn.addActionListener(new ActionListener() {
//	                    public void actionPerformed(ActionEvent evt) {
//	                        try {
//	                            // String text = datee;
//	                            // DateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
//	                            // Date myDate = formatter.parse(text);
//	                            java.util.Date datee = (java.util.Date) datePicker.getModel().getValue();
//	                            if (datee != null) {
//	                                java.sql.Date sqlDate = new java.sql.Date(datee.getTime());
//
//	                                String sql = "INSERT INTO Invoice"
//	                                                + "(Issuedate)"
//	                                                + "VALUES (?)";
//
//	                                input.setText(sqlDate.toString());
//
//	                                try (PreparedStatement stmt = con.prepareStatement(sql)) {
//	                                    stmt.setDate(1, sqlDate);
//	                                    int rowCount = stmt.executeUpdate();
//	                                    System.out.println(rowCount);
//	                                    con.commit();
//	                                }
//
//	                                select();
//
//	                            } else {
//	                                JOptionPane.showMessageDialog(TestPane.this, "You need to select a date");
//	                            }
//	                        } catch (SQLException | HeadlessException ex) {
//	                            ex.printStackTrace();
//	                            JOptionPane.showMessageDialog(TestPane.this, ex);
//
//	                        }
//	                    }
//	                });
//	            }
//
//	            protected void select() throws SQLException {
//	                try (PreparedStatement stmt = con.prepareStatement("select * from Invoice")) {
//	                    try (ResultSet rs = stmt.executeQuery()) {
//	                        while (rs.next()) {
//	                            java.sql.Date date = rs.getDate(1);
//	                            output.setText(date.toString());
//	                        }
//	                    }
//	                }
//	            }
//
//	            protected void make() throws SQLException {
//	                con = DriverManager.getConnection("jdbc:h2:mem:");
//	                try (Statement stmt = con.createStatement()) {
//	                    boolean result = stmt.execute("create table Invoice( Issuedate date not null )");
//	                    System.out.println(result);
//	                    con.commit();
//	                    select();
//	                }
//	            }
//	        }
//
//	        public class DateLabelFormatter extends AbstractFormatter {
//
//	            private String datePattern = "yyyy-MM-dd";
//	            private SimpleDateFormat dateFormatter = new SimpleDateFormat(datePattern);
//
//	            @Override
//	            public Object stringToValue(String text) throws ParseException {
//	                return dateFormatter.parseObject(text);
//	            }
//
//	            @Override
//	            public String valueToString(Object value) throws ParseException {
//	                if (value != null) {
//	                    Calendar cal = (Calendar) value;
//	                    return dateFormatter.format(cal.getTime());
//	                }
//
//	                return "";
//	            }
//
//	        }
//	    }
	        // fin https://stackoverflow.com/questions/48915874/how-do-i-insert-date-from-jdatepicker-to-mysql-database-am-using-java-swing
	  
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
    //    JDatePanelImpl datePanel = new JDatePanelImpl(model, null);
    //    JDatePickerImpl datePicker = new JDatePickerImpl(datePanel, null);
//     
//    getContentPane().add(datePicker);
    
//    import javax.swing.*; 
//    import java.awt.*; 
//    import java.awt.event.*; 
//    import net.sourceforge.jdatepicker.*; 
//    import net.sourceforge.jdatepicker.graphics.*; 
//    import net.sourceforge.jdatepicker.impl.*; 
//    import net.sourceforge.jdatepicker.util.*;
//    import java.text.DateFormat; 
//    import java.text.SimpleDateFormat;
//    import java.util.Calendar; 
//    import java.util.Date;
    
//    public class selectDate extends JFrame implements ActionListener
//    {
//    JLabel CheckDate; JButton check;
//    public UtilDateModel model;
//    public JDatePanelImpl datePanel;
//    public JDatePickerImpl datePicker;
    
//    public selectDate()
//        {
//        UtilDateModel model = new UtilDateModel();  
//        JDatePanelImpl datePanel = new JDatePanelImpl(model);  
//        JDatePickerImpl datePicker = new JDatePickerImpl(datePanel);
//        JPanel panel=new JPanel();
//        CheckDate=new JLabel("Date:");
//        check=new JButton("CHECK"); 
//        check.addActionListener(this);
//        panel.add(CheckDate);
//        panel.add(datePicker);
//        panel.add(check);
//        add(panel);
//        setBounds(200,150,400,300);
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setResizable(false);
//        setVisible(true); 
//        }
//    public void actionPerformed(ActionEvent e) 
//        {if(check==e.getSource())
//        {
//        Date selectedDate = (Date) datePicker.getModel().getValue();
//        DateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
//        String reportDate = df.format(selectedDate);
//        JOptionPane.showMessageDialog(null,reportDate);
//        }}
//    public static void main(String args[])
//    {new selectDate();}
//    }
    
//    textField_8 = new JDatePicker();
//    textField_8.getButton().setText("");
//    textField_8.getButton().setIcon(new ImageIcon(fenetreGestionCompetitionsCreationEtape2Tournoi1.class.getResource("/ressources/icons8-planner-15.png")));
//    textField_8.setToolTipText("S'il est déjà existant sous Poona mais pas encore répertorié dans le logiciel (première modification via le logiciel d'une compétition dont le dossier existe déjà sur Poona), vous pouvez le saisir.\r\nS'il est déjà existant et répertorié dans le logiciel, le champ sera rempli, grisé et inactif.\r\nSinon, s'il n'existe pas encore, le champ est vide.");
//    textField_8.setBounds(265, 301, 206, 22);
//    getContentPane().add(textField_8);
//    
//    JDatePicker datePicker = new JDatePicker();
//    datePicker.getButton().setIcon(new ImageIcon(fenetreGestionCompetitionsCreationEtape2Tournoi1.class.getResource("/ressources/icons8-planner-15.png")));
//    datePicker.getButton().setText("");
//    datePicker.getButton().addActionListener(new ActionListener() {
//    	public void actionPerformed(ActionEvent arg0) {
//    	}
//    });
//    datePicker.setToolTipText("S'il est déjà existant sous Poona mais pas encore répertorié dans le logiciel (première modification via le logiciel d'une compétition dont le dossier existe déjà sur Poona), vous pouvez le saisir.\r\nS'il est déjà existant et répertorié dans le logiciel, le champ sera rempli, grisé et inactif.\r\nSinon, s'il n'existe pas encore, le champ est vide.");
//    datePicker.setBounds(265, 344, 206, 22);
//    getContentPane().add(datePicker);
    
    JLabel lblinclus = new JLabel("(inclus)");
    lblinclus.setBounds(509, 295, 52, 34);
    getContentPane().add(lblinclus);
    
    JLabel label = new JLabel("(inclus)");
    label.setBounds(509, 338, 52, 34);
    getContentPane().add(label);
    
    textField_7 = new ObservingTextField();
    textField_7.setToolTipText("S'il est déjà existant sous Poona mais pas encore répertorié dans le logiciel (première modification via le logiciel d'une compétition dont le dossier existe déjà sur Poona), vous pouvez le saisir.\r\nS'il est déjà existant et répertorié dans le logiciel, le champ sera rempli, grisé et inactif.\r\nSinon, s'il n'existe pas encore, le champ est vide.");
    textField_7.setColumns(10);
    textField_7.setBounds(265, 301, 194, 22);
    getContentPane().add(textField_7);
    
    JButton button_datedebutcompet = new JButton("");
    button_datedebutcompet.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent arg0) {
    		String lang = null;
//    		final Locale locale = getLocale(lang);
    		final Locale locale = getLocale();
    		DatePicker dp = new DatePicker(textField_7, locale);
    		// previously selected date
    		Date selectedDate = dp.parseDate(textField_7.getText());
    		dp.setSelectedDate(selectedDate);
//    		dp.setDefaultLocale(Locale.FRENCH);
    		dp.start(textField_7);
    	}
//    	private Locale getLocale(String loc) {
//    		if (loc != null && loc.length() > 0)
//    			return new Locale(loc);
//    		else
////    			return Locale.FRANCE;
//    			return Locale.FRENCH;
//    		}
    	
//        public Locale getLocale() {
//            if (this.locale == null) {
//                this.locale = new Locale(System.getProperty("user.language"), System.getProperty("user.country"));
//            }
//            return this.locale;
//        }
        ;
    });
    button_datedebutcompet.setIcon(new ImageIcon(fenetreGestionCompetitionsCreationEtape2Tournoi1.class.getResource("/ressources/icons8-planner-15.png")));
    button_datedebutcompet.setBounds(464, 300, 31, 25);
    getContentPane().add(button_datedebutcompet);
    
//    JDatePickerImpl datePickerImpl = new JDatePickerImpl((JDatePanelImpl) null, (AbstractFormatter) null);
//    datePickerImpl.setBounds(219, 500, 342, 124);
//    getContentPane().add(datePickerImpl);
    
    textField_9 = new ObservingTextField();
    textField_9.setToolTipText("S'il est déjà existant sous Poona mais pas encore répertorié dans le logiciel (première modification via le logiciel d'une compétition dont le dossier existe déjà sur Poona), vous pouvez le saisir.\r\nS'il est déjà existant et répertorié dans le logiciel, le champ sera rempli, grisé et inactif.\r\nSinon, s'il n'existe pas encore, le champ est vide.");
    textField_9.setColumns(10);
    textField_9.setBounds(265, 344, 194, 22);
    getContentPane().add(textField_9);
    
    JButton button_datefincompet = new JButton("");
    button_datefincompet.setIcon(new ImageIcon(fenetreGestionCompetitionsCreationEtape2Tournoi1.class.getResource("/ressources/icons8-planner-15.png")));
    button_datefincompet.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent arg0) {
    		String lang = null;
    		final Locale locale = getLocale(lang);
    		DatePicker dp = new DatePicker(textField_9, locale);
    		// previously selected date
    		Date selectedDate = dp.parseDate(textField_9.getText());
    		dp.setSelectedDate(selectedDate);
    		dp.start(textField_9);
    	}
    	private Locale getLocale(String loc) {
    		if (loc != null && loc.length() > 0)
    			return new Locale(loc);
    		else
    			return Locale.FRANCE;
    		};
    });
    button_datefincompet.setBounds(464, 343, 31, 25);
    getContentPane().add(button_datefincompet);
    
//    getContentPane().add(textField_7);
    
    

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
	
	Locale locale = Locale.getDefault();
      
	fenetreGestionCompetitionsCreationEtape2Tournoi1 fen= new fenetreGestionCompetitionsCreationEtape2Tournoi1();
}

@Override
public void itemStateChanged(ItemEvent e) {
	// TODO Stub de la méthode généré automatiquement
	
}
}