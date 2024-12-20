package org.ies.library.model;

import java.util.Arrays;
import java.util.Objects;

public class Book {
    private String ISBN;
    private  String title;
    private int year;
    private Author[] authors;

    public Book(String ISBN, String title, int year, Author[] authors) {
        this.ISBN = ISBN;
        this.title = title;
        this.year = year;
        this.authors = authors;
    }
    public boolean hasAuthor(String NIF) {
        for (Author author : authors) {
            if (author.getNIF().equals(NIF)) {
                return true;
            }
        }
        return false;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
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
