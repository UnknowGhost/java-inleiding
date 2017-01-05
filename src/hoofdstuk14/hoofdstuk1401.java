package hoofdstuk14;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Random;

public class hoofdstuk1401 extends Applet {

    Button knop;

    String[] bsbg;
    String[] bsbg2;

    public void init() {
        knop = new Button("deel kaart");
        add(knop);
        knop.addActionListener(new klik());
        bsbg = new String[]{""};
        bsbg2 = new String[]{""};
    }

    public void paint(Graphics g) {
        g.drawString((Arrays.toString(bsbg)) + "  " + ((Arrays.toString(bsbg2))), 150, 50);
    }

    class klik implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            repaint();
            Random rand = new Random();

            String [][] name = {{"harten"}, {"schoppen"}, {"klaveren"}, {"ruiten"}};
            String [][] name2 = {{"2"}, {"3"}, {"4"}, {"5"}, {"6"}, {"7"}, {"8"}, {"9"}, {"10"}, {"boer"}, {"vrouw"}, {"heer"}, {"aas"}};

            bsbg = name [rand.nextInt(name.length)];
            bsbg2 = name2 [rand.nextInt(name2.length)];
        }
    }
}