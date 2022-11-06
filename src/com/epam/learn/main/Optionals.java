// https://www.youtube.com/watch?v=1xCxoOuDZuU

package com.epam.learn.main;

import java.util.Optional;


public class Optionals {

    public static void main(String[] args) {

       Person person = new Person("Inga", null);
//       String email =
//               person.getEmail()
//                       .map(String::toLowerCase)
//                       .orElse("email is not provided");
//        System.out.println(email);

        // you can use "ifPresent" and wrap actual value  inside of the optional yourself
        if (person.getEmail().isPresent()) {
            String email = person.getEmail().get().toLowerCase(); // get(): If a value is present, returns the value, otherwise throws NoSuchElementException.
            System.out.println(email);
        }
        else {
            System.out.println("email is not provided");
        }

    }

    // Optional.empty()
    // Optional.of(T value)
    // Optional.ofNullable(T value)
    public static void OptionsOptionals () {
        Optional<Object> empty = Optional.empty();
        System.out.println(empty);
        System.out.println(empty.isPresent());
        System.out.println(empty.isEmpty());
        System.out.println();


        /// Optional.of(...)
        Optional<String> nameOf = Optional.of("Inga");
        System.out.println("Optional.of: " + nameOf);
        System.out.println();

        // Optional.ofNullable()
        Optional<String> nameOfNullable = Optional.ofNullable(null);

        // orElse(...) -
        String nameOrElse = nameOfNullable
                .map(String::toUpperCase)
                .orElse("orElse: " + "Pali"); // in case value is present - do some transformation
        System.out.println(nameOrElse);
        System.out.println();

        // orElseGet(...) - string with transformations
        String nameOrElseGet = nameOfNullable
                .map(String::toUpperCase)
                .orElseGet(() -> { // can make computations
                    return "orElseGet: " + "Pali";});
        System.out.println(nameOrElseGet);
        System.out.println();

        // orElseThrow() - exception
//        String nameOrElseThrow = nameOfNullable
//                .map(String::toUpperCase)
//                .orElseThrow(IllegalStateException::new);// exception
//        System.out.println(nameOrElseThrow);
//        System.out.println();

        // ifPresent() takes value inside your optional if it's present
        nameOfNullable.ifPresent(word -> {
            System.out.println("ifPresent: " + word.toUpperCase());
        }); // takes value inside your optional if it's present - implement someting
        System.out.println();

        // ifPresentOrElse()
        nameOfNullable.ifPresentOrElse(System.out::println, () -> System.out.println("ifPresentOrElse: " + "Pali"));
        System.out.println();
    }
}

    class Person {
        private final String name;
        private final String email;

        Person(String name, String email) {
            this.name = name;
            this.email = email;
        }

        public String getName() {
            return name;
        }

        public Optional<String> getEmail() {
            return Optional.ofNullable(email); // an Optional with a present value if the specified value is non-null, otherwise an empty Optional
        }
    }