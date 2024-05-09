package com.masanz.imperia.modelo;

public class MisionConquistar24Territorios extends Mision {
    private Jugador jugador;

    @Override
    public boolean estaCumplida() {
       return Mundo.tiene24Territorios(jugador.getId());
    }

    @Override
    public boolean setJugador(Jugador jugador) {
        this.jugador = jugador;
        return true;
    }

    @Override
    public String toString() {
        return " Conquistar 24 Territorios";
    }
}
