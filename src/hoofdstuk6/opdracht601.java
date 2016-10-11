package hoofdstuk6;// opdracht 6.1
import java.awt.*;
import java.applet.*;


public class opdracht601 extends Applet {
    double totaalBedrag;;
    double bedrag;
    int seconden;
    int uur;
    int dag;
    int jaar;
    int possitief1;
    int possitief2;
    int uitkomst;





    public void init() {
        totaalBedrag = 113;
        bedrag = totaalBedrag /= 4;
        seconden = 1;
        uur = 60 * 60;
        dag = 60 * 60 * 24;
        jaar = 60 * 60 * 24 * 365 ;
        possitief1 = 5;
        possitief2 = 15;
        uitkomst = possitief1 +- possitief2;



    }

    public void paint(Graphics g) {
 // opdracht 6.1
        g.drawString("Jan " + bedrag +" euro", 20, 20);
        g.drawString("Ali " + bedrag +" euro", 20, 30);
        g.drawString("Jeannette " + bedrag +" euro", 20, 40);
        g.drawString("jij " + bedrag +" euro", 20, 50);
// opdracht 6.2
        g.drawString("uur " + seconden * uur +" seconden", 200, 20);
        g.drawString("dag " + seconden * dag  +" seconden", 200, 30);
        g.drawString("jaar " + seconden * jaar +" seconden", 200, 40);
// opdracht 6.3
        g.drawString( + uitkomst +" uitkomst", 20, 80);

    }
}