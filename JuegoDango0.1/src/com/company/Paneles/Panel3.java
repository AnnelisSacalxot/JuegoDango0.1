package com.company.Paneles;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class Panel3 extends JPanel{
    private JPanel panel33;

    Cuadro[][] matrizCuadros;
    JPanel panelIngreso, panelVer, panelBotones;
    JTextField fieldEscenario;
    JLabel labelInstrucciones, labelEvaluar;
    JButton btnAgregar, btnTienda, btnTanque, btnAvion;

    boolean Tanque;


    public Panel3(String nombre) {
        super();
        delCuadro();
        matrizCuadros = new Cuadro[][];

        Tanque = true;

        labelInstrucciones = new JLabel("Agregue la dimension");
        labelEvaluar = new JLabel("0");
        fieldEscenario = new JTextField(10);
        btnAgregar = new JButton("Agregar");
        btnTienda = new JButton("Tienda");
        btnAvion = new JButton();
        btnTanque = new JButton();
        panelIngreso = new JPanel();
        panelVer = new JPanel();
        panelBotones = new JPanel();

        //Agregar imagenes de los botones selccionadores
        btnTanque.setIcon(new ImageIcon("src/Imagenes/ars.jpg"));
        btnAvion.setIcon(new ImageIcon("src/Imagenes/enal.jpg"));

        /**
         * Este metodo me sirve para dar accion a los botones
         */
        btnAgregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnAgregar.setEnabled(false);
                fieldEscenario.setEnabled(false);
                addCuadro();
            }
        });

        btnTienda.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                delCuadro();
                btnAgregar.setEnabled(true);
                fieldEscenario.setEnabled(true);
                fieldEscenario.setText("");
                fieldEscenario.requestFocus();
            }
        });

        btnTanque.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //botones.setEstado(true);
                Tanque = true;
            }
        });


        btnAvion.addActionListener(new ActionListener() {
            private Object Avion;

            @Override
            public void actionPerformed(ActionEvent e) {
                //botones.setEstado(false);
                Avion = true;
            }
        });

        //Agrego bordes a los paneles
        TitledBorder bordePanelInformacion = new TitledBorder("Ingreso de datos");
        bordePanelInformacion.setTitleJustification(TitledBorder.CENTER);
        bordePanelInformacion.setTitlePosition(TitledBorder.TOP);
        panelIngreso.setBorder(bordePanelInformacion);

        TitledBorder bordePanelBotones = new TitledBorder("Tablero de juego");
        bordePanelInformacion.setTitleJustification(TitledBorder.CENTER);
        bordePanelInformacion.setTitlePosition(TitledBorder.TOP);
        panelBotones.setBorder(bordePanelBotones);

        TitledBorder bordePanelPiezas = new TitledBorder("Elija una para poner en el tablero");
        bordePanelPiezas.setTitleJustification(TitledBorder.CENTER);
        bordePanelPiezas.setTitlePosition(TitledBorder.TOP);
        panelBotones.setBorder(bordePanelPiezas);

        // todo al JFrame
        panelIngreso.add(labelInstrucciones);
        panelIngreso.add(fieldEscenario);
        panelIngreso.add(btnAgregar);
        panelIngreso.add(btnTanque);
        panelBotones.add(btnAvion);
        panelBotones.add(btnTanque);
        panelIngreso.add(labelEvaluar);



        setVisible(false);
    }

    public void moverVehiculo(Cuadro cuadro, Cuadro cuadro1){
        int x,y,d;
        Scanner n = new Scanner(System.in);
        System.out.println("Posición y:");
        x= n.nextInt();
        System.out.println("Posición x:");
        y=n.nextInt();
        System.out.println("0 izquierda, 1 derecha:");
        d = n.nextInt();

        if (movimientoValido(x,y,1)&& movimientoValido(x,y,0)){
            if (movimientoValido(matrizCuadros[x][y],matrizCuadros[(x+1)][(y+1)]))
                moverVehiculo(matrizCuadros[x][y],matrizCuadros[(x+1)][(y+1)]);
            else
                System.out.println("¡Invalido!");
        }
        else
            System.out.println("Fuera de rango");


    }

    public void moverTanque(Cuadro co, Cuadro cd){
        cd.setTanque(co.getTanque());
        co.setTanque(null);

    }
    public void moverAvion(Cuadro co, Cuadro cd){
        cd.setAvion(co.getAvion());
        co.setAvion(null);

    }

    public boolean movimientoValido(Cuadro co, Cuadro cd){
        if (cd.isEmpty() && !co.isEmpty())
            return true;
        return false;
    }


    public boolean movimientoValido(int x, int y, int m){
        x+=m;
        y+=m;
        if ((x>=0) && (x<= 7) && (y>=0 ) && (y<=7))
            return true;
        return false;
    }


    public void jugar(){
        addCuadro();
        moverVehiculo(matrizCuadros[x][y], matrizCuadros[(x + 1)][(y + 1)]);
        addCuadro();
        moverVehiculo(matrizCuadros[x][y], matrizCuadros[(x + 1)][(y + 1)]);
        addCuadro();



    }


    public Panel3() {

    }


    public void delCuadro() {
        for (int i = 0; i < Integer.parseInt(fieldEscenario.getText()); i++) {
            for (int j = 0; j < Integer.parseInt(fieldEscenario.getText()); j++) {
                matrizCuadros[i][j] = null;
            }
            panelBotones.removeAll();
        }
        panelBotones.repaint();
    }

    public void addCuadro() {
        int tmp = Integer.parseInt(fieldEscenario.getText());

        this.matrizCuadros = new Cuadro[tmp][tmp];
        //Greed Layout para botones
        panelBotones.setLayout(new GridLayout(tmp,tmp));
        for (int i = 0; i < tmp; i++) {
            for (int j = 0; j < tmp; j++) {
                this.matrizCuadros[i][j] = new Cuadro(i, j, panelBotones, this);

            }
        }
        this.setVisible(true);
    }
}
