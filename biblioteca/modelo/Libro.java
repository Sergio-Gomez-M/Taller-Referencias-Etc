/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca.modelo;

/**
 *
 * @author estuam
 */
public class Libro {
    private String titulo;
    private String autor;
    private boolean disponible;

    public Libro(String titulo, String autor) {
        this.disponible = true;
        this.autor = autor;
        setTitulo(titulo);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo == null || titulo.isEmpty()) {
            System.out.println("Título inválido");
            this.titulo = "Sin título";
        } else {
            this.titulo = titulo;
        }
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    public boolean estaDisponible() {
        return disponible;
    }

    public void prestar() {
        this.disponible = false;
    }

    public void devolver() {
        this.disponible = true;
    }

    public void mostrarInformacion() {
        System.out.println(this.titulo + " de " + this.autor + " | disponible: " + this.disponible);
    }

    public boolean mismoTitulo(Libro otro) {
        if (otro == null) {
            return false;
        }
        return this.titulo.equals(otro.getTitulo());
    }
}