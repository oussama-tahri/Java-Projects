package optionals;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        String email = "tahrioussama.ot@gmail.com";

        Optional.ofNullable(null)
                .ifPresentOrElse(email1 -> System.out.println("Your email is -> " +email1) ,
                        () -> System.out.println("Email not found"));

        System.out.println("********************************************");

        List<String> first = Optional.of(email)
                .stream().collect(Collectors.toList());
        System.out.println(first);

    }
}
