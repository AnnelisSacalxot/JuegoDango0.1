package com.company.Cuadros;

public class CasillaMontaña extends Casilla{

    //@Override sobre escribe el metodo que tenemos en la super clase

    @Override
    String getCuadradoColor(){
        return ANSI_RED+CUADRO;
    }
}
