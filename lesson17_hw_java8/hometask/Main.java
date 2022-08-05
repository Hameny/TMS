package by.tms.java.java8.hometask;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Integer> listInteger = List.of(5, 2, 4, 2, 1);

        String collect = listInteger.stream()
                .map(String::valueOf)
                .collect(Collectors.joining());
        System.out.println(collect);

        List<Person> persons = List.of(
                new Person("Kirill", "Oliev", 20),
                new Person("Piotr", "Ivanov", 34),
                new Person("Svetlana", "Svetikova", 76),
                new Person("Katya", "Kutuzova", 50),
                new Person("Karolina", "Slavikova", 18),
                new Person("Archibald", "Kotov", 56)
        );

        persons.stream()
                .filter(name -> name.getFullName().length() <= 15)
                .max(Comparator.comparing(Person::getAge))
                .map(Person::getFullName)
                .ifPresent(System.out::println);
    }
}