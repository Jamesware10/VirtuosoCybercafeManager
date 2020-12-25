/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virtuosocybercafemanager;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Curtney James
 */
public class Date {

    //instance variables(class attributes)

    /**
     *
     */
    public int year,

    /**
     *
     */
    day;

    /**
     *
     */
    public Month month;

    /**
     *
     */
    public LocalDate date;

    /**
     *
     */
    public Date() {
        date = LocalDate.now();
        year = date.getYear();
        month = date.getMonth();
        day = date.getDayOfMonth();

    }

//    
//    public Date(int day, int month, int year) {
//        this.year = year;
//        this.month = month;
//        this.day = day;
//    }

    /**
     *
     * @param day
     */
    public void setDay(int day) {
        this.day = day;
    }

    /**
     *
     * @param year
     */
    public void setYear(int year) {
        this.year = year;

    }
//
//    public void setMonth(int month) {
//        this.month = month;
//        format("%02d", month);
//    }

    /**
     *
     * @return
     */
    public int getYear() {
        return year;
    }

    /**
     *
     * @return
     */
    public Month getMonth() {
        return month;
    }

    /**
     *
     * @return
     */
    public int getDay() {
        return day;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        String date = month.toString()+ " " + day + " "+ year; 
        return date;
    }

//    public void setDate(int year, int month, int day) {
//
//        this.year = year;
//        this.month = month;
//        this.day = day;
//
//    }

}
