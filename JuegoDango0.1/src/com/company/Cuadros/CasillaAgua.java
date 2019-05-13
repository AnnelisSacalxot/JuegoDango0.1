package com.company.Cuadros;

public class CasillaAgua extends Casilla {

    //@Override sobre escribe el metodo que tenemos en la super clase

    @Override
    String getCuadradoColor(){
        return ANSI_BLUE+CUADRO;
    }
}
