package com.gevernova.timeapi;

import java.time.*;
import java.util.*;

class PeriodCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LocalDate d1 = LocalDate.parse(sc.next());
        LocalDate d2 = LocalDate.parse(sc.next());

        Period p = Period.between(d1, d2);
        System.out.println(p.getYears()+" Years "+p.getMonths()+" Months "+p.getDays()+" Days");
    }
}

