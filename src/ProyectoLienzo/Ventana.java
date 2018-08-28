package ProyectoLienzo;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;

public class Ventana extends JFrame implements KeyListener, Runnable {

    JButton boton;
    JPanel mainPanel;
    Thread animator;
    Lienzo lien;

    public Ventana() {
        super("Lienzo");

        this.setFocusable(true); //sin esto, no tira el escuchador de eventos

        //Añade el escuchador a la ventana
        this.addKeyListener(this);

        //muestra la ventana en condiciones
        this.mostrarVentana();

        //arranca el hilo una vez mostrada la ventana
        this.empezarAnimacion();
    }

    public void empezarAnimacion() {
        this.animator = new Thread(this);
        this.animator.start();
    }

    public void mostrarVentana() {

        setSize(700, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //recoge el contenedor de la ventana y lo almacena en la variable "cp"
        Container cp = this.getContentPane();

        //crea un JPanel con layout GridGagLayout en "mainPanel"
        this.mainPanel = new JPanel(new GridBagLayout());

        //"lien" es el objeto lienzo
        this.lien = new Lienzo(Color.red, 70, 80, this);

        cp.add(lien);
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

        int key = e.getKeyCode();

        if (key == KeyEvent.VK_UP) {
            this.lien.requestFocus();
        }

        if (key == KeyEvent.VK_DOWN) {
            this.requestFocus();
        }

        System.out.println(".");

    }

    @Override
    public void run() {

        int num = 0;

        while (true) {
            System.out.println("test: " + num);
            num++;

            
            
            try {
                this.lien.posX++;
                Thread.sleep(20);
                this.lien.repaint();
                
            } catch (InterruptedException ex) {
            }
        }
    }
}
