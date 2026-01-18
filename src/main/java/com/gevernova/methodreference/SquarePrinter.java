package com.gevernova.methodreference;

import java.util.*;

class SquarePrinter {
    static void printSquare(int n) {
        System.out.println(n * n);
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,3,4,5);
        list.forEach(SquarePrinter::printSquare);
    }
}