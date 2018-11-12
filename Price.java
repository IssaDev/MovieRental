package com.oos;

public abstract class Price {
    private int priceCode;
    //private int daysRented;
    public FRPStrategy strategy;

    public Price() {

    }

   public abstract double rentalPrice(int daysRented);

    /*public int frequentRenterPoints(int daysRented) {
        return 0;
    }*/
    public int getFrequentRenterPoints(int daysRented){
        return strategy.frequentRenterPoints(daysRented);
    }
}
