package com.company.Arsenal;
//this: concatena o une
//float: guarda números enteros y decimales
//String: su variable inicia con mayuscula, guarda cadenas (es una frase) : String nombreVariable;
//int: para numeros enteros su estructura: int nombreVariable;--- esta es la buena practica  = tiene un rango de 8bits
// get: mostrar
// set: modificar
//return: valor de vuelto


/**
 * Atributos del arsenal que tendra a dispocision el usuario
 */


public class Armas { int Disparos; String Municiones; int Alcanze; int Daño; float VelocidadDeRecarga;public Armas(){

}

    public int getDisparos(){
        return Disparos;
    }

    public void setDisparos(int Disparos){

        this.Disparos = Disparos;
    }

    public String getMuniciones(){

        return Municiones;
    }

    public void setMuniciones(String Municiones){

        this.Municiones = Municiones;
    }

    public int getAlcanze(){
        return Alcanze;
    }

    public void setAlcanze(int Alcanze){

        this.Alcanze = Alcanze;
    }

    public int getDaño(){
        return Daño;
    }

    public void setDaño(int Daño){

        this.Daño = Daño;
    }

    public float getVelocidadDeRecarga(){

        return VelocidadDeRecarga;
    }

    public void setVelocidadDeRecarga(float VelocidadDeRecarga){

        this.VelocidadDeRecarga = VelocidadDeRecarga;
    }

    //Constructor


    public Armas(int Disparos, String Municiones, int Alcanze , int Daño, float VelocidadDeRecarga) {

        //parametros del objeto

        this.Disparos = Disparos ; this.Municiones = Municiones; this.Alcanze = Alcanze; this.Daño = Daño; this.VelocidadDeRecarga = VelocidadDeRecarga;

    }
}
