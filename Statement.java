package com.oos;

import java.util.Enumeration;
import java.util.Vector;

public class Statement {
    private Vector _rentals = new Vector();
    protected  Customer cust;
    public  Statement(Customer cust){
        this.cust = cust;
    }


    public String statement() {
        Enumeration rentals = cust.getRentals().elements();
        String result = "Rental Record for " + cust.getName() + "\n";

        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            // show figures for this rental
            result += "\t" + each.getMovieTitle() +
                    "\t" + String.valueOf(each.calculateCharge()) + "\n";
        }
        // add footer lines
        result += "Amount owed is " + String.valueOf(cust.getTotalAmount()) + "\n";
        result += "You earned " + String.valueOf(cust.totalFrequentRenterPoints()) +
                " frequent renter points";
        return result;
    }



}
