package com.masanz.imperia.modelo;

public abstract class Mision  {

    protected Jugador jugador;

    public abstract boolean estaCumplida();

    public boolean setJugador(Jugador jugador) {
            // Verificar si la misión ya tiene un jugador asignado
            if (this.jugador != null) {
                return false; // La misión ya tiene un jugador asignado
            } else {
                this.jugador = jugador; // Asignar el jugador a la misión
                return true; // La asignación se realizó con éxito
       }
    }
}
