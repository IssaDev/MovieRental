package com.oos;

public class PriceFactory {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    public Price setMoviePrice(int priceCode){
        Price _price = null;
        switch (priceCode){
            case REGULAR:
                _price =new RegularPrice();
                break;
            case NEW_RELEASE:
                _price = new NewReleasePrice();
                break;
            case CHILDRENS:
                _price = new ChildrensPrice();
                break;
        }
        return _price;
    }
}
