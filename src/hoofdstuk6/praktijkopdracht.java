package hoofdstuk6;

import java.awt.*;
import java.applet.*;

public class praktijkopdracht extends Applet {
    double a;
    double b;
    double c;
    double uitkomst;
    double afgerondeuitkomst;
    double keeruitkomst;
    int intuitkomstt;
    double doubleuitkomst;
    double totaaluitkomst;



    public void init() {
        a = 5.9;
        b = 6.3;
        c = 6.9;
        uitkomst = a + b + c;
        afgerondeuitkomst = uitkomst /= 3;
        keeruitkomst = afgerondeuitkomst * 10;
        intuitkomstt = (int)  keeruitkomst;
        doubleuitkomst = intuitkomstt;
        totaaluitkomst = doubleuitkomst / 10;



    }

    public void paint(Graphics g) {
        super.paint(g);

        g.drawString("uitkomst " + totaaluitkomst, 200, 20);

    }
    }




