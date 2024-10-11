package edu.fra.uas.classes;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    public static int numberOfCustomers;

    private static List<Customer> customers = new ArrayList<Customer>();

    private String name;
    private String address;

    private Customer(String name, String address) {
        this.name = name;
        this.address = address;
        numberOfCustomers++;
    }

    public static Customer createCustomer(String name, String address) {
        Customer customer = new Customer(name, address);
        customers.add(customer);
        return customer;
    }

    public static Customer findCustomer(int number) {
        if (number < 0 || number >= numberOfCustomers) {
            return null;
        }
        return customers.get(number);
    }

    public void changeAddress(String address) {
        this.address = address;
    }

    public String toString() {
        return name + ", " + address;
    }

}
