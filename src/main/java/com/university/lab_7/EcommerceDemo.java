package com.university.lab_7;
import com.university.lab_7.exceptions.OutOfStockException;
import com.university.lab_5.NegativeAmountException;
import com.university.lab_7.entities.*;


public class EcommerceDemo {
        public static void main(String[] main) throws OutOfStockException, NegativeAmountException {
        ECommercePlatform platform = new ECommercePlatform();
        User user1 = platform.addUser(1, "Paul Davies", 1000);
        User user2 = platform.addUser(2, "Kat Morgan", 1000);
        User user3 = platform.addUser(3, "Victor Blanco", 1000);
        // platform.addUser(user1);
        // platform.addUser(user2);
        // platform.addUser(user3);

        Product product1 = new Product(1, "Headphones", 100.0, 30);
        Product product2 = new Product(2, "Microphone", 55.0, 20);
        Product product3 = new Product(3, "Laptop", 800.0, 15);
        platform.addProduct(product1);
        platform.addProduct(product2);
        platform.addProduct(product3);

        System.out.println("Available Products: ");
        platform.displayAvailableProducts();

        user1.addToCart(product1, 3);
        user1.addToCart(product2, 2);
        user2.addToCart(product3, 5);
        user3.addToCart(product3, 4);

        user3.modifyCart(product3, 2);
        user2.removeFromCart(product3);

        platform.createOrder(user1);
        platform.createOrder(user2);
        platform.createOrder(user3);

        platform.updateProductStock(3, 12);

        System.out.println("Available Products: ");
        platform.displayAvailableProducts();

        System.out.println("Users: ");
        platform.displayUsers();

        System.out.println("Orders: ");
        platform.displayOrders();

        platform.displayProductsByName();
        platform.displayProductsByStock();
        platform.displayProductsByPrice();
        platform.displaySortedAvailableProducts();

        platform.updateProductStock(2, -2);
        System.out.println("Available Products: ");
        platform.displayAvailableProducts();
        platform.updateProductStock(4, 10);
        System.out.println("Available Products: ");
        platform.displayAvailableProducts();
        platform.updateProductStock(3, 15);
        System.out.println("Available Products: ");
        platform.displayAvailableProducts();

    }

}
