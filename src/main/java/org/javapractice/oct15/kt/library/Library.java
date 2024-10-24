package org.javapractice.oct15.kt.library;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library {
    public static int count;
    private Map<Integer, Book> books = new HashMap<>();
    private Map<Integer,DVD> dvds = new HashMap<>();
    private Map<Integer, Magazine> magazines = new HashMap<>();
    public void addBooks(Book ... book) {
        for (Book book1 : book) {
            books.put(count, book1);
            count++;
        }
    }
    public void addDvds(DVD ... dvd) {
        for (DVD dvd1 : dvd) {
            dvds.put(count, dvd1);
            count++;
        }

    }
    public void addMagazines(Magazine ... magazine) {
        for (Magazine dvd1 : magazine) {
            magazines.put(count, dvd1);
            count++;
        }
    }
    public Library(){
        count = 0;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Library.count = count;
    }

    public Map<Integer, Book> getBooks() {
        return books;
    }

    public void setBooks(Map<Integer, Book> books) {
        this.books = books;
    }

    public Map<Integer, DVD> getDvds() {
        return dvds;
    }

    public void setDvds(Map<Integer, DVD> dvds) {
        this.dvds = dvds;
    }

    public Map<Integer, Magazine> getMagazines() {
        return magazines;
    }

    public void setMagazines(Map<Integer, Magazine> magazines) {
        this.magazines = magazines;
    }
    public Book getBook(int id) throws NullPointerException {
        return books.get(id);
    }
    public DVD getDVD(int id) throws NullPointerException {
        return dvds.get(id);
    }
    public Magazine getMagazine(int id) throws NullPointerException {
        return magazines.get(id);
    }
    @Override
    public String toString() {
        return "Library{" +
                "books=" + books +
                ", dvds=" + dvds +
                ", magazines=" + magazines +
                '}';
    }
}
