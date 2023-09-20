import java.util.*;
import java.lang.*;
import java.net.*;
import java.io.*;

class Server8{
    public static void main(String args[])throws Exception{
        ServerSocket s = new ServerSocket(122);
        System.out.println("waiting for clients:");
        Socket ss = s.accept();
        System.out.println("connected with client " + s);
        DataInputStream in = new DataInputStream(ss.getInputStream());
        int x=in.readInt();
        int y=in.readInt();
        int sum=x+y;
        DataOutputStream out = new DataOutputStream(ss.getOutputStream());
        out.writeInt(sum);
        out.close();
in.close();
    }
}