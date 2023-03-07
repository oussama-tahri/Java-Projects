package imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;


import static imperative.Main.Gender.*;

public class Main {

    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Oussama", MALE),
                new Person("Alice", FEMALE),
                new Person("Marouane", MALE),
                new Person("Georgi", FEMALE),
                new Person("Aiman", MALE),
                new Person("Marta", FEMALE),
                new Person("Yassine", MALE)
        );


        System.out.println("\n// Imperative Approach:");
        // Imperative Approach
        List<Person> females = new ArrayList<>();
        for (Person person: people) {
            if(FEMALE.equals(person.gender)) {
                females.add(person);
            }
        }
        for (Person female : females) {
            System.out.println(female);

        }





        System.out.println(" \n// Declarative Approach:");
        // Declarative Approach
        // Without stocking in a list
        people.stream()
                .filter(personF -> FEMALE.equals(personF.gender))
                .forEach(System.out::println);

        // Using List "females2"
        System.out.println(" \n// Declarative Approach: (List of females2)");
        // The first way without extracting it to variable

        // ----------------------------------------------------------
        // people.stream()
        //      .filter(person -> FEMALE.equals(person.gender))
        //      .collect(Collectors.toList());
        // ----------------------------------------------------------


        // Returns true if person is FEMALE
        Predicate<Person> personPredicate = person -> FEMALE.equals(person.gender);

        // Extract to variable ----> 1st step select the code from people.stream() -- to -- .collect(Collectors.toList());
        // 2nd step (Ctrl + Alt + V) identified by "females2"
        List<Person> females2 = people.stream()
                // We can use .filter as like the previous example
                // Or Predicate (to use Predicate we should Extract -> Variable)
                // Select ("person -> FEMALE.equals(person.gender)")  and  (Ctrl + Alt + V)
                .filter(personPredicate).toList();
        females2.forEach(System.out::println);

    }

    static class Person {
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender {
        MALE, FEMALE
    }
}
