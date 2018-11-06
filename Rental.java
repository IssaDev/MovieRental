package com.oos;


public class Rental {
    private Price price;

    private Movie _movie;
    private int _daysRented;
    private  int priceCode;
    PriceFactory priceFactory = new PriceFactory();

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
        priceCode = getMoviePrice();
        price = priceFactory.setMoviePrice(priceCode);
        return price.rentalPrice(getDaysRented());
    }

    public int getFrequentRenterPoints() {
        priceCode = getMoviePrice();
        price = priceFactory.setMoviePrice(priceCode);
        return price.frequentRenterPoints(getDaysRented());
    }

}
