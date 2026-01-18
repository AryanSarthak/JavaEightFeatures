package com.gevernova.problemstatement.bookrecommendation;

import java.util.*;
import java.util.stream.*;

class RecommendationEngine {

    static List<List<BookSuggestion>> process(List<Book> list){

        List<BookSuggestion> result =
                list.stream()
                        .filter(b->b.genre.equalsIgnoreCase("Science Fiction"))
                        .filter(b->b.rating>4.0)
                        .map(b->new BookSuggestion(b.title,b.rating))
                        .sorted((a,b)->Double.compare(b.rating,a.rating))
                        .limit(10)
                        .toList();

        return IntStream.range(0,result.size())
                .boxed()
                .collect(Collectors.groupingBy(i->i/5))
                .values()
                .stream()
                .map(l->l.stream().map(result::get).toList())
                .toList();
    }
}

