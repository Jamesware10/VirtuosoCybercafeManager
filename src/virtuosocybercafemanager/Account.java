/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virtuosocybercafemanager;

/**
 *
 * @author Curtney James
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
    public Account() {
        balance = 5000;
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
    public void setDateCreated(Date dateCreated) {

        //this.dateCreated = dateCreated;

    }

    //getter method for balance

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

    //method for withdrawl

    /**
     *
     * @param amount
     */
    public void withdraw(double amount) {

        balance = balance - amount;

        System.out.println("Your withdrawl amount is: " + amount
                + "\nYour new balance is: " + balance);

    }

    //method for deposit 

    /**
     *
     * @param amount
     */
    public void deposit(double amount) {

        balance = balance + amount;

        System.out.println("Your deposit amount is: " + amount
                + "\nYour new balance is: " + balance);
    }

}
