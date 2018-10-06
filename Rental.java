package com.oos;

import java.util.Enumeration;

public class Rental {
    private Movie _movie;
    private int _daysRented;
    private Customer _customer;

    public Rental(Movie movie, int daysRented, Customer customer) {
        _movie = movie;
        _daysRented = daysRented;
        _customer = customer;
    }

    public int getDaysRented() {
        return _daysRented;
    }

    public String getMovieTitle(){
        return  _movie.getTitle();
    }

    public int getMoviePrice(){
        return _movie.getPriceCode();
    }

    public double calculateCharge() {
        Price price =  new Price();
        double charge = price.rentalPrice(getMoviePrice(),getDaysRented());

        return charge;
    }
    public int getFrequentRenterPoints(){
        if ((getMoviePrice() == Movie.NEW_RELEASE) &&
                (getDaysRented() > 1)) {
            return  2;
        }
        return 0;
    }

}
