package com.gevernova.methodreference;

import java.util.*;

class UpperCaseConverter {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("java","spring","react");

        list.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}

