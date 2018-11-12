package com.oos;

public class RenterPoints implements   FRPStrategy {
    public int frequentRenterPoints(int daysRented){
        if(daysRented > 1){
            return 2;
        }
        return 0;
    }
}
