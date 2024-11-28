package org.ies.library.model;

import java.util.Objects;

public class Author {
    private String NIF;
    private String name;
    private String surname;

    public Author(String NIF, String name, String surname) {
        this.NIF = NIF;
        this.name = name;
        this.surname = surname;
    }

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author autor = (Author) o;
        return NIF == autor.NIF && Objects.equals(name, autor.name) && Objects.equals(surname, autor.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(NIF, name, surname);
    }

    @Override
    public String toString() {
        return "Autor{" +
                "NIF=" + NIF +
                ", nombre='" + name + '\'' +
                ", apellidos='" + surname + '\'' +
                '}';
    }
}
