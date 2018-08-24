package ProyectoLienzo;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;

/**
 *
 * @author pau
 */
public class Lienzo extends JFrame implements KeyListener {

    Bola bola;

    public Lienzo() {
        super("Lienzo");

        this.setSize(200, 200);

        //Añade el escuchador a la ventana
        this.addKeyListener(this);

        //muestra la ventana
        this.mostrarVentana();

    }

    public void crearBola(Container cp) {

        this.bola = new Bola(this, 140, 90, Color.black);
        cp.add(bola);
    }

    public void mostrarVentana() {

        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container cp = this.getContentPane();

        //Crea (es la intencion) una bola negra y la muestra por la ventana
        this.crearBola(cp);
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

        if (e.getKeyCode() == 44) {
            System.out.println("44 es una coma simple");

        } else {
            System.out.println(".");
        }
    }
}
