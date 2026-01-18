package com.gevernova.timeapi;

import java.time.*;

class DaylightSavingChecker {
    public static void main(String[] args) {

        ZonedDateTime now = ZonedDateTime.now();
        boolean status = now.getZone().getRules().isDaylightSavings(now.toInstant());

        System.out.println(status);
    }
}

