package Entities;

public class OrderItem {
    private Integer quantity;
    private Product product;

    public OrderItem(){
    }

    public OrderItem(Product product, Integer quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Double subTotal(){
        return product.getPrice() * quantity;
    }

    @Override
    public String toString() {
        return product.toString() +
                ", Quantity= " + quantity + "$" + subTotal();
    }
}