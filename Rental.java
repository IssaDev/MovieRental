package com.oos;


public class Rental {
    private Price price;

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

    public Price getMoviePrice() {
        return _movie.getPriceCode();
    }

    public double calculateCharge() {
        price = getMoviePrice();
        return price.rentalPrice(getDaysRented());
    }

    public int getFrequentRenterPoints() {
        price = getMoviePrice();
        return price.frequentRenterPoints(getDaysRented());
    }

}
