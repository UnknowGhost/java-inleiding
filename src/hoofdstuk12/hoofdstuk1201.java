package hoofdstuk12;
import java.awt.*;
import java.applet.*;
import java.util.stream.IntStream;

public class hoofdstuk1201 extends Applet {
    int[] Getal = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int Sum = IntStream.of(Getal).sum();

    public void init() {
        Sum = Sum / 10;
    }

    public void paint(Graphics g)  {
        g.drawString("Het gemiddelde is: " + Sum, 50, 20);
    }
}
