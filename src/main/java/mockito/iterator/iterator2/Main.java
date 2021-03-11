package mockito.iterator.iterator2;


import mockito.iterator.iterator1.Book;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        final Logger log = LoggerFactory.getLogger(Main.class);

        Book book1 = new Book("5656435", "Hawkins", 2021 );
        Book book2 = new Book("124234fdfg", "Tolle", 1997 );
        Book book3 = new Book("42536357657", "David", 1500 );

        BookShop books = new BookShop();
        books.addBook(book1);
        books.addBook(book2);
        books.addBook(book3);


        Iterator<Book> iterador = books.iterator();
        while (iterador.hasNext()){
            Book book = iterador.next();
            String logMessage= book.toString();
            log.info(logMessage);

        }

        String logMessage= "============";
        log.info(logMessage);


        for (Book book: books) {
            logMessage= book.toString();
            log.info(logMessage);
        }
    }
}
