package com.oos;

public class Main {

    public static void main(String[] args) {
	Customer newCust = new Customer("Darryl Jones");
	Movie newMovie = new Movie("Life of Pi", 2);
	Rental newRental = new Rental(newMovie,3);
	newCust.addRental(newRental);
	String res = newCust.statement();
		System.out.println(res);
    }
}
