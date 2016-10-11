package hoofdstuk2;
import java.awt.*;
import java.applet.*;


public class opdracht201 extends Applet {

    public void init() {
        setBackground(Color.blue);
    }

    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.drawString("Thomas Ponzo", 50, 60 );
    }
}