package com.masanz.imperia.modelo;

public abstract class Mision  {
    protected Jugador jugador;

    public abstract boolean estaCumplida();

    public  boolean setJugador(Jugador jugador){
        this.jugador = jugador;
        return true;
    }
}
