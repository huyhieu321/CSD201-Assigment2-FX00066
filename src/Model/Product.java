package Model;

import java.io.Serializable;

public class Product implements Serializable {
    String productID;
    String productTitle;
    int productQuantity;
    double productPrice;

    public Product(String bCode, String title, int quantity, double price) {
        this.productID = bCode;
        this.productTitle = title;
        this.productPrice = price;
        this.productQuantity = quantity;
    }

    public Product() {

    }

    @Override
    public String toString() {
        return productID + "\t\t" + productTitle + "\t\t" + productQuantity + "\t\t" + productPrice;
    }

}
