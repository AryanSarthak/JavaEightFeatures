package com.gevernova.problemstatement.riskassessment;

import java.util.*;
import java.util.stream.*;

class RiskAnalyzer {

    static void process(List<PolicyHolder> list){

        List<RiskProfile> result =
                list.stream()
                        .filter(p->p.type.equalsIgnoreCase("Life"))
                        .filter(p->p.age>60)
                        .map(p->new RiskProfile(
                                p.id,p.name,p.premium/p.age))
                        .sorted((a,b)->Double.compare(b.score,a.score))
                        .toList();

        Map<String,List<RiskProfile>> map =
                result.stream()
                        .collect(Collectors.groupingBy(
                                r->r.score>0.5?"High Risk":"Low Risk"));

        System.out.println(map);
    }
}

