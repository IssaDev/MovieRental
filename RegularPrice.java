package com.oos;

public class RegularPrice extends Price {
    public RegularPrice(){
        strategy = new NoRenterPoints();
    }
    @Override
    public double rentalPrice(int daysRented) {
        double charge = 2;
        if (daysRented > 2) {
            charge += (daysRented - 2) * 1.5;
        }
        return charge;
    }
}
