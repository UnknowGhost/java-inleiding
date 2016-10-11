package  hoofdstuk10;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class praktijkopdracht extends Applet {
    Button knop;
    TextField tekstvak;
    Label label;
    String s, tekst;
    int cijfer;

    public void init() {
        knop = new Button("ok");
        tekstvak = new TextField("", 20);
        label = new Label("typ uw cijfer en druk op enter");
        knop.addActionListener(new TekstvakListener());
        tekst = "";
        add(label);
        add(tekstvak);
        add(knop);

    }

    public void paint(Graphics g) {
        g.drawString(tekst  , 50, 60);
        g.drawString("Typ het nummer van de maand en zie hoeveel dagen de maand heeft"  , 10, 100);

    }
    class TekstvakListener implements ActionListener {
        public void  actionPerformed(ActionEvent e) {
            s =  tekstvak.getText();
            cijfer = Integer.parseInt( s);
            switch (cijfer) {
                case 1:
                    tekst = "Januari 31 dagen";
                    break;
                case 2:
                    tekst = "Februari 28/29 dagen";
                    break;
                case 3:
                    tekst = "Maart 31 dagen";
                    break;
                case 4:
                    tekst = " April 30 dagen";
                    break;
                case 5:
                    tekst = "Mei 31 dagen";
                    break;
                case 6:
                    tekst = "Juni 30 dagen";
                    break;
                case 7:
                    tekst = "Juli 31 dagen";
                    break;
                case 8:
                    tekst = "Augustus 31 dagen";
                    break;
                case 9:
                    tekst = "September 30 dagen";
                    break;
                case 10:
                    tekst = "Oktober 31 dagen";
                    break;
                case 11:
                    tekst = "November 30 dagen";
                    break;
                case 12:
                    tekst = " December 31 dagen";
                    break;
                default:
                    tekst = "Het getal kan niet hoger dan 12";
                    break;
            }
            repaint();
        }
    }

}
