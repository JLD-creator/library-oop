package org.ies.library;

import org.ies.library.components.LibraryReader;
import org.ies.library.components.AuthorReader;
import org.ies.library.components.BookReader;
import org.ies.library.model.Book;
import org.ies.library.model.Library;
import org.ies.library.model.Autor;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LibraryReader libraryReader = new LibraryReader(scanner, new BookReader(scanner, new AuthorReader(scanner)));
        Library library =libraryReader.read();
        System.out.println(library);

    }
}