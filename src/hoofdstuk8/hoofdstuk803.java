package hoofdstuk8;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class hoofdstuk803 extends Applet {
    Button knop1;
    TextField tekstvak;
    double s;
    double andwoord;


    public void init() {
        tekstvak = new TextField("", 30);
        knop1 = new Button("ok");
        knop1.addActionListener( new TekstvakListener() );
        add(tekstvak);
        add(knop1);


    }

    public void paint(Graphics g) {
        g.drawString(String.valueOf(andwoord), 50, 60);
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = Double.parseDouble(tekstvak.getText());
            andwoord = s * 1.21;
            repaint();
        }
    }

        }


