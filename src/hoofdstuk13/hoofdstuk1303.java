package hoofdstuk13;
import java.applet.*;
import java.awt.*;
public class hoofdstuk1303 extends Applet {
    public void paint(Graphics g) {
        g.setColor(Color.red);
        int x1, y1, x2, y2, breete, lengte, xcordinaat, ycorndinaat;

        breete = 60;
        lengte = 60;
        xcordinaat = 0;
        ycorndinaat = 200;

        x1 = xcordinaat;
        y1 = ycorndinaat;
        x2 = breete;
        y2 = lengte;

        g.setColor(Color.black);
        rodemuur(g, x1, y1, x2, y2);
    }

    void rodemuur(Graphics g, int x1, int y1, int x2, int y2) {
        for (int i = 0; i < 6; i++) {
            x1 = 60;
            g.setColor(Color.black);
            g.drawRect(x1, y1, x2, y2);
            g.setColor(Color.red);
            x2 = y2 = 59;
            g.fillRect(x1, y1, x2, y2);
            for (int j = 0; j < 7; j++) {
                x1 += 61;
                g.setColor(Color.black);
                g.drawRect(x1, y1, x2, y2);
                g.setColor(Color.red);
                x2 = y2 = 59;
                g.fillRect(x1, y1, x2, y2);
            }
            y1 += 61;
            setSize(600, 600);
        }
    }
}