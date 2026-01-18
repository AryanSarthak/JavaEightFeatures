package com.gevernova.timeapi;

import java.time.*;

class ExecutionTimer {
    public static void main(String[] args) {

        Instant start = Instant.now();

        for(int i=0;i<1000000;i++);

        Instant end = Instant.now();

        System.out.println(Duration.between(start,end).getSeconds());
    }
}

