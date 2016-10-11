package  hoofdstuk10;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class voorbeeld1 extends Applet {
    Button knop;
    Button knop2;
    Button knop3;
    TextField tekstvak;
    Label label;
    String s, tekst;
    String s2;
    String tekst2;
    String uitkomst;
    int cijfer, cijfer2;


    public void init() {
        knop3 = new Button("begin");
        knop2 = new Button("+");
        knop = new Button("ok");
        tekstvak = new TextField("", 10);
        label = new Label("typ uw cijfer en druk op +");
        knop2.addActionListener(new TekstvakListener());
        knop3.addActionListener(new TekstvakListener2());
        tekst = "";
        uitkomst = "";
        add(label);
        add(tekstvak);
        add(knop3);
        add(knop2);
        add(knop);


    }

    public void paint(Graphics g) {
        setSize(700, 200);
        g.drawString(tekst, 320, 60);
        g.drawString(s2, 200, 70);
        g.drawString(s, 300, 60);
        g.drawString(uitkomst, 200, 50);
        g.drawString("Typ de cijfers  , Klik op ok om het gemiddelde te berekenen en of U geslaagd bent", 10, 100);

    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s2 = s + tekstvak.getText();
            cijfer2 = Integer.parseInt(s);



            switch (cijfer) {
                case 1:
                    tekst2 = "niet geslaagd";
                    break;
                case 2:
                    tekst2 = "niet geslaagd";
                    break;
                case 3:
                    tekst2 = "niet geslaagd";
                    break;
                case 4:
                    tekst2 = "niet geslaagd";
                    break;
                case 5:
                    tekst2 = "niet geslaagd";
                    break;
                case 6:
                    tekst2 = "geslaagd";
                    break;
                case 7:
                    tekst2 = "geslaagd";
                    break;
                case 8:
                    tekst2 = "geslaagd";
                    break;
                case 9:
                    tekst2 = "geslaagd";
                    break;
                case 10:
                    tekst2 = "geslaagd";
                    break;
            }
            repaint();
        }
    }

    class TekstvakListener2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            cijfer = Integer.parseInt(s);


            switch (cijfer) {
                case 1:
                    tekst = "onvoldoende";
                    break;
                case 2:
                    tekst = "onvoldoende";
                    break;
                case 3:
                    tekst = "onvoldoende";
                    break;
                case 4:
                    tekst = "onvoldoende";
                    break;
                case 5:
                    tekst = "onvoldoende";
                    break;
                case 6:
                    tekst = "voldoende";
                    break;
                case 7:
                    tekst = "voldoende";
                    break;
                case 8:
                    tekst = "voldoende";
                    break;
                case 9:
                    tekst = "voldoende";
                    break;
                case 10:
                    tekst = "voldoende";
                    break;
                default:
                    tekst = "Het getal kan niet hoger dan 10";
                    break;
            }
            repaint();
        }
    }
}
