package com.oos;

import java.util.Enumeration;
import java.util.Vector;

public class Customer {
    private String _name;
    private Vector _rentals = new Vector();

    public Customer(String name) {
        _name = name;
    }

    public void addRental(Rental arg) {
        _rentals.addElement(arg);
    }

    public String getName() {
        return _name;
    }

    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Enumeration rentals = _rentals.elements();
        String result = "Rental Record for " + getName() + "\n";

        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            // show figures for this rental
            result += "\t" + each.getMovie().getTitle() +
                    "\t" + String.valueOf(each.calculateCharge()) + "\n";
        }

        // add footer lines
        result += "Amount owed is " + String.valueOf(getTotalAmount()) + "\n";
        result += "You earned " + String.valueOf(totalFrequentRenterPoints()) +
                " frequent renter points";
        return result;
    }

     double getTotalAmount() {
         double totalAmount = 0;
         Enumeration rentals = _rentals.elements();
         while (rentals.hasMoreElements()) {
             Rental each = (Rental) rentals.nextElement();
             totalAmount += each.calculateCharge();
         }
        return totalAmount;
    }

    int totalFrequentRenterPoints(){
        int frequentRenterPoints =1;
        Enumeration rentals = _rentals.elements();
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            frequentRenterPoints += each.getFrequentRenterPoints();
        }
        return frequentRenterPoints;

    }


}
