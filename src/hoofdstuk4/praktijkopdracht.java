package hoofdstuk4;
import java.awt.*;
import java.applet.*;

public class praktijkopdracht extends Applet {
    Color achtergrondKleur;

    public void init() {
        achtergrondKleur = new Color(0, 102, 204);
    }

    public void paint(Graphics g) {
        super.paint(g);

//lijn
        g.drawLine(10, 10, 120, 10);
        g.drawString("Lijn", 60, 30);
//rechthoek
        g.drawRect(10, 40, 120, 80);
        g.drawString("Rechthoek", 40, 140);
//afgeronde rechthoek
        g.drawRoundRect(10, 150, 120, 80, 30, 30);
        g.drawString("Afgeronde rechthoek", 20, 250);
// gevulde rechthoek met ovaal
        Color achtergrondKleur = this.achtergrondKleur;
        g.fillRect(140, 40, 120, 80);
        g.setColor(Color.blue);
        g.drawOval(140, 40, 120, 80);
        g.setColor(Color.black);
        g.drawString("Gevulde rechthoek met ovaal", 105, 140);
// gevulde ovaal
        g.setColor(Color.magenta);
        g.fillOval(140, 150, 120, 80);
        g.setColor(Color.black);
        g.drawString("gevulde ovaal", 160, 250);
// taartpunt met ovaal eromheen
        g.setColor(Color.black);
        g.drawOval(265, 40, 120, 80);
        Color achtergrondKleur1 = this.achtergrondKleur;
        g.fillArc(265, 40, 120, 80, 0, 45);
        g.setColor(Color.black);
        g.drawString("Taartpunt met ovaal eromheen", 270, 140);
// cirkel
        g.drawOval(290, 150, 80, 80);
        g.drawString("Cirkel", 315, 250);
    }
}