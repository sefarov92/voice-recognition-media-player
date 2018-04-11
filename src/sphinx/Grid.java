package sphinx;

import java.awt.Graphics;
import javax.swing.JFrame;


public class Grid extends JFrame{
    public Grid()
    {
    setTitle("gridtest");
    setExtendedState(JFrame.MAXIMIZED_BOTH);
    
    setUndecorated(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setVisible(true);
    setOpacity(0.50f);
}
    @Override
    public void paint (Graphics p){
        p.drawRect(0,0,455, 256);
        p.drawRect(455,0,455,256);
        p.drawRect(910,0,455,256);
        p.drawRect(0,256,455, 256);
        p.drawRect(455,256,455,256);
        p.drawRect(910,256,455,256);
        p.drawRect(0,512,455, 256);
        p.drawRect(455,512,455,256);
        p.drawRect(910,512,455,256);
    }
    public static void main(String [] sumen)
    {
        Grid s  = new Grid();
        s.paint(null);
    }
}