import javax.swing.*;
import java.awt.*;

public class Circle extends JComponent { //the class for any circles
    private int x, y, z; //coordinates
    private boolean yes; //value yes
    public  Circle(){
        x=0; y=0; z=0; yes=false;
        //in a circle the length and width are equal values
        //x and y in default represent the coordinates of the up left angle
        //in this case they have to represent the center of the circle

    }
    public void paintComponent(Graphics w){
        w.drawOval(x, y, 2*z, 2*z);
        //GEOMETRYYYYY
    }
    public void re_draw(int x0,int y0, int radius){
        x=x0-radius; //little bit of elementary geometry
        y=y0-radius;
        z=radius;
        repaint();
    }
}
