/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virtuosocybercafemanager;

import java.awt.GridBagConstraints;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Curtney James
 */
public class User extends Account {

    //Field variables

    /**
     *
     */
    public String password;

    /**
     *
     */
    public String username;

    /**
     *
     */
    public String email;

    /**
     *
     */
    public Account account;

    //DATABASE CONNECTION
    //Query results variables
    String usernameResults, emailResults, passwordResults;

    //Connects to database
    Connection connection = null;    //creates a connection

    //Specifies the location of the database
    String jdbcUrl = "jdbc:mysql://localhost:3308/virtuoso_cybercafe_db";

    //Login credentials to database
    String mySQL_User = "james";
    String mySQL_Password = "james";
    
    

    /**
     * Creates user
     * @throws java.sql.SQLException
     * 
     */
    public User(){
        try {
            username = "";
            password = "";
            email = "";
            account = new Account();
            
            connection = DriverManager.getConnection(jdbcUrl, mySQL_User, mySQL_Password);
            
            //System.out.println("Database Error : " + e.getMessage());
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    //<--------------------------------GETTERS AND SETTERS----------------------------->

    /**
     *
     * @return
     */
    public String getUsername() {
        return username;
    }

    /**
     *
     * @return
     */
    public String getEmail() {

        return email;
    }

    /**
     *
     * @return
     */
    public String getPassword() {
        return password;
    }

    /**
     *
     * @return
     */
    public Account getAccount() {
        return account;
    }

    /**
     *
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     *
     * @param account
     */
    public void setAccount(Account account) {
        this.account = account;
    }

    /**
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
    
    private GridBagConstraints createGbc(int x, int y) {
      GridBagConstraints gbc = new GridBagConstraints();
      gbc.gridx = x;
      gbc.gridy = y;
      gbc.gridwidth = 1;
      gbc.gridheight = 1;

      gbc.anchor = (x == 0) ? GridBagConstraints.WEST : GridBagConstraints.EAST;
      gbc.fill = (x == 0) ? GridBagConstraints.BOTH
            : GridBagConstraints.HORIZONTAL;

      //gbc.insets = (x == 0) ? /*WEST_INSETS*/ : /*EAST_INSETS*/;
      gbc.weightx = (x == 0) ? 0.1 : 1.0;
      gbc.weighty = 1.0;
      return gbc;
   }

}
