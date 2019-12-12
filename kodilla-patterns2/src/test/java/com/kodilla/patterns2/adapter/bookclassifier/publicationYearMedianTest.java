package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdaptee;
import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class publicationYearMedianTest {
    @Test
    public void publicationYearMedian() {
        //Given
        MedianAdapter medianAdapter = new MedianAdapter();
        Set<Book> books = new HashSet<>();
        books.add(new Book("Author1", "Title1", 2000, "DZ001"));
        books.add(new Book("Author2", "Title2", 1958, "DZ002"));
        books.add(new Book("Author3", "Title3", 1936, "DZ003"));
        books.add(new Book("Author4", "Title4", 2005, "DZ004"));
        books.add(new Book("Author5", "Title5", 2007, "DZ005"));
        books.add(new Book("Author6", "Title6", 2009, "DZ006"));
        //When
        int medianYear = medianAdapter.publicationYearMedian(books);
        //Then
        System.out.println("Median Year : " + medianYear);
        Assert.assertEquals(2005, medianYear);

    }
}
