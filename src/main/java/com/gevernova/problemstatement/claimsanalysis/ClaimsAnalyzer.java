package com.gevernova.problemstatement.claimsanalysis;

import java.util.*;
import java.util.stream.*;

class ClaimsAnalyzer {

    static void process(List<Claim> list){

        Map<String,DoubleSummaryStatistics> stats =
                list.stream()
                        .filter(c->c.status.equalsIgnoreCase("Approved"))
                        .filter(c->c.claimAmount>5000)
                        .collect(Collectors.groupingBy(
                                c->c.policyNumber,
                                Collectors.summarizingDouble(c->c.claimAmount)));

        stats.entrySet()
                .stream()
                .sorted((a,b)->Double.compare(
                        b.getValue().getSum(),
                        a.getValue().getSum()))
                .limit(3)
                .forEach(System.out::println);
    }
}

