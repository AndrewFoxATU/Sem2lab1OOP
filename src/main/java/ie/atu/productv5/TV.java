package ie.atu.productv5;

import ie.atu.productv3.Product;

import java.text.NumberFormat;

public class TV extends Product {


    private String ScreenSize;
    private String code;
    private String description;
    private double price;
    private String Manu;
    protected static int count = 0;

    public TV() {
        description = "";
        code = "";
        ScreenSize = "";
        price = 0.0;
        Manu = "";
        count++;
    }

    public void setManu(String Manu) {
        this.Manu = Manu;
    }

    public String getManu() {
        return Manu;
    }

    public void setScreenSize(String ScreenSize) {
        this.ScreenSize = ScreenSize;
    }

    public String getScreenSize() {
        return ScreenSize;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getPriceFormatted() {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(price);
    }

    public String toString() {
        return description + " by " + ScreenSize;
    }

    public static int getCount() {
        return count;
    }
}
