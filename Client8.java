import java.util.*;
import java.lang.*;
import java.net.*;
import java.io.*;

class Client8{
    public static void main(String args[])throws Exception{
        int x,y;
        x=7;
        y=4;
        Socket skt = new Socket(InetAddress.getLocalHost(), 122);
        DataOutputStream out = new DataOutputStream(skt.getOutputStream());
        out.writeInt(x);
        out.writeInt(y);
        DataInputStream in = new DataInputStream(skt.getInputStream());
        int sum=in.readInt();
        System.out.println("The sum of two is "+sum);
        in.close();
        skt.close();
    }
}