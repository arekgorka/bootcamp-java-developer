package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.BookA;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest() {
        //Given
        Set<BookA> listOfBookA = new HashSet<>();
        listOfBookA.add(new BookA("Author1", "Title1", 1997, "BA1"));
        listOfBookA.add(new BookA("Author2", "Title2", 1984, "BA2"));
        listOfBookA.add(new BookA("Author3", "Title3", 2020, "BA3"));
        listOfBookA.add(new BookA("Author4", "Title4", 2011, "BA4"));
        listOfBookA.add(new BookA("Author5", "Title5", 1999, "BA5"));
        MedianAdapter medianAdapter = new MedianAdapter();
        //When
        int result = medianAdapter.publicationYearMedian(listOfBookA);
        System.out.println(result);
        //Then
        Assertions.assertEquals(1999,result);

    }
}
