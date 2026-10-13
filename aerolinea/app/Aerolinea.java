/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aerolinea.app;

/**
 *
 * @author estuam
 */
import aerolinea.modelo.Pasajero;
import aerolinea.modelo.Vuelo;

public class Aerolinea {
    public static void main(String[] args) {

        Vuelo av204 = new Vuelo("AV-204", "Cartagena", 2);

        Pasajero sara = new Pasajero("Sara");
        Pasajero tomas = new Pasajero("Tomás");
        Pasajero lina = new Pasajero("Lina");

        lina.mostrarReserva();

        sara.reservar(av204);
        tomas.reservar(av204);
        lina.reservar(av204);
        System.out.println(av204.getSillasDisponibles());

        av204.setDestino("Santa Marta");

        sara.mostrarReserva();
        tomas.mostrarReserva();
        lina.mostrarReserva();
        System.out.println(sara.getVuelo() == tomas.getVuelo());
    }
}