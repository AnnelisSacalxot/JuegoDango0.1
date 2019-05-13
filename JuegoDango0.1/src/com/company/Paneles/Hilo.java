package com.company.Paneles;

public class Hilo extends Thread{

    int x;
    int y;
    Panel3 ventana;
    Cuadro[][] matriz;
    boolean torre;

    public Hilo(int X, int Y, Panel3 ventana, Cuadro[][] matriz, boolean torre) {
        this.x = X;
        this.y = Y;
        this.matriz = matriz;
        this.ventana = ventana;
        this.torre = torre;
    }


    @Override
    public void run() {

        if (torre)
            //recorridoTorre();
            recorridoTR(1,ventana.matrizCuadros.length);
        else
            recorridoAR(1,ventana.matrizCuadros.length);
        //recorridoAlfil();

        //recorridoTorre();
        //ventana.recorridoTorre(x,y);
        // System.out.println("hola"+matriz[x][y].getX());

    }

    public void recorridoTR(int contador, int size){
        int tm =0;
        System.out.println("Contador: "+contador);

        if (((x-contador)>=0))
            ventana.matrizCuadros[x-contador][y].setTanque();
        else
            tm++;

        if (((y+contador)<size))
            ventana.matrizCuadros[x][y+contador].setTanque();
        else
            tm++;

        if (((x+contador)<size))
            ventana.matrizCuadros[x+contador][y].setTanque();
        else
            tm++;

        if (((y-contador)>=0))
            ventana.matrizCuadros[x][y-contador].setTanque();
        else
            tm++;

        ventana.setVisible(true);
        try {
            sleep(300);
        } catch (InterruptedException ex) {
            //  Logger.getLogger(Hilos.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (tm != 4)
            recorridoTR(contador+1,size);
        else
            return;


    }


    public void recorridoAR(int contador, int size){
        int tm =0;
        System.out.println("Contador A: "+contador);

        if (((x-contador)>=0)&&((y-contador)>=0))
            ventana.matrizCuadros[x-contador][y-contador].setAvion();
        else
            tm++;

        if (((x-contador)>=0)&&((y+contador)<size))
            ventana.matrizCuadros[x-contador][y+contador].setAvion();
        else
            tm++;

        if (((x+contador)<size)&&((y+contador)<size))
            ventana.matrizCuadros[x+contador][y+contador].setAvion();
        else
            tm++;

        if (((x+contador)<size)&&((y-contador)>=0))
            ventana.matrizCuadros[x+contador][y-contador].setAvion();
        else
            tm++;

        ventana.setVisible(true);
        try {
            sleep(300);
        } catch (InterruptedException ex) {
            //  Logger.getLogger(Hilos.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (tm != 4)
            recorridoAR(contador+1,size);
        else
            return;


    }

    public void recorridoTorre() {
        int contador = 1;
        int size = ventana.matrizCuadros.length;
        int tm =0;
        while (tm!=4){
            tm = 0;

            if (((x-contador)>=0))
                ventana.matrizCuadros[x-contador][y].setTanque();
            else
                tm++;

            if (((y+contador)<size))
                ventana.matrizCuadros[x][y+contador].setTanque();
            else
                tm++;

            if (((x+contador)<size))
                ventana.matrizCuadros[x+contador][y].setTanque();
            else
                tm++;

            if (((y-contador)>=0))
                ventana.matrizCuadros[x][y-contador].setTanque();
            else
                tm++;

            contador++;

            ventana.setVisible(true);
            try {
                sleep(300);
            } catch (InterruptedException ex) {
                //  Logger.getLogger(Hilos.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    public void recorridoAlfil(){
        int contador = 1;
        int size = ventana.matrizCuadros.length;
        int tm =0;
        while (tm!=4){
            tm = 0;

            if (((x-contador)>=0)&&((y-contador)>=0))
                ventana.matrizCuadros[x-contador][y-contador].setAvion();
            else
                tm++;

            if (((x-contador)>=0)&&((y+contador)<size))
                ventana.matrizCuadros[x-contador][y+contador].setAvion();
            else
                tm++;

            if (((x+contador)<size)&&((y+contador)<size))
                ventana.matrizCuadros[x+contador][y+contador].setAvion();
            else
                tm++;

            if (((x+contador)<size)&&((y-contador)>=0))
                ventana.matrizCuadros[x+contador][y-contador].setAvion();
            else
                tm++;

            contador++;

            ventana.setVisible(true);
            try {
                sleep(300);
            } catch (InterruptedException ex) {
                //  Logger.getLogger(Hilos.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }



}