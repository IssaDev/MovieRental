package com.oos;

public class Main {

    public static void main(String[] args) {
        Customer newCust = new Customer("Darryl Jones", 20);
        Movie newMovie = new Movie("Life of Pi", 2);
        Movie mov = new Movie("Gretta Payne", 1);
        Rental rent = new Rental(mov, 5);
        Rental newRental = new Rental(newMovie, 3);
        Statement custStatement = new Statement(newCust);
        newCust.addRental(newRental);
        newCust.addRental(rent);
        //String res = custStatement.statement();
        XmlStatement state = new XmlStatement(newCust);
        String res = state.statement();
        System.out.println(res);
    }
}
