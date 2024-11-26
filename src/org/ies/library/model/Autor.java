package org.ies.library.model;

import java.util.Objects;

public class Autor {
    private int NIF;
    private String nombre;
    private String apellidos;

    public Autor(int NIF, String nombre, String apellidos) {
        this.NIF = NIF;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public int getNIF() {
        return NIF;
    }

    public void setNIF(int NIF) {
        this.NIF = NIF;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Autor autor = (Autor) o;
        return NIF == autor.NIF && Objects.equals(nombre, autor.nombre) && Objects.equals(apellidos, autor.apellidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(NIF, nombre, apellidos);
    }

    @Override
    public String toString() {
        return "Autor{" +
                "NIF=" + NIF +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                '}';
    }
}
