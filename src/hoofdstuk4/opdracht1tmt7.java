//Voorbeeld 4.1
package hoofdstuk4;
import java.awt.*;
import java.applet.*;

public class opdracht1tmt7 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        // driehoek
        setBackground(Color.green);
        g.setColor(Color.yellow);
        g.drawLine(50, 120, 120, 120);
        g.drawLine(50, 120, 85, 240);
        g.drawLine(120, 120, 85, 240);
        //huis
        g.drawRect(220, 40, 100, 100);
        g.drawRect(250, 70, 10, 10);
        g.drawRect(300, 70, 10, 10);
        g.fillRect(280, 110, 10, 30);
// nederlandse vlag
        g.setColor(Color.black);
        g.fillRect(180, 200, 20, 200);
        g.setColor(Color.red);
        g.fillRect(200, 200, 150, 30);
        g.setColor(Color.white);
        g.fillRect(200, 230, 150, 30);
        g.setColor(Color.blue);
        g.fillRect(200, 260, 150, 30);
// staafdiagram
        g.setColor(Color.black);
        g.drawString("100", 500, 400 );
        g.setColor(Color.black);
        g.drawString("Hans", 560, 400 );
        g.setColor(Color.black);
        g.drawString("Valerie", 620, 400 );
        g.setColor(Color.red);
        //staaf
        g.fillRect(500, 280, 30, 100);
        g.setColor(Color.white);
        g.fillRect(560, 300, 30, 80);
        g.setColor(Color.blue);
        g.fillRect(620, 340, 30, 40);
        g.setColor(Color.black);
        // gegevens
        g.drawString("kilo 1:20", 670, 400 );
        g.setColor(Color.black);
        g.drawString("5", 490, 300 );
        g.setColor(Color.black);
        g.drawString("4", 490, 320 );
        g.setColor(Color.black);
        g.drawString("3", 490, 340 );
        g.setColor(Color.black);
        g.drawString("2", 490, 360 );
        g.setColor(Color.black);
        g.drawString("1", 490, 380 );
//opdracht 4.5
        g.setColor(Color.yellow);
        g.fillOval(400, 20, 50, 100);
//stoplicht
        g.setColor(Color.black);
        g.fillRect(20, 500, 50, 100);
        g.setColor(Color.red);
        g.fillOval(35, 510, 20, 20);
        g.setColor(Color.orange);
        g.fillOval(35, 540, 20, 20);
        g.setColor(Color.green);
        g.fillOval(35, 570, 20, 20);
//dobbelsteen
        g.setColor(Color.white);
        g.fillRoundRect(100, 500, 100, 100, 10, 10);
        g.setColor(Color.black);
        g.fillOval(110, 520, 30, 30);
        g.setColor(Color.black);
        g.fillOval(160, 520, 30, 30);
        g.setColor(Color.black);
        g.fillOval(110, 560, 30, 30);
        g.setColor(Color.black);
        g.fillOval(160, 560, 30, 30);
    }

}
