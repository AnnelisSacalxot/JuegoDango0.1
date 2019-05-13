package com.company;

import com.company.Paneles.Principal;

import java.util.InputMismatchException;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("se estan ejecutando los paneles");
       try {
           new Principal("Juego Endere");
       }catch (InputMismatchException p){

        }
       finally {
           System.out.println("Proceso terminado");
       }
    }
}
