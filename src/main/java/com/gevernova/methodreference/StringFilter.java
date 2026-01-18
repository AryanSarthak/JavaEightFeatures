package com.gevernova.methodreference;

import java.util.*;

class StringFilter {
    static boolean hasA(String s){
        return s.contains("a");
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("java","python","cpp");
        list.stream()
                .filter(StringFilter::hasA)
                .forEach(System.out::println);
    }
}

