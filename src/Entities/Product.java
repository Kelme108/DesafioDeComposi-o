package Entities;

public class Product {
    private String nameProduct;
    private Double price;

    public Product(){
    }

    public Product(String nameProduct, Double price) {
        this.nameProduct = nameProduct;
        this.price = price;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String name) {
        this.nameProduct = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return  nameProduct + ", $" + price;
    }
}
