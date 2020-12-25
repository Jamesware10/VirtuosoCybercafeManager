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
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Curtney James
 */
public class RegisterPanel extends JPanel {

    //Declare JComponent variable

    /**
     *
     */
    public static JPanel headerPanel, footerPanel;

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
    lblEmail,

    /**
     *
     */
    lblMessage,

    /**
     *
     */
    lblLogin,

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
    public static JTextField txtUsername,

    /**
     *
     */
    txtEmail;

    /**
     *
     */
    public static JPasswordField txtPassword;

    /**
     *
     */
    public static JButton btnSubmit;

    Border titledBorder;

    /**
     *
     */
    public RegisterPanel() {

        GridBagLayout gbl = new GridBagLayout();
        GridBagConstraints constraints = new GridBagConstraints();
        setLayout(gbl);

        lblUsername = new JLabel("Username: ");
        lblPassword = new JLabel("Password: ");
        lblEmail = new JLabel("Email Address: ");
        lblMessage = new JLabel(" ");
        txtUsername = new JTextField(20);
        txtEmail = new JTextField(20);
        txtPassword = new JPasswordField(20);
        btnSubmit = new JButton("Submit");
        lblLogin = new JLabel("Signin");


        Color purple = new Color(77, 0, 153);

        //lblUsername constraints
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridheight = 1;
        constraints.insets = new Insets(10, 1, 8, 1);
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

        //lblEmail constraints
        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridheight = 1;
        constraints.insets = new Insets(10, 1, 8, 1);
        constraints.fill = GridBagConstraints.HORIZONTAL;
        lblEmail.setForeground(Color.WHITE);
        add(lblEmail, constraints);

        //txtEmail constraints
        constraints.gridx = 0;
        constraints.gridy = 3;
        constraints.gridheight = 1;
        constraints.insets = new Insets(0, 1, 8, 1);
        constraints.fill = GridBagConstraints.HORIZONTAL;
        txtEmail.setBackground(Color.BLACK);
        txtEmail.setForeground(Color.WHITE);
        add(txtEmail, constraints);

        add(Box.createRigidArea(new Dimension(20, 20)));

        //lblPassword constraints
        constraints.gridx = 0;
        constraints.gridy = 4;
        constraints.gridheight = 1;
        constraints.insets = new Insets(8, 1, 8, 1);
        constraints.fill = GridBagConstraints.HORIZONTAL;
        lblPassword.setForeground(Color.WHITE);
        add(lblPassword, constraints);

        //txtPassword constraints
        constraints.gridx = 0;
        constraints.gridy = 5;
        constraints.gridheight = 1;
        constraints.insets = new Insets(0, 1, 8, 1);
        constraints.fill = GridBagConstraints.HORIZONTAL;
        txtPassword.setBackground(Color.BLACK);
        txtPassword.setForeground(Color.WHITE);
        add(txtPassword, constraints);

        //btnSubmit constraints
        constraints.gridx = 0;
        constraints.gridy = 6;
        constraints.gridheight = 1;
        constraints.insets = new Insets(10, 1, 8, 1);
        constraints.fill = GridBagConstraints.HORIZONTAL;
        btnSubmit.setBackground(purple);
        btnSubmit.setForeground(Color.WHITE);
        btnSubmit.setFont(new Font("Nothing", 1, 13));
        btnSubmit.setCursor(new Cursor(Cursor.HAND_CURSOR));
        add(btnSubmit, constraints);

        //lblMessage constraints
        constraints.gridx = 0;
        constraints.gridy = 7;
        constraints.gridheight = 1;
        constraints.insets = new Insets(8, 1, 2, 1);
        constraints.fill = GridBagConstraints.WEST;
        add(lblMessage, constraints);

        //lblLogin constraints
        constraints.gridx = 0;
        constraints.gridy = 8;
        constraints.gridheight = 1;
        constraints.insets = new Insets(2, 1, 30, 1);
        constraints.fill = GridBagConstraints.CENTER;
        lblLogin.setForeground(Color.BLACK);
        add(lblLogin, constraints);
        lblLogin.setFont(new Font("Nothing", 1, 15));
        lblLogin.setCursor(new Cursor(Cursor.HAND_CURSOR));

    }

}
