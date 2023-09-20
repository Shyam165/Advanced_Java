import java.io.DataInputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server5 {
    public static void main(String args[]){
        String message="hello world";
        try{
            ServerSocket s = new ServerSocket(90);
            System.out.println("waiting for clients:");
            Socket ss = s.accept();
            System.out.println("connected with client " + s);
            PrintWriter out = new PrintWriter(ss.getOutputStream(), true);
            System.out.println("Sending message: "+message);
            out.print(message);
            out.close();
        }
        catch (Exception e){
            System.out.println("Couldn't received messages "+e);
        }
    }
}
