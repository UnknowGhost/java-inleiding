package hoofdstuk8;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Staafdiagram extends Applet {
    int begin;
    TextField jeroeng;
    TextField hansg;
    TextField valerieg;

    Button knop;


    int valerie, hoogteyvaleriey1, hoogteyvaleriey2, staafGrootteValerie;

    int jeroen, hoogteJeroeny1, hoogteJeroeny2, staafGrootteJeroen;

    int hans, hoogteHansy1, hoogteHansy2, staafGrootteHans;

    int base = 250;

    int a;

    int b;
    int c;


    public void init() {




        jeroeng = new TextField(2);
        add(jeroeng);
        hansg = new TextField(2);
        add(hansg);
        valerieg = new TextField(2);
        add(valerieg);

        knop = new Button("Wijzig waarde");
        knop.addActionListener( new StaafUpdateListener () );
        add(knop);

    }

    public void paint(Graphics g) {

        begin = 250;

        valerie = a;
        jeroen = b;
        hans = c;

        staafGrootteValerie = valerie * 2;
        hoogteyvaleriey2 = staafGrootteValerie;
        hoogteyvaleriey1 = begin - hoogteyvaleriey2;

        staafGrootteJeroen = jeroen * 2;
        hoogteJeroeny2 = staafGrootteJeroen;
        hoogteJeroeny1 = begin - hoogteJeroeny2;

        staafGrootteHans = hans * 2;
        hoogteHansy2 = staafGrootteHans;
        hoogteHansy1 = begin - hoogteHansy2;

        g.drawLine(70, base, 140, base);


        g.drawString("Valerie", 50, 270);
        g.fillRect(80, hoogteyvaleriey1, 10, hoogteyvaleriey2);


        g.drawString("Hans", 90, 270);
        g.fillRect(100, hoogteHansy1, 10, hoogteHansy2);


        g.drawString("Jeroen", 120, 270);
        g.fillRect(120, hoogteJeroeny1, 10, hoogteJeroeny2);
        g.drawString("Gewicht in kilo", 60, 40);
        g.drawString("100", 60, 60);

        g.drawString("80", 60, 90);

        g.drawString("60", 60, 135);

        g.drawString("40", 60, 180);

        g.drawString("20", 60, 220);

        g.drawString("0", 60, 250);

    }
        class StaafUpdateListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                a = Integer.parseInt(valerieg.getText());
                b = Integer.parseInt(jeroeng.getText());
                c = Integer.parseInt(hansg.getText());
                repaint();

            }
        }


    }


