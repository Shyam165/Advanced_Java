import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;

public class Add extends Applet {
    Label l1, l2, l3;
    TextField t1, t2, t3;
    Button b;
    int x, y, z;

    public void init() {
        l1 = new Label("Number 1:");
        l1.setBounds(30,40,100,30);

        t1 = new TextField(10);
        t1.setBounds(130,40,100,30);

        l2 = new Label("Number 2:");
        l2.setBounds(30,80,100,30);

        t2 = new TextField(10);
        t2.setBounds(130,80,100,30);

        l3 = new Label("Total=");
        l3.setBounds(30,120,100,30);

        t3 = new TextField(10);
        t3.setBounds(130,120,100,30);

        b = new Button("Add");
        b.setBounds(60,150,100,30);

        b.addActionListener(new test());
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(b);
        setLayout(null);
    }

    class test implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == b) {
                x = Integer.parseInt(t1.getText());
                y = Integer.parseInt(t2.getText());
                z = x + y;
                t3.setText(String.valueOf(z));
            }
        }
    }
    /* <applet code="Add.class" height="300" width="400"></applet> */
}