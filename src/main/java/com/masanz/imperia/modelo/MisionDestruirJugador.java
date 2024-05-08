package com.masanz.imperia.modelo;

public class MisionDestruirJugador extends Mision {
    Jugador enemigo;

    public MisionDestruirJugador(Jugador jugador) {
        super();
       this.enemigo = jugador;
    }

    @Override
    public boolean estaCumplida() {
        if (enemigo.getId().isEmpty()){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return " Destruir territorios de " + enemigo;
    }

}
