package ProyectoLienzo;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;

/**
 *
 * @author pau
 */
public class Lienzo extends Canvas {

    Color colorin;
    int posX;
    int posY;
    Ventana ventana;

    public Lienzo(Color c, int x, int y, Ventana l) {

        this.colorin = c;
        this.posX = x;
        this.posY = y;
        this.ventana = l;
    }

    @Override
    public void paint(Graphics g) {

        Graphics2D g2d = (Graphics2D) g; // cast the graphics context

        g2d.setColor(colorin);
        g2d.fillOval(posX, posY, 90, 90);
    }

    /*
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
                System.out.println(".");

    }
     */
}
