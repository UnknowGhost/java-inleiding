package hoofdstuk14;
import java.lang.String;
import java.io.*;
import java.util.Arrays;
import java.util.Random;
import java.applet.*;
import java.awt.Graphics;

public class testomtetesten extends Applet {
    String[] bsbg;
    String[] bsbg2;

    public void init(){


        String [][] name = {{"harten"}, {"schoppen"}, {"klaveren"}, {"ruiten"}};
        String [][] name2 = {{"2"}, {"3"}, {"4"}, {"5"}, {"6"}, {"7"}, {"8"}, {"9"}, {"10"}, {"boer"}, {"vrouw"}, {"heer"}, {"aas"}};


        Random rand = new Random();

        bsbg = name [rand.nextInt(name.length)];
        bsbg2 = name2 [rand.nextInt(name2.length)];



    }
    public void stop(){
    }

    public void paint(Graphics g){

        g.drawString((Arrays.toString(bsbg)) + " " + ((Arrays.toString(bsbg2))), 150, 50);
    }
}
