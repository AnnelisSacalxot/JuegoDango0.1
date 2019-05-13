package com.company.Automocion;


//this: concatena o une
//float: guarda números enteros y decimales
//int: para numeros enteros su estructura: int nombreVariable;--- esta es la buena practica  = tiene un rango de 8bits
// get: mostrar
// set: modificar
// return: valor de vuelto
//clases abstractas: generamos los metodos que necesitamos (nos obliga a implementar ciertos metodos)



public class Vehiculos {

    protected final char CUADRO = (char)182;
    protected static final String ANSI_RED = "\u001B[31m";
    protected static final String ANSI_WHITE = "\u001B[37m";
    protected static final String ANSI_YELLOW = "\u001B[33m";
    protected static final String ANSI_BLUE = "\u001B[34m";
    protected static final String ANSI_PURPLE =  "\u001B[35m";

    protected int Ataque;
    protected int Defensa;
    protected float Punteria;
    protected int MovimientoEspecial;
    protected int Desplazamiento;

    public Vehiculos() {

    }

    public int getAtaque() {

        return Ataque;
    }

    public void setAtaque(int Ataque) {

        this.Ataque = Ataque;
    }

    public int getDefensa(){

        return Defensa;
    }

    public void setDefensa(int Defensa){
        this.Defensa = Defensa;
    }


    public float getPunteria(){

        return Punteria;
    }

    public void setPunteria(float Punteria){

        this.Punteria= Punteria;
    }

    public int getMovimientoEspecial(){

        return MovimientoEspecial;
    }

    public void setMovimientoEspecial(){

        this.MovimientoEspecial = MovimientoEspecial;
    }

    public int getDesplazamiento(){
        return Desplazamiento;
    }

    public void setDesplazamiento( int Desplazamiento){

        this.Desplazamiento = Desplazamiento;
    }

    public Vehiculos(int Ataque, int Defensa, float Punteria, int MovimientoEspecial, int Desplazamiento) {

        //parametros del objeto

        this.Ataque = Ataque ;
        this.Defensa = Defensa;
        this.Punteria = Punteria;
        this.MovimientoEspecial = MovimientoEspecial;
        this.Desplazamiento = Desplazamiento;
    }

}

