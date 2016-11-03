package hoofdstuk11;
import java.awt.*;
import java.applet.*;
/**
 * Created by Dell on 30-10-2016.
 * by thomas
 */
public class hoofdstuk1104 extends Applet {


    public void init() {}

    public void paint(Graphics g) {
        int teller;
        int andwoord;
        int y = 0;

        for(teller = 1; teller < 11; teller++) {
            andwoord = teller * 3;
            y += 20;
            g.drawString("" + andwoord, 165, y );
            g.drawString(teller + " keer 3 =", 105, y );
        }
    }
}