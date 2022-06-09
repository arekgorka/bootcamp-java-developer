package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

public class LibraryTestSuite {

    @Test
    void testGetBooks() {
        //Given
        Library library = new Library("My Basic Library: ");
        Book book1 = new Book("Night","S.King", LocalDate.of(2001,12,10));
        Book book2 = new Book("Harry Potter","J.K.Rowling", LocalDate.of(1997,5,1));
        Book book3 = new Book("Hobbit","H.Tolkien", LocalDate.of(1963,2,15));
        Book book4 = new Book("You","A.Gritz", LocalDate.of(1984,10,29));
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);
        library.getBooks().add(book4);

        Library shallowClonedLibrary = null;
        try {
            shallowClonedLibrary = library.shallowCopy();
            shallowClonedLibrary.setName("My Shallow Copy Library: ");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("My Deep Copy Library: ");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().remove(book1);
        //Then
        System.out.println(library);
        System.out.println(" ");
        System.out.println(shallowClonedLibrary);
        System.out.println(" ");
        System.out.println(deepClonedLibrary);
        assertEquals(3,library.getBooks().size());
        assertEquals(3,shallowClonedLibrary.getBooks().size());
        assertEquals(4,deepClonedLibrary.getBooks().size());
        assertEquals(shallowClonedLibrary.getBooks(),library.getBooks());
        assertNotEquals(deepClonedLibrary.getBooks(),library.getBooks());
    }
}
