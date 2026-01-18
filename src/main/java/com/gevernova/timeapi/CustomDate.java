package com.gevernova.timeapi;

import java.time.*;
import java.time.format.*;
import java.util.*;

class CustomDate {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm:ss");
        DateTimeFormatter f2 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");

        LocalDateTime dt = LocalDateTime.parse(input,f1);
        System.out.println(dt.format(f2));
    }
}

