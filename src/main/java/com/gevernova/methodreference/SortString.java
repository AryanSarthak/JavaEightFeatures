package com.gevernova.methodreference;

import java.util.*;

public class SortString {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Banana","apple","Orange");
        list.sort(String::compareToIgnoreCase);
        System.out.println(list);
    }
}
