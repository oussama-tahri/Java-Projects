package finalsection;

import java.util.function.Consumer;

public class Callbacks {

    public static void main(String[] args) {

        hello("Oussama", "Tahri", firstname -> {
            System.out.println("No lastname provided for: "+firstname);
        });

        System.out.println("\n*******************\n");

        hello2("Oussama",
                "Tahri",
                () -> System.out.println("No lastname provided"));
    }

    //                      We're going to use Callback as like JavaScript

    // First we're going to use Consumer
    static void hello (String firstname, String lastname, Consumer<String> callback) {
        System.out.println(firstname);
        if (lastname != null) {
            System.out.println(lastname);
        }
        else {
            callback.accept(firstname);
        }
    }

    // Now we're going to use Runnable
    static void hello2 (String firstname, String lastname, Runnable callback) {
        System.out.println(firstname);
        if (lastname != null){
            System.out.println(lastname);
        }
        else {
            callback.run();
        }
    }
}
