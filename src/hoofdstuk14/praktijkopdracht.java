package hoofdstuk14;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.net.*;

public class praktijkopdracht extends Applet {

    int aantal_Stenen = 23,
            aantal_Speler = 0,
            aantal_Computer = 0;
    Label tekstvakLabel = new Label("Hoeveel smileys neem je (één, twee of drie)?");
    TextField tekstvak = new TextField("", 5);
    Button startKnop = new Button("Start spel"),
            speelKnop = new Button("Speel"),
            nieuwSpelKnop = new Button("Nieuw spel");
    String regel1 = "",
            regel2 = "",
            regel3 = "";

    private Image afbeelding;
    private URL pad;

    public void init() {
// Om het spel te starten
        startKnop.addActionListener(new StartKnopListener());
        add(startKnop);
    }

    public void paint(Graphics g) {
        int x = 10;
        int y = 130;

        g.drawString(regel1, 10, 40);
        g.drawString(regel2, 10, 60);
        g.drawString(regel3, 10, 80);

        for (int i = 0; i < aantal_Stenen; i++) {
            if (i == 7 || i == 14 || i == 21) {
                x = 10;
                y += 35;
            }
            g.drawImage(afbeelding, x, y, 30, 30, this);
            x += 35;
        }
    }

    // Spel wordt gestart \\
    class StartKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {


            pad = Afbeelding.class.getResource("/resources/");
            afbeelding = getImage(pad, "Old_sponge.png");

            remove(startKnop);

            add(tekstvakLabel);
            add(tekstvak);

            // Speel Knop wordt pas gebruikt wanneer er op de Start Knop is gedrukt.
            speelKnop.addActionListener(new SpeelKnopListener());
            add(speelKnop);

            // Toegevoegde knoppen worden zichtbaar
            setSize(401, 300);
            setSize(400, 300);
        }
    }


    private void computerZet() {

        double RandomGetal = Math.random();
        int random = (int) (RandomGetal * 3 + 1);

        if (aantal_Stenen > 21) {
            aantal_Computer = aantal_Stenen - 21;
        } else if (aantal_Stenen == 21) {
            aantal_Computer = random;
        } else if (aantal_Stenen > 17) {
            aantal_Computer = aantal_Stenen -17;
        } else if (aantal_Stenen == 17) {
            aantal_Computer = random;
        } else if (aantal_Stenen > 13) {
            aantal_Computer = aantal_Stenen -13;
        } else if (aantal_Stenen == 13) {
            aantal_Computer = random;
        }else if (aantal_Stenen > 9) {
            aantal_Computer = aantal_Stenen -9;
        } else if (aantal_Stenen == 9) {
            aantal_Computer = random;
        }else if (aantal_Stenen > 5) {
            aantal_Computer = aantal_Stenen -5;
        } else if (aantal_Stenen == 5) {
            aantal_Computer = random;
        }else if (aantal_Stenen > 1) {
            aantal_Computer = aantal_Stenen -1;
        } else if (aantal_Stenen == 1) {
            aantal_Computer = random;
        }

        aantal_Stenen = aantal_Stenen - aantal_Computer;
    }

    // Spel Berekeningen \\
    class SpeelKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            aantal_Speler = Integer.parseInt(tekstvak.getText());


            if (aantal_Speler > 0 && aantal_Speler < 4) {
                aantal_Stenen = (aantal_Stenen - aantal_Speler);

                if (aantal_Stenen <= 0) {
                    regel1 = "Ha je hebt verloren!";
                    remove(tekstvakLabel);
                    remove(tekstvak);
                    remove(speelKnop);

                    // Nieuwe Spel Knop wordt pas gebruikt wanneer het spel is geeïndigd.
                    nieuwSpelKnop.addActionListener(new NieuwSpelKnopListener());
                    add(nieuwSpelKnop);

                    // Toegevoegde knoppen worden zichtbaar
                    setSize(401, 300);
                    setSize(400, 300);
                    regel2 = "";
                    regel3 = "";

                } else if (aantal_Stenen == 1) {
                    regel1 = "Je hebt gewonnen";
                    remove(tekstvakLabel);
                    remove(tekstvak);
                    remove(speelKnop);

                    // Nieuwe Spel Knop wordt pas gebruikt wanneer het spel is geeïndigd.
                    nieuwSpelKnop.addActionListener(new NieuwSpelKnopListener());
                    add(nieuwSpelKnop);

                    // Toegevoegde knoppen worden zichtbaar
                    setSize(401, 300);
                    setSize(400, 300);
                    regel2 = "";
                    regel3 = "";
                } else {
                    computerZet();
                    regel1 = "De computer heeft " + aantal_Computer + " smileys weggehaald.";
                    regel2 = "Aantal smileys: " + aantal_Stenen + ". Jouw beurt.";
                    regel3 = "Je had hiervoor " + aantal_Speler + " smileys weggehaald";
                }
            }
            // Einde spel
            else {
                regel2 = "";
                regel3 = "";
                regel1 = "Onjuiste invoer";
            }
            repaint();
        }
    }

    // Nieuwe Spel \\
    class NieuwSpelKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            regel1 = "";
            regel2 = "";
            regel3 = "";

            aantal_Stenen = 23;

            add(tekstvakLabel);
            add(tekstvak);
            add(speelKnop);
            remove(nieuwSpelKnop);

            // Toegevoegde knoppen worden zichtbaar
            setSize(401, 300);
            setSize(400, 300);

            repaint();
        }
    }
}

