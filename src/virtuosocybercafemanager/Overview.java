/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virtuosocybercafemanager;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneLayout;
import javax.swing.plaf.basic.BasicScrollBarUI;

/**
 *
 * @author Curtney James
 */
public class Overview {

    public JScrollPane scroll;

    public JPanel myAccountPanel, innerPanel, panel;

    public JLabel lblMyAccount, lblDisplayPicture, lblUsername, lblUsernameDisplayed, lblEmail, lblPassword, lblPasswordDisplayed, lblAccount, lblDatecreated;

    public static JLabel lblAccountDisplayed, lblEmailDisplayed;

    /**
     *
     * @throws Exception
     */
    public Overview() throws Exception {

        initComponents();

    }

    private void initComponents() {
        JPanel panel = new JPanel();
        scroll = new JScrollPane(panel);
        //Color
        //Color navPanelBlack = new Color(20, 20, 20);
        Color purple = new Color(77, 0, 153);
        Color orange = new Color(255, 140, 0);//255, 128, 0
        Color navPanelBlack = new Color(20, 20, 20);

        //Images
        //Icon iCafe_logo = new ImageIcon("C:\\Users\\Curtney James\\Documents\\NetBeansProjects\\CybercafeManagerGUI\\src\\img/iCafe_logo.png");
        //Icon userAccountIcon = new ImageIcon("C:\\Users\\Curtney James\\Documents\\NetBeansProjects\\CybercafeManagerGUI\\src\\img/login_icon.png");
        //Icon basic = new ImageIcon("C:\\Users\\Curtney James\\Documents\\NetBeansProjects\\CybercafeManagerGUI\\src\\img/esports2.jpg");
        //Icon work = new ImageIcon("C:\\Users\\Curtney James\\Documents\\NetBeansProjects\\CybercafeManagerGUI\\src\\img/gaming.png");
        //new ImageIcon(new ImageIcon("C:\\Users\\Curtney James\\Documents\\NetBeansProjects\\CybercafeManagerGUI\\src\\img/esports2.jpg").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
//GridBagLayout
        GridBagLayout gbl = new GridBagLayout();
        GridBagConstraints constraints = new GridBagConstraints();

        
        scroll.setPreferredSize(new Dimension(1000, 620));

        //Panel Settings
        //panel.setPreferredSize(new Dimension(1000, 620));
        panel.setLayout(gbl);
        panel.setBackground(purple);
        scroll.setLayout(new ScrollPaneLayout());

        //CREATES CONPONENTS
        myAccountPanel = new JPanel(gbl);
        innerPanel = new JPanel(gbl);
        lblMyAccount = new JLabel("My Account: ");
        lblDisplayPicture = new JLabel();
        lblDatecreated = new JLabel(/*dateCreated.toString()*/"Date created");
        lblUsername = new JLabel("Username: ");
        lblUsernameDisplayed = new JLabel(UserLogin.user.getUsername());
        lblEmail = new JLabel("Email: ");
        lblEmailDisplayed = new JLabel();
        lblPassword = new JLabel("Password: ");
        lblPasswordDisplayed = new JLabel(UserLogin.user.getPassword());
        lblAccount = new JLabel("Account Balance: ");
        lblAccountDisplayed = new JLabel();

        //<-----------------------------MY ACCOUNT LABEL----------------------------->
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridheight = 1;
        constraints.gridwidth = 1;
        constraints.insets = new Insets(100, 0, 55, 0);
        constraints.fill = GridBagConstraints.HORIZONTAL;
        lblMyAccount.setForeground(Color.WHITE);
        lblMyAccount.setFont(new Font("Nothing", 1, 25));
        panel.add(lblMyAccount, constraints);

        //<---------------------------ADDS MY ACCOUNT TO PANEL------------------------>
        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.gridheight = 2;
        constraints.gridwidth = 1;
        //constraints.ipady = 30;
        //constraints.ipadx = 30;
        constraints.insets = new Insets(10, 0, 20, 50);
        constraints.fill = GridBagConstraints.HORIZONTAL;
        myAccountPanel.setBackground(navPanelBlack);
        //myAccountPanel.add(innerPanel, constraints);
        panel.add(myAccountPanel, constraints);

//<------------------------------------MY ACCOUNT PANEL-------------------------------->
        myAccountPanel.setLayout(gbl);

        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridheight = 2;
        constraints.gridwidth = 1;
        //constraints.ipady = 30;
        constraints.ipadx = 60;
        constraints.insets = new Insets(20, 50, 20, 10);
        constraints.fill = GridBagConstraints.BOTH;
        //lblDisplayPicture.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("C:\\Users\\Curtney James\\Documents\\NetBeansProjects\\CybercafeManagerGUI\\src\\img/login_icon.png")).getImage().getScaledInstance(200, 50, Image.SCALE_SMOOTH)));
        ImageIcon imageIcon = new ImageIcon(new ImageIcon(getClass().getResource("img/login_icon.png")).getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
        lblDisplayPicture.setIcon(imageIcon);
//lblDisplayPicture.setIcon(userAccountIcon);
        //lblDisplayPicture.setPreferredSize(new Dimension(100,100));
        myAccountPanel.add(lblDisplayPicture, constraints);

        constraints.gridx = 1;
        constraints.gridy = 0;
        constraints.gridheight = 1;
        constraints.gridwidth = 1;
        constraints.weightx = 0.1;
        //constraints.ipady = 30;
        //constraints.ipadx = 60;
        constraints.anchor = GridBagConstraints.WEST;
        constraints.insets = new Insets(0, 0, 0, 0);
        constraints.fill = GridBagConstraints.VERTICAL;
        lblDatecreated.setFont(new Font("Nothing", 1, 20));
        lblDatecreated.setBackground(orange);
        myAccountPanel.add(lblDatecreated, constraints);

        //<---------------------------MY ACCOUNT INNER INFO--------------------------->
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridheight = 1;
        constraints.gridwidth = 1;
        constraints.ipady = 0;
        //constraints.ipadx = 60;

        constraints.insets = new Insets(0, 20, 0, 0);
        constraints.fill = GridBagConstraints.HORIZONTAL;
        lblUsername.setForeground(Color.WHITE);
        lblUsername.setFont(new Font("Nothing", 1, 20));
        innerPanel.add(lblUsername, constraints);

        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.gridheight = 1;
        constraints.gridwidth = 1;
        //constraints.ipady = 30;
        constraints.ipadx = 60;
        constraints.insets = new Insets(0, 20, 0, 0);
        constraints.fill = GridBagConstraints.HORIZONTAL;
        lblUsernameDisplayed.setForeground(Color.CYAN);
        lblUsernameDisplayed.setFont(new Font("Nothing", 1, 20));
        innerPanel.add(lblUsernameDisplayed, constraints);

        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridheight = 1;
        constraints.gridwidth = 1;
        //constraints.ipady = 1;
        constraints.ipadx = 60;
        constraints.insets = new Insets(20, 20, 0, 0);
        constraints.fill = GridBagConstraints.HORIZONTAL;
        lblEmail.setForeground(Color.WHITE);
        lblEmail.setFont(new Font("Nothing", 1, 20));
        innerPanel.add(lblEmail, constraints);

        constraints.gridx = 0;
        constraints.gridy = 3;
        constraints.gridheight = 1;
        constraints.gridwidth = 1;
        //constraints.ipady = 30;
        constraints.ipadx = 60;
        constraints.insets = new Insets(0, 20, 0, 0);
        constraints.fill = GridBagConstraints.HORIZONTAL;
        lblEmailDisplayed.setForeground(Color.CYAN);
        lblEmailDisplayed.setFont(new Font("Nothing", 1, 20));
        lblEmailDisplayed.setText(UserLogin.user.email);
        innerPanel.add(lblEmailDisplayed, constraints);

        constraints.gridx = 0;
        constraints.gridy = 4;
        constraints.gridheight = 1;
        constraints.gridwidth = 1;
        //constraints.ipady = 30;
        constraints.ipadx = 60;
        constraints.insets = new Insets(20, 20, 0, 0);
        constraints.fill = GridBagConstraints.HORIZONTAL;
        lblPassword.setForeground(Color.WHITE);
        lblPassword.setFont(new Font("Nothing", 1, 20));
        innerPanel.add(lblPassword, constraints);

        constraints.gridx = 0;
        constraints.gridy = 5;
        constraints.gridheight = 1;
        constraints.gridwidth = 1;
        //constraints.ipady = 30;
        constraints.ipadx = 60;
        constraints.insets = new Insets(0, 20, 0, 0);
        constraints.fill = GridBagConstraints.HORIZONTAL;
        lblPasswordDisplayed.setForeground(Color.CYAN);
        lblPasswordDisplayed.setFont(new Font("Nothing", 1, 20));
        innerPanel.add(lblPasswordDisplayed, constraints);

        constraints.gridx = 0;
        constraints.gridy = 6;
        constraints.gridheight = 1;
        constraints.gridwidth = 1;
        //constraints.ipady = 30;
        constraints.ipadx = 60;
        constraints.insets = new Insets(20, 20, 0, 0);
        constraints.fill = GridBagConstraints.HORIZONTAL;
        lblAccount.setForeground(Color.WHITE);
        lblAccount.setFont(new Font("Nothing", 1, 20));
        innerPanel.add(lblAccount, constraints);

        constraints.gridx = 0;
        constraints.gridy = 7;
        constraints.gridheight = 1;
        constraints.gridwidth = 1;
        //constraints.ipady = 30;
        constraints.ipadx = 60;
        constraints.insets = new Insets(0, 20, 0, 0);
        constraints.fill = GridBagConstraints.HORIZONTAL;
        lblAccountDisplayed.setForeground(Color.CYAN);
        lblAccountDisplayed.setFont(new Font("Nothing", 1, 20));
        lblAccountDisplayed.setText("$"+String.valueOf(UserLogin.user.balance));
        innerPanel.add(lblAccountDisplayed, constraints);

        //
        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridheight = 1;
        constraints.gridwidth = 2;
        constraints.ipady = 10;
        constraints.ipadx = 60;
        constraints.weightx = 2;
        constraints.anchor = GridBagConstraints.CENTER;
        constraints.insets = new Insets(20, 50, 20, 50);
        constraints.fill = GridBagConstraints.HORIZONTAL;
        innerPanel.setBackground(Color.DARK_GRAY);
        myAccountPanel.add(innerPanel, constraints);

        scroll.getVerticalScrollBar().setUI(new BasicScrollBarUI() {
            @Override
            protected void configureScrollBarColors() {
                scroll.getVerticalScrollBar().setBackground(navPanelBlack);
                this.thumbColor = Color.DARK_GRAY;
            }
        });

    }

}
