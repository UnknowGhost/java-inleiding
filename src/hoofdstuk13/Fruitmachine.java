package hoofdstuk13;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Graphics;
import java.net.URL;
import java.net.*;

public class Fruitmachine extends Applet {
    int random , gewonnen ;
    double r;
    private Image plaatje1 , plaatje2 , plaatje3;
    private AudioClip gewonnengeluid;
    private AudioClip jackpotgeluid;

    double randomgetal1 = Math.random();
    double randomgetal2 = Math.random();
    double randomgetal3 = Math.random();

    int randomint1 = (int)(randomgetal1 * 20 + 1);
    int randomint2 = (int)(randomgetal2 * 20 + 1);
    int randomint3 = (int)(randomgetal3 * 20 + 1);



    String jpg1 = "fruit_" + randomint1 + ".jpg" ;
    String jpg2 = "fruit_" + randomint2 + ".jpg" ;
    String jpg3 = "fruit_" + randomint3 + ".jpg" ;
    String jackpot;

    Button speel;
    Button koop;


    int krediet;


    public void init() {
        setSize(253, 300);
        gewonnen = 0;
        jackpot = "";


        speel = new Button("Speel");
        koop = new Button("Koop 10 kredietpunten");

        speel.addActionListener(new Speelgeklikt());
        koop.addActionListener(new kredietgeklikt());

        add(speel);
        add(koop);
        krediet = 10;

        URL pad = test2.class.getResource("/resources/");
        plaatje1 = getImage(pad, jpg1);
        plaatje2 = getImage(pad, jpg2);
        plaatje3 = getImage(pad, jpg3);
        gewonnengeluid = getAudioClip(pad, "coin.wav");
        jackpotgeluid = getAudioClip(pad, "jackpot.wav");

        r = Math.random();
        random = (int)(r * 20 + 1);

        koop.setEnabled(false);
    }

    public void paint(Graphics g) {

        g.drawImage(plaatje1, 20, 60, 71, 165, this);
        g.drawImage(plaatje2, 91, 60, 71, 165, this);
        g.drawImage(plaatje3, 162, 60, 71, 165, this);
        g.drawString("Krediet: " + krediet ,100,240);
        g.drawString("Gewonnen krediet: " + gewonnen + jackpot, 70 , 260);
    }

    class Speelgeklikt implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            krediet = krediet - 1;
            if (krediet == 0)
                koop.setEnabled(true);
            if (krediet == 0)
                speel.setEnabled(false);


            double randomgetal1 = Math.random();
            double randomgetal2 = Math.random();
            double randomgetal3 = Math.random();

            int randomint1 = (int) (randomgetal1 * 20 + 1);
            int randomint2 = (int) (randomgetal2 * 20 + 1);
            int randomint3 = (int) (randomgetal3 * 20 + 1);


            jpg1 = "fruit_" + randomint1 + ".jpg";
            jpg2 = "fruit_" + randomint2 + ".jpg";
            jpg3 = "fruit_" + randomint3 + ".jpg";

            URL pad = test2.class.getResource("/resources/");

            plaatje1 = getImage(pad, jpg1);
            plaatje2 = getImage(pad, jpg2);
            plaatje3 = getImage(pad, jpg3);
            repaint();

            if (plaatje1 == plaatje2 && plaatje2 == plaatje3 ) {
                krediet += 20;
                gewonnen = 20;
                jackpot = " JACKPOT!";
                jackpotgeluid.play();
            } else {
                gewonnen = 0;
                jackpot = "";
                if (plaatje1 == plaatje2 || plaatje1 == plaatje3 || plaatje2 == plaatje3) {
                    krediet += 4;
                    gewonnen = 4;
                    gewonnengeluid.play();
                } else {
                    gewonnen = 0;
                    jackpot = "";
                }
            }
        }
    }
    class kredietgeklikt implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            krediet += 10;
            speel.setEnabled(true);
            koop.setEnabled(false);
            repaint();

        }
    }
}
