package streams;




import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static streams._Stream.Gender.*;


public class _Stream {

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

        // Using Stream
        people.stream()
                .map(person -> person.gender)
                .collect(Collectors.toSet()) // collect without duplicates
               // .forEach(gender -> System.out.println(gender));
                // Or we replace lambda with method reference
                .forEach(System.out::println);

        // -----------------------------------------------------------------------

        Predicate<Person> findFemales = person -> FEMALE.equals(person.gender);
        boolean OnlyFemales = people.stream()
                .anyMatch(findFemales);
        System.out.println(OnlyFemales);
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
