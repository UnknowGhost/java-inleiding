package hoofdstuk13;
import java.applet.*;
import java.awt.*;

public class praktijkopdracht2 extends Applet {

    public void paint(Graphics g) {
        g.setColor(Color.red);
        int x1, x1b, y1, y1b, x2, y2, xy2, breete, lengte, lbb, xcordinaat, xcordinaatb, ycorndinaat, ycorndinaatb;
        setSize(1280, 720);

        //stam
        breete = 60;
        lengte = 200;
        xcordinaat = 60;
        ycorndinaat = 100;

        x1 = xcordinaat;
        y1 = ycorndinaat;
        x2 = breete;
        y2 = lengte;

        //bladeren//
        lbb = 150;
        xcordinaatb = 15;
        ycorndinaatb = 20;

        xy2 = lbb;
        x1b = xcordinaatb;
        y1b = ycorndinaatb;

        bomen(g, x1, x1b, y1, y1b, x2, y2, xy2);
    }

    void bomen(Graphics g, int x1, int x1b, int y1, int y1b, int x2, int y2, int xy2) {
        for (int i = 0; i < 3; i++) {
            x1 = 60;
            x1b = 20;
            g.fillRect(x1, y1, x2, y2);
            g.setColor(Color.black);
            g.drawRect(x1, y1, x2, y2);
            g.fillRect(x1, y1, x2, y2);
            g.setColor(Color.green);
            g.fillOval(x1b, y1b, xy2, xy2);
            for (int j = 0; j < 7; j++) {
                x1b += 160;
                x1 += 160;
                g.fillRect(x1, y1, x2, y2);
                g.setColor(Color.black);
                g.drawRect(x1, y1, x2, y2);
                g.fillRect(x1, y1, x2, y2);
                g.setColor(Color.green);
                g.fillOval(x1b, y1b, xy2, xy2);
            }
            y1 += 300;
            y1b += 300;
        }
    }
}

