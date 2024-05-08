package com.masanz.imperia.modelo;

public class MisionConquistar18TerritoriosCon2Ejercitos extends Mision {

    @Override
    public boolean estaCumplida() {
        return Mundo.tiene18TerritoriosCon2Ejercitos(jugador.getId());
    }

    @Override
    public String toString() {
        return " Conquistar 18 Territorios con 2 Ejercitos o Más";
    }
}
