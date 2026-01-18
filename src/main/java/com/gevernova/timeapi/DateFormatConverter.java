package com.gevernova.timeapi;

import java.time.*;
import java.time.format.*;
import java.util.*;

class DateFormatConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.next();
        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter f2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate date = LocalDate.parse(input,f1);
        System.out.println(date.format(f2));
    }
}

