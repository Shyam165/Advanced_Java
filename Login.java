import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Login extends Applet implements ActionListener {
    Label l1, l2;
    TextField t1, t2;
    Button b;
    String username, password;
    String message = "";

    public void init() {
        l1 = new Label("Enter Username:");
        l1.setBounds(30, 40, 100, 30);

        t1 = new TextField(10);
        t1.setBounds(130, 40, 100, 30);

        l2 = new Label("Enter Password:");
        l2.setBounds(30, 80, 100, 30);

        t2 = new TextField(10);
        t2.setBounds(130, 80, 100, 30);
        t2.setEchoChar('*'); // Set the password field to display '*'

        b = new Button("Submit");
        b.setBounds(60, 120, 100, 30);

        b.addActionListener(this);
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b);
        setLayout(null);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b) {
            username = t1.getText();
            password = t2.getText();

            if (username.equals("shyam") && password.equals("sh8763")) {
                message = "Login Successfully !!";
            } else {
                message = "Wrong Username or Password";
            }

            repaint(); // Call repaint to update the display
        }
    }

    public void paint(Graphics g) {
        g.drawString(message, 50, 200);
    }
      /* <applet code="Login.class" height="300" width="400"></applet> */
}
