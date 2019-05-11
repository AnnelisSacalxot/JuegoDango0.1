package com.company.Paneles;

import javax.swing.*;
import java.awt.*;

public class Panel0 extends JFrame {

    private Image fondo;
    private JPanel panel0;
    private JButton button1;

    public Panel0(){

        preInit();
        initComponents();

    }

    public void initComponents(){

    }

    public void preInit(){
        fondo = new ImageIcon("jeje.gif").getImage();
    }

    public void paint (Graphics g){
        g.drawImage(fondo,0,0,getWidth(),getHeight(),this);

    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
