package ejercicio2;

import java.awt.*;

public class Graphics2DAdapter implements Panel {
    private Graphics2D g;

    public Graphics2DAdapter(Graphics2D graphics2D) {
        this.g = graphics2D;
    }

    @Override
    public void pintarCirculo(int x, int y, int radio) {
        g.drawOval(x - radio, y - radio, 2 * radio, 2 * radio);

    }

    @Override
    public void pintarLinea(int x1, int y1, int x2, int y2) {
        g.drawLine(x1, y1, x2, y2);
    }

    @Override
    public void pintarTexto(int x, int y, String texto) {
        g.drawString(texto, x, y);
    }

}
