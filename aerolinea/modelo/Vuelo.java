/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aerolinea.modelo;

/**
 *
 * @author estuam
 */
public class Vuelo {
    private String codigo;
    private String destino;
    private int sillasDisponibles;

    public Vuelo(String codigo, String destino, int sillasDisponibles) {
        this.codigo = codigo;
        setDestino(destino);
        if (sillasDisponibles >= 0) {
            this.sillasDisponibles = sillasDisponibles;
        } else {
            this.sillasDisponibles = 0;
        }
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        if (destino == null || destino.isEmpty()) {
            System.out.println("Destino inválido");
            this.destino = "Por asignar";
        } else {
            this.destino = destino;
        }
    }

    public int getSillasDisponibles() {
        return sillasDisponibles;
    }

    public boolean reservarSilla() {
        if (this.sillasDisponibles > 0) {
            this.sillasDisponibles--;
            return true;
        }
        return false;
    }
}