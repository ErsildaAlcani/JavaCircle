import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class CircleFrame extends JFrame{ //inheritance
    private JTextField radius;//input from user
    private JButton button;//add a button listener
    private Circle circle1; // object
    private int x, y, r; //coordinates so that we know where user clicked

    public CircleFrame(){
        krijoPanelControl();
        krijoPanelOutput();
        setSize(400, 400);
        pack();
    }
    public void krijoPanelControl(){
        JLabel label= new JLabel("Me jep rrezen e rrethit");
        radius=new JTextField("00", 4);
        button=new JButton();
        JPanel panelControl= new JPanel();
        panelControl.add(label);
        panelControl.add(radius);
        add(panelControl, BorderLayout. NORTH);
    }
    public void krijoPanelOutput(){
        MouseListener listener=new CircleListener();
        circle1=new Circle();
        circle1.setPreferredSize(new Dimension(400, 350));
        circle1.addMouseListener(listener);
        add(circle1, BorderLayout.CENTER);
    }
    public class CircleListener implements MouseListener{
        public void mouseClicked(MouseEvent event){
            try{
                r=Integer.parseInt(radius.getText()); //we have to make sure that user gave us the correct input format
                x=event.getX(); //get the x coordinate of the click
                y=event.getY(); //get the y coordinate of the click
                circle1.re_draw(x, y, r); //a function that redraws the circle with the new coordinates
            } catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "I cannot create a circle with this radius");
            }
        }
        public void mouseEntered(MouseEvent event) {} //other mouse listener because we have to
        public void mouseExited(MouseEvent event) {}
        public void mousePressed(MouseEvent event) {}
        public void mouseReleased(MouseEvent event) {}
    }
}



