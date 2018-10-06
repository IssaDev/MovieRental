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

    public Movie getMovie() {
        return _movie;
    }
    public String getMovieTitle(){
        return  _movie.getTitle();
    }
    public int getMoviePrice(){
        return _movie.getPriceCode();
    }
    public double calculateCharge() {
        double charge = 0;
        // determine amounts for each line
        switch (getMoviePrice()) {
            case Movie.REGULAR:
                charge += 2;
                if (getDaysRented() > 2) {
                    charge += (getDaysRented() - 2) * 1.5;
                }
                break;
            case Movie.NEW_RELEASE:
                charge += getDaysRented() * 3;
                break;
            case Movie.CHILDRENS:
                charge += 1.5;
                if (getDaysRented() > 3) {
                    charge += (getDaysRented() - 3) * 1.5;
                }
                break;
        }
        return charge;
    }
    public int getFrequentRenterPoints(){
        if ((getMovie().getPriceCode() == Movie.NEW_RELEASE) &&
                (getDaysRented() > 1)) {
            return  2;
        }
        return 0;
    }

}
