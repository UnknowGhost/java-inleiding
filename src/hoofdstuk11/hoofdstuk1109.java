package hoofdstuk11;
import java.applet.Applet;
import java.awt.*;

/**
 * Created by Dell on 30-10-2016.
 */
public class hoofdstuk1109 extends Applet {
    int marge;
    int breedteVeld;
    int hoogteVeld;
    Color wit;
    Color zwart;
    Color achtergrond;


    public void init() {
        wit = Color.white;
        zwart = Color.black;
        achtergrond = Color.lightGray;
        marge = 60;
        breedteVeld = 40;
        hoogteVeld = breedteVeld;

        int breedteScherm = 2 * marge + 8 * breedteVeld;
        int hoogteScherm = 2 * marge + 8 * hoogteVeld;
        setSize(breedteScherm, hoogteScherm);
        setBackground(achtergrond);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        int y = marge;
        for (int rij = 0; rij < 8; rij++) {
            int x = marge;
            for (int kolom = 0; kolom < 8; kolom++) {
                if ( (rij +kolom) % 2 == 0 ) {
                    g.setColor(zwart);
                } else {
                    g.setColor(wit);
                }
                g.fillRect(x, y, breedteVeld, hoogteVeld);
                x += breedteVeld;
            }
            y += hoogteVeld;
        }
    }
}
