import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class Client5 {
    public static void main(String args[]){
        String message;
        try{
            Socket skt = new Socket(InetAddress.getLocalHost(),90);
            BufferedReader in = new BufferedReader(new InputStreamReader(skt.getInputStream()));
            message=in.readLine();
            System.out.println("Received messages: "+message);
            in.close();
            skt.close();
        }
        catch (Exception e){
            System.out.println("couldn't send messages:" +e);
        }
    }
}
