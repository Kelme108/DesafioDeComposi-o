package Entities;

import java.util.Date;

public class Client {
    private String name;
    private String email;
    private String birthDate;
    private Order order;

    public Client(){
    }

    public Client(String name, String email, String birthDate, Order order) {
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
        this.order = order;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public Order getOrder() {
        return order;
    }
}
