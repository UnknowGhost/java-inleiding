package hoofdstuk14;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;

public class test2 extends Applet {

    private Image afbeelding;
    private URL pad;

    int aantalSmiley = 23;
    int x;
    int y;

    Label invoerGetalLabel = new Label("Hoeveel smileys neem je (één, twee of drie)?");
    TextField invoerGetal = new TextField("", 5);

    Button knop = new Button("Speel");
    String aantalSmileyString = "Aantal smileys: " + aantalSmiley + ". Jouw beurt.",

            invoerCheckString = "",
            aantalWeggehaaldComputerString = "",
            aantalWeggehaaldSpelerString = "";


    public void init() {

        pad = Afbeelding.class.getResource("/resources/");
        afbeelding = getImage(pad, "Old_sponge.png");

        add(invoerGetalLabel);
        add(invoerGetal);
        knop.addActionListener(new KnopListener());
        add(knop);

        setSize(400, 300);

    }

    public void paint (Graphics g) {
//Ha!!! Je hebt verloren.
        g.drawString(aantalWeggehaaldComputerString, 10, 40);
        g.drawString(aantalWeggehaaldSpelerString, 10, 60);
        g.drawString(aantalSmileyString, 10, 80);
        g.setColor(Color.RED);
        g.drawString(invoerCheckString, 10, 100);
        x = 30;
        y = 130;
        for (int i = 0; i < 3; i++) {
            x = 30;
            for (int j = 0; j < 8; j++) {
                g.drawImage(afbeelding, x, y, 30, 30, this);
                x += 30;

            }
             y += 35;

        }
        x = 30;
        for (int j = 0; j < 2; j++) {

            g.drawImage(afbeelding, x, y, 30, 30, this);
            x += 30;
        }

    }

    class KnopListener implements ActionListener {
        public void actionPerformed (ActionEvent e){

            double randomDoubleToInt = Math.random();
            int checkIntIngevoerd, aantalWeggehaaldComputerRandomInt = (int)(randomDoubleToInt * 3 + 1);
            checkIntIngevoerd = Integer.parseInt(invoerGetal.getText());
            if (checkIntIngevoerd >= 3 && checkIntIngevoerd <= 1) {

                invoerCheckString = "";
                aantalSmiley = (aantalSmiley - checkIntIngevoerd);
                aantalSmiley = (aantalSmiley - aantalWeggehaaldComputerRandomInt);
                aantalSmileyString =  "Aantal smileys: " + aantalSmiley + ". Jouw beurt.";
                aantalWeggehaaldComputerString = "De computer heeft " + aantalWeggehaaldComputerRandomInt + " smileys weggehaald.";
                aantalWeggehaaldSpelerString = "Je had daarvoor " + checkIntIngevoerd + " smileys weggehaald.";
            }
            else {

                invoerCheckString = "Onjuiste invoer";
            }
            repaint();
        }
    }
}
