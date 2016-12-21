package hoofdstuk12;
import java.awt.*;
import java.applet.*;

public class hoofdstuk1202 extends Applet {
    Button knop;

    public void init() {
        for (int teller = 0; teller < 26; teller++) {
            knop = new Button("ok");
            add(knop);
        }
    }
    public void paint(Graphics g) {
        repaint();
    }
}
