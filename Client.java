import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {
    public static void main(String args[]){
        try{
            Socket skt = new Socket("localhost", 14);
            BufferedReader in = new BufferedReader(new InputStreamReader(skt.getInputStream()));
            System.out.println("Received string");
            System.out.println(in.readLine());
            System.out.print("\n");
            in.close();
        }
        catch (Exception e){
            System.out.println("Whoops! It Didn't \n" + e);
        }
    }
}

