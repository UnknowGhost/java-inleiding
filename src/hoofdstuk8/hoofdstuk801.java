package hoofdstuk8;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class hoofdstuk801 extends Applet {
    Button knop1;
    Button knop2;
    TextField tekstvak;
    String s;


    public void init() {
        tekstvak = new TextField("", 30);
        knop1 = new Button("ok");
        knop2 = new Button("reset");
        knop1.addActionListener( new TekstvakListener() );
        knop2.addActionListener( new TekstvakListener2() );
        add(tekstvak);
        add(knop1);
        add(knop2);
        s = ("");

    }

    public void paint(Graphics g) {
        g.drawString(s, 50, 60);
        g.drawString("Klik op ok om uw teks op het beeld te laten komen", 50, 90);
        g.drawString("Klik op reset om uw tekst te resetten", 50, 100);
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            repaint();
        }
    }

    class TekstvakListener2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = "";
            repaint();
        }

    }
}







