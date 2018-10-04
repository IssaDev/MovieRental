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

    public Vector getRentals(){
        return _rentals;
    }

    public String getName() {
        return _name;
    }

    public double getTotalAmount() {
        double totalAmount = 0;
        Enumeration rentals =getRentals().elements();
        while (rentals.hasMoreElements()) {
            Rental each = (Rental)rentals.nextElement();
            totalAmount += each.calculateCharge();
        }
        return totalAmount;
    }

    int totalFrequentRenterPoints(){
        int frequentRenterPoints =1;
        Enumeration rentals =getRentals().elements();
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            frequentRenterPoints += each.getFrequentRenterPoints();
        }
        return frequentRenterPoints;

    }

}
