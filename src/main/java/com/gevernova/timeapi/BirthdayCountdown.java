package com.gevernova.timeapi;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.*;

class BirthdayCountdown {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LocalDate dob = LocalDate.parse(sc.next());

        LocalDate today = LocalDate.now();
        LocalDate next = dob.withYear(today.getYear());

        if(next.isBefore(today))
            next = next.plusYears(1);

        long days = ChronoUnit.DAYS.between(today, next);
        System.out.println(days);
    }
}
