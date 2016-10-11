/**
 * Created by Dell on 11-9-2016.
 */
package hoofdstuk2;
import java.awt.*;
import java.applet.*;

public class opdracht202 extends Applet {

    public void init() {
        setBackground(Color.white);
    }

    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawString("thomas", 50, 60 );
        g.setColor(Color.red);
        g.drawString("ponzo", 50, 70 );
    }
}
