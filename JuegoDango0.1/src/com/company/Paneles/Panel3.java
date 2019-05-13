package com.company.Paneles;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Panel3 extends JFrame{
    private JPanel panel33;

    Cuadro[][] matrizCuadros;
    JPanel panelIngreso, panelVer, panelBotones;
    JTextField fieldDimension;
    JLabel labelInstrucciones, labelEvaluar;
    JButton btnAgregar, btnTienda, btnTanque, btnAvion;

    boolean torre;


    public Panel3(String nombre) {
        /*super(nombre);
        this.setTitle(nombre);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 800);*/

        torre = true;

        labelInstrucciones = new JLabel("Agregue la dimension");
        labelEvaluar = new JLabel("0");
        fieldDimension = new JTextField(10);
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
                fieldDimension.setEnabled(false);
                addCuadro();
            }
        });

        btnTienda.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                delCuadro();
                btnAgregar.setEnabled(true);
                fieldDimension.setEnabled(true);
                fieldDimension.setText("");
                fieldDimension.requestFocus();
            }
        });

        btnTanque.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //botones.setEstado(true);
                torre = true;
            }
        });


        btnAvion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //botones.setEstado(false);
                torre = false;
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
        panelIngreso.add(fieldDimension);
        panelIngreso.add(btnAgregar);
        panelIngreso.add(btnTanque);
        panelBotones.add(btnAvion);
        panelBotones.add(btnTanque);
        panelIngreso.add(labelEvaluar);
        this.getContentPane().add(BorderLayout.NORTH, panelIngreso);
        this.getContentPane().add(BorderLayout.CENTER, panelBotones);
        this.getContentPane().add(BorderLayout.SOUTH, panelBotones);


        setVisible(true);
    }

    public Panel3() {

    }


    public void delCuadro() {
        for (int i = 0; i < Integer.parseInt(fieldDimension.getText()); i++) {
            for (int j = 0; j < Integer.parseInt(fieldDimension.getText()); j++) {
                matrizCuadros[i][j] = null;
            }
            panelBotones.removeAll();
        }
        panelBotones.repaint();
    }

    public void addCuadro() {
        int tmp = Integer.parseInt(fieldDimension.getText());

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
