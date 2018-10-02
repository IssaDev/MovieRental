package com.oos;

public class Rental {
    private Movie _movie;
    private int _daysRented;

    public Rental(Movie movie, int daysRented) {
        _movie = movie;
        _daysRented = daysRented;
    }

    public int getDaysRented() {
        return _daysRented;
    }

    public Movie getMovie() {
        return _movie;
    }

    public double calculateCharge() {
        double charge = 0;
        // determine amounts for each line
        switch (getMovie().getPriceCode()) {
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
}
