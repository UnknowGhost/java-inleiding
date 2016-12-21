package hoofdstuk13;
import java.applet.*;
import java.awt.*;

public class praktijkopdracht1 extends Applet {

    public void paint(Graphics g) {
        g.setColor(Color.red);
        int x1, x1b, y1, y1b , x2, y2, xy2 ,  breete, lengte , lbb , xcordinaat, xcordinaatb, ycorndinaat, ycorndinaatb;
        setSize(400 , 400);

        //stam
        breete = 60;
        lengte = 200;
        xcordinaat = 150;
        ycorndinaat = 100;

        x1 = xcordinaat;
        y1 = ycorndinaat;
        x2 = breete;
        y2 = lengte;

        //bladeren//
        lbb = 150;
        xcordinaatb = 100;
        ycorndinaatb = 20;

        xy2 = lbb;
        x1b = xcordinaatb;
        y1b = ycorndinaatb;

        rodemuur(g, x1, x1b, y1, y1b, x2, y2 , xy2 );
    }

    void rodemuur(Graphics g, int x1, int x1b , int y1, int y1b , int x2, int y2 , int xy2 ) {
        g.setColor(Color.black);
        g.drawRect(x1, y1, x2, y2);
        g.fillRect(x1, y1, x2, y2);
        g.setColor(Color.green);
        g.fillOval(x1b, y1b, xy2, xy2);
    }
}
