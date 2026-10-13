/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca.personas;

/**
 *
 * @author estuam
 */

import biblioteca.modelo.Libro;

public class Socio {
    private String nombre;
    private int librosPrestados;

    public Socio(String nombre) {
        this.nombre = nombre;
        this.librosPrestados = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getLibrosPrestados() {
        return librosPrestados;
    }

    public void prestarLibro(Libro libro) {
        if (libro == null) {
            System.out.println("No hay libro para prestar");
        } else if (!libro.estaDisponible()) {
            System.out.println(libro.getTitulo() + " no está disponible");
        } else {
            libro.prestar();
            this.librosPrestados++;
            System.out.println(this.nombre + " recibió " + libro.getTitulo());
        }
    }

    public void devolverLibro(Libro libro) {
        if (libro != null) {
            libro.devolver();
            if (this.librosPrestados > 0) {
                this.librosPrestados--;
            }
        }
    }
}
