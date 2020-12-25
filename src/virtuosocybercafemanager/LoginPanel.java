/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virtuosocybercafemanager;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Curtney James
 */
public class LoginPanel extends JPanel {

    //Declare JComponent variable

    /**
     *
     */
    public static JLabel lblUsername,

    /**
     *
     */
    lblPassword,

    /**
     *
     */
    lblMessage,

    /**
     *
     */
    lblRegister,

    /**
     *
     */
    lblHeader,

    /**
     *
     */
    lblFooter;

    /**
     *
     */
    public static JTextField txtUsername;

    /**
     *
     */
    public static JPasswordField txtPassword;

    /**
     *
     */
    public static JButton btnSubmit;

    TitledBorder titledBorder;

    /**
     *
     */
    public LoginPanel() {
        
        //GridBagLayout
        GridBagLayout gbl = new GridBagLayout();
        GridBagConstraints constraints = new GridBagConstraints();

        setLayout(gbl);
        //constraints.ipady = 100;

        //Creates JComponents
        lblHeader = new JLabel("Virtuoso Internet Cafe");
        lblUsername = new JLabel("Username: ");
        lblPassword = new JLabel("Password: ");
        lblMessage = new JLabel(" ");
        txtUsername = new JTextField(20);
        txtPassword = new JPasswordField(20);
        btnSubmit = new JButton("Submit");
        lblRegister = new JLabel("Register");
        lblFooter = new JLabel("© 2020 Curtney K. James. All Rights Reserved");

        //Login panel
//        titledBorder = BorderFactory.createTitledBorder("User Login");
//        titledBorder.setTitleColor(purple);
//        setBorder(titledBorder);
        Color purple = new Color(77, 0, 153);

        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridheight = 1;
        constraints.insets = new Insets(8, 1, 8, 1);
        constraints.fill = GridBagConstraints.HORIZONTAL;
        lblUsername.setForeground(Color.WHITE);
        add(lblUsername, constraints);

        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.gridheight = 1;
        constraints.insets = new Insets(0, 1, 8, 1);
        constraints.fill = GridBagConstraints.HORIZONTAL;
        txtUsername.setBackground(Color.BLACK);
        txtUsername.setForeground(Color.WHITE);
        add(txtUsername, constraints);

        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridheight = 1;
        constraints.insets = new Insets(8, 1, 8, 1);
        constraints.fill = GridBagConstraints.HORIZONTAL;
        lblPassword.setForeground(Color.WHITE);
        add(lblPassword, constraints);

        constraints.gridx = 0;
        constraints.gridy = 3;
        constraints.gridheight = 1;
        constraints.insets = new Insets(0, 1, 8, 1);
        constraints.fill = GridBagConstraints.HORIZONTAL;
        txtPassword.setBackground(Color.BLACK);
        txtPassword.setForeground(Color.WHITE);
        add(txtPassword, constraints);

        constraints.gridx = 0;
        constraints.gridy = 4;
        constraints.gridheight = 1;
        constraints.insets = new Insets(8, 1, 8, 1);
        constraints.fill = GridBagConstraints.HORIZONTAL;
        btnSubmit.setBackground(purple);
        btnSubmit.setForeground(Color.WHITE);
        btnSubmit.setFont(new Font("Nothing", 1, 13));
        btnSubmit.setCursor(new Cursor(Cursor.HAND_CURSOR));
        add(btnSubmit, constraints);

        constraints.gridx = 0;
        constraints.gridy = 5;
        constraints.gridheight = 1;
        constraints.insets = new Insets(2, 1, 2, 1);
        constraints.fill = GridBagConstraints.CENTER;
        add(lblMessage, constraints);

        constraints.gridx = 0;
        constraints.gridy = 6;
        constraints.gridheight = 1;
        constraints.insets = new Insets(2, 1, 2, 1);
        constraints.fill = GridBagConstraints.CENTER;
        lblRegister.setForeground(Color.BLACK);
        add(lblRegister, constraints);
        lblRegister.setFont(new Font("Nothing", 1, 15));
        lblRegister.setCursor(new Cursor(Cursor.HAND_CURSOR));

    }
    
    
    private void initComponents(){
         //GridBagLayout
        GridBagLayout gbl = new GridBagLayout();
        GridBagConstraints constraints = new GridBagConstraints();

        //Colors
        Color purple = new Color(77, 0, 153);
        
        setLayout(gbl);

        //Creates JComponents
        lblHeader = new JLabel("Virtuoso Internet Cafe");
        lblUsername = new JLabel("Username: ");
        lblPassword = new JLabel("Password: ");
        lblMessage = new JLabel(" ");
        txtUsername = new JTextField(20);
        txtPassword = new JPasswordField(20);
        btnSubmit = new JButton("Submit");
        lblRegister = new JLabel("Register");
        lblFooter = new JLabel("© 2020 Curtney K. James. All Rights Reserved");


        //lblUsername constraints
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridheight = 1;
        constraints.insets = new Insets(8, 1, 8, 1);
        constraints.fill = GridBagConstraints.HORIZONTAL;
        lblUsername.setForeground(Color.WHITE);
        add(lblUsername, constraints);

        //txtUsername constraints
        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.gridheight = 1;
        constraints.insets = new Insets(0, 1, 8, 1);
        constraints.fill = GridBagConstraints.HORIZONTAL;
        txtUsername.setBackground(Color.BLACK);
        txtUsername.setForeground(Color.WHITE);
        add(txtUsername, constraints);

        //lblPassword constraints
        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridheight = 1;
        constraints.insets = new Insets(8, 1, 8, 1);
        constraints.fill = GridBagConstraints.HORIZONTAL;
        lblPassword.setForeground(Color.WHITE);
        add(lblPassword, constraints);

        //txtPassword constraints
        constraints.gridx = 0;
        constraints.gridy = 3;
        constraints.gridheight = 1;
        constraints.insets = new Insets(0, 1, 8, 1);
        constraints.fill = GridBagConstraints.HORIZONTAL;
        txtPassword.setBackground(Color.BLACK);
        txtPassword.setForeground(Color.WHITE);
        add(txtPassword, constraints);

        //tbnSubmit constraints
        constraints.gridx = 0;
        constraints.gridy = 4;
        constraints.gridheight = 1;
        constraints.insets = new Insets(8, 1, 8, 1);
        constraints.fill = GridBagConstraints.HORIZONTAL;
        btnSubmit.setBackground(purple);
        btnSubmit.setForeground(Color.WHITE);
        btnSubmit.setFont(new Font("Nothing", 1, 13));
        btnSubmit.setCursor(new Cursor(Cursor.HAND_CURSOR));
        add(btnSubmit, constraints);

        //lblMessage constraints
        constraints.gridx = 0;
        constraints.gridy = 5;
        constraints.gridheight = 1;
        constraints.weightx=0.2;
        constraints.insets = new Insets(2, 1, 2, 1);
        constraints.fill = GridBagConstraints.CENTER;
        add(lblMessage, constraints);

        //lblRegister constraints
        constraints.gridx = 0;
        constraints.gridy = 6;
        constraints.gridheight = 1;
        constraints.insets = new Insets(2, 1, 2, 1);
        constraints.fill = GridBagConstraints.CENTER;
        lblRegister.setForeground(Color.BLACK);
        add(lblRegister, constraints);
        lblRegister.setFont(new Font("Nothing", 1, 15));
        lblRegister.setCursor(new Cursor(Cursor.HAND_CURSOR));

    }

    /**
     *
     * @return
     */
    @Override
    public Dimension getPreferredSize() {
        return new Dimension(300, 250);
    }
}
