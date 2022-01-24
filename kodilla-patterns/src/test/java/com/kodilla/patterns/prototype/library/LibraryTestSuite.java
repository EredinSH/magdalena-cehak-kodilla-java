package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {
        //GIVEN
        Library library1 = new Library("Fantasy");
        Book book1 = new Book("Hobbit", "J.R.R. Tolkien", LocalDate.of(1960, Month.NOVEMBER,21));
        Book book2 = new Book("Silmarillion", "J.R.R. Tolkien", LocalDate.of(1977, Month.APRIL,18));
        Book book3 = new Book("Opowieści z Narnii", "C.S. Lewis", LocalDate.of(1971, Month.NOVEMBER,11));

        library1.addBook(book1);
        library1.addBook(book2);
        library1.addBook(book3);

        Library clonedLibrary = null;
        try {
            clonedLibrary = library1.shallowCopy();
            clonedLibrary.setName("Fantasy - shallow copy");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library1.deepCopy();
            deepClonedLibrary.setName("Fantasy - shallow copy");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //WHEN
        Book book4 = new Book("Krew elfów", "A. Sapkowski", LocalDate.of(1994, Month.JULY,15));
        library1.addBook(book4);

        //THEN
        assertEquals(4, library1.getBooks().size());
        assertEquals(4, clonedLibrary.getBooks().size());
        assertEquals(3, deepClonedLibrary.getBooks().size());

    }

}
