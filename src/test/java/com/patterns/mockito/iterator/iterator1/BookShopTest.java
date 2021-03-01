package com.patterns.mockito.iterator.iterator1;

import com.patterns.behavioral.iterator.iterator1.Book;
import com.patterns.behavioral.iterator.iterator1.BookShop;
import com.patterns.behavioral.iterator.iterator1.CustomIterator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BookShopTest {

    @Test
    void addBook() {

        Book bookToAdd = new Book("5656435", "Hawkins", 2021 );

        BookShop books = new BookShop();
        CustomIterator iterador = books.iterator();

        books.addBook(bookToAdd);

        Book lastBook = (Book) books.getOne(books.getSize());
        System.out.println(lastBook.getIsbn() + bookToAdd.getIsbn());
        assertEquals(lastBook.getIsbn(), bookToAdd.getIsbn());

    }

    @Test
    void addBookNull() {

        Book book1 = null;

        BookShop books = new BookShop();
        CustomIterator iterador = books.iterator();

        int totalBooksBefore = books.getSize();
        System.out.println(totalBooksBefore);
        books.addBook(book1);

        assertEquals(totalBooksBefore, books.getSize());

    }

    @Test
    void iterator() {

        Book book1 = new Book("5656435", "Hawkins", 2021 );

        BookShop books = new BookShop();

        books.addBook(book1);


        CustomIterator iterador = books.iterator();

        assertTrue(iterador instanceof CustomIterator);
    }
}