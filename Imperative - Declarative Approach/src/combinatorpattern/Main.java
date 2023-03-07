package combinatorpattern;

import java.time.LocalDate;

import static combinatorpattern.CustomerRegistrationValidator.*;

public class Main {

    public static void main(String[] args) {

        // Combinator pattern allows use to chain functions together

        // Combinator: is a function that may take other function in arguments and returns new functions

        Customer customer = new Customer(
                "Oussama",
                "+2127861767867113571",
                "mail@emmail.com",
                LocalDate.of(2002, 05, 20)
        );

        // System.out.println(new CustomerValidatorService().isValid(customer));

        // IF VALID WE CAN STORE CUSTOMER IN DATA BASE

        // Using Combinator pattern
        ValidationResult result = isEmailValid()
                .and(isAdult())
                .and(isPhoneValid())
                .apply(customer);

        System.out.println(result);

        if (result != ValidationResult.SUCCESS) {
            throw new IllegalStateException(result.name());
        }

    }
}
