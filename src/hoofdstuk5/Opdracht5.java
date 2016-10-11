package hoofdstuk5;

import java.awt.*;
import java.applet.*;

public class Opdracht5 extends Applet {
    Color achtergrondKleur;
    int x;
    int y;


    public void init() {

    }

    public void paint(Graphics g) {
        super.paint(g);
        achtergrondKleur = new Color(255, 0, 255);
        y = 120;
        x = 80;

//lijn
        g.drawLine(10, 10, y, 10);
        g.drawString("Lijn", 60, 30);
//rechthoek
        g.drawRect(10, 40, y, x);
        g.drawString("Rechthoek", 40, 140);
//afgeronde rechthoek
        g.drawRoundRect(10, 150, y, x, 30, 30);
        g.drawString("Afgeronde rechthoek", 20, 250);
// gevulde rechthoek met ovaal
        g.setColor( achtergrondKleur);
        g.fillRect(140, 40, y, x);
        g.setColor(Color.blue);
        g.drawOval(140, 40, y, x);
        g.setColor(Color.black);
        g.drawString("Gevulde rechthoek met ovaal", 105, 140);
// gevulde ovaal
        g.setColor( achtergrondKleur);
        g.fillOval(140, 150, y, x);
        g.setColor(Color.black);
        g.drawString("gevulde ovaal", 160, 250);
// taartpunt met ovaal eromheen
        g.setColor(Color.black);
        g.drawOval(265, 40, y, x);
        g.setColor( achtergrondKleur);
        g.fillArc(265, 40, y, x, 0, 45);
        g.setColor(Color.black);
        g.drawString("Taartpunt met ovaal eromheen", 270, 140);
// cirkel
        g.drawOval(290, 150, 80, 80);
        g.drawString("Cirkel", 315, 250);

    }
}