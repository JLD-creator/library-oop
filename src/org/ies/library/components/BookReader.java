package org.ies.library.components;
import org.ies.library.model.Author;
import org.ies.library.model.Book;
import java.util.Scanner;


public class BookReader {
    private final Scanner scanner;
    private final AuthorReader authorReader;

    public BookReader(Scanner scanner, AuthorReader authorReader) {
        this.scanner = scanner;
        this.authorReader = authorReader;
    }

    public Book read(){
        System.out.println("ISBN del libro");
        int isbn = scanner.nextInt();
        scanner.nextLine();
        System.out.println("titulo del libro");
        String titulo = scanner.nextLine();
        System.out.println("Año");
        int year = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Cuantos autores hay");
        int size = scanner.nextInt();
        Author[]autors = new Author[size];
        for (int i = 0; i < autors.length; i++) {
            autors[i] = authorReader.read();
        }
        return new Book(isbn, titulo, year,autors);
    }
}
