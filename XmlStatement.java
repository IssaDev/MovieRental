package com.oos;

import java.util.List;

public class XmlStatement extends Statement {
    public XmlStatement(Customer cust) {
        super(cust);
    }

    @Override
    public String statement() {
        List<Rental> rentals = cust.getRentals();
        String result = "<Header>" + "Rental Record for<Header/>" + "\n" + "<Name>" + cust.getName() + "<Name/>" + "\n";

        for (Rental each : rentals) {
            // show figures for this rental
            result += "<Movies>" + "\n" + "\t" + "<Title>" + each.getMovieTitle() + "<Title/>" + "\n" +
                    "\t" + "<AmountCharged>" + String.valueOf(each.calculateCharge()) + "<AmountCharged/>" + "\n" + "<Movies/> " + "\n";
        }

        // add footer lines
        result += "<TotalAmount>" + String.valueOf(cust.getTotalAmount()) + "<TotalAmount/>" + "\n";
        result += "<RenterPoints>" + String.valueOf(cust.totalFrequentRenterPoints()) +
                "<RenterPoints/>";
        return result;
    }
}

