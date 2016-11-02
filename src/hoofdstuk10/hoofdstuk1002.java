package  hoofdstuk10;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Graphics;

public class hoofdstuk1002 extends Applet {
    private TextField tekstvak;
    private int tokio;
    private int londen;
    private int newyork;
    private int sydney;

    public void init() {
        Button knop = new Button("Toon Tijden");
        tekstvak = new TextField("", 10);
        Knoplistener kl = new Knoplistener();
        knop.addActionListener(kl);
        add(tekstvak);
        add(knop);
    }

    public void paint(Graphics g) {
        setSize(700, 200);
        super.paint(g);
        int x = 50;
        int y = 70;
        g.drawString("Voer een uur in", 170, 20 );

        g.drawString(tokio + ":00", x, y);
          y = y + 20;
        g.drawString("Tijd in londen:" + londen + ":00", x, y);
          y = y + 20;
        g.drawString("Tijd in New York:" + newyork + ":00", x, y);
          y = y + 20;
        g.drawString("Tijd in New sydney:" + sydney + ":00", x, y);

    }
    private class Knoplistener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String getalstring = tekstvak.getText();
            int tijd = Integer.parseInt(getalstring);
            tokio = tijd + 7;
            if (tijd > 16) {
                tokio = tijd - 17;

                }
            londen = tijd - 1;
            if (tijd < 1) {
                londen = tijd + 23;
            }
            newyork = tijd - 6;
            if (tijd < 6) {
                newyork = tijd + 18;
            }
            sydney = tijd + 9;
            if (tijd > 14) {
                sydney = tijd - 15;
            }
                repaint();
            }
        }
    }



