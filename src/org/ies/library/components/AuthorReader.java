package org.ies.library.components;
import org.ies.library.model.Author;
import java.util.Scanner;

public class AuthorReader {
    private final Scanner scanner;

    public AuthorReader(Scanner scanner) {
        this.scanner = scanner;
    }
    public Author read(){
        System.out.println("NIF del autor");
        int nif = scanner.nextInt();
        scanner.nextLine();
        System.out.println("nombre del autor");
        String nombre = scanner.nextLine();
        System.out.println("apellido del autor");
        String apellido = scanner.nextLine();
        return new Author(nif, nombre, apellido);

    }
}
