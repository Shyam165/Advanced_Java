import javax.swing.*;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPFinder {
    public static void main(String[] args) throws IOException {
        String host;
        host = JOptionPane.showInputDialog("please input the server's name");

        try {
            InetAddress address = InetAddress.getByName(host);
            JOptionPane.showMessageDialog(null, "IP address: " + address.toString());
        } catch (UnknownHostException e) {
            JOptionPane.showMessageDialog(null, "Could not find" + host);
        }
    }
}
