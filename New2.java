import java.util.*;
import java.io.*;
import java.lang.*;

class New2{
    public static void main() throws IOException{
        InputStreamReader obj = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(obj);
        System.out.println("Enter the String and char value");
        String s = br.readLine();
//char ch = (char)br.next();
        System.out.println("The string is "+s);
//System.out.println("The char value is "+ch);
    }
}