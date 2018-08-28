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
    Graphics grx;
    Image img;
    int alto;
    int ancho;
    int posX;
    int posY;
    Ventana ventana;

    public Lienzo(Color c, int x, int y, Ventana l) {

        

        this.colorin = c;
        this.posX = x;
        this.posY = y;
        this.ventana = l;
        this.img = null;

       
    }

    private void renderizar() {
        this.img = createImage(alto, ancho);
        this.grx = this.img.getGraphics();
        this.grx.setColor(Color.WHITE);
        this.grx.fillOval(posX, posY, 90, 90);
    }

    /*
    @Override
    public void paint(Graphics g) {

        //Graphics2D g2d = (Graphics2D) g; // cast the graphics context
       // g.setColor(colorin);
        //g.fillOval(posX, posY, 90, 90);
    }
     */
    public void paintComponent(Graphics g) {

        if (this.img != null) {
            g.drawImage(this.img, 0, 0, null);
        }

    }

}
