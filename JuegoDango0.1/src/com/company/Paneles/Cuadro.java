package com.company.Paneles;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cuadro extends JButton {

    int posx, posy;


    Panel3 ventana;

    boolean situacion;
    boolean recorrido;


    public Cuadro(int posx, int posy, JPanel panel, Panel3 tmpPanel3) {
        panel.add(this);
        this.posx = posx;
        this.posy = posy;
        this.setVisible(true);
        panel.setVisible(true);
        this.ventana = tmpPanel3;
        situacion = false;
        recorrido = false;

        //Reaccionar al click de un boton
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                System.out.println("x "+posx+" Y "+posy);
                reaccion();
            }
        });
    }


    public void reaccion() {
        if (recorrido  == true)
            gameover();
        else {
            situacion = true;
            if (ventana.torre) {
                System.out.println("ventana.hilotorre(x,y)");
                this.setIcon(new ImageIcon("src/Imagenes/ars.png"));
                Hilo tmp = new Hilo(posx, posy, ventana,ventana.matrizCuadros,true);
                tmp.start();

            } else {
                this.setIcon(new ImageIcon("src/Imagenes/enal.jpg"));

                Hilo tmp = new Hilo(posx, posy, ventana,ventana.matrizCuadros,false);
                tmp.start();
                System.out.println(posx + ", " + posy);
            }
        }
    }

    public void setAvion() {
        if (situacion== true)
            gameover();
        else {
            if (recorrido)
                this.setBackground(Color.black);
            else
                this.setBackground(Color.red);
            recorrido = true;

        }
    }


    public void setTanque() {
        if (situacion == true)
            gameover();
        else {
            if (recorrido)
                this.setBackground(Color.black);
            else
                this.setBackground(Color.blue);
            recorrido = true;
            //this.setBackground(Color.blue);
        }
    }



    private void gameover(){
        this.setBackground(Color.yellow);
        JDialog d = new JDialog(ventana, "Perdio ");

        // create a label
        JLabel l = new JLabel("en la posición x "+posx+" y "+posy);



        // create a panel
        JPanel p = new JPanel();


        p.add(l);

        // add panel to dialog
        d.add(p);

        // setsize of dialog
        d.setSize(200, 200);

        // set visibility of dialog
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension  screenSize = toolkit.getScreenSize();
        int x = (screenSize.width - d.getWidth()) / 2;
        int y = (screenSize.height - d.getHeight()) / 2;
        d.setLocation(x, y);
        d.setVisible(true);
    }

}
