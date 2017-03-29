package hoofdstuk14;
import java.awt.*;
import java.applet.*;
import java.net.URL;

public class Afbeelding extends Applet {

    private Image afbeelding;
    private URL pad;

    public void init() {
        pad = Afbeelding.class.getResource("/resources/");
        afbeelding = getImage(pad, "Old_sponge.png");
    }

    public void paint(Graphics g) {
        g.drawString(pad.toString(), 20, 10 );
        g.drawImage(afbeelding, 20, 20, 30, 30, this);
    }
}