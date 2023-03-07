package funtionalinterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {

        // Normal JAVA Function
        Customer ot = new Customer("Oussama", "7777777");
        greetCustomer(ot);
        greetCustomerBiC(ot, false);

        // Consumer Functional interface
        greetCustomerConsumer.accept(ot);
        greetCustomerBiConsumer.accept(ot,false);
    }

    // Consumer Functional interface
    // It takes one argument and returns nothing (void function)
    static Consumer<Customer> greetCustomerConsumer = customer ->
            System.out.println("Hello "+customer.customerName +
            " Please register your phone number "+customer.customerPhoneNumber);

    // Let's use BiConsumer
    static BiConsumer<Customer, Boolean> greetCustomerBiConsumer = (customer, showPhoneNumber) ->
            System.out.println("Hello "+customer.customerName +" Please register your phone number "
                    +(showPhoneNumber ? customer.customerPhoneNumber : "**********"));

    static void greetCustomer(Customer customer) {
        System.out.println("Hello "+customer.customerName +
                " Please register your phone number "+customer.customerPhoneNumber);
    }
    static void greetCustomerBiC (Customer customer, boolean showPhoneNumber) {
        System.out.println("Hello "+customer.customerName +" Please register your phone number "
                +(showPhoneNumber ? customer.customerPhoneNumber : "**********"));
    }

   static class Customer {
        private final String customerName;
        private final String customerPhoneNumber;

       Customer(String customerName, String customerPhoneNumber) {
           this.customerName = customerName;
           this.customerPhoneNumber = customerPhoneNumber;
       }

   }
}
