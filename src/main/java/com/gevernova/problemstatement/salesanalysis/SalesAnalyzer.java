package com.gevernova.problemstatement.salesanalysis;

import java.util.*;
import java.util.stream.*;

class SalesAnalyzer {

    static void process(List<Sale> list){

        List<ProductRevenue> result =
                list.stream()
                        .filter(s->s.quantity>10)
                        .collect(Collectors.groupingBy(
                                s->s.productId,
                                Collectors.summingDouble(s->s.quantity*s.price)))
                        .entrySet()
                        .stream()
                        .map(e->new ProductRevenue(e.getKey(),e.getValue()))
                        .sorted((a,b)->Double.compare(b.revenue,a.revenue))
                        .limit(5)
                        .toList();

        System.out.println(result);
    }
}

