package com.gevernova.methodreference;

import java.util.*;

class GenericMaxFinder {
    public static <T extends Comparable<T>> Optional<T> findMax(List<T> list){
        return list.stream().max(Comparable::compareTo);
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,40,20);
        Optional<Integer> max = findMax(list);

        System.out.println(max.orElse(-1));
    }
}

