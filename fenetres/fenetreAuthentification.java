// http://www.zentut.com/java-swing/simple-login-dialog/

//Second, we create login dialog that extends JDialog class and provides users with layout including:
//
//    The username and password text fields.
//    The  login and cancel buttons.
//
//Whenever user enters the username and password and clicks the login button, we call Login module above to authenticate the user. In the login dialog, we also have a property called succeeded to indicate that the user has provided correct username and password.

package fenetres;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;

import traitements.authentification;

public class fenetreAuthentification extends JDialog 
{
	 
    /**
	 * 
	 */
	private static final long serialVersionUID = -6917648663906744440L;
	private JTextField tfUsername;
    private JPasswordField pfPassword;
    private JLabel lbUsername;
    private JLabel lbPassword;
    private JButton btnLogin;
    private JButton btnCancel;
    private boolean succeeded;
    public boolean b;
    
//    public void setModal(boolean b)
 
    public fenetreAuthentification(Frame parent) 
    {
    	
    	// initialement booléen modal à true
    	super(parent, "authentification", false);
        //
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints cs = new GridBagConstraints();
 
        cs.fill = GridBagConstraints.HORIZONTAL;
 
        lbUsername = new JLabel("Username: ");
        cs.gridx = 0;
        cs.gridy = 0;
        cs.gridwidth = 1;
        panel.add(lbUsername, cs);
 
        tfUsername = new JTextField(20);
        cs.gridx = 1;
        cs.gridy = 0;
        cs.gridwidth = 2;
        panel.add(tfUsername, cs);
 
        lbPassword = new JLabel("Password: ");
        cs.gridx = 0;
        cs.gridy = 1;
        cs.gridwidth = 1;
        panel.add(lbPassword, cs);
 
        pfPassword = new JPasswordField(20);
        cs.gridx = 1;
        cs.gridy = 1;
        cs.gridwidth = 2;
        panel.add(pfPassword, cs);
        panel.setBorder(new LineBorder(Color.GRAY));
        
//        public class JPanelFlow extends JPanel{
//        	
//        	JPanelFlow(){
//        		super();
//        	}
//        	
//        	void add(Component...comp){
//        		
//        		for(Component compo:comp){
//        			add(compo);
//        		}
//        		
//        	}
//        }
 
        btnLogin = new JButton("Valider");
        btnLogin.addActionListener(new ActionListener() 
        {
 
            public void actionPerformed(ActionEvent e) 
            {
                if (authentification.authenticate (getUsername (), getPassword ())) 
                {
                    JOptionPane.showMessageDialog(fenetreAuthentification.this,
                            "Bonjour/bonsoir " + getUsername () + "!",
                            "Authentification",
                            JOptionPane.INFORMATION_MESSAGE);
                    succeeded = true;
                    corpsFenetreAccueil fenAccueil = new fenetres.corpsFenetreAccueil ();
                	fenAccueil.setVisible(true);
                    dispose ();
                } 
                else 
                {
                    JOptionPane.showMessageDialog 
                    (fenetreAuthentification.this,
                            "Nom d'utilisateur et/ou mot de passe invalide",
                            "Authentification",
                            JOptionPane.ERROR_MESSAGE);
                    // reset username and password
                    tfUsername.setText ("");
                    pfPassword.setText ("");
                    succeeded = false;
 
                }
            }
        }
        );
        
        btnCancel = new JButton("Annuler");
        btnCancel.addActionListener (new ActionListener () 
        {
 
            public void actionPerformed (ActionEvent e) 
            {
                dispose ();
            }
        }
        );
        
        JPanel bp = new JPanel ();
        bp.add (btnLogin);
        bp.add (btnCancel);
 
        getContentPane ().add (panel, BorderLayout.CENTER);
        getContentPane ().add (bp, BorderLayout.PAGE_END);
 
        pack();
        // setResiz. initialement à false
        setResizable(true);
        setLocationRelativeTo (parent);
        
//      fenetreAuthentification.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//      fenetreAuthentification.setSize(300, 100);
//      fenetreAuthentification.setLayout(new FlowLayout());
//      fenetreAuthentification.getContentPane().add(btnLogin);
//      fenetreAuthentification.setVisible(true);
        
        try {
  		  UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");

  		} catch (Exception e) {
  		  }
        
    }
 

	public String getUsername () 
    {
        return tfUsername.getText ().trim ();
    }
 
    public String getPassword () 
    {
        return new String (pfPassword.getPassword ());
    }
 
    public boolean isSucceeded () 
    {
        return succeeded;
    }
}
 
