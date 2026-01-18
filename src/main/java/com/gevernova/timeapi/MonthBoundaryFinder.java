package com.gevernova.timeapi;

import java.time.*;
import java.time.temporal.*;

class MonthBoundaryFinder {
    public static void main(String[] args) {

        LocalDate now = LocalDate.now();

        LocalDate first = now.with(TemporalAdjusters.firstDayOfMonth());
        LocalDate last = now.with(TemporalAdjusters.lastDayOfMonth());

        System.out.println(first);
        System.out.println(last);
    }
}

