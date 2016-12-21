package hoofdstuk13;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Graphics;

public class hoofdstuk1304 extends Applet {

    Button knop;
    Button knop2;

    int breette;
    int breette2;

    int lengtte;
    int lengtte2;


    public void init() {
        knop = new Button("baksteenmuur");
        knop2 = new Button("butonmuur");

        knop.addActionListener(new TekstvakListener());
        knop2.addActionListener(new TekstvakListener2());

        add(knop);
        add(knop2);
        setSize(600 , 600);
    }

    public void paint(Graphics g) {
        g.setColor(Color.red);
        int x1, y1, x2, y2, breete, lengte, xcordinaat, ycorndinaat;
        int bx2 , by2 , breete2, lengte2;

        breete = breette;
        breete2 = breette2;

        lengte = lengtte;
        lengte2 = lengtte2;

        xcordinaat = 0;
        ycorndinaat = 200;

        x1 = xcordinaat;
        y1 = ycorndinaat;

        x2 = breete;
        bx2 = breete2;

        y2 = lengte;
        by2 = lengte2;

        g.setColor(Color.black);
        rodemuur(g, x1, y1, x2, y2);
        batonmuur(g, x1, y1, bx2, by2);
    }

    void rodemuur(Graphics g, int x1, int y1, int x2, int y2) {
        for (int i = 0; i < 6; i++) {
            x1 = 60;
            g.setColor(Color.black);
            g.drawRect(x1, y1, x2, y2);
            g.setColor(Color.red);
            g.fillRect(x1, y1, x2, y2);

            for (int j = 0; j < 7; j++) {
                x1 += 61;
                g.setColor(Color.black);
                g.drawRect(x1, y1, x2, y2);
                g.setColor(Color.red);
                g.fillRect(x1, y1, x2, y2);
            }
            y1 += 61;
        }
    }

    void batonmuur(Graphics g, int x1, int y1, int bx2, int by2) {
        for (int i = 0; i < 3; i++) {
            x1 = 60;
            g.setColor(Color.black);
            g.drawRect(x1, y1, bx2, by2);
            g.setColor(Color.gray);
            g.fillRect(x1, y1, bx2, by2);

            for (int j = 0; j < 3; j++) {
                x1 += 119;
                g.setColor(Color.black);
                g.drawRect(x1, y1, bx2, by2);
                g.setColor(Color.gray);
                g.fillRect(x1, y1, bx2, by2);
            }
            y1 += 119;
        }
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            breette = 59;
            lengtte = 59;
            breette2 = 0;
            lengtte2 = 0;
            repaint();

        }
    }
    class TekstvakListener2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            breette = 0;
            lengtte = 0;
            breette2 = 118;
            lengtte2 = 118;
            repaint();

        }
    }
}
