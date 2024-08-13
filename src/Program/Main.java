package Program;

import Entities.*;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Order order = new Order();

        // Registrando o cliente do pedido.

        System.out.print("Enter cliente data: \n Name: ");
        String nameClient = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.println("Birth date (DD/MM/YYYY): ");
        String birthDate = sc.nextLine();
        Client client1 = new Client(nameClient, email, birthDate, order);

        // Registrar os pedidos do cliente

        System.out.println("Enter order data: ");
        System.out.println("Status ");
        String statusString = sc.nextLine().toUpperCase();
        OrderStatus status;
        System.out.print("How many items to this order? ");
        int n = sc.nextInt();
        sc.nextLine();

        // Loop para registro dos pedidos
        for (int i = 0 ; i < n ; i++){
            System.out.println("Enter # " + (i+1) + "item data:");
            System.out.print("Product name: ");
            String nameProduct = sc.nextLine();
            System.out.print("Product price: ");
            Double price = sc.nextDouble();
            System.out.print("Quantity: ");
            Integer quantity = sc.nextInt();
            sc.nextLine();

            Product product = new Product(nameProduct, price);
            OrderItem orderItem = new OrderItem(product, quantity);
            order.addItem(orderItem);
        }

        // Obtendo o instante atual
        Instant date = Instant.now();

        // Convertendo Instant para ZonedDateTime no fuso horário do sistema
        ZonedDateTime zonedDateTime = date.atZone(ZoneId.systemDefault());

        // Formatando ZonedDateTime para uma string legível
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDate = zonedDateTime.format(formatter);

        // Imprimir na tela o momento do pedido, o status e os dados do cliente.
        System.out.println("ORDER SUMMARY:");
        System.out.println("Order moment: " + formattedDate);
        System.out.println("Order Status: " + statusString);

        // Após isso impressão dos pedidos e seus valores.

        System.out.println("Order items:");
        for (OrderItem item : order.getItens()) {
            System.out.println(item);
        }

        System.out.println("Total price: $" + order.total());

        sc.close();
    }
}