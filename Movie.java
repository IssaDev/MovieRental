package com.oos;

public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    private String _title;
    private int _priceCode;
    private Price _price;

    public Movie(String title, int priceCode) {
        _title = title;
        //setPriceCode(priceCode);
        _priceCode = priceCode;
    }

    public int getPriceCode() {
        return _priceCode;
    }

   /* public void setPriceCode(int arg) {
        switch (arg){
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
    }*/

    public String getTitle() {
        return _title;
    }
}
