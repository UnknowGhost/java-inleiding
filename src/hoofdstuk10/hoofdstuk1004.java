package  hoofdstuk10;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class hoofdstuk1004 extends Applet {
    Button knop;
    TextField tekstvak;
    TextField tekstvak2;
    Label label;
    Label label2;
    String s, tekst;
    String  s2, tekst2;
    int cijfer;
    int jaartal;

    public void init() {
        knop = new Button("ok");
        tekstvak = new TextField("", 10);
        tekstvak2 = new TextField("", 10);
        label = new Label("typ uw cijfer en druk op ok");
        label2 = new Label("jaartal");
        knop.addActionListener(new TekstvakListener());
        tekst = "";
        tekst2 = "";
        add(label);
        add(tekstvak);
        add(label2);
        add(tekstvak2);
        add(knop);

    }

    public void paint(Graphics g) {
        setSize(700,200);
        g.drawString(tekst  , 300, 60);
        g.drawString(tekst2  , 420, 60);
        g.drawString("Typ het nummer van de maand , jaartal en zie hoeveel dagen de maand heeft en of het jaartal een schrikkeljaar is"  , 10, 100);

    }
    class TekstvakListener implements ActionListener {
        public void  actionPerformed(ActionEvent e) {
            s =  tekstvak.getText();
            s2 = tekstvak2.getText();
            cijfer = Integer.parseInt( s);
            jaartal = Integer.parseInt( s2);
            if ( (jaartal % 4 == 0 && !(jaartal % 100 == 0)) ||
                    jaartal % 400 == 0 ) {
                tekst2 = ""+ jaartal + " is een schrikkeljaar";
            }
            else {
                tekst2 = ""+ jaartal + " is geen schrikkeljaar";
            }
            switch (cijfer) {
                case 1:
                    tekst = "31 dagen";
                    break;
                case 2:
                    tekst = "28/29 dagen";
                    break;
                case 3:
                    tekst = "31 dagen";
                    break;
                case 4:
                    tekst = "30 dagen";
                    break;
                case 5:
                    tekst = "31 dagen";
                    break;
                case 6:
                    tekst = "30 dagen";
                    break;
                case 7:
                    tekst = "31 dagen";
                    break;
                case 8:
                    tekst = "31 dagen";
                    break;
                case 9:
                    tekst = "30 dagen";
                    break;
                case 10:
                    tekst = "31 dagen";
                    break;
                case 11:
                    tekst = "30 dagen";
                    break;
                case 12:
                    tekst = "31 dagen";
                    break;
            }
            repaint();
        }
    }

}
