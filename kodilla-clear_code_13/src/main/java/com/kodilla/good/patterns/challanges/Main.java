package com.kodilla.good.patterns.challanges;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();
        Map<String, List<String>> booksTitlesWithTranslations = movieStore.getMovies();
        String bookList = booksTitlesWithTranslations.entrySet().stream()
                .flatMap(book->book.getValue().stream())
                .collect(Collectors.joining(" ! "));
        System.out.println(bookList);
    }
}
