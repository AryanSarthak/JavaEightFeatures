package com.gevernova.methodreference;

import java.util.*;

class OptionalUpperCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        Optional.ofNullable(input)
                .map(String::toUpperCase)
                .ifPresent(System.out::println);
    }
}

