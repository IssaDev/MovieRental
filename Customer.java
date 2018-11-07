package com.oos;

import java.util.ArrayList;
import java.util.List;


public class Customer {
    private String _name;
    private ArrayList<Rental> _rentals = new ArrayList<>();

    public Customer(String name) {
        _name = name;
    }

    public void addRental(Rental arg) {
        _rentals.add(arg);
    }

    public List<Rental> getRentals() {
        return _rentals;
    }

    public String getName() {
        return _name;
    }

    public double getTotalAmount() {//Rental class
        double totalAmount = 0;
        List<Rental> rentals = getRentals();
        for (Rental each : rentals) {
            totalAmount += each.calculateCharge();
        }
        return totalAmount;
    }

    int totalFrequentRenterPoints() {
        int frequentRenterPoints = 0;
        List<Rental> rentals = getRentals();
        for (Rental each : rentals) {
            frequentRenterPoints += each.getFrequentRenterPoints();
        }
        return frequentRenterPoints;

    }

}
