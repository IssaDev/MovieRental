package com.oos;

import java.util.Enumeration;

public class Rental {
    private Movie _movie;
    private int _daysRented;
    private Customer _customer;
    Price price =  new Price();

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

        double charge = price.rentalPrice(getMoviePrice(),getDaysRented());

        return charge;
    }
    public int getFrequentRenterPoints(){
        int points =price.frequentRenterPoints(getMoviePrice(),getDaysRented());
        return points;
    }

}
