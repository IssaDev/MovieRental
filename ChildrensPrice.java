package com.oos;

public class ChildrensPrice extends Price {
    public ChildrensPrice(){
        strategy = new NoRenterPoints();
    }
    @Override
    public double rentalPrice(int daysRented) {
        double charge = 1.5;
        if (daysRented > 3) {
            charge += (daysRented - 3) * 1.5;
        }

        return charge;
    }
}
