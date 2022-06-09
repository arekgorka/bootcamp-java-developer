package com.kodilla.patterns.prototype.library;

import com.kodilla.patterns.prototype.Prototype;

import java.util.HashSet;
import java.util.Set;

public final class Library extends Prototype<Library> {

    private String name;
    private Set<Book> books = new HashSet<>();

    public Library(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Library shallowCopy() throws CloneNotSupportedException {
        return super.clone();
    }

    public Library deepCopy() throws CloneNotSupportedException {
        Library clonedLibrary = super.clone();
        clonedLibrary.books = new HashSet<>();
        for (Book theBook: books) {
            Book clonedBook = new Book(theBook.getTitle(), theBook.getAuthor(),theBook.getPublicationDate());
            clonedLibrary.getBooks().add(clonedBook);
        }
        return clonedLibrary;
    }

    public String getName() {
        return name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public String toString() {
        String s = getName() + "\n" + getBooks().toString();

        return s;
    }
}
