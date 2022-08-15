package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.BookA;
import com.kodilla.patterns2.adapter.bookclassifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclassifier.libraryb.BookB;
import com.kodilla.patterns2.adapter.bookclassifier.libraryb.BookSignature;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {


    @Override
    public int publicationYearMedian(Set<BookA> bookSet) {
        Map<BookSignature,BookB> listOfBooks = new HashMap<>();
        for (BookA book : bookSet) {
            listOfBooks.put(new BookSignature(book.getSignature()),new BookB(book.getAuthor(), book.getAuthor(), book.getPublicationYear()));
        }
        return medianPublicationYear(listOfBooks);
    }
}