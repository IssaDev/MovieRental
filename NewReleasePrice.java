package com.oos;

public class NewReleasePrice extends Price {
    public NewReleasePrice(){
        strategy = new RenterPoints();
    }
    @Override
    public double rentalPrice(int daysRented) {
        double charge =0;
         charge += daysRented * 3;
        return charge;
    }

    //@Override
   /* public int frequentRenterPoints(int daysRented) {
        if (daysRented > 1) {
            return 2;
        }
        return 0;
    }*/
}
