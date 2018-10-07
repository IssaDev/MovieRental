package com.oos;

import java.util.List;

public class Statement {
    protected Customer cust;

    public Statement(Customer cust) {
        this.cust = cust;
    }


    public String statement() {
        List<Rental> rentals = cust.getRentals();
        String result = "Rental Record for " + cust.getName() + "\n";

        for (Rental each : rentals) {
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
