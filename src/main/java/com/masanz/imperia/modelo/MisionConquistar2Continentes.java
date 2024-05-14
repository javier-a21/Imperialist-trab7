package com.masanz.imperia.modelo;

public class MisionConquistar2Continentes extends Mision {

    protected String continente1;
    protected String continente2;
    public MisionConquistar2Continentes(String continente1, String continente2) {
        this.continente1 = continente1;
        this.continente2 = continente2;

    }

    @Override
    public boolean estaCumplida() {
        if (Mundo.esContinenteDe(continente1,jugador.getId()) &&
                Mundo.esContinenteDe(continente2,jugador.getId())){
            return true;
        }
        return false;
    }
    @Override
    public String toString() {
        return " Conquistar los continentes: " + continente1 + " y " + continente2;
    }
}
