package com.company.Automocion;

public class Avion extends Vehiculos {

    int Velocidad;
    // atributos que hereda de la clase Vehiculos
    public Avion (int Ataque, int Defensa, float Punteria, int MovimientoEspecial, int Desplazamiento, int Velocidad){

        // super: manda a llamar al constructor
        super (Ataque, Defensa, Punteria,MovimientoEspecial, Desplazamiento);
        this.Velocidad = Velocidad;
    }

    //Se le saca get y set a la nueva caracteristica que lo distingue de los demas

    public Avion(){
    }

    public int getVelocidad(){
        return Velocidad;
    }

    public void setVelocidad(int Velocidad){
        this.Velocidad = Velocidad;
    }

    //Mostrando los valores iniciales que se tiene de cada caracteristia del Avion
    // \n es un enter

    public void mostrar (){
        System.out.println("Ataque = 7 Puntos \n, " +
                "Defensa = 3 Puntos \n, " +
                "Punteria = 70 \n," +
                " Movimiento Especial = 20 \n, " +
                "Velocidad = 1 ");
    }


}
