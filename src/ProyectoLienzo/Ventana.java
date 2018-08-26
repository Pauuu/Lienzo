package ProyectoLienzo;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;

/**
 *
 * @author pau
 */
public class Ventana extends JFrame implements KeyListener {

    JPanel mainPanel;
    Lienzo lien;

    public Ventana() {
        super("Lienzo");

        this.setFocusable(true);
        this.requestFocus();

        //Añade el escuchador a la ventana
        this.addKeyListener(this);
        //muestra la ventana en condiciones
        this.mostrarVentana();

        //crea la bola
        //this.lien = new Lienzo(Color.red, 70, 80, this);
        //añade la bola en el panel
        //this.mainPanel.add(lien);
    }

    public void mostrarVentana() {

        setSize(700, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //recoge el contenedor de la ventana y lo almacena en la variable "cp"
        Container cp = this.getContentPane();

        //crea un JPanel con layout GridGagLayout
        this.mainPanel = new JPanel(new GridBagLayout());

        //this.lien = new Lienzo(Color.red, 70, 80, this);
        JButton boton1 = new JButton("Hola :1");
        JButton boton2 = new JButton("Hola :2");
        JButton boton3 = new JButton("Hola :3");
        
        cp.add(boton1);

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    //Al pulsar el boton de la coma, salta un msj en la terminal de netbeans
    @Override
    public void keyReleased(KeyEvent e) {

        System.out.println(".");
    }
}
