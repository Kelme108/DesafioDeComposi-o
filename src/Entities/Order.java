package Entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import Entities.OrderItem;

public class Order {
    private Date moment;
    private OrderStatus status;

    private List<OrderItem> itens = new ArrayList<>();

    public Order(){
    }

    public Order(Date moment, OrderStatus status) {
        this.moment = moment;
        this.status = status;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public List<OrderItem> getItens() {
        return itens;
    }
    public void addItem(OrderItem item){
        itens.add(item);
    }
    public void removeItem(OrderItem item){
        itens.remove(item);
    }
    public Double total() {
        double total = 0.0;
        for (OrderItem i : itens) {
             total = total + i.subTotal();
        }
        return total;
    }
}
