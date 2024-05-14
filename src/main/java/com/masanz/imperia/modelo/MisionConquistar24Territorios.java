package com.masanz.imperia.modelo;

public class MisionConquistar24Territorios extends Mision {

    @Override
    public boolean estaCumplida() {
       return Mundo.tiene24Territorios(jugador.getId());
    }



    @Override
    public String toString() {
        return " Conquistar 24 Territorios";
    }
}
