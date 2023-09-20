import com.sun.source.tree.Scope;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String [] args){
        String data = "Any Message ";
        try{
            ServerSocket srvr = new ServerSocket(14);
            Socket skt = srvr.accept();
            System.out.println("Server has connected! \n");
            PrintWriter out = new PrintWriter(skt.getOutputStream(), true);
            System.out.println("Sending String: " + data + "\n");
            out.print(data);
            skt.close();
            srvr.close();

        }
        catch (Exception e){
            System.out.println("Whoops! It Didn't work\n");
        }
    }
}
