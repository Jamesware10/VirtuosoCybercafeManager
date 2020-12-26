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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import static virtuosocybercafemanager.LoginPanel.lblRegister;
import static virtuosocybercafemanager.RegisterPanel.lblLogin;

/**
 * The purpose of this project is to be able to register users and/or allow them
 * to sign in to the Cybercafe Manager where they can easily purchase
 * subscriptions to Virtuoso Cybercafe services
 *  @see CybercafeManagerFrame
 * @author Curtney James
 */
public class UserLogin extends User {

    //Declare JComponent variable
    private JFrame frame = new JFrame();
    private static JPanel headerPanel, loginPanel, registerPanel, footerPanel;
    private static JLabel lblHeader, lblFooter;

    static User user;

    //Constructs User Form

    /**
     *
     * @throws Exception
     */
    public UserLogin() throws Exception {
        frame.setTitle("Virtuoso Cybercafe Manager Login");
        ImageIcon iCafe_logo = new ImageIcon(this.getClass().getResource("/img/iCafe_logo.png"));
        frame.setIconImage(iCafe_logo.getImage());
        try {
            user = new User();
        } catch (Exception ex) {
            Logger.getLogger(UserLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Sets up frame
        frame.setResizable(true);

        //GridBagLayout LayoutManager
        GridBagLayout gbl = new GridBagLayout();
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(0, 0, 0, 0);
        frame.setLayout(gbl);

        //Colors and Fonts
        Color purple = new Color(77, 0, 153);
        Color orange = new Color(255, 128, 0);
        Font titleFont = new Font("Nothing", 1, 20);

        //BorderssetMinimumSize(new Dimension(300,400));
        TitledBorder userTitledBorder = BorderFactory.createTitledBorder("User Login");
        userTitledBorder.setTitleColor(Color.WHITE);
        userTitledBorder.setTitleFont(titleFont);
        TitledBorder registerTitledBorder = BorderFactory.createTitledBorder("Register");
        registerTitledBorder.setTitleColor(Color.WHITE);
        registerTitledBorder.setTitleFont(titleFont);
        Border lineBorder = BorderFactory.createLineBorder(purple);

        //Create JComponents
        headerPanel = new JPanel();
        lblHeader = new JLabel("Virtuoso Internet Cafe");
        loginPanel = new LoginPanel();
        registerPanel = new RegisterPanel();
        footerPanel = new JPanel();
        lblFooter = new JLabel("© 2020 Curtney K. James. All Rights Reserved");

        //login panel
        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.BOTH;
        loginPanel.setBorder(userTitledBorder);
        loginPanel.setBackground(Color.DARK_GRAY);
        //add(loginPanel);
        frame.setContentPane(loginPanel);

        //register panel
        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.gridheight = 1;
        //constraints.insets = new Insets(40, 20,40,20);
        //constraints.ipady = 1000;
        //constraints.ipadx = 20;
        constraints.fill = GridBagConstraints.BOTH;
        registerPanel.setBorder(registerTitledBorder);
        registerPanel.setBackground(Color.DARK_GRAY);
        //add(registerPanel, constraints);

        //Displays login panel
        lblLogin.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                frame.getContentPane().remove(registerPanel);
                frame.setContentPane(loginPanel);
                loginPanel.setVisible(true);
            }

        });

        //Displays register panel
        lblRegister.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                frame.getContentPane().remove(loginPanel);
                frame.setContentPane(registerPanel);
                registerPanel.setVisible(true);
            }

        });

        //Submits login info
        LoginPanel.btnSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //checks credentials if the user is signing in
                if (loginPanel.isVisible()) {
                    user.setUsername(LoginPanel.txtUsername.getText());
                    user.setPassword(String.valueOf(LoginPanel.txtPassword.getPassword()));
                    
                    validateLogin();
                    
                    user.setEmail(emailResults);
                    user.setBalance(balanceResults);
                    

                    if (validateLogin() == true) {
                        //builds a Cybercafe Manager Frame
                        try {
                            
                            new CybercafeManagerFrame();
                            
                            
                        } catch (IOException ex) {
                            Logger.getLogger(UserLogin.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (SQLException ex) {
                            Logger.getLogger(UserLogin.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (Exception ex) {
                            Logger.getLogger(UserLogin.class.getName()).log(Level.SEVERE, null, ex);
                        }

                        //exits frame after sign in
                        frame.dispose();
                    }
                }
            }
        });

        //Adds user to database
        RegisterPanel.btnSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //checks for credentials  in order to register a user
                if (registerPanel.isVisible()) {
                    user.setUsername(RegisterPanel.txtUsername.getText());
                    user.setEmail(RegisterPanel.txtEmail.getText());
                    user.setPassword(String.valueOf(RegisterPanel.txtPassword.getPassword()));
                    user.setBalance(5000);
                    register();
                }
            }
        });

        frame.pack();

        frame.setMinimumSize(new Dimension(300, 400));
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        registerPanel.setVisible(false);
        frame.setVisible(true);
    }

    /**
     * Method that sends a select query to database.It takes the values inputted
     * by user and checks to see if it matches with any element in the database
     *
     * @return loginValid Boolean
     */
    public boolean validateLogin() {

        ResultSet results, results2;

        boolean loginValid = false;

        try {
            //connects to the database

            System.out.println("Connection to the Virtuoso Cybercafe Database was successful " + mySQL_User);

            //Query statement - gets information from database
            Statement statement = connection.createStatement();
            String select = "SELECT `id`, `username`, `email`, `password`,`account` FROM `virtuoso_cybercafe_users` "
                    + "WHERE USERNAME = " + "'" + user.getUsername() + "'"
                    + " 'PASSWORD' = " + "'" + user.getPassword() + "'";
            //+ "SELECT `email` FROM `virtuoso_cybercafe_users` WHERE 'username'= 'q' 'email' = 'q'";

            // String selectEmail = "SELECT `email` FROM `virtuoso_cybercafe_users` WHERE 'username'= 'q' 'email' = 'q'";
            results = statement.executeQuery(select);
            System.out.println(select+" was selected");
            
            //results2 = statement.executeQuery(selectEmail);

            while (results.next()) {
                //emailResults = results2.getString("email");
                int rowCount = 0;

                usernameResults = results.getString("username");
                emailResults = results.getString("email");
                passwordResults = results.getString("password");
                balanceResults = results.getDouble("account");

                rowCount++;
            }
            //lblEmailDisplayed.setText(emailResults);
            System.out.println("balance is " + balanceResults);
            System.out.println("email results are: " + emailResults);

            //Overview.lblEmailDisplayed.setText(emailResults);
            if ((usernameResults.equals(user.getUsername())) && (passwordResults.equals(user.getPassword()))) {
                LoginPanel.lblMessage.setForeground(Color.GREEN);
                LoginPanel.lblMessage.setText("Login valid");
                loginValid = true;

            } else {
                LoginPanel.lblMessage.setForeground(Color.RED);
                LoginPanel.lblMessage.setText("Login NOT valid");
                loginValid = false;
            }

        } catch (SQLException ex) {

            LoginPanel.lblMessage.setForeground(Color.RED);
            LoginPanel.lblMessage.setText("Database Error : " + ex.getMessage());

            System.out.println("Database Error : " + ex.getMessage());
        }

        return loginValid;
    }

    /**
     * this method checks the password String for at least 2 capital letters, 2
     * common letters and 2 digits, if these conditions are met, then the pass
     * is strong enough and the method will return true
     *
     * @param password
     * @return passwordStrong
     */
    public boolean validatePasswordStrength(String password) {

        boolean passwordStrong = false;

        if (passwordStrong == false) {
            //initializes counters
            int upperCaseCount = 0;
            int lowerCaseCount = 0;
            int digitsCount = 0;

            //loops through characters to find the amount of uppercase and lowercase and digits
            for (int i = 0; i < password.length(); i++) {

                if (Character.isUpperCase(password.charAt(i))) {
                    upperCaseCount++;
                }
                if (Character.isLowerCase(password.charAt(i))) {
                    lowerCaseCount++;
                }
                if (Character.isDigit(password.charAt(i))) {
                    digitsCount++;
                }
            }

            //Checks if user's password is valid 
            if ((upperCaseCount >= 2) && (lowerCaseCount >= 2) && (digitsCount >= 2)) {
                System.out.println("Your Password is Strong");
                passwordStrong = true;
            } else {
                System.out.println("Your password is too weak, try again");
                passwordStrong = false;
            }
        }

        return passwordStrong;

    }

    /**
     * Method that sends an update query to database.It takes the values
     * inputted by user and adds it to database as long as the inputs are valid.
     *
     */
    public void register() {
        String insert = "";

        try {
            //connects to the database
            connection = DriverManager.getConnection(jdbcUrl, mySQL_User, mySQL_Password);
            System.out.println("Connection to the Virtuoso Cybercafe Database was successful " + mySQL_User);

            //checks if textfields are empty
            if ((user.getUsername().isEmpty()) || (user.getEmail().isEmpty()) || (user.getPassword().isEmpty())) {
                RegisterPanel.lblMessage.setForeground(Color.RED);
                RegisterPanel.lblMessage.setText("Please fill out all the fields");
            } //            else if(!validatePasswordStrength(password)){
            //                RegisterPanel.lblMessage.setForeground(Color.RED);
            //                RegisterPanel.lblMessage.setText("password must contains atleast 2 "
            //                    + "uppercase,2 lowercase letters and 2 digits.");
            //            }
            else {
                RegisterPanel.lblMessage.setText("");

                //Query statement - gets information from database
                Statement statement = connection.createStatement();
                insert = "INSERT INTO `virtuoso_cybercafe_users"
                        + "` (`id`, `username`, `email`, `password`, `account`) "
                        + "VALUES "
                        + "(NULL," + "'"
                        + user.getUsername() + "'" + ", " + "'"
                        + user.getEmail() + "'" + ", " + "'"
                        + user.getPassword() + "'" + ", " + "'"
                        + user.getBalance() + "')";
                statement.executeUpdate(insert);

                RegisterPanel.lblMessage.setForeground(Color.GREEN);
                RegisterPanel.lblMessage.setText("Register successful");

                System.out.println(insert);
            }

        } catch (SQLException ex) {
            RegisterPanel.lblMessage.setForeground(Color.RED);
            RegisterPanel.lblMessage.setText("Database Error : " + ex.getMessage());
            System.out.println("Database Error : " + ex.getMessage());
        }

    }

    /**
     * main method
     *
     * @param args String[]
     * @throws java.sql.SQLException
     *
     */
    public static void main(String[] args) {
        try {
            UserLogin l = new UserLogin();
        } catch (Exception ex) {
            Logger.getLogger(UserLogin.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
