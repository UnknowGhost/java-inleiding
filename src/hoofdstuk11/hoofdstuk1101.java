package hoofdstuk11;
import java.awt.*;
import java.applet.*;
/**
 * Created by Dell on 30-10-2016.
 */
public class hoofdstuk1101 extends Applet {


    public void init() {}

    public void paint(Graphics g) {
        int teller;
        int y = 0;

        for(teller = 0; teller < 11; teller++) {
            y += 20;
            g.drawLine(50 , y, 300, y );
            g.drawString("" + teller, 305, y );
        }
    }
}