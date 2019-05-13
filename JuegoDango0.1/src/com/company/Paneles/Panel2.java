package com.company.Paneles;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Panel2 extends JPanel {

    private JPanel panel1;
    private JPanel panelIngreso;
    private JTextField usuario;
    private JLabel lUsuaruio;
    private JButton listo;

    public Panel2(){
        super();

        panelIngreso = new JPanel();

        usuario= new JTextField(5);
        lUsuaruio = new JLabel ("Usuario: ");
        listo = new JButton("¡Listos!");

        panelIngreso.add(lUsuaruio);
        panelIngreso.add(usuario);
        panelIngreso.add(listo);


        listo.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {

                        Saludo();


                    }

                }
        );



        setVisible(false);
    }

    public void Saludo(){
        //Entrada
        String nombre = "" + usuario.getText();

        JOptionPane.showMessageDialog(this,"Bienvenido"+nombre);

    }
}
