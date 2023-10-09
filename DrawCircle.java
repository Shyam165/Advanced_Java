import java.applet.Applet;
import java.awt.*;

public class DrawCircle extends Applet {
    public void paint(Graphics g) {
        g.setColor(Color.RED);
        g.drawOval(20, 50, 100, 120);    // draw the circle and set border red
        g.fillOval(20, 50, 100, 120);
        /* <applet code="DrawCircle.class" height="300" width="300"></applet>*/
    }
}
