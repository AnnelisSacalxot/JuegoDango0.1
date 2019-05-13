package com.company.Cuadros;

public class CasillaTierra extends Casilla{

    //@Override sobre escribe el metodo que tenemos en la super clase

    @Override

    String getCuadradoColor(){
        return ANSI_YELLOW+CUADRO;
    }
}
