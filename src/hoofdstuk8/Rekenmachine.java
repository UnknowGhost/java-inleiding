package hoofdstuk8;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Rekenmachine extends Applet {
    Button knop1;
    Button knop2;
    Button knop3;
    Button knop4;
    TextField tekstvak;
    TextField tekstvak2;
    double s;
    double a;
    double andwoord;


    public void init() {
        tekstvak = new TextField("", 10);
        add(tekstvak);
        tekstvak2 = new TextField("", 10);
        add(tekstvak2);

        knop1 = new Button("X");
        knop1.addActionListener( new keer() );
        add(knop1);

        knop2 = new Button("/");
        knop2.addActionListener( new gedeeltdoor() );
        add(knop2);

        knop3 = new Button("-");
        knop3.addActionListener( new min() );
        add(knop3);

        knop4 = new Button("+");
        knop4.addActionListener( new plus() );
        add(knop4);



    }

    public void paint(Graphics g) {
        g.drawString(String.valueOf(andwoord), 50, 60);
    }

    class keer implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = Double.parseDouble(tekstvak.getText());
            a = Double.parseDouble(tekstvak2.getText());
            andwoord = s * a;
            repaint();

        }
    }

    class gedeeltdoor implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = Double.parseDouble(tekstvak.getText());
            a = Double.parseDouble(tekstvak2.getText());
            andwoord = s / a;
            repaint();

        }
    }

    class min implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = Double.parseDouble(tekstvak.getText());
            a = Double.parseDouble(tekstvak2.getText());
            andwoord = s - a;
            repaint();

        }
    }

    class plus implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = Double.parseDouble(tekstvak.getText());
            a = Double.parseDouble(tekstvak2.getText());
            andwoord = s + a;
            repaint();

        }
    }

}






