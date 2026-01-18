package com.gevernova.methodreference;

import java.util.*;
import java.util.stream.*;

class Human {
    int age;
    Human(int age){
        this.age=age;
    }
}

class RandomPersonGenerator {
    public static void main(String[] args) {
        List<Human> list = new Random()
                .ints(5,1,50)
                .mapToObj(Human::new)
                .toList();

        list.forEach(p -> System.out.println(p.age));
    }
}

