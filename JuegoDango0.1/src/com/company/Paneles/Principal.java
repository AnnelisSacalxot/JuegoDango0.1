package com.company.Paneles;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Principal extends JFrame implements ActionListener {

  Panel0 panel0 = new Panel0();
  Panel2 panel2 = new Panel2();
  Panel3 panel3 = new Panel3();
  Panel0 p;

    private JPanel panel1;
    private JPanel contenedor;
    private JPanel Botones;
    private JButton btn_siguiente;
    private JButton btn_salir;
    private JButton btn_anterior;

    public Principal(String nombre){
        super(nombre);
        setTitle(nombre);
        setSize(600,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        Container content = getContentPane();
        p = new Panel0();
        content.add(p);


        contenedor.add(panel0);
        panel0.setVisible(true);
        panel1.setVisible(false);
        panel3.setVisible(false);

        deshabilitarBotones();

        btn_anterior.addActionListener(this);
        btn_siguiente.addActionListener(this);
        btn_salir.addActionListener(this);


        /**
         * Este metodo me sirve para salir y que el programa en definitiva ya no se ejecute
         */


        btn_salir.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        salirDelJuego();
                    }
                }
        );

        setVisible(true);

}

    public void salirDelJuego(){
        System.exit(0);
    }


    /**
     * Este metodo de accion para los botones esten activos o no
     */

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

        Object suceso = actionEvent.getSource();

        if (suceso.equals(btn_anterior)){
            panel0.setVisible(true);
            panel1.setVisible(false);
            panel3.setVisible(false);

            contenedor.add(panel0);
            contenedor.validate();
            deshabilitarBotones();

        }else if (suceso.equals(btn_siguiente)){
            panel0.setVisible(false);
            panel1.setVisible(true);
            panel3.setVisible(false);

            contenedor.add(panel1);
            contenedor.validate();
            deshabilitarBotones();

        }else if (suceso.equals(btn_siguiente)){
            panel0.setVisible(false);
            panel1.setVisible(false);
            panel3.setVisible(true);

            contenedor.add(panel3);
            contenedor.validate();
            deshabilitarBotones();
        }
    }
    public void deshabilitarBotones(){
        if (panel0.isVisible()){
            btn_anterior.setEnabled(false);
            btn_siguiente.setEnabled(true);
        }else if (panel1.isVisible()){
            btn_anterior.setEnabled(true);
            btn_siguiente.setEnabled(true);
            }else if (panel3.isVisible()){
            btn_anterior.setEnabled(true);
            btn_siguiente.setEnabled(false);
        }
    }
}