package com.patterns.behavioral.iterator.iterator1;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements IBookShop{

    // estructura datos interna
    List<Book> books;

    // constructor
    public BookShop(){
        books = new ArrayList<>();
    }

    // metodo para guardar datos en la estructura interna
    public void addBook(Book book){
        if(book != null)
            books.add(book);
    }

    // metodo que obtiene un libro en concreto
    public Object getOne(int index) {
        return books.get(index);
    }

    // metodo que devuelve el tamaño de la librería
    public int getSize() {
        return books.size() - 1;
    }

    // iterador para recuperar elementos de la estructura interna
    @Override
    public CustomIterator iterator() {
        return new BookShopIterator();
    }

    // crear iterador
    private class BookShopIterator implements CustomIterator{

        int currentIndex = 0;

        @Override
        public boolean hasNext() {
            if (this.currentIndex >= books.size())
                return false;

            return true;
        }

        @Override
        public Object next() {
            return books.get(currentIndex++);
        }


    }
}
