package com.oos;

import java.util.ArrayList;
import java.util.List;


public class Customer {
    private String _name;
    private ArrayList<Rental> _rentals = new ArrayList<>();
    private int _age;

    public Customer(String name, int age) {
        _age = age;
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
        int frequentRenterPoints = 1;
        List<Rental> rentals = getRentals();
        for (Rental each : rentals) {
            frequentRenterPoints += each.getFrequentRenterPoints();
        }
        frequentRenterPoints = doublePoints(frequentRenterPoints);
        return frequentRenterPoints;

    }
    int doublePoints(int freqPoints){
        List<Rental> rentals = getRentals();
        if(_age >17 && _age <23){
            for(Rental each : rentals){
                if (each.getMoviePrice() == 1){
                    freqPoints = freqPoints *2;
                    break;
                }
            }
        }
        return  freqPoints;
    }

}
