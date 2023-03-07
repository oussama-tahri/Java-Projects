package funtionalinterface;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class _Predicate {

    public static void main(String[] args) {

        System.out.println("\nWithout Predicate:");
        System.out.println(isPhoneNumberValid("070809050406"));
        System.out.println(isPhoneNumberValid("070809056"));
        System.out.println(isPhoneNumberValid("090154151006"));

        System.out.println("\n*********************");

        System.out.println("\nWith Predicate:");
        System.out.println(isPhoneNumberValidPredicate.test("070809050406"));
        System.out.println(isPhoneNumberValidPredicate.test("070809056"));
        System.out.println(isPhoneNumberValidPredicate.test("090154151006"));

        System.out.println("\n*********************");

        System.out.println("is Phone Number valid AND contains 7 = "
                +isPhoneNumberValidPredicate.and(containsNumber7).test("070809056"));

        System.out.println("is Phone Number valid OR contains 7 = "
                +isPhoneNumberValidPredicate.or(containsNumber7).test("070809056"));

        System.out.println("is equal = "+isEqualBiPredicate.test(20,50));

    }

    // Predicate takes one argument & return boolean
    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber ->
            phoneNumber.startsWith("07") && phoneNumber.length() == 12;

    static Predicate<String> containsNumber7 = phoneNumber ->
            phoneNumber.contains("7");


    static BiPredicate<Integer, Integer> isEqualBiPredicate = (number1, number2) ->
             number1.toString().equals(number2.toString());

    // Normal function
    static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("07") && phoneNumber.length() == 12;
    }
}
