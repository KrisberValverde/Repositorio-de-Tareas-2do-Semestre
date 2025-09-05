/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodigoCorregido;

import java.util.Objects;

public class Alumno {

    int id;
    String nombre;

    Alumno(int id, String nombre) { this.id = id; this.nombre = nombre; }

    @Override
    public String toString() {

        return "Alumno{id=" + id + ", nombre='" + nombre + "'}";

    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alumno alumno = (Alumno) o;
        return id == alumno.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}