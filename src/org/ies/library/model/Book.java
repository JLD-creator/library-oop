package org.ies.library.model;

import java.util.Arrays;
import java.util.Objects;

public class Book {
    private int ISBN;
    private  String title;
    private int year;
    private Author[] authors;

    public Book(int ISBN, String title, int year, Author[] authors) {
        this.ISBN = ISBN;
        this.title = title;
        this.year = year;
        this.authors = authors;
    }
    public Author hasAuthor(int NIF){
        for( Author autor: authors){
            if (autor.getNIF() == NIF){
                return autor;
            }
        }
        return null;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public void setAuthors(Author[] authors) {
        this.authors = authors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return ISBN == book.ISBN && year == book.year && Objects.equals(title, book.title) && Objects.deepEquals(authors, book.authors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ISBN, title, year, Arrays.hashCode(authors));
    }

    @Override
    public String toString() {
        return "Book{" +
                "ISBN=" + ISBN +
                ", titulo='" + title + '\'' +
                ", year=" + year +
                ", autors=" + Arrays.toString(authors) +
                '}';
    }
}
