package com.gevernova.timeapi;

import java.time.*;
import java.util.*;

class TimeZoneConverter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String dateTime = sc.nextLine();
        String fromZone = sc.next();
        String toZone = sc.next();

        LocalDateTime ldt = LocalDateTime.parse(dateTime);
        ZonedDateTime z1 = ldt.atZone(ZoneId.of(fromZone));
        ZonedDateTime z2 = z1.withZoneSameInstant(ZoneId.of(toZone));

        System.out.println(z2);
    }
}
