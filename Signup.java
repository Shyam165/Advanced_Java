import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Signup extends Applet implements ActionListener {
    Label l1, l2, l3;
    TextField t1, t2;
    Button b;
    String username, password;
    String message = "";
    Font largeFont;

    public void init() {
        l1 = new Label("Enter Username:");
        l1.setBounds(30, 40, 100, 30);

        t1 = new TextField(10);
        t1.setBounds(130, 40, 100, 30);

        l2 = new Label("Enter Password:");
        l2.setBounds(30, 80, 100, 30);

        t2 = new TextField(10);
        t2.setBounds(130, 80, 100, 30);
        
        b = new Button("Signup");
        b.setBounds(60, 120, 100, 30);

        b.addActionListener(this);
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b);
        setLayout(null);

        largeFont = new Font("Arial", Font.BOLD, 18);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b) {
            username = t1.getText();
            password = t2.getText();

            if (password.length() !=8){
                message="Password should be of length 8";
            }
            else{
                message = "Signup Successful for User: " + username;
            }

            repaint(); // Call repaint to update the display
        }
    }

    public void paint(Graphics g) {
        g.setFont(largeFont);
        g.drawString(message, 50, 200);
    }
    /* <applet code="Signup.class" height="300" width="400"></applet> */
}
