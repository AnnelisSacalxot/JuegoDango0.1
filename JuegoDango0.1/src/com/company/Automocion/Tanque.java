package com.company.Automocion;

public class Tanque extends Vehiculos {

    // atributos que hereda de la clase Vehiculos
    public Tanque (int Ataque, int Defensa, float Punteria, int MovimientoEspecial, int Desplazamiento)
    {


        //super: manda a llamar al constructor
        super (Ataque, Defensa, Punteria , MovimientoEspecial, Desplazamiento);
    }


    //Mostrando los valores iniciales que se tiene de cada caracteristia del Tanque
    public void mostrar (){
        System.out.println("Ataque = 10 Puntos \n, Defensa = 6 Puntos \n, Punteria = 60 \n, Movimiento Especial = 20");

    }
}
