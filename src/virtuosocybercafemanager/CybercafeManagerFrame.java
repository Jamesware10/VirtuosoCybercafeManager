/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virtuosocybercafemanager;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.sql.SQLException;
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
import javax.swing.JScrollPane;

/**
 * This is the main part of the application, once a user is logger in they can
 * access their account.
 *
 * @author Curtney James
 */
public class CybercafeManagerFrame extends JFrame{

    //Declare component variables
    
    JScrollPane overviewGUIPanel = new JScrollPane();
    private JPanel dashboardGUIPanel, paymentGUIPanel, navPanel, panel, headerPanel, footerPanel;
    public JButton btnHamburger, btnHome, btnOverview, btnBilling, btnLogout;
    JLabel lblHeader = new JLabel("Virtuoso Internet Cafe");
    JLabel lblFooter = new JLabel("© 2020 Curtney K. James. All Rights Reserved");

    public CybercafeManagerFrame() throws IOException, SQLException, Exception {

        initComponents();
    }

    /**
     * This method creates instances of all necessary components, define the
     * design of each component and adds the components to the frame
     *
     * @params accepts nothing
     */
    private void initComponents() throws SQLException, Exception {
        JFrame frame = new JFrame();
        frame.setTitle("Virtuoso Cybercafe Manager");
        
        //Color
        Color navPanelBlack = new Color(20, 20, 20);
        Color purple = new Color(77, 0, 153);
        Color orange = new Color(255, 140, 0);//255, 128, 0

        //Icons
        ImageIcon iCafe_logo = new ImageIcon(this.getClass().getResource("/img/iCafe_logo.png"));
        ImageIcon homeIcon = new ImageIcon(getClass().getResource("/img/home_icons/home.png"));
        ImageIcon menuIcon = new ImageIcon(getClass().getResource("/img/menu_icons/list.png"));
        ImageIcon informationIcon = new ImageIcon(getClass().getResource("/img/info_icons/information.png"));
        ImageIcon paymentIcon = new ImageIcon(getClass().getResource("/img/billing_icons/credit-card.png"));
        ImageIcon logOutIcon = new ImageIcon(getClass().getResource("/img/logout_icons(2)/exit.png"));

        frame.setIconImage(iCafe_logo.getImage());
        //GridBagLayout
        GridBagLayout gbl = new GridBagLayout();
        GridBagConstraints constraints = new GridBagConstraints();

        //Pre-frame-construction  changes
        //Frame Layout to BorderLayout
        frame.setLayout(new BorderLayout()/*new BoxLayout(getContentPane(), BoxLayout.X_AXIS)*/);
        frame.setResizable(true);

        //setPreferredSize(new Dimension(1000, 620));
        //creates components
        navPanel = new JPanel();
        headerPanel = new JPanel();
        dashboardGUIPanel = new DashboardGUI().mainPanel;
        paymentGUIPanel = new PaymentGUI().payPanel;
        overviewGUIPanel = new Overview().scroll;
        panel = new JPanel(gbl);
        btnHamburger = new JButton();
        btnHome = new JButton();
        btnOverview = new JButton();
        btnBilling = new JButton();
        btnLogout = new JButton();
        lblHeader = new JLabel("Virtuoso Internet Cafe");
        footerPanel = new JPanel();
        
        //panel.setLayout(new BorderLayout());

        //<--------------------------ADDING HEADER PANEL------------------------------->
        
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridheight = 1;
        constraints.gridwidth = 2;
        //constraints.gridwidth = 10;
        //constraints.ipady = 20;
        constraints.ipadx = 20;
        constraints.insets = new Insets(0, 0, 0, 0);
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.anchor = GridBagConstraints.PAGE_END;
        headerPanel.setBackground(navPanelBlack);
        lblHeader.setForeground(Color.orange);
        lblHeader.setFont(new Font("Nothing", 1, 35));
        headerPanel.add(lblHeader);
        panel.add(headerPanel, constraints);

        //<-----------------------ADDING NAVIGATION PANEL---------------------------->
        //adding components to navigation panel
        navPanel.setLayout(new BoxLayout(navPanel, BoxLayout.Y_AXIS));

        //NAVPANEL MENU BUTTON
        navPanel.add(btnHamburger);
        btnHamburger.setOpaque(false);
        btnHamburger.setContentAreaFilled(false);
        btnHamburger.setBorderPainted(false);
        btnHamburger.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnHamburger.setIcon(menuIcon);

        navPanel.add(Box.createRigidArea(new Dimension(0, 100)));

        //NAVPANEL HOME BUTTON
        navPanel.add(btnHome);
        btnHome.setOpaque(false);
        btnHome.setContentAreaFilled(false);
        btnHome.setBorderPainted(false);
        btnHome.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnHome.setIcon(homeIcon);

        navPanel.add(Box.createRigidArea(new Dimension(0, 20)));

        //NAVPANEL OVERVIEW
        navPanel.add(btnOverview);
        btnOverview.setOpaque(false);
        btnOverview.setContentAreaFilled(false);
        btnOverview.setBorderPainted(false);
        btnOverview.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnOverview.setIcon(informationIcon);

        navPanel.add(Box.createRigidArea(new Dimension(0, 20)));

        //NAVPANEL BILLING
        navPanel.add(btnBilling);
        btnBilling.setOpaque(false);
        btnBilling.setContentAreaFilled(false);
        btnBilling.setBorderPainted(false);
        btnBilling.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnBilling.setIcon(paymentIcon);

        navPanel.add(Box.createRigidArea(new Dimension(0, 270)));

        //NAVPANEL LOGOUT
        navPanel.add(btnLogout, Box.createVerticalGlue());
        btnLogout.setOpaque(false);
        btnLogout.setContentAreaFilled(false);
        btnLogout.setBorderPainted(false);
        btnLogout.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnLogout.setIcon(logOutIcon);

        navPanel.add(Box.createHorizontalGlue());

        //navigation panel constraints
        navPanel.setBackground(navPanelBlack);
        //navPanel.setSize(new Dimension(150, 700));

        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.gridheight = 2;
        constraints.gridwidth = 1;
        //constraints.gridwidth = 10;
        //constraints.ipady = 20;
        constraints.ipadx = 0;
        constraints.insets = new Insets(0, 0, 0, -10);
        constraints.fill = GridBagConstraints.VERTICAL;
        panel.add(navPanel, constraints);

        //<--------------------------ADDING FOOTER PANEL------------------------------->
        //footer panel cosntraints
        constraints.gridx = 1;
        constraints.gridy = 2;
        constraints.gridheight = 1;
        constraints.gridwidth = 3;
        //constraints.gridwidth = 10;
        //constraints.ipady = 20;
        //constraints.ipadx = 20;
        constraints.insets = new Insets(0, 0, 0, 0);
        constraints.fill = GridBagConstraints.HORIZONTAL;
        //constraints.anchor= GridBagConstraints.PAGE_END;

        footerPanel.setBackground(navPanelBlack);
        footerPanel.add(lblFooter);
        lblFooter.setForeground(Color.WHITE);
        //headerPanel.setSize(new Dimension(150,700));
        panel.add(footerPanel, constraints);

        //<----------------------------ADDS DASHBOARD PANEL--------------------------->
        constraints.gridx = 1;
        constraints.gridy = 1;
        constraints.gridheight = 1;
        constraints.gridwidth = 1;
        //constraints.gridwidth = 10;
        //constraints.ipady = 20;
        constraints.ipadx = 20;
        constraints.insets = new Insets(0, 0, 0, 0);
        constraints.fill = GridBagConstraints.VERTICAL;

        //dashboardGUIPanel.setPreferredSize(new Dimension(1000, 1000));
        panel.add(dashboardGUIPanel, constraints);
        dashboardGUIPanel.setVisible(true);

        //<------------------------------ADDS PAYMENT PANEL--------------------------->
        constraints.gridx = 1;
        constraints.gridy = 1;
        constraints.gridheight = 1;
        constraints.gridwidth = 1;
        //constraints.gridwidth = 10;
        //constraints.ipady = 20;
        constraints.ipadx = 20;
        constraints.insets = new Insets(0, 0, 0, 0);
        constraints.fill = GridBagConstraints.VERTICAL;
        panel.add(paymentGUIPanel, constraints);
        paymentGUIPanel.setVisible(false);

        constraints.gridx = 1;
        constraints.gridy = 1;
        constraints.gridheight = 1;
        constraints.gridwidth = 1;
        //constraints.gridwidth = 10;
        //constraints.ipady = 20;
        constraints.ipadx = 20;
        constraints.insets = new Insets(0, 0, 0, 0);
        constraints.fill = GridBagConstraints.VERTICAL;
        panel.add(overviewGUIPanel, constraints);
        overviewGUIPanel.setVisible(false);

        //<-----------------------------END OF ADDING COMPONENTS---------------------->
        //Sets main panel as content pane
        frame.setContentPane(panel);

        //Post frame construction settings
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        //Shows dashboard
        btnHome.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dashboardGUIPanel.setVisible(true);
                paymentGUIPanel.setVisible(false);
                overviewGUIPanel.setVisible(false);
                System.out.println("dashboard");
            }
        });

        //Shows dashboard
        btnOverview.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                overviewGUIPanel.setVisible(true);
                paymentGUIPanel.setVisible(false);
                dashboardGUIPanel.setVisible(false);
                System.out.println("overview");
            }
        });

        //Shows payment
        btnBilling.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dashboardGUIPanel.setVisible(false);
                paymentGUIPanel.setVisible(true);
                overviewGUIPanel.setVisible(false);
                System.out.println("payment");
            }
        });

        //Exit applicstion and goes to the User login
        btnLogout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new UserLogin();
                } catch (SQLException ex) {
                    Logger.getLogger(CybercafeManagerFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (Exception ex) {
                    Logger.getLogger(CybercafeManagerFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
                frame.dispose();
            }
        });
        
        
        btnHamburger.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                
                //if(e.getClickCount()==10){
                    PaintApplication paint = new PaintApplication();
                //}
            }
            
            @Override
            public void mousePressed(MouseEvent e) {
                
            }
            
            @Override
            public void mouseReleased(MouseEvent e) {
                
            }
            
            @Override
            public void mouseEntered(MouseEvent e) {
                
            }
            
            @Override
            public void mouseExited(MouseEvent e) {
                
            }
        });
        frame.setVisible(true);
    }

    public static void main(String[] args) throws SQLException, Exception {
        try {
            CybercafeManagerFrame c = new CybercafeManagerFrame();
        } catch (IOException ex) {
            Logger.getLogger(CybercafeManagerFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
