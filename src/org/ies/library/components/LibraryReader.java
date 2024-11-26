package org.ies.library.components;
import org.ies.library.model.Library;
import  org.ies.library.model.Book;
import java.util.Scanner;

public class LibraryReader {
    private final Scanner scanner;
    private final BookReader bookReader;

    public LibraryReader(Scanner scanner, BookReader bookReader) {
        this.scanner = scanner;
        this.bookReader = bookReader;
    }
    public Library read(){
        System.out.println("Titulo de la libreria");
        String titulo = scanner.nextLine();
        System.out.println("Cuantos libros tiene ");
        int size = scanner.nextInt();
        scanner.nextLine();
        Book[] books = new Book[size];
        for (int i = 0; i < books.length; i++) {
            books[i] = bookReader.read();
        }
        return new Library(titulo, books);
    }
}
