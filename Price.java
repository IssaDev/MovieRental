package com.oos;

public abstract class Price {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    private int priceCode;
    private int daysRented;

    public Price() {

    }

   public abstract double rentalPrice(int daysRented);

    public int frequentRenterPoints(int daysRented) {
        return 0;
    }
}
