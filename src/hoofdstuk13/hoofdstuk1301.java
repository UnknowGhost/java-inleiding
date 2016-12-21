package hoofdstuk13;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import java.applet.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class hoofdstuk1301 extends Applet {
    Button knopblauw;
    Button knoprood;
    Button knoppaars;
    Button knopgroen;
    Button knopgrijs;
    String kleur;

    public void init() {
        kleur = "";
        knopblauw = new Button("blauw");
        knoprood = new Button("rood");
        knoppaars = new Button("paars");
        knopgroen = new Button("groen");
        knopgrijs = new Button("grijs");

        knopblauw.setBackground(Color.blue);
        knoprood.setBackground(Color.red);
        knoppaars.setBackground(Color.MAGENTA);
        knopgroen.setBackground(Color.green);
        knopgrijs.setBackground(Color.gray);

        knopblauw.addActionListener(new blauwListener());
        knoprood.addActionListener(new roodListener());
        knoppaars.addActionListener(new paarsListener());
        knopgroen.addActionListener(new groenListener());
        knopgrijs.addActionListener(new grijsListener());

        add(knopblauw);
        add(knoprood);
        add(knoppaars);
        add(knopgroen);
        add(knopgrijs);
    }

    public void paint(Graphics g) {
        g.drawString("De kleur die u heeft geklikt is = " + kleur, 90, 60);
    }

    class blauwListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            kleur = "blauw";
            repaint();
        }
    }

    class roodListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            kleur = "rood";
            repaint();
        }
    }

    class paarsListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            kleur = "paars";
            repaint();
        }
    }

    class groenListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            kleur = "groen";
            repaint();
        }
    }

    class grijsListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            kleur = "grijs";
            repaint();
        }
    }
}






