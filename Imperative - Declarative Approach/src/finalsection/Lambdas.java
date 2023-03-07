package finalsection;

import java.util.function.BiFunction;

public class Lambdas {

    public static void main(String[] args) {

        Integer count = null;

        // We can't use null with primitives
        int counter = 0;

        // That's why we don't use primitives in our functional code
        // So we can use or return null as we want

        BiFunction<String, Integer, String> showUpperCase = (name, age) -> {
            if (name.isBlank()) throw new IllegalStateException("");
            System.out.println(age);
            return name.toUpperCase();
        };

        System.out.println(showUpperCase.apply("OUssama", null));

    }

}
