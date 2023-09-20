import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.channels.ScatteringByteChannel;

public class Input {
    public static void main(String args[])throws  IOException{
        InputStreamReader obj = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(obj);
        System.out.println("Enter the character and string");

        String kch = br.readLine();
        char ch = (char)br.read();
        System.out.println(kch);
        System.out.println(ch);
    }
}


// 1. what is exception. Explain various types of exception in detail with the heirarchy of exception classes.
// 2. explain various techniques of exception handling.
// 3. write a program to show a arithmetic exception and handle it using try, catch.
// 4. write a program to show multiple exceptions in one program .
// 5. write a program to take user input using buffer reader class and handle the exception using throws keywords.