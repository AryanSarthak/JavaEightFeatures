package com.gevernova.timeapi;

import java.time.*;

class TimeZoneDifference {
    public static void main(String[] args) {

        ZonedDateTime utc = ZonedDateTime.now(ZoneId.of("UTC"));
        ZonedDateTime local = ZonedDateTime.now();

        Duration d = Duration.between(utc, local);

        System.out.println(d.toHours()+" Hours "+d.toMinutesPart()+" Minutes");
    }
}

