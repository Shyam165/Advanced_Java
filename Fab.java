import java.util.Scanner;
public class Fab {
    public static void main(String [] args){
        int n ;
        System.out.println("Enter the size of fibonacci series");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        Fab1 obj = new Fab1();
        obj.fibonacci(n);

    }
}
class Fab1{
    int a = 0 , b = 1;
    void fibonacci(int x){
        System.out.print(a + " " + b);
        for (int i = 0 ; i < x-2 ; i++){
            int c = a+b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
    }
}
