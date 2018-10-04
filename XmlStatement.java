
package com.oos;

import com.oos.Customer;

import java.util.Enumeration;

public class XmlStatement extends Statement {
    public XmlStatement(Customer cust) {
        super(cust);
    }

    @Override
    public String statement() {
        Enumeration rentals = cust.getRentals().elements();
        String result = "<Header>"  + "Rental Record for<Header/>" + "\n" + "<Name>" + cust.getName() + "<Name/>" + "\n";

        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            // show figures for this rental
            result += "<Title>" + each.getMovieTitle() + "<Title/>" + "\n" +
                    "<AmountCharged>" + String.valueOf(each.calculateCharge()) + "<AmountCharged/>" + "\n";
        }
        // add footer lines
        result += "<TotalAmount>" + String.valueOf(cust.getTotalAmount()) + "<TotalAmount/>" + "\n";
        result += "<RenterPoints>" + String.valueOf(cust.totalFrequentRenterPoints()) +
                "<RenterPoints/>";
        return result;
    }
}

