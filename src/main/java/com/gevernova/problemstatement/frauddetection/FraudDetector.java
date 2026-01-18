package com.gevernova.problemstatement.frauddetection;

import java.util.*;
import java.util.stream.*;

class FraudDetector {

    static void process(List<Transaction> list){

        Map<String,List<Transaction>> map =
                list.stream()
                        .filter(t->t.fraud)
                        .filter(t->t.amount>10000)
                        .collect(Collectors.groupingBy(t->t.policy));

        map.forEach((k,v)->{
            long count=v.size();
            double sum=v.stream().mapToDouble(t->t.amount).sum();

            if(count>5 || sum>50000)
                System.out.println("ALERT -> "+k);
        });
    }
}

