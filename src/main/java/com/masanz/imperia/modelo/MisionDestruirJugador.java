package com.masanz.imperia.modelo;

public class MisionDestruirJugador extends Mision {
    private Jugador jugadorQueHayQueDestruir;

    public MisionDestruirJugador(Jugador jugadorQueHayQueDestruir) {
        super();
       this.jugadorQueHayQueDestruir = jugadorQueHayQueDestruir;
    }
    @Override
    public boolean setJugador(Jugador jugador) {

        return !jugador.equals(jugadorQueHayQueDestruir);
        //if(!jugador.equals(jugadorQueHayQueDestruir){
        //return false;
        //jugador = jugador
        //return true
    }

    @Override
    public boolean estaCumplida() {
        if (jugadorQueHayQueDestruir.getId().isEmpty()){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return " Destruir territorios de " + jugadorQueHayQueDestruir;
    }

}
