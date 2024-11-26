package org.ies.library.model;
import org.ies.library.model.Autor;

import java.util.Arrays;
import java.util.Objects;

public class Book {
    private int ISBN;
    private  String titulo;
    private int year;
    private Autor[] autors;

    public Book(int ISBN, String titulo, int year, Autor[] autors) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.year = year;
        this.autors = autors;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Autor[] getAutors() {
        return autors;
    }

    public void setAutors(Autor[] autors) {
        this.autors = autors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return ISBN == book.ISBN && year == book.year && Objects.equals(titulo, book.titulo) && Objects.deepEquals(autors, book.autors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ISBN, titulo, year, Arrays.hashCode(autors));
    }

    @Override
    public String toString() {
        return "Book{" +
                "ISBN=" + ISBN +
                ", titulo='" + titulo + '\'' +
                ", year=" + year +
                ", autors=" + Arrays.toString(autors) +
                '}';
    }
}
