package com.oos;

public class Price {
    private int priceCode;
    private int daysRented;

    public Price() {

    }
    public double rentalPrice(int priceCode, int daysRented){
        double charge = 0;
        switch (priceCode) {
            case Movie.REGULAR:
                charge += 2;
                if (daysRented > 2) {
                    charge += (daysRented - 2) * 1.5;
                }
                break;
            case Movie.NEW_RELEASE:
                charge += daysRented * 3;
                break;
            case Movie.CHILDRENS:
                charge += 1.5;
                if (daysRented > 3) {
                    charge += (daysRented - 3) * 1.5;
                }
                break;
        }

        return 0.0;
    }
}
