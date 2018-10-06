package com.oos;

public class Price {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    private int priceCode;
    private int daysRented;

    public Price() {

    }
    public double rentalPrice(int priceCode, int daysRented){
        double charge = 0;
        switch (priceCode) {
            case REGULAR:
                charge += 2;
                if (daysRented > 2) {
                    charge += (daysRented - 2) * 1.5;
                }
                break;
            case NEW_RELEASE:
                charge += daysRented * 3;
                break;
            case CHILDRENS:
                charge += 1.5;
                if (daysRented > 3) {
                    charge += (daysRented - 3) * 1.5;
                }
                break;
        }

        return charge;
    }

    public int frequentRenterPoints(int priceCode,int daysRented){
        if ((priceCode == Movie.NEW_RELEASE) &&
                (daysRented > 1)) {
            return  2;
        }
        return 0;
    }
}
