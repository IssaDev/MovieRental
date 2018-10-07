package com.oos;

public class Rental {
    Price price = new Price();
    private Movie _movie;
    private int _daysRented;

    public Rental(Movie movie, int daysRented) {
        _movie = movie;
        _daysRented = daysRented;

    }

    public int getDaysRented() {
        return _daysRented;
    }

    public String getMovieTitle() {
        return _movie.getTitle();
    }

    public int getMoviePrice() {
        return _movie.getPriceCode();
    }

    public double calculateCharge() {
        return price.rentalPrice(getMoviePrice(), getDaysRented());
    }

    public int getFrequentRenterPoints() {
        return price.frequentRenterPoints(getMoviePrice(), getDaysRented());
    }

}
