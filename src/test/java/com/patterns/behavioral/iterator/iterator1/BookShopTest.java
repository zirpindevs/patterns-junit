package com.patterns.behavioral.iterator.iterator1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookShopTest {

    @Test
    void addBook() {

        Book bookToAdd = new Book("5656435", "Hawkins", 2021 );

        BookShop books = new BookShop();
        CustomIterator iterador = books.iterator();

        books.addBook(bookToAdd);

        Book lastBook = (Book) books.getOne(books.getSize());
        System.out.println(lastBook);
        assertEquals(lastBook.getIsbn(), bookToAdd.getIsbn());

    }

    @Test
    void addBookNull() {

        Book book1 = null;

        BookShop books = new BookShop();
        CustomIterator iterador = books.iterator();

        books.addBook(book1);

        int contador = 0;
        while (iterador.hasNext()){
            Book book = (Book) iterador.next();
            contador++;

        }
        assertEquals(contador, 0);

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