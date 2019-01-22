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
import javax.swing.table.TableColumn;
import javax.swing.DefaultCellEditor;

//import org.jdatepicker.JDatePanel;
//import org.jdatepicker.JDatePicker;
//import org.jdatepicker.UtilDateModel;
//import org.jdatepicker.impl.JDatePanelImpl;
//import org.jdatepicker.impl.JDatePickerImpl;
//import org.jdatepicker.impl.UtilDateModel;

//import net.sourceforge.jdatepicker.*; 
//import net.sourceforge.jdatepicker.graphics.*; 
//import net.sourceforge.jdatepicker.impl.*; 
//import net.sourceforge.jdatepicker.util.*;

//import fenetres.corpsFenetreGestionCompetitions;
import objets.objetCompetitions;
import ressources.DatePicker;
import ressources.ObservingTextField;

import javax.swing.ImageIcon;
import ressources.Heures;
import ressources.Minutes;
import javax.swing.SwingConstants;
import javax.swing.Box;
import java.awt.Choice;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import java.awt.SystemColor;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JProgressBar;
import javax.swing.AbstractListModel;
//import org.jdatepicker.util.JDatePickerUtil;

public class fenetreGestionCompetitionsCreationEtape2Tournoi1 extends JFrame implements ActionListener, ItemListener {
//	private Fenetre2 fen;
	private fenetreGestionCompetitionsCreationEtape3Tournoi2 etapeSuivante;
	private JTextField textField_NumDossierAutorisation;
	private JTextField textField_TempsRepos;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5_OrganisateursCompetition;
	private JTextField textField_6_JAsCompetition;
//	private JDatePicker textField_7;
//	private JDatePicker textField_8;
  JLabel CheckDate; JButton check;
//  public UtilDateModel model;
//  public JDatePanelImpl datePanel;
//  public JDatePickerImpl datePicker;
//  private JTextField textField_7;
  private ObservingTextField textField_7_DateDebutCompetition;
//  private JTextField textField_9;
  private ObservingTextField textField_9_DateFinCompetition;
  private JTextField textField_8_MontantInscription;
  private JTextField textField_10_NombreTableauxAutorisesJoueur;
  private JTextField textField_11_NbMaxMatchsParJourParJoueur;
  private JTextField textField_NbTablMaxAutorisParJoueurDifferencieHFHommes;
  private JTextField textField_1_NbTablMaxAutorisParJoueurDifferencieHFFemmes;
  private JTable table;
  private JTable table_1;
  private JTextField textField_7;
  private JTextField textField_9;
  private JTextField textField_10;
  private JTextField textField_8;
  private JTextField textField;

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

    this.setSize(1949, 1102);

    this.setLocationRelativeTo(null);
    getContentPane().setLayout(null);
    
    JLabel lblNumAutorisationCompetition = new JLabel("<html>N° dossier<br>d'autorisation :</html>");
    lblNumAutorisationCompetition.setBounds(25, 18, 116, 34);
    getContentPane().add(lblNumAutorisationCompetition);
    
    textField_NumDossierAutorisation = new JTextField();
    textField_NumDossierAutorisation.addKeyListener(new KeyAdapter() {
    	@Override
    	public void keyPressed(KeyEvent arg0) {
    	}
    });
    textField_NumDossierAutorisation.setToolTipText("S'il est déjà existant sous Poona mais pas encore répertorié dans le logiciel (première modification via le logiciel d'une compétition dont le dossier existe déjà sur Poona), vous pouvez le saisir puis valider avec Entrée pour le rechercher, si le n° est reconnu cela remplira automatiquement ceux des champs de formulaires restants qui sont partagés entre le logiciel et Poona.\r\nS'il est déjà existant et répertorié dans le logiciel, le champ sera rempli, grisé et inactif.\r\nSinon, s'il n'existe pas encore, le champ est vide. \r\nLe n° correspondant sera créé automatiquement à la fin du processus, lors de la transmission des informations saisies à Poona.");
    textField_NumDossierAutorisation.setBounds(186, 24, 296, 22);
    getContentPane().add(textField_NumDossierAutorisation);
    textField_NumDossierAutorisation.setColumns(10);
    
    JLabel lblDatesCompetition = new JLabel("<html>Date(s) et horaires<br>prévisionnel(s)<br>de la compétition :</html>");
    lblDatesCompetition.setToolTipText("Ces dates et horaires, y compris ceux d'ouverture et/ou de convocation des joueurs, peuvent être indiqués selon leur nature dans le Règlement Particulier (RP) et/ou la plaquette d'invitation et/ou l'affiche/les autres moyens de communication de la compétition ; pour les dates et horaires généraux en eux-mêmes, ils doivent respecter le RGC en terme d'autorisation et de dérogation.");
    lblDatesCompetition.setBounds(25, 60, 124, 66);
    getContentPane().add(lblDatesCompetition);
    
    JLabel lblDateHeureDebutCompetition = new JLabel("début : ");
    lblDateHeureDebutCompetition.setBounds(186, 56, 57, 34);
    getContentPane().add(lblDateHeureDebutCompetition);
    
    textField_7_DateDebutCompetition = new ObservingTextField();
    textField_7_DateDebutCompetition.setToolTipText("S'il est déjà existant sous Poona mais pas encore répertorié dans le logiciel (première modification via le logiciel d'une compétition dont le dossier existe déjà sur Poona), vous pouvez le saisir.\r\nS'il est déjà existant et répertorié dans le logiciel, le champ sera rempli, grisé et inactif.\r\nSinon, s'il n'existe pas encore, le champ est vide.\r\nFormat : jour (en toutes lettres) JJ mois (en toutes lettres) AAAA");
    textField_7_DateDebutCompetition.setColumns(10);
    textField_7_DateDebutCompetition.setBounds(248, 62, 194, 22);
    getContentPane().add(textField_7_DateDebutCompetition);
    
    JButton button_datedebutcompetition = new JButton("");
    button_datedebutcompetition.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent arg0) {
    		String lang = null;
//    		final Locale locale = getLocale(lang);
    		final Locale locale = getLocale();
    		DatePicker dp = new DatePicker(textField_7_DateDebutCompetition, locale);
    		// previously selected date
    		Date selectedDate = dp.parseDate(textField_7_DateDebutCompetition.getText());
    		dp.setSelectedDate(selectedDate);
//    		dp.setDefaultLocale(Locale.FRENCH);
    		dp.start(textField_7_DateDebutCompetition);
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
    button_datedebutcompetition.setIcon(new ImageIcon(fenetreGestionCompetitionsCreationEtape2Tournoi1.class.getResource("/ressources/icons8-planner-15.png")));
    button_datedebutcompetition.setBounds(451, 61, 31, 25);
    getContentPane().add(button_datedebutcompetition);
    
    JComboBox comboBox_5_HeureDebutCompetition = new JComboBox();
    comboBox_5_HeureDebutCompetition.setMaximumRowCount(12);
    comboBox_5_HeureDebutCompetition.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23"}));
    comboBox_5_HeureDebutCompetition.setSelectedIndex(8);
    comboBox_5_HeureDebutCompetition.setToolTipText("Heures (00 à 23)\r\nValeur par défaut : 08h00 (voir RGC)");
    comboBox_5_HeureDebutCompetition.setBounds(490, 62, 52, 22);
    getContentPane().add(comboBox_5_HeureDebutCompetition);
    
    JLabel lblHDateHeureDebutCompetition = new JLabel("h");
    lblHDateHeureDebutCompetition.setHorizontalAlignment(SwingConstants.CENTER);
    lblHDateHeureDebutCompetition.setBounds(543, 56, 23, 34);
    getContentPane().add(lblHDateHeureDebutCompetition);
    
    JComboBox comboBox_7_MinuteDebutCompetition = new JComboBox();
    comboBox_7_MinuteDebutCompetition.setMaximumRowCount(10);
    comboBox_7_MinuteDebutCompetition.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59"}));
    comboBox_7_MinuteDebutCompetition.setSelectedIndex(0);
    comboBox_7_MinuteDebutCompetition.setToolTipText("Minutes (00 à 59)");
    comboBox_7_MinuteDebutCompetition.setBounds(567, 62, 52, 22);
    getContentPane().add(comboBox_7_MinuteDebutCompetition);
    
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
    
    JLabel lblInclusDateHeureDebutCompetition = new JLabel("(inclus)");
    lblInclusDateHeureDebutCompetition.setBounds(627, 56, 52, 34);
    getContentPane().add(lblInclusDateHeureDebutCompetition);
    
//    JDatePickerImpl datePickerImpl = new JDatePickerImpl((JDatePanelImpl) null, (AbstractFormatter) null);
//    datePickerImpl.setBounds(219, 500, 342, 124);
//    getContentPane().add(datePickerImpl);
    
    textField_9_DateFinCompetition = new ObservingTextField();
    textField_9_DateFinCompetition.setToolTipText("S'il est déjà existant sous Poona mais pas encore répertorié dans le logiciel (première modification via le logiciel d'une compétition dont le dossier existe déjà sur Poona), vous pouvez le saisir.\r\nS'il est déjà existant et répertorié dans le logiciel, le champ sera rempli, grisé et inactif.\r\nSinon, s'il n'existe pas encore, le champ est vide.\r\nFormat : jour (en toutes lettres) JJ mois (en toutes lettres) AAAA");
    textField_9_DateFinCompetition.setColumns(10);
    textField_9_DateFinCompetition.setBounds(248, 105, 194, 22);
    getContentPane().add(textField_9_DateFinCompetition);
    
    JButton button_datefincompetition = new JButton("");
    button_datefincompetition.setIcon(new ImageIcon(fenetreGestionCompetitionsCreationEtape2Tournoi1.class.getResource("/ressources/icons8-planner-15.png")));
    button_datefincompetition.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent arg0) {
    		String lang = null;
    		final Locale locale = getLocale(lang);
    		DatePicker dp = new DatePicker(textField_9_DateFinCompetition, locale);
    		// previously selected date
    		Date selectedDate = dp.parseDate(textField_9_DateFinCompetition.getText());
    		dp.setSelectedDate(selectedDate);
    		dp.start(textField_9_DateFinCompetition);
    	}
    	private Locale getLocale(String loc) {
    		if (loc != null && loc.length() > 0)
    			return new Locale(loc);
    		else
    			return Locale.FRANCE;
    		};
    });
    button_datefincompetition.setBounds(451, 104, 31, 25);
    getContentPane().add(button_datefincompetition);
    
    JLabel lblDateHeureFinCompetition = new JLabel("fin : ");
    lblDateHeureFinCompetition.setBounds(186, 99, 57, 34);
    getContentPane().add(lblDateHeureFinCompetition);
    
    JComboBox comboBox_8_HeureFinCompetition = new JComboBox();
    comboBox_8_HeureFinCompetition.setMaximumRowCount(12);
    comboBox_8_HeureFinCompetition.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23"}));
    comboBox_8_HeureFinCompetition.setSelectedIndex(19);
    comboBox_8_HeureFinCompetition.setToolTipText("Heures (00 à 23)\r\nValeur par défaut : 19h (voir RGC), grisé et inactif (activable et modifiable si dérogation JA)");
    comboBox_8_HeureFinCompetition.setBounds(490, 102, 52, 22);
    getContentPane().add(comboBox_8_HeureFinCompetition);
    
    JLabel labelDateHeureFinCompetition = new JLabel("h");
    labelDateHeureFinCompetition.setHorizontalAlignment(SwingConstants.CENTER);
    labelDateHeureFinCompetition.setBounds(543, 97, 23, 34);
    getContentPane().add(labelDateHeureFinCompetition);
    
    JComboBox comboBox_9_MinuteFinCompetition = new JComboBox();
    comboBox_9_MinuteFinCompetition.setMaximumRowCount(10);
    comboBox_9_MinuteFinCompetition.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59"}));
    comboBox_9_MinuteFinCompetition.setToolTipText("Minutes (00 à 59)");
    comboBox_9_MinuteFinCompetition.setBounds(567, 103, 52, 22);
    getContentPane().add(comboBox_9_MinuteFinCompetition);
    
    JLabel label_1_InclusDateFinCompetition = new JLabel("(inclus)");
    label_1_InclusDateFinCompetition.setBounds(627, 97, 52, 34);
    getContentPane().add(label_1_InclusDateFinCompetition);
    
    JCheckBox checkBox_DateHorairesCompetitionDerogationJA = new JCheckBox("Dérogation JA");
    checkBox_DateHorairesCompetitionDerogationJA.setBounds(687, 61, 124, 25);
    // si case cochée, les sélecteurs d'horaire de début ne renverront pas d'erreur si l'horaire sélectionné est inférieur à celui du RGC
    // si case cochée + case Nocturne cochée, les sélecteurs d'horaire de début passent à 23h00
    getContentPane().add(checkBox_DateHorairesCompetitionDerogationJA);
    
    JCheckBox chckbxCompetitionNocturne = new JCheckBox("Nocturne");
    chckbxCompetitionNocturne.setBounds(687, 104, 124, 25);
    // si case cochée, les sélecteurs d'horaire de début passent à 23h00, se grisent et se désactivent
    // si case cochée + case Déro JA cochée, les sélecteurs d'horaire de début passent à 23h00, se dégrisent et s'activent
    getContentPane().add(chckbxCompetitionNocturne);
    
    JLabel lbldateDePrise = new JLabel("<html>Date de prise en<br>compte des<br>classements :</html>");
    lbldateDePrise.setToolTipText("Ces dates et horaires, y compris ceux d'ouverture et/ou de convocation des joueurs, peuvent être indiqués selon leur nature dans le Règlement Particulier (RP) et/ou la plaquette d'invitation et/ou l'affiche/les autres moyens de communication de la compétition ; pour les dates et horaires généraux en eux-mêmes, ils doivent respecter le RGC en terme d'autorisation et de dérogation.");
    lbldateDePrise.setBounds(25, 172, 124, 58);
    getContentPane().add(lbldateDePrise);
    
    ObservingTextField observingTextField = new ObservingTextField();
    observingTextField.setToolTipText("S'il est déjà existant sous Poona mais pas encore répertorié dans le logiciel (première modification via le logiciel d'une compétition dont le dossier existe déjà sur Poona), vous pouvez le saisir.\r\nS'il est déjà existant et répertorié dans le logiciel, le champ sera rempli, grisé et inactif.\r\nSinon, s'il n'existe pas encore, le champ est vide.\r\nFormat : jour (en toutes lettres) JJ mois (en toutes lettres) AAAA");
    observingTextField.setColumns(10);
    observingTextField.setBounds(186, 193, 194, 22);
    getContentPane().add(observingTextField);
    
    JButton button_2 = new JButton("");
    button_2.setIcon(new ImageIcon(fenetreGestionCompetitionsCreationEtape2Tournoi1.class.getResource("/ressources/icons8-planner-15.png")));
    button_2.setBounds(389, 192, 31, 25);
    getContentPane().add(button_2);
    
    JLabel lbldateLimitedinscription = new JLabel("<html>Date limite<br>d'inscription :</html>");
    lbldateLimitedinscription.setToolTipText("Ces dates et horaires, y compris ceux d'ouverture et/ou de convocation des joueurs, peuvent être indiqués selon leur nature dans le Règlement Particulier (RP) et/ou la plaquette d'invitation et/ou l'affiche/les autres moyens de communication de la compétition ; pour les dates et horaires généraux en eux-mêmes, ils doivent respecter le RGC en terme d'autorisation et de dérogation.");
    lbldateLimitedinscription.setBounds(25, 126, 90, 48);
    getContentPane().add(lbldateLimitedinscription);
    
    ObservingTextField observingTextField_1 = new ObservingTextField();
    observingTextField_1.setToolTipText("S'il est déjà existant sous Poona mais pas encore répertorié dans le logiciel (première modification via le logiciel d'une compétition dont le dossier existe déjà sur Poona), vous pouvez le saisir.\r\nS'il est déjà existant et répertorié dans le logiciel, le champ sera rempli, grisé et inactif.\r\nSinon, s'il n'existe pas encore, le champ est vide.\r\nFormat : jour (en toutes lettres) JJ mois (en toutes lettres) AAAA");
    observingTextField_1.setColumns(10);
    observingTextField_1.setBounds(186, 141, 194, 22);
    getContentPane().add(observingTextField_1);
    
    JButton button_3 = new JButton("");
    button_3.setIcon(new ImageIcon(fenetreGestionCompetitionsCreationEtape2Tournoi1.class.getResource("/ressources/icons8-planner-15.png")));
    button_3.setBounds(389, 140, 31, 25);
    getContentPane().add(button_3);
    
    JLabel lbldateDuTirage = new JLabel("<html>Date du tirage<br>au sort :</html>");
    lbldateDuTirage.setToolTipText("Ces dates et horaires, y compris ceux d'ouverture et/ou de convocation des joueurs, peuvent être indiqués selon leur nature dans le Règlement Particulier (RP) et/ou la plaquette d'invitation et/ou l'affiche/les autres moyens de communication de la compétition ; pour les dates et horaires généraux en eux-mêmes, ils doivent respecter le RGC en terme d'autorisation et de dérogation.");
    lbldateDuTirage.setBounds(25, 230, 90, 48);
    getContentPane().add(lbldateDuTirage);
    
    ObservingTextField observingTextField_2 = new ObservingTextField();
    observingTextField_2.setToolTipText("S'il est déjà existant sous Poona mais pas encore répertorié dans le logiciel (première modification via le logiciel d'une compétition dont le dossier existe déjà sur Poona), vous pouvez le saisir.\r\nS'il est déjà existant et répertorié dans le logiciel, le champ sera rempli, grisé et inactif.\r\nSinon, s'il n'existe pas encore, le champ est vide.\r\nFormat : jour (en toutes lettres) JJ mois (en toutes lettres) AAAA");
    observingTextField_2.setColumns(10);
    observingTextField_2.setBounds(186, 245, 194, 22);
    getContentPane().add(observingTextField_2);
    
    JButton button_4 = new JButton("");
    button_4.setIcon(new ImageIcon(fenetreGestionCompetitionsCreationEtape2Tournoi1.class.getResource("/ressources/icons8-planner-15.png")));
    button_4.setBounds(389, 244, 31, 25);
    getContentPane().add(button_4);
    
    JLabel lblOrganisateursCompetition = new JLabel("<html>Organisateur(s)<br>de la compétition :</html>");
    lblOrganisateursCompetition.setBounds(25, 281, 124, 34);
    getContentPane().add(lblOrganisateursCompetition);
    
    textField_5_OrganisateursCompetition = new JTextField();
    textField_5_OrganisateursCompetition.setToolTipText("S'il est déjà existant, répertorié et validé dans le logiciel, le champ sera rempli, grisé et inactif.\r\nSinon, s'il n'existe pas encore, le champ est vide. \r\nLe n° correspondant sera créé automatiquement à la fin du processus, lors de la transmission des informations saisies à Poona.\r\nPour rechercher un organisateur (OC/SOC), taper quelques lettres de son nom, de son prénom ou du nom/sigle de son club (casse indifférente), ou quelques chiffres de son n° de licence ou du n° d'affiliation de son club, puis choisir l'organisateur qui correspond à celui voulu à ajouter.");
    textField_5_OrganisateursCompetition.setColumns(10);
    textField_5_OrganisateursCompetition.setBounds(186, 286, 296, 22);
    getContentPane().add(textField_5_OrganisateursCompetition);
    
    JButton button_2_AjoutOrganisateurCompetition = new JButton("+");
    button_2_AjoutOrganisateurCompetition.setToolTipText("Ajouter un tarif");
    button_2_AjoutOrganisateurCompetition.setBounds(494, 285, 41, 25);
    getContentPane().add(button_2_AjoutOrganisateurCompetition);
    
    JLabel lblJugesArbitresCompetition = new JLabel("<html>Juge(s)-Arbitre(s)<br>de la compétition :</html>");
    lblJugesArbitresCompetition.setBounds(25, 321, 124, 34);
    getContentPane().add(lblJugesArbitresCompetition);
    
    textField_6_JAsCompetition = new JTextField();
    textField_6_JAsCompetition.setToolTipText("S'il est déjà existant sous Poona mais pas encore répertorié dans le logiciel (première modification via le logiciel d'une compétition dont le dossier existe déjà sur Poona), vous pouvez le saisir.\r\nS'il est déjà existant et répertorié dans le logiciel, le champ sera rempli, grisé et inactif.\r\nSinon, s'il n'existe pas encore, le champ est vide.\r\nPour rechercher un juge-arbitre, taper quelques lettres de son nom, de son prénom ou du nom/sigle de son club (casse indifférente), ou quelques chiffres de son n° de licence ou du n° d'affiliation de son club, puis choisir le JA qui correspond à celui voulu à ajouter.");
    textField_6_JAsCompetition.setColumns(10);
    textField_6_JAsCompetition.setBounds(186, 327, 296, 22);
    getContentPane().add(textField_6_JAsCompetition);
    
    JSeparator separator_JACompetFormePartic = new JSeparator();
    separator_JACompetFormePartic.setBounds(25, 362, 950, 1);
    getContentPane().add(separator_JACompetFormePartic);
    
    JLabel lblFormeCompetition = new JLabel("<html>Forme particulière<br>de la compétition :</html>");
    lblFormeCompetition.setBounds(25, 373, 132, 34);
    getContentPane().add(lblFormeCompetition);
    
    // (compéts par équipe) Ronde italienne : Formule constituée d'une succession de sets entre 2 équipes avec changement de joueurs après chaque set. Le vainqueur de la rencontre est celui qui a le plus de points.
    JComboBox comboBox_4_FormeParticuliereCompetition = new JComboBox();
    comboBox_4_FormeParticuliereCompetition.setToolTipText("cf Enquête - Formats et Formules de Compétitions : https://sondage.ffbad.org/index.php/493121\r\n- Ronde suisse : Format en plusieurs rondes où chaque joueur rencontre des personnes ayant des statistiques proches. Format permettant de produire un classement intégral.\r\n- Entrées échelonnées : Arbre à élimination directe avec entrée possible à différents stades en fonction d'un rang, d'une côte ou d'un classement.\r\n- Double élimination : Arbre à élimination directe où les perdants de chaque tour alimentent un autre arbre à élimination. Les vainqueurs de chaque arbre se rencontrent pour désigner le vainqueur global du tableau.\r\n- Double repêchage : Arbre à élimination directe où les perdants de chaque tour alimente un autre arbre à élimination directe. Le vainqueur du deuxième arbre termine 3° du tableau.\r\n- Poule de poule : Phase qualificative en poules suivi d'une phase finale en poules constituée des joueurs de même rang de la phase qualificative.\r\n- Consolante : Tableau pouvant prendre la forme de poules ou élimination directe constitué des perdants de la phase qualificative ou de la phase finale.");
    comboBox_4_FormeParticuliereCompetition.setModel(new DefaultComboBoxModel(new String[] {"Ronde suisse", "Entrées échelonnées", "Double élimination", "Double repêchage", "Poule de poule", "Consolante"}));
    comboBox_4_FormeParticuliereCompetition.setSelectedIndex(0);
    comboBox_4_FormeParticuliereCompetition.setBounds(186, 381, 296, 22);
    getContentPane().add(comboBox_4_FormeParticuliereCompetition);
    
    JLabel lblAutoarbitragearbitrage = new JLabel("<html>Déroulement<br>des matchs en :</html>");
    lblAutoarbitragearbitrage.setBounds(25, 413, 124, 34);
    getContentPane().add(lblAutoarbitragearbitrage);
    
    JComboBox comboBox_3_Autoarbitragearbitrage = new JComboBox();
    comboBox_3_Autoarbitragearbitrage.setModel(new DefaultComboBoxModel(new String[] {"Auto-arbitrage uniquement", "Arbitrage", "Auto-arbitrage et arbitrage"}));
    comboBox_3_Autoarbitragearbitrage.setToolTipText("Auto-arbitrage uniquement (si absolument aucun arbitre n'est présent, disponible et disposé à officier sur la compétition, ou si l'arbitrage n'est pas autorisé/souhaité)\r\nArbitrage (si les matchs de la compétition doivent être intégralement arbitrés)\r\nAuto-arbitrage et arbitrage (si un arbitre peut être présent, disponible et disposé à officier sur un ou plusieurs matchs, autrement les matchs se déroulent en auto-arbitrage)");
    comboBox_3_Autoarbitragearbitrage.setBounds(186, 420, 296, 22);
    getContentPane().add(comboBox_3_Autoarbitragearbitrage);
    
    JLabel lblFormatScore = new JLabel("Format de score :");
    lblFormatScore.setToolTipText("Format de score (scoring)");
    lblFormatScore.setBounds(25, 455, 124, 34);
    getContentPane().add(lblFormatScore);
    
    JComboBox comboBoxFormatScore = new JComboBox();
    // si choix de ronde italienne dans la forme de compét' : passer cette liste auto à "Autre" et afficher case à cocher (avec son label ; cochée par défaut) Nb tours + zone saisie texte corresp. + cases à cocher (avec leurs labels) points et sets + zone(s) de saisie texte corresp. (si l'une/l'autre ou les deux cases sont pas cochées, ne pas faire apparaître la/les zone(s) de saisie texte corresp.) 
    comboBoxFormatScore.setToolTipText("par défaut : 3 sets de 21 points (3x21), scoring actuel en France et à l'international");
    comboBoxFormatScore.setModel(new DefaultComboBoxModel(new String[] {"1 set de 11 points (1x11)", "1 set de 21 points (1x21)", "3 sets de 15 points (3x15)", "3 sets de 21 points (3x21)", "5 sets de 11 points (5x11) - sans tie break", "5 sets de 11 points (5x11) - avec tie break", "Autre"}));
    comboBoxFormatScore.setSelectedIndex(3);
    comboBoxFormatScore.setBounds(186, 461, 296, 22);
    getContentPane().add(comboBoxFormatScore);
    
    JCheckBox chckbxNombreDeTours = new JCheckBox("Nombre de tours :");
    chckbxNombreDeTours.setBounds(186, 492, 145, 25);
    getContentPane().add(chckbxNombreDeTours);
    
    textField_8 = new JTextField();
    textField_8.setToolTipText("Le nombre de tours que comporte la ronde");
    textField_8.setColumns(10);
    textField_8.setBounds(334, 493, 31, 22);
    getContentPane().add(textField_8);
    
    JCheckBox chckbxNombreDeSets = new JCheckBox("Nombre de sets :");
    chckbxNombreDeSets.setBounds(367, 492, 132, 25);
    getContentPane().add(chckbxNombreDeSets);
    
    textField_9 = new JTextField();
    textField_9.setToolTipText("Le nombre de tours que comporte la ronde");
    textField_9.setColumns(10);
    textField_9.setBounds(503, 493, 31, 22);
    getContentPane().add(textField_9);
    
    JCheckBox chckbxNombreDePoints = new JCheckBox("Nombre de points :");
    chckbxNombreDePoints.setBounds(541, 492, 142, 25);
    getContentPane().add(chckbxNombreDePoints);
    
    textField_10 = new JTextField();
    textField_10.setToolTipText("Le nombre de tours que comporte la ronde");
    textField_10.setColumns(10);
    textField_10.setBounds(691, 493, 31, 22);
    getContentPane().add(textField_10);
    
    JButton button_1_AjoutJACompetition = new JButton("+");
    button_1_AjoutJACompetition.setToolTipText("Ajouter un tarif");
    button_1_AjoutJACompetition.setBounds(494, 326, 41, 25);
    getContentPane().add(button_1_AjoutJACompetition);
    
    JLabel lblTempsRepos = new JLabel("Temps de repos : ");
    lblTempsRepos.setBounds(25, 517, 124, 34);
    getContentPane().add(lblTempsRepos);
    
    textField_TempsRepos = new JTextField();
    textField_TempsRepos.setEnabled(false);
    textField_TempsRepos.setText("20");
    textField_TempsRepos.setToolTipText("En minutes ; voir le RGC (onglet Divers > Documentation bad > Compétitions > RGC) pour plus de précisions règlementaires ==> par défaut, valeurs RGC : 20 minutes, 30 minutes maxi.");
    textField_TempsRepos.setColumns(10);
    textField_TempsRepos.setBounds(186, 525, 45, 22);
    // à faire valider (InputVerifier, SimpleValidationAPI, JGoodies Validation) : max 30 minutes ==> si saisie d'un nombre supérieur à 30, affichage message erreur et non-prise en compte de la saisie jusqu'à saisie correcte
    getContentPane().add(textField_TempsRepos);
    
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
		
		textField_TempsRepos.setVisible(false);
		
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
		textField_TempsRepos.setVisible(true);
		textField_2.setVisible(false);
		textField_3.setVisible(false);
		textField_4.setVisible(false);
	}
	}
}
		);
    chckbxDiffTpsReposDisciplines.setBounds(239, 524, 99, 25);
    getContentPane().add(chckbxDiffTpsReposDisciplines);
    
    JLabel lblTarifsInscriptionCompetition = new JLabel("<html>Tarif(s) d'inscription<br>à la compétition :</html>");
    lblTarifsInscriptionCompetition.setBounds(25, 848, 124, 34);
    getContentPane().add(lblTarifsInscriptionCompetition);
    
    JComboBox comboBox_1_TypeParticipant = new JComboBox();
    comboBox_1_TypeParticipant.setModel(new DefaultComboBoxModel(new String[] {"Par joueur", "Par équipe"}));
    comboBox_1_TypeParticipant.setToolTipText("Tournoi\r\nChampionnat");
    comboBox_1_TypeParticipant.setBounds(525, 848, 116, 22);
    getContentPane().add(comboBox_1_TypeParticipant);
    
    textField_8_MontantInscription = new JTextField();
    textField_8_MontantInscription.setToolTipText("S'il est déjà existant sous Poona mais pas encore répertorié dans le logiciel (première modification via le logiciel d'une compétition dont le dossier existe déjà sur Poona), vous pouvez le saisir.\r\nS'il est déjà existant et répertorié dans le logiciel, le champ sera rempli, grisé et inactif.\r\nSinon, s'il n'existe pas encore, le champ est vide.");
    textField_8_MontantInscription.setColumns(10);
    textField_8_MontantInscription.setBounds(186, 850, 73, 22);
    getContentPane().add(textField_8_MontantInscription);
    
    JButton button_AjoutTarifInscription = new JButton("+");
    button_AjoutTarifInscription.setToolTipText("Ajouter un tarif");
    button_AjoutTarifInscription.setBounds(647, 849, 41, 25);
    getContentPane().add(button_AjoutTarifInscription);
    
    JComboBox comboBox_2_TableauTarifInscription = new JComboBox();
    // ne pas faire figurer la valeur "3 tableaux" si elle n'est pas permise (cas des hommes, hors éventuellement N, pour la plupart des tournois)
    comboBox_2_TableauTarifInscription.setModel(new DefaultComboBoxModel(new String[] {"Simple", "Double", "Mixte", "1 tableau", "2 tableaux", "3 tableaux"}));
    comboBox_2_TableauTarifInscription.setToolTipText("Tournoi\r\nChampionnat");
    comboBox_2_TableauTarifInscription.setBounds(315, 850, 97, 22);
    getContentPane().add(comboBox_2_TableauTarifInscription);
    
    JLabel lblNombreTableauxAutorisesJoueurs = new JLabel("<html>Nombre de tableaux<br>\r\nautorisés par joueur :</html>");
    lblNombreTableauxAutorisesJoueurs.setBounds(25, 597, 132, 34);
    getContentPane().add(lblNombreTableauxAutorisesJoueurs);
    
    textField_10_NombreTableauxAutorisesJoueur = new JTextField();
    textField_10_NombreTableauxAutorisesJoueur.setToolTipText("voir le Règlement Particulier (RP) pour plus de précisions règlementaires, ainsi que le RGC s'il y a lieu.");
    textField_10_NombreTableauxAutorisesJoueur.setText("3");
    textField_10_NombreTableauxAutorisesJoueur.setColumns(10);
    textField_10_NombreTableauxAutorisesJoueur.setBounds(186, 604, 45, 22);
    getContentPane().add(textField_10_NombreTableauxAutorisesJoueur);
    
    JCheckBox chckbxNbTablMaxParJoueurDifferencieHF = new JCheckBox("Différencié H/F");
    chckbxNbTablMaxParJoueurDifferencieHF.setToolTipText("À cocher si une différenciation est prévue entre les hommes et les femmes");
    chckbxNbTablMaxParJoueurDifferencieHF.setBounds(186, 642, 124, 25);
    getContentPane().add(chckbxNbTablMaxParJoueurDifferencieHF);
    
    JLabel lblNombreMaxMatchsParJourParJoueur = new JLabel("<html>Nombre maxi de<br>matchs par jour<br>et par joueur :</html>");
    lblNombreMaxMatchsParJourParJoueur.setBounds(25, 777, 132, 58);
    getContentPane().add(lblNombreMaxMatchsParJourParJoueur);
    
    textField_11_NbMaxMatchsParJourParJoueur = new JTextField();
    textField_11_NbMaxMatchsParJourParJoueur.setEnabled(false);
    textField_11_NbMaxMatchsParJourParJoueur.setToolTipText("voir le RGC (onglet Divers > Documentation bad > Compétitions > RGC) pour plus de précisions règlementaires ==> par défaut, la valeur est celle du RGC : 8, et le champ est grisé.");
    textField_11_NbMaxMatchsParJourParJoueur.setText("8");
    textField_11_NbMaxMatchsParJourParJoueur.setColumns(10);
    textField_11_NbMaxMatchsParJourParJoueur.setBounds(186, 802, 45, 22);
    getContentPane().add(textField_11_NbMaxMatchsParJourParJoueur);
    
    JCheckBox chckbxDerogationJANbMaxMatchsParJourParJoueur = new JCheckBox("Dérogation JA");
    chckbxDerogationJANbMaxMatchsParJourParJoueur.setBounds(239, 801, 124, 25);
    getContentPane().add(chckbxDerogationJANbMaxMatchsParJourParJoueur);
    
    JCheckBox chckbxNbTablAutorisesParJoueurDifferencieSeriesClassement = new JCheckBox("Différencié selon séries classement joueurs et/ou HF : sélectionnez les valeurs dans le tableau ci-dessous");
    chckbxNbTablAutorisesParJoueurDifferencieSeriesClassement.setToolTipText("À cocher si une différenciation est prévue selon les séries de classement des joueurs");
    chckbxNbTablAutorisesParJoueurDifferencieSeriesClassement.setBounds(186, 692, 647, 25);
    getContentPane().add(chckbxNbTablAutorisesParJoueurDifferencieSeriesClassement);
    
    JComboBox comboBox_6_TypeDefinitionTarif = new JComboBox();
    comboBox_6_TypeDefinitionTarif.setModel(new DefaultComboBoxModel(new String[] {"Remise", "Taux", "Valeur"}));
    comboBox_6_TypeDefinitionTarif.setToolTipText("Remise\r\nTaux : \r\nValeur : si vous voulez uniquement considérer le tarif final");
    comboBox_6_TypeDefinitionTarif.setBounds(418, 850, 97, 22);
    getContentPane().add(comboBox_6_TypeDefinitionTarif);
    
    JComboBox comboBox_10_DeviseTarifInscriptionCompetition = new JComboBox();
    comboBox_10_DeviseTarifInscriptionCompetition.setModel(new DefaultComboBoxModel(new String[] {"€", "$", "£", "¥"}));
    comboBox_10_DeviseTarifInscriptionCompetition.setToolTipText("Devises (euro EUR, dollar US USD, livre sterling GBP, yen JPY)");
    comboBox_10_DeviseTarifInscriptionCompetition.setBounds(265, 850, 41, 22);
    getContentPane().add(comboBox_10_DeviseTarifInscriptionCompetition);
    
    JLabel lblNbTablMaxAutorisParJoueurDifferencieHFHommes = new JLabel("Hommes : ");
    lblNbTablMaxAutorisParJoueurDifferencieHFHommes.setBounds(310, 637, 69, 34);
    getContentPane().add(lblNbTablMaxAutorisParJoueurDifferencieHFHommes);
    
    textField_NbTablMaxAutorisParJoueurDifferencieHFHommes = new JTextField();
    textField_NbTablMaxAutorisParJoueurDifferencieHFHommes.setToolTipText("S'il est déjà existant, répertorié et validé dans le logiciel, le champ sera rempli, grisé et inactif.\r\nSinon, s'il n'existe pas encore, le champ est vide. \r\nLe n° correspondant sera créé automatiquement à la fin du processus, lors de la transmission des informations saisies à Poona.\r\nPour rechercher un organisateur (OC/SOC), taper quelques lettres de son nom, de son prénom ou du nom/sigle de son club (casse indifférente), ou quelques chiffres de son n° de licence ou du n° d'affiliation de son club, puis choisir l'organisateur qui correspond à celui voulu à ajouter.");
    textField_NbTablMaxAutorisParJoueurDifferencieHFHommes.setColumns(10);
    textField_NbTablMaxAutorisParJoueurDifferencieHFHommes.setBounds(383, 643, 45, 22);
    getContentPane().add(textField_NbTablMaxAutorisParJoueurDifferencieHFHommes);
    
    JLabel lblNbTablMaxAutorisParJoueurDifferencieHFFemmes = new JLabel("Femmes : ");
    lblNbTablMaxAutorisParJoueurDifferencieHFFemmes.setBounds(447, 637, 69, 34);
    getContentPane().add(lblNbTablMaxAutorisParJoueurDifferencieHFFemmes);
    
    textField_1_NbTablMaxAutorisParJoueurDifferencieHFFemmes = new JTextField();
    textField_1_NbTablMaxAutorisParJoueurDifferencieHFFemmes.setToolTipText("S'il est déjà existant, répertorié et validé dans le logiciel, le champ sera rempli, grisé et inactif.\r\nSinon, s'il n'existe pas encore, le champ est vide. \r\nLe n° correspondant sera créé automatiquement à la fin du processus, lors de la transmission des informations saisies à Poona.\r\nPour rechercher un organisateur (OC/SOC), taper quelques lettres de son nom, de son prénom ou du nom/sigle de son club (casse indifférente), ou quelques chiffres de son n° de licence ou du n° d'affiliation de son club, puis choisir l'organisateur qui correspond à celui voulu à ajouter.");
    textField_1_NbTablMaxAutorisParJoueurDifferencieHFFemmes.setColumns(10);
    textField_1_NbTablMaxAutorisParJoueurDifferencieHFFemmes.setBounds(521, 643, 45, 22);
    getContentPane().add(textField_1_NbTablMaxAutorisParJoueurDifferencieHFFemmes);
    
    // scrollPane avec JTable à masquer si case correspondante pas cochée
    JScrollPane scrollPane = new JScrollPane();
    scrollPane.setToolTipText("Saisir le nombre de tableaux maxi autorisé par joueur selon les séries de classement et les genres H/F.");
    scrollPane.setBounds(186, 723, 444, 63);
    getContentPane().add(scrollPane);
    
    //dissocier table de scrollpane si table placée ds scrollpane par cliquer-glisser, puis surrounder table par scrollpane pr afficher l'ensemble correctement
    // cf https://baptiste-wicht.developpez.com/tutoriels/java/swing/jtable/ pour l'amélioration de la table
    table_1 = new JTable();
    table_1.setBorder(null);
    scrollPane.setViewportView(table_1);
    table_1.setModel(new DefaultTableModel(
    	new Object[][] {
    		{"H", null, null, null, null},
    		{"F", null, null, null, null},
    	},
    	new String[] {
    		"H/F", "N", "R", "D", "P"
    	}
    ) {
    	Class[] columnTypes = new Class[] {
    		String.class, Integer.class, Integer.class, Integer.class, Integer.class
    	};
    	public Class getColumnClass(int columnIndex) {
    		return columnTypes[columnIndex];
    	}
    	/* boolean[] columnEditables = new boolean[] {
    		false, true, true, true, true }; */
    		
    	boolean [] canEdit = new boolean [] 
    	{
    		false, true, true, true, true
    	};
    	
    	public boolean isCellEditable(int row, int column) {
    		//return columnEditables[column];
    		return canEdit[column];
    	}
    	
    	//setUpNColumn(table_1.getColumnModel ().getColumn (2));
		public void setUpNColumn (JTable table_1, TableColumn NColumn)
		{
			JComboBox comboBox = new JComboBox ();
			comboBox.addItem("-");
			comboBox.addItem("1");
			comboBox.addItem("2");
			comboBox.addItem("3");
			NColumn.setCellEditor (new DefaultCellEditor (comboBox));
		}
    });
    table_1.getColumnModel().getColumn(0).setResizable(false);
    table_1.setFillsViewportHeight(true);
    table_1.setColumnSelectionAllowed(true);
    table_1.setCellSelectionEnabled(true);
    table_1.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
    table_1.setVisible(true);
    
    JLabel lblTempsDchauffement = new JLabel("Temps d'échauffement : ");
    lblTempsDchauffement.setBounds(25, 550, 145, 34);
    getContentPane().add(lblTempsDchauffement);
    
    textField_7 = new JTextField();
    textField_7.setToolTipText("En minutes ; voir le RGC (onglet Divers > Documentation bad > Compétitions > RGC) pour plus de précisions règlementaires ==> par défaut, valeurs RGC : 3 minutes.");
    textField_7.setText("3");
    textField_7.setEnabled(false);
    textField_7.setColumns(10);
    textField_7.setBounds(186, 556, 45, 22);
    getContentPane().add(textField_7);
    
    JLabel lblOu = new JLabel("OU");
    lblOu.setHorizontalAlignment(SwingConstants.CENTER);
    lblOu.setBounds(391, 665, 25, 34);
    getContentPane().add(lblOu);
    
    textField = new JTextField();
    textField.setToolTipText("S'il est déjà existant sous Poona mais pas encore répertorié dans le logiciel (première modification via le logiciel d'une compétition dont le dossier existe déjà sur Poona), vous pouvez le saisir.\r\nS'il est déjà existant et répertorié dans le logiciel, le champ sera rempli, grisé et inactif.\r\nSinon, s'il n'existe pas encore, le champ est vide.");
    textField.setColumns(10);
    textField.setBounds(186, 895, 73, 22);
    getContentPane().add(textField);
    
    JComboBox comboBox = new JComboBox();
    comboBox.setToolTipText("Devises (euro EUR, dollar US USD, livre sterling GBP, yen JPY)");
    comboBox.setBounds(265, 895, 41, 22);
    getContentPane().add(comboBox);
    
    JComboBox comboBox_1 = new JComboBox();
    comboBox_1.setToolTipText("Tournoi\r\nChampionnat");
    comboBox_1.setBounds(315, 895, 97, 22);
    getContentPane().add(comboBox_1);
    
    JComboBox comboBox_2 = new JComboBox();
    comboBox_2.setToolTipText("Remise\r\nTaux : \r\nValeur : si vous voulez uniquement considérer le tarif final");
    comboBox_2.setBounds(418, 895, 97, 22);
    getContentPane().add(comboBox_2);
    
    JComboBox comboBox_3 = new JComboBox();
    comboBox_3.setToolTipText("Tournoi\r\nChampionnat");
    comboBox_3.setBounds(523, 895, 116, 22);
    getContentPane().add(comboBox_3);
    
    JButton button = new JButton("+");
    button.setToolTipText("Ajouter un tarif");
    button.setBounds(647, 894, 41, 25);
    getContentPane().add(button);
    
    JButton button_1 = new JButton("-");
    button_1.setToolTipText("Supprimer un tarif");
    button_1.setBounds(699, 894, 41, 25);
    getContentPane().add(button_1);
    
    JSeparator separator = new JSeparator();
    separator.setBounds(25, 588, 950, 1);
    getContentPane().add(separator);
    
    JSeparator separator_2 = new JSeparator();
    separator_2.setBounds(25, 838, 950, 1);
    getContentPane().add(separator_2);
    
    JSeparator separator_3 = new JSeparator();
    separator_3.setBounds(25, 928, 950, 1);
    getContentPane().add(separator_3);
    
    JLabel label_1 = new JLabel("Progression étape : ");
    label_1.setBounds(25, 931, 124, 34);
    getContentPane().add(label_1);
    
    JProgressBar progressBar = new JProgressBar();
    progressBar.setToolTipText("Indique la progression du remplissage de l'étape en cours.");
    progressBar.setStringPainted(true);
    progressBar.setBounds(186, 942, 296, 22);
    getContentPane().add(progressBar);
    
    JLabel lblprogressionCrationcomptition = new JLabel("<html>Progression création<br>compétition :</html>");
    lblprogressionCrationcomptition.setBounds(25, 968, 132, 34);
    getContentPane().add(lblprogressionCrationcomptition);
    
    JProgressBar progressBar_1 = new JProgressBar();
    progressBar_1.setToolTipText("Indique la progression actuelle de la création de la compétition.");
    progressBar_1.setStringPainted(true);
    progressBar_1.setBounds(186, 982, 296, 22);
    getContentPane().add(progressBar_1);
    
    JButton btnPrecedent = new JButton("Précédent");
    btnPrecedent.setBounds(186, 1017, 97, 25);
    getContentPane().add(btnPrecedent);
    
    JButton btnSuivant = new JButton("Suivant");
    btnSuivant.addActionListener(this);
    btnSuivant.setBounds(385, 1017, 97, 25);
    getContentPane().add(btnSuivant);
    
    JButton btnModuleDeRecherche = new JButton("Rechercher");
    btnModuleDeRecherche.setToolTipText("Ajouter un tarif");
    btnModuleDeRecherche.setBounds(543, 285, 110, 25);
    getContentPane().add(btnModuleDeRecherche);
    
    JButton button_5 = new JButton("Rechercher");
    button_5.setToolTipText("Ajouter un tarif");
    button_5.setBounds(543, 326, 110, 25);
    getContentPane().add(button_5);
    
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
    etapeSuivante = new fenetreGestionCompetitionsCreationEtape3Tournoi2();
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