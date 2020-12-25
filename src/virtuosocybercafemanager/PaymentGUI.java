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
import java.awt.Image;
import java.sql.Statement;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import static virtuosocybercafemanager.Overview.lblAccountDisplayed;

/**
 *
 * @author Curtney James
 */
public class PaymentGUI extends User {

    //Declare JComponent variables

    /**
     *
     */
    public JPanel paymentOptPanel1, paymentOptPanel2,

    /**
     *
     */
    paymentOptPanel3,

    /**
     *
     */
    payPanel;
    private JLabel lblSubsription, lblOption1, lblOption2, lblOption3, lblPrice1, lblPrice2, lblPrice3, lblPicture1, lblPicture2, lblPicture3;
    private JButton btnBuy1, btnBuy2, btnBuy3;

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
    public static JLabel lblHeader,

    /**
     *
     */
    lblFooter;

    //Color
    Color navPanelBlack = new Color(20, 20, 20);
    Color purple = new Color(77, 0, 153);
    Color orange = new Color(255, 140, 0);//255, 128, 0

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
    btnBilling,

    /**
     *
     */
    btnLogout;

    ImageIcon basic = new ImageIcon(new ImageIcon("/img/esports2.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));

    //Constructs Payment GUI

    /**
     *
     * @throws Exception
     */
    public PaymentGUI() throws Exception {

        //Initializes components
        initComponents();

        //makes panel visible
        payPanel.setVisible(true);
    }

    /**
     * This method creates instances of all necessary components, define the
     * design of each component and adds the components to the frame
     *
     * @params accepts nothing
     */
    private void initComponents() {
        payPanel = new JPanel();

        //Images
        Icon iCafe_logo = new ImageIcon("/img/iCafe_logo.png");

        //GridbagLayout
        GridBagLayout gbl = new GridBagLayout();
        GridBagConstraints constraints = new GridBagConstraints();

        //
        payPanel.setPreferredSize(new Dimension(1000, 620));
        payPanel.setBackground(purple);
        payPanel.setLayout(gbl);

        //<-----------------------------CREATES COMPONENTS--------------------------!>
        lblSubsription = new JLabel("Choose your subscription plan!");
        paymentOptPanel1 = new JPanel();
        paymentOptPanel2 = new JPanel();
        paymentOptPanel3 = new JPanel();
        lblOption1 = new JLabel("One day");
        lblOption2 = new JLabel("One Month");
        lblOption3 = new JLabel("Three Months");
        lblPicture1 = new JLabel();
        lblPicture2 = new JLabel();
        lblPicture3 = new JLabel();
        lblPrice1 = new JLabel("$5.00");
        lblPrice2 = new JLabel("$125.00");
        lblPrice3 = new JLabel("$289.00");
        btnBuy1 = new JButton("Buy");
        btnBuy2 = new JButton("Buy");
        btnBuy3 = new JButton("Buy");
        footerPanel = new JPanel();
        btnHamburger = new JButton("==");
        btnOverview = new JButton("i");
        btnBilling = new JButton("$");
        btnLogout = new JButton("-->");
        headerPanel = new JPanel();
        lblHeader = new JLabel("Virtuoso Internet Cafe");
        mainPanel = new JPanel();
        footerPanel = new JPanel();
        lblFooter = new JLabel("© 2020 Curtney K. James. All Rights Reserved");
        mainPanel = new JPanel();
        
        
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridheight = 1;
        constraints.gridwidth = 3;
        constraints.fill = GridBagConstraints.CENTER;
        lblSubsription.setFont(new Font("Normal", 1, 30));
        lblSubsription.setForeground(Color.WHITE);
        payPanel.add(lblSubsription, constraints);
        //<----------------------------OPTION PANEL 1-------------------------------->
        //payment option panel 1 
        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.gridheight = 1;
        constraints.gridwidth = 1;
        //constraints.ipady = 45;
        constraints.ipadx = 45;
        constraints.insets = new Insets(40, 80, 50, 20);
        constraints.fill = GridBagConstraints.BOTH;
        paymentOptPanel1.setBackground(Color.CYAN);
        //paymentOptPanel1.setSize(new Dimension(300,400));
        paymentOptPanel1.setLayout(new BoxLayout(paymentOptPanel1, BoxLayout.Y_AXIS));
        payPanel.add(paymentOptPanel1, constraints);

        //Payment Option 1 Label
        paymentOptPanel1.add(Box.createRigidArea(new Dimension(0, 10)));
        paymentOptPanel1.add(lblOption1);
        JLabel lblOption1Part2 =(new JLabel("/Casual Plan"));
        lblOption1Part2.setFont(new Font("Normal", 1, 20));
        paymentOptPanel1.add(lblOption1Part2);
        lblOption1.setAlignmentX(payPanel.CENTER_ALIGNMENT);
        lblOption1Part2.setAlignmentX(payPanel.CENTER_ALIGNMENT);
        lblOption1.setFont(new Font("Normal", 1, 20));
        paymentOptPanel1.add(Box.createRigidArea(new Dimension(0, 5)));

        //Payment Option 1 Picture
        paymentOptPanel1.add(Box.createRigidArea(new Dimension(0, 5)));
        paymentOptPanel1.add(lblPicture1);
        lblPicture1.setIcon(new ImageIcon(new ImageIcon(this.getClass().getResource("/img/gaming.png")).getImage().getScaledInstance(180, 180, Image.SCALE_DEFAULT)));
        lblPicture1.setAlignmentX(payPanel.CENTER_ALIGNMENT);
        paymentOptPanel1.add(Box.createRigidArea(new Dimension(0, 10)));

        //Payment Option 1 Price label
        paymentOptPanel1.add(Box.createRigidArea(new Dimension(0, 5)));
        paymentOptPanel1.add(lblPrice1);
        lblPrice1.setAlignmentX(payPanel.CENTER_ALIGNMENT);
        lblPrice1.setFont(new Font("Normal", 1, 22));
        paymentOptPanel1.add(Box.createRigidArea(new Dimension(0, 10)));

        //Payment Option 1 button
        btnBuy1.setBackground(purple);
        btnBuy1.setForeground(Color.WHITE);
        btnBuy1.setFont(new Font("Nothing", 1, 13));
        btnBuy1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        paymentOptPanel1.add(btnBuy1);
        btnBuy1.setAlignmentX(payPanel.CENTER_ALIGNMENT);
        paymentOptPanel1.add(Box.createRigidArea(new Dimension(0, 100)));

        //<----------------------------OPTION PANEL 2-------------------------------->
        //Payment Option panel 2 constraints
        constraints.gridx = 1;
        constraints.gridy = 1;
        constraints.gridheight = 1;
        //constraints.ipadx = 20;
        constraints.insets = new Insets(40, 20, 50, 20);
        constraints.fill = GridBagConstraints.BOTH;
        //paymentOptPanel2.setSize(new Dimension(300,400));
        paymentOptPanel2.setLayout(new BoxLayout(paymentOptPanel2, BoxLayout.Y_AXIS));
        paymentOptPanel2.setBackground(Color.CYAN);
        payPanel.add(paymentOptPanel2, constraints);

        //Payment Option 2 Label
        paymentOptPanel2.add(Box.createRigidArea(new Dimension(0, 10)));
        paymentOptPanel2.add(lblOption2);
        JLabel lblOption2Part2 =(new JLabel("/Membership Plan"));
        lblOption2Part2.setFont(new Font("Normal", 1, 20));
        paymentOptPanel2.add(lblOption2Part2);
        lblOption2.setAlignmentX(payPanel.CENTER_ALIGNMENT);
        lblOption2Part2.setAlignmentX(payPanel.CENTER_ALIGNMENT);
        lblOption2.setFont(new Font("Normal", 1, 20));
        paymentOptPanel2.add(Box.createRigidArea(new Dimension(0, 5)));

        //Payment Option 2 Picture
        paymentOptPanel2.add(Box.createRigidArea(new Dimension(0, 5)));
        paymentOptPanel2.add(lblPicture2);
        lblPicture2.setIcon(new ImageIcon(new ImageIcon(this.getClass().getResource("/img/esports2.jpg")).getImage().getScaledInstance(180, 180, Image.SCALE_DEFAULT)));
        lblPicture2.setAlignmentX(payPanel.CENTER_ALIGNMENT);
        paymentOptPanel2.add(Box.createRigidArea(new Dimension(0, 10)));

        //Payment Option 1 Price label
        paymentOptPanel2.add(Box.createRigidArea(new Dimension(0, 5)));
        paymentOptPanel2.add(lblPrice2);
        lblPrice2.setAlignmentX(payPanel.CENTER_ALIGNMENT);
        lblPrice2.setFont(new Font("Normal", 1, 22));
        paymentOptPanel2.add(Box.createRigidArea(new Dimension(0, 10)));

        //Payment Option 2 button
        btnBuy2.setBackground(purple);
        btnBuy2.setForeground(Color.WHITE);
        btnBuy2.setFont(new Font("Nothing", 1, 13));
        btnBuy2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        paymentOptPanel2.add(btnBuy2);
        btnBuy2.setAlignmentX(payPanel.CENTER_ALIGNMENT);
        paymentOptPanel2.add(Box.createRigidArea(new Dimension(0, 20)));

        //--------------------------OPTION PANEL3------------------------------------>
        //Payment option panel 3 constraints
        constraints.gridx = 2;
        constraints.gridy = 1;
        constraints.gridheight = 1;
        //constraints.gridwidth = 1;
        //constraints.ipady=10;
        constraints.insets = new Insets(40, 20, 50, 80);
        //paymentOptPanel3.setSize(new Dimension(300, 400));
        constraints.fill = GridBagConstraints.BOTH;
        paymentOptPanel3.setLayout(new BoxLayout(paymentOptPanel3, BoxLayout.Y_AXIS));
        paymentOptPanel3.setBackground(Color.CYAN);
        payPanel.add(paymentOptPanel3, constraints);

        //Payment Option 3 Label
        paymentOptPanel3.add(Box.createRigidArea(new Dimension(0, 10)));
        paymentOptPanel3.add(lblOption3);
        JLabel lblOption3Part2 =(new JLabel("/Membership Plan"));
        lblOption3Part2.setFont(new Font("Normal", 1, 20));
        paymentOptPanel3.add(lblOption3Part2);
        lblOption3.setAlignmentX(payPanel.CENTER_ALIGNMENT);
        lblOption3Part2.setAlignmentX(payPanel.CENTER_ALIGNMENT);
        lblOption3.setFont(new Font("Normal", 1, 20));
        paymentOptPanel3.add(Box.createRigidArea(new Dimension(0, 5)));

        //Payment Option 1 Picture
        paymentOptPanel3.add(Box.createRigidArea(new Dimension(0, 5)));
        paymentOptPanel3.add(lblPicture3);
        lblPicture3.setIcon(new ImageIcon(new ImageIcon(this.getClass().getResource("/img/ultimategaming2.jpg")).getImage().getScaledInstance(180, 180, Image.SCALE_DEFAULT)));
        lblPicture3.setAlignmentX(payPanel.CENTER_ALIGNMENT);
        paymentOptPanel3.add(Box.createRigidArea(new Dimension(0, 10)));

        //Payment Option 1 Price label
        paymentOptPanel3.add(Box.createRigidArea(new Dimension(0, 5)));
        paymentOptPanel3.add(lblPrice3);
        lblPrice3.setAlignmentX(payPanel.CENTER_ALIGNMENT);
        lblPrice3.setFont(new Font("Normal", 1, 22));
        paymentOptPanel3.add(Box.createRigidArea(new Dimension(0, 10)));

        //Payment Option 3 button
        btnBuy3.setBackground(purple);
        btnBuy3.setForeground(Color.WHITE);
        btnBuy3.setFont(new Font("Nothing", 1, 13));
        btnBuy3.setCursor(new Cursor(Cursor.HAND_CURSOR));
        paymentOptPanel3.add(btnBuy3);
        btnBuy3.setAlignmentX(payPanel.CENTER_ALIGNMENT);

        btnBuy1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double cost = 5.0;
                    //try {
                    buyOptionPane(cost);
                    //} catch (SQLException ex) {
                    //    Logger.getLogger(PaymentGUI.class.getName()).log(Level.SEVERE, null, ex);
                    // }
                } catch (SQLException ex) {
                    Logger.getLogger(PaymentGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        btnBuy2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                double cost = 129.0;
                try {
                    buyOptionPane(cost);
                } catch (SQLException ex) {
                    Logger.getLogger(PaymentGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        btnBuy3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double cost = 285.0;
                try {
                    buyOptionPane(cost);
                } catch (SQLException ex) {
                    Logger.getLogger(PaymentGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

    }

    /**
     *
     * @param cost
     * @throws SQLException
     */
    public void buyOptionPane(double cost) throws SQLException {
        JFrame buyOptionPane = new JFrame();
        buyOptionPane.setBackground(purple);
        buyOptionPane.setForeground(Color.WHITE);
        int a = JOptionPane.showConfirmDialog(buyOptionPane, "Are you sure you want this subscription?");

        if (a == JOptionPane.YES_OPTION) {
            UserLogin.user.withdraw(cost);
            try {
                connection = DriverManager.getConnection(jdbcUrl, mySQL_User, mySQL_Password);
                Statement upDatestatement = connection.createStatement();
                String update = "UPDATE `virtuoso_cybercafe_users` SET account = " + UserLogin.user.balance
                        + " WHERE USERNAME = " + "'" +UserLogin.user.username+"'";
                        //+ " 'PASSWORD' = " + "'" + UserLogin.user.password+ "'";
                upDatestatement.executeUpdate(update);
                lblAccountDisplayed.setText(String.valueOf(UserLogin.user.balance));
            } catch (SQLException ex) {
                //ex.getStackTrace();
                System.out.println("Database Error : " + ex.getMessage());
                System.out.println(UserLogin.user.getBalance());
            }

        } else if (a != JOptionPane.YES_OPTION) {
            buyOptionPane.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }

    }

}
