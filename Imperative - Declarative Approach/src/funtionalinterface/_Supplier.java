package funtionalinterface;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {

    public static void main(String[] args) {

        System.out.println(getDBConnectionUrl());
        System.out.println(getDBConnectionUrlSupplier.get());
        System.out.println(getDBConnectionUrlsSupplier.get());
    }

    static String getDBConnectionUrl() {
        return "jdbc://localhost:3030/users";
    }

    // Using Supplier
    static Supplier<String> getDBConnectionUrlSupplier = ()
            -> "jdbc://localhost:3030/users";

    // Using Supplier & List
    static Supplier<List<String>> getDBConnectionUrlsSupplier = ()
            -> List.of(
                    "jdbc://localhost:3030/users",
                    "jdbc://localhost:3030/products");
}
