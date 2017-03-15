package hoofdstuk14;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.net.*;

public class hoofdstuk1402 extends Applet {
    Button deelKaartenKnop = new Button("Deel kaarten");
    String[] deck = new String[52];
    String[] kleurenStringArray = {"Schoppen ", "Harten ", "Klaveren ", "Ruiten "};
    String[] kaartenStringArray = {"aas", "twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen", "tien", "boer", "vrouw", "heer"};
    String[] speler1 = new String[13];
    String[] speler2 = new String[13];
    String[] speler3 = new String[13];
    String[] speler4 = new String[13];

    private String deelKaart() {
        int random = new Random().nextInt(deck.length);
        String kaart = deck[random];

        //vervang de inhoud van deck
        String[] hulpLijst = new String[deck.length - 1];
        int hulpindex = 0;
        for (int i = 0; i < deck.length; i++) {
            if (i != random) {
                hulpLijst[hulpindex] = deck[i];
                hulpindex++;
            }
        }
        deck = hulpLijst;
        return kaart;

    }

    public void init() {
        deelKaartenKnop.addActionListener(new DeelKaartKnopListener());
        add(deelKaartenKnop);


    }

    public void paint(Graphics g) {
        for (int i = 0; i < speler1.length; i++) {
            g.drawString(speler1[i], 10, 20 * i + 20);
            g.drawString(speler2[i], 110, 20 * i + 20);
            g.drawString(speler3[i], 210, 20 * i + 20);
            g.drawString(speler4[i], 310, 20 * i + 20);
        }
    }



    class DeelKaartKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            deck = new String[52];
            int teller = 0;
            for (int i = 0; i < kleurenStringArray.length; i++) {

                for (int j = 0; j < kaartenStringArray.length; j++) {
                    if (teller < deck.length) {
                        deck[teller] = kleurenStringArray[i] + kaartenStringArray[j];
                        teller++;
                    }
                }
            }

            for (int k = 0; k < speler1.length; k++) {
                speler1[k] = deelKaart();
                speler2[k] = deelKaart();
                speler3[k] = deelKaart();
                speler4[k] = deelKaart();
            }
            repaint();
        }
    }

}
