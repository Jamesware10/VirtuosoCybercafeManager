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
import java.awt.Insets;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Curtney James
 */
public class DashboardGUI {
    
    /**
     *
     */
    public static JPanel dashboardPanel,

    /**
     *
     */
    navPanel;
    private JLabel welcomeLabel, lblLogo;

    /**
     *
     */
    public JLabel userLabel;
    //Declare JComponent variables

    /**
     *
     */
    public JPanel headerPanel,

    /**
     *
     */
    footerPanel;

    /**
     *
     */
    public static JPanel mainPanel;
    
    /**
     *
     */
    public static JButton btnHamburger,

    /**
     *
     */
    btnOverview,

    /**
     *
     */
    btnBilling, btnLogout;
    
    /**
     *
     */
    public DashboardGUI() {
        
        initComponents();
        mainPanel.setVisible(true);
    }

    /**
     * This method creates instances of all necessary components, define the
     * design of each component and adds the components to the frame
     *
     * @params accepts nothing
     */
    private void initComponents() {
        mainPanel = new JPanel();
        //Color
        Color navPanelBlack = new Color(20, 20, 20);
        Color purple = new Color(77, 0, 153);
        Color orange = new Color(255, 140, 0);//255, 128, 0

        //Images
        Icon iCafe_logo = new ImageIcon(this.getClass().getResource("/img/iCafe_logo.png"));

        //GridBagLayout
        GridBagLayout gbl = new GridBagLayout();
        GridBagConstraints constraints = new GridBagConstraints();

        //Panel Settings
        mainPanel.setPreferredSize(new Dimension(1000, 620));
        mainPanel.setLayout(gbl);
        mainPanel.setBackground(purple);

        //CREATES CONPONENTS
        dashboardPanel = new JPanel();
        userLabel = new JLabel();
        welcomeLabel = new JLabel("Welcome To Your Dashboard ");
        lblLogo = new JLabel();

        //NavPanel navPanel = new NavPanel();
//<------------------------------------WELCOME LABEL----------------------------------->
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridheight = 1;
        constraints.gridwidth = 1;
        constraints.insets = new Insets(0, 10, 20, -20);
        constraints.fill = GridBagConstraints.HORIZONTAL;
        welcomeLabel.setForeground(Color.WHITE);
        welcomeLabel.setFont(new Font("Nothing", 1, 25));
        mainPanel.add(welcomeLabel, constraints);
        
        constraints.gridx = 1;
        constraints.gridy = 0;
        constraints.gridheight = 1;
        constraints.gridwidth = 1;
        constraints.insets = new Insets(0, -140, 20, 0);
        constraints.fill = GridBagConstraints.HORIZONTAL;
        //constraints.weightx=0.1;
        //constraints.anchor = GridBagConstraints.WEST;
        userLabel.setText((UserLogin.user.getUsername()));
        userLabel.setForeground(orange);
        userLabel.setFont(new Font("Nothing", 1, 25));
        mainPanel.add(userLabel, constraints);

//<------------------------------------DASHBOARD PANEL--------------------------------->
        lblLogo.setIcon(iCafe_logo);
        dashboardPanel.add(lblLogo);
        
        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.gridheight = 2;
        constraints.gridwidth = 1;
        //constraints.ipady = 60;
        //constraints.ipadx = 120;
        //constraints.weightx=1;
        //constraints.anchor = GridBagConstraints.CENTER;
        constraints.insets = new Insets(20, 50, 20, 50);
        constraints.fill = GridBagConstraints.BOTH;
        dashboardPanel.setPreferredSize(new Dimension(400, 220));
        dashboardPanel.setBackground(Color.CYAN);
        mainPanel.add(dashboardPanel, constraints);
        
        
        
    }
    
}
