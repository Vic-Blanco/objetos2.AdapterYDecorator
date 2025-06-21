package ejercicio2;

import javax.swing.*;
import java.awt.*;

class Canvas extends JPanel {
    private java.util.List<Figura> figuras;

    public Canvas() {
        figuras = new java.util.ArrayList<>();
    }

    public void agregarFigura(Figura figura) {
        figuras.add(figura);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        Panel panel = new Graphics2DAdapter(g2);

        for (Figura figura : figuras) {
            figura.dibujar(panel);
        }
    }
}