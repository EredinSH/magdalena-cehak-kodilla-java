package com.kodilla.testing.library;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class BookDirectoryTestSuite {

    @Mock
    private LibraryDatabase libraryDatabaseMock;

    @Test                                                                               // [1]
    void testListBooksWithConditionsReturnList() {                                      // [2]

        // Given
        LibraryDatabase libraryDatabaseMock = Mockito.mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);                  // [3]
        List<Book> resultListOfBooks = new ArrayList<>();                                // [4]
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);                   // [5]
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);    // [6]
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);    // [7]
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);                 // [8]
        resultListOfBooks.add(book1);                                                    // [9]
        resultListOfBooks.add(book2);                                                    // [10]
        resultListOfBooks.add(book3);                                                    // [11]
        resultListOfBooks.add(book4);                                                    // [12]
        when(libraryDatabaseMock.listBooksWithCondition("Secret")).thenReturn(resultListOfBooks);// [13]

        // When
        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");        // [14]

        // Then
        assertEquals(4, theListOfBooks.size());                                          // [15]
    }

    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<>();
        for (int n = 1; n <= booksQuantity; n++) {
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }

    @Test
    void testListBooksWithConditionMoreThan20() {

        // Given
        LibraryDatabase libraryDatabaseMock = Mockito.mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);                  // [1]
        List<Book> resultListOf0Books = new ArrayList<>();
        List<Book> resultListOf15Books = generateListOfNBooks(15);
        List<Book> resultListOf40Books = generateListOfNBooks(40);                       // [4]
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf15Books);
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks"))
                .thenReturn(resultListOf0Books);
        when(libraryDatabaseMock.listBooksWithCondition("FortyBooks"))
                .thenReturn(resultListOf40Books);                                           // [10]

        // When
        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
        List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FortyBooks");  // [12]
        // Then

        assertEquals(0, theListOfBooks0.size());
        assertEquals(15, theListOfBooks15.size());
        assertEquals(0, theListOfBooks40.size());                                      // [16]
    }

    @Test
    void testListBooksWithConditionFragmentShorterThan3() {                          // [1]
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);            // [2]
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);               // [3]

        // When
        List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");       // [4]

        // Then
        assertEquals(0, theListOfBooks10.size());                                     // [5]
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());    // [6]
    }

    @Test
    void testListBooksInHandsOfIs0() {

        //GIVEN
        LibraryDatabase libraryDatabaseMock = Mockito.mock(LibraryDatabase.class);
        LibraryUser newUser = new LibraryUser("John", "Wick", "111222333");
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> listWith0Books = new ArrayList<>();
        when(libraryDatabaseMock.listBooksInHandsOf(newUser)).thenReturn(listWith0Books);

        //WHEN
        List<Book> listBooksInHandsOf = bookLibrary.listBooksInHandsOf(newUser);

        //THEN
        assertEquals(0, listBooksInHandsOf.size());

    }

    @Test
    void testListBooksInHandsOfIs1() {

        //GIVEN
        LibraryDatabase libraryDatabaseMock = Mockito.mock(LibraryDatabase.class);
        LibraryUser newUser = new LibraryUser("John", "Wick", "111222333");
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBooks = new ArrayList<>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        resultListOfBooks.add(book1);
        when(libraryDatabaseMock.listBooksInHandsOf(newUser)).thenReturn(resultListOfBooks);

        //WHEN
        List<Book> listBooksInHandsOf = bookLibrary.listBooksInHandsOf(newUser);

        //THEN
        assertEquals(1, listBooksInHandsOf.size());

    }
    @Test
    void testListBooksInHandsOfIs5() {

        //GIVEN
        LibraryDatabase libraryDatabaseMock = Mockito.mock(LibraryDatabase.class);
        LibraryUser newUser = new LibraryUser("John", "Wick", "111222333");
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBooks = new ArrayList<>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        Book book5 = new Book("Harry Potter", "J.K. Rowling", 2000);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        resultListOfBooks.add(book5);
        when(libraryDatabaseMock.listBooksInHandsOf(newUser)).thenReturn(resultListOfBooks);

        //WHEN
        List<Book> listBooksInHandsOf = bookLibrary.listBooksInHandsOf(newUser);

        //THEN
        assertEquals(5, listBooksInHandsOf.size());

    }


}
