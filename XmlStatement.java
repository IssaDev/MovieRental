/*
package com.oos;

import java.util.Enumeration;

public class XmlStatement extends Statement {
    public XmlStatement(Customer cust) {
        super(cust);
    }

    @Override
    public String statement() {
        Enumeration rentals = cust.getRentals().elements();
        String result = "Rental Record for " + cust.getName() + "\n";

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
}
*/
