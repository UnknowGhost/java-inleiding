package hoofdstuk12;
import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class hoofdstuk1206                                                               extends Applet {


    int[] getallen = {6, 6, 6, 2, 2, 1, 8, 8, 8};




    TextField textField;
    Button button;
    String schermtekst;


    @Override
    public void init() {


        textField = new TextField("", 8);
        add(textField);
        button = new Button("Kies");
        add(button);
        button.addActionListener(new KnopListener());
        schermtekst = "";
    }


    @Override
    public void paint(Graphics g) {
        int x = 50;
        int y = 80;


        g.drawString(schermtekst,x,y);
    }


    class KnopListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int invoer = Integer.parseInt(textField.getText());
            boolean isgevonden = false;
            int hoevaak = 0;
            for (int i = 0; i < getallen.length; i++){
                if (getallen[i] == invoer) {
                    isgevonden = true;
                    hoevaak += 1;
                }


                if (isgevonden) {
                    schermtekst = "Is gevonden. Index is " + invoer + "  hoevaak gevonden " + hoevaak;
                }
                else {
                    schermtekst = "Is gevonden. Index is " + invoer + "  hoevaak gevonden 0";

                }
                repaint();
            }
        }
    }
}