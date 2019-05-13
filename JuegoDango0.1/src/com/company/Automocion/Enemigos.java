package com.company.Automocion;

public class Enemigos extends Vehiculos {

    int Velocidad;

    // atributos que hereda de la clase Vehiculos

    public Enemigos (int Ataque, int Defensa, float Punteria, int MovimientoEspecial, int Desplazamiento, int Velocidad){

        // super: manda a llamar al constructor

        super (Ataque, Defensa, Punteria,MovimientoEspecial, Desplazamiento);
        this.Velocidad = Velocidad;
    }

    //Se le saca get y set a la nueva caracteristica que lo distingue de los demas

    public Enemigos(){
    }

    public int getVelocidad(){
        return Velocidad;
    }

    public void setVelocidad(int Velocidad){
        this.Velocidad = Velocidad;
    }




}