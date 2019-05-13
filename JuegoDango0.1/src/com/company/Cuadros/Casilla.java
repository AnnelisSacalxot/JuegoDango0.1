package com.company.Cuadros;

import javax.swing.*;
import java.awt.*;

    abstract public class Casilla {
        protected final char CUADRO = (char)182;
        protected static final String ANSI_RED = "\u001B[31m";
        protected static final String ANSI_WHITE = "\u001B[37m";
        protected static final String ANSI_YELLOW = "\u001B[33m";
        protected static final String ANSI_BLUE = "\u001B[34m";

        String getLine1(){

            return getCuadradoColor()+ getCuadradoColor()+ getCuadradoColor()+ getCuadradoColor()+ getCuadradoColor()+ getCuadradoColor();
        }

        String getLine2(){

            return getCuadradoColor()+ getCuadradoColor()+ getCuadradoColor()+ getCuadradoColor()+ getCuadradoColor()+ getCuadradoColor();
        }

        String getLine3(){

            return getCuadradoColor()+ getCuadradoColor()+ getCuadradoColor()+ getCuadradoColor()+ getCuadradoColor()+ getCuadradoColor();
        }

        String getCuadradoColor(){
            return ANSI_RED+CUADRO;
        }

    }
