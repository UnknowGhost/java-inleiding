package hoofdstuk11;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class praktijkopdracht02 extends Applet {
    Button knop1;
    int s;

    public void init() {
        knop1 = new Button("ok");
        knop1.addActionListener(new KnopListener());
        add(knop1);
    }

    public void paint(Graphics g) {
        int teller;
        int antwoord;
        int y = 20;

        for (teller = 1; teller < 11; teller++) {
            antwoord = s * teller;
            y += 20;
            g.drawString(teller + " keer " + s +  " = " + antwoord, 115, y);

        }
    }
    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = s + 1;
            repaint();
        }
    }
}