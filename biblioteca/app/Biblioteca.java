/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca.app;

/**
 *
 * @author estuam
 */
import biblioteca.modelo.Libro;
import biblioteca.personas.Socio;

public class Biblioteca {
    public static void main(String[] args) {
        Libro l1 = new Libro("Cien años de soledad", "García Márquez");
        l1.mostrarInformacion();

        Libro l2 = l1; // l2 es un alias de l1
        Libro l3 = new Libro("Cien años de soledad", "García Márquez");

        l2.prestar();
        System.out.println(l1.estaDisponible()); 
        System.out.println(l3.estaDisponible());
        System.out.println(l1 == l2);           
        System.out.println(l1 == l3);            

        Libro l4 = null;
        if (l4 != null) {
            l4.mostrarInformacion();
        } else {
            System.out.println("No hay libro");
        }

        l1.setTitulo("");
        System.out.println(l1.getTitulo());

        Libro lInvalido = new Libro("", "Anónimo");
        System.out.println(lInvalido.getTitulo());

        Socio camila = new Socio("Camila");
        camila.prestarLibro(l3);
        camila.prestarLibro(l1);
        camila.prestarLibro(null);

        System.out.println(camila.getLibrosPrestados());
        System.out.println(l3.estaDisponible());

        System.out.println("¿l1 y l3 tienen el mismo título?: " + l1.mismoTitulo(l3));
    }
}