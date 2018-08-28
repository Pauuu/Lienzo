package ProyectoLienzo;

import java.awt.*;

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

        //creamos la relacion estructural
        this.colorin = c;
        this.posX = x;
        this.posY = y;
        this.ventana = l;
        this.img = null;
    }

    private void renderizar() { //esto no se pa que era
        this.img = createImage(alto, ancho);
        this.grx = this.img.getGraphics();
        this.grx.setColor(Color.WHITE);
        this.grx.fillOval(posX, posY, 90, 90);
    }

    @Override
    public void paint(Graphics g) {

        Graphics2D g2d = (Graphics2D) g; // cast the graphics context
        g2d.setColor(colorin);
        g2d.fillOval(posX, posY, 90, 90);
    }
}
