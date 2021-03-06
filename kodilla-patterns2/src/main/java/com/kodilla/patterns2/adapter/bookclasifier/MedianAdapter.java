package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;

import java.util.*;
import java.util.stream.Collectors;

public class MedianAdapter extends MedianAdaptee implements Classifier {

    MedianAdaptee medianAdaptee;

    @Override
    public int publicationYearMedian(Set<Book> bookSet) {

        Map<BookSignature, com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book> books = bookSet.stream()
                .collect(Collectors.toMap(b -> new BookSignature(b.getSignature()), b -> new com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book( b.getAuthor(), b.getTitle(), b.getPublicationYear())));


        return medianAdaptee.medianPublicationYear(books);
    }
}
