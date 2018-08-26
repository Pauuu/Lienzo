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

    JButton boton;
    JPanel mainPanel;
    Lienzo lien;

    public Ventana() {
        super("Lienzo");

        this.setFocusable(true); //sin esto, no tira
        //this.requestFocus();

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
}
