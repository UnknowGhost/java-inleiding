package hoofdstuk5;

import com.sun.org.apache.xml.internal.security.Init;

import java.awt.*;
import java.applet.*;

public class opdracht52 extends Applet {
    int hans;
    int valerie;
    int jeroen;


    public void init() {
        hans = 80;
        valerie = 40;
        jeroen = 100;


    }

    public void paint(Graphics g) {

// staafdiagram
        setBackground(Color.gray);
        g.setColor(Color.black);
        g.drawString("jeroen", 500, 400 );
        g.setColor(Color.black);
        g.drawString("Hans", 560, 400 );
        g.setColor(Color.black);
        g.drawString("Valerie", 620, 400 );
        g.setColor(Color.red);
        //staaf
        g.fillRect(500, 280, 30, jeroen);
        g.setColor(Color.white);
        g.fillRect(560, 300, 30, hans);
        g.setColor(Color.blue);
        g.fillRect(620, 340, 30, valerie);
        g.setColor(Color.black);
        // gegevens
        g.drawString("kilo 1:20", 670, 400 );
        g.setColor(Color.black);
        g.drawString("5", 490, 300 );
        g.setColor(Color.black);
        g.drawString("4", 490, 320 );
        g.setColor(Color.black);
        g.drawString("3", 490, 340 );
        g.setColor(Color.black);
        g.drawString("2", 490, 360 );
        g.setColor(Color.black);
        g.drawString("1", 490, 380 );
    }

}
