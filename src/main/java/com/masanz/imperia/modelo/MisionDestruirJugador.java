package com.masanz.imperia.modelo;

import java.util.List;

public class MisionDestruirJugador extends Mision {
    private Jugador jugadorQueHayQueDestruir;

    public MisionDestruirJugador(Jugador jugadorQueHayQueDestruir) {
       this.jugadorQueHayQueDestruir = jugadorQueHayQueDestruir;
    }
    @Override
    public boolean setJugador(Jugador jugador) {
        super.setJugador(jugador);
        return !jugador.equals(jugadorQueHayQueDestruir);

    }

    @Override
    public boolean estaCumplida() {
        List<Territorio> territoriosJugadorDestruir = Mundo.getListaTerritoriosDelJugador(jugadorQueHayQueDestruir.getId());
        if (territoriosJugadorDestruir.isEmpty()){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return " Destruir territorios de " + jugadorQueHayQueDestruir;
    }

}
