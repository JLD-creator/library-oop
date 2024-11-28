package org.ies.library.model;

import java.util.Arrays;
import java.util.Objects;

public class Library {
    private String name;
    private Book[] books;

    public Library(String name, Book[] books) {
        this.name = name;
        this.books = books;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public boolean hasBook(String ISBN) {
        for (Book book : books) {
            if (book.getISBN().equals(ISBN)) {
                return true;
            }
        }
        return false;
    }

    public boolean hasAuthor(String NIF) {
        for (Book book : books) {
            if (book.hasAuthor(NIF)) {
                return true;
            }
        }
        return false;
    }

    public int countBooks(String nif) {
        int count = 0;
        for (Book book : books) {
            if (book.hasAuthor(nif)) {
                count = count + 1;
            }
        }
        return count;
    }

    public int countYear(int year) {
        int count = 0;
        for (Book book : books) {
            if (book.getYear() == year) {
                count = count + 1;
            }
        }
        return count;
    }

    public String findBook(String isbn) {
        for (Book book : books) {
            if (book.getISBN().equals(isbn)) {
                return book.getTitle();
            }
        }
        return null;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library that = (Library) o;
        return Objects.equals(name, that.name) && Objects.deepEquals(books, that.books);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, Arrays.hashCode(books));
    }

    @Override
    public String toString() {
        return "Biblioteca{" +
                "nombre='" + name + '\'' +
                ", books=" + Arrays.toString(books) +
                '}';
    }
}
