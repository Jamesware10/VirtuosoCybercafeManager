/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virtuosocybercafemanager;

/**
 *
 * @author Curtney James
 * @deprecated 
 */
public class Account {

    //Declaration of instance variables

    /**
     *
     */
    public double balance;
    //public Date dateCreated;

    //No argument Constructor

    /**
     *
     */
    public Account(double balance) {
         this.balance = balance;
        //dateCreated = new Date();
    }




    //setter method for balance

    /**
     *
     * @param balance
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    //setter method for date created

    /**
     *
     * @param dateCreated
     */
    


    /**
     *
     * @return
     */
    public double getBalance() {
        System.out.println("Your balance is: ");
        return balance;
    }

    // getter method for date created 
//    public Date getDateCreated() {
//        return dateCreated;
//    }

   

}
