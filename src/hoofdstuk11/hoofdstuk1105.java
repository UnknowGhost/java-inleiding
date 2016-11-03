package hoofdstuk11;
import java.awt.*;
import java.applet.*;
/**
 * Created by Dell on 30-10-2016.
 */
public class hoofdstuk1105 extends Applet {


    public void init() {}

    public void paint(Graphics g) {
        int teller;
        int andwoord;
        int y = 0;

        for(teller = 1; teller < 6; teller++) {
            y += 40;
            g.drawRect(y, y, 40, 40);
        }
    }
}
