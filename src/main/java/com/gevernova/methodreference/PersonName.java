package com.gevernova.methodreference;

import java.util.*;

class Person {
    String name;
    Person(String name) {
        this.name = name;
    }
    String getName() {
        return name;
    }
}

class  Main{
    public static void main(String[] args) {
        List<Person> list = Arrays.asList(
                new Person("Aryan"),
                new Person("Shiva"),
                new Person("Kaur")
        );

        list.stream()
                .map(Person::getName)
                .forEach(System.out::println);
    }
}
