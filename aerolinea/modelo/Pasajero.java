/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aerolinea.modelo;

/**
 *
 * @author estuam
 */
public class Pasajero {
    private String nombre;
    private Vuelo vuelo;

    public Pasajero(String nombre) {
        this.nombre = nombre;
        this.vuelo = null;
    }

    public String getNombre() {
        return nombre;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void reservar(Vuelo vuelo) {
        if (vuelo == null) {
            System.out.println(this.nombre + ": no hay vuelo");
        } else {
            boolean exito = vuelo.reservarSilla();
            if (exito) {
                this.vuelo = vuelo;
                System.out.println(this.nombre + " reservó en " + vuelo.getCodigo());
            } else {
                System.out.println(this.nombre + ": vuelo " + vuelo.getCodigo() + " lleno");
            }
        }
    }

    public void mostrarReserva() {
        if (this.vuelo == null) {
            System.out.println(this.nombre + ": sin reserva");
        } else {
            System.out.println(this.nombre + " viaja a " + this.vuelo.getDestino());
        }
    }
}