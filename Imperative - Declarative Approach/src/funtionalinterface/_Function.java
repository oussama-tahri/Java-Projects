package funtionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {

    public static void main(String[] args) {
        int increment = incrementByOne(6);
        System.out.println(increment);

        //                                      Function :

        // Function <T, R> : Represents a function that accepts one argument and produces a result
        // 1st way to use Function is using it directly
        // We choose the argument's type and return type
        // (number -> number +1;) -- (number) represents the argument and (number + 1) is the return
        Function<Integer, Integer> incrementByOneFunction = number -> number + 1;
        Integer increment2 = incrementByOneFunction.apply(21);
        System.out.println(increment2);


        // We are going to call incrementByOneFunction2 and extract it to variable using (Ctrl + Alt + V)
        Integer increment3 = incrementByOneFunction2.apply(10);
        System.out.println(increment3);

        // Here we're going to call "multiplyBy10Function" and use it
        Integer multiply = multiplyBy10Function.apply(increment3);
        System.out.println(multiply);


        // (2nd method) creating multiplyBy10Function inside the main
        Function<Integer, Integer> multiplyBy10Function2 = number -> number * 10;
        // We're going to use .andThen this time
        Function<Integer, Integer> add1AndThenMultiplyBy10 = incrementByOneFunction.andThen(multiplyBy10Function2);
        System.out.println(add1AndThenMultiplyBy10.apply(19));


        //                                     BiFunction :

        System.out.println(incrementByOneAndMultiplyBy(4,100));
        Integer incrementAndMultiply = incrementByOneAndMultiplyByFunction.apply(6, 100);
        System.out.println(incrementAndMultiply);

    }

    // 2nd way of Function (outside the main)
    static Function<Integer, Integer> incrementByOneFunction2 = number -> number + 1;

    // (1st method) We're going to create a Function that multiply the argument by 10
    static Function<Integer, Integer> multiplyBy10Function = number -> number * 10;

    // 1st I'm going to create a method that accepts one argument and return a result
    static int incrementByOne(int number) {
        return number + 1;
    }


    // BiFunction <T, R> : Represents a function that accepts two arguments and produces a result
    // Let's First use a simple method
    static int incrementByOneAndMultiplyBy(int numberToIncrementByOne, int numberToMultiplyBy) {
        return (numberToIncrementByOne + 1) * numberToMultiplyBy;
    }

    // And now we will make it using a BiFunction
    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyByFunction =
            (numberToIncrementByOne, numberToMultiply) -> (numberToIncrementByOne + 1) * numberToMultiply;


}