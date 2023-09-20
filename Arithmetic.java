import java.util.Scanner;
public class Arithmetic {
    public static void main(String [] args){
        int  a, b;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of a and b ");
        a = in.nextInt();
        b = in.nextInt();
        Operator obj = new Operator();
        System.out.println("the sum  of a and b is " +  obj.add(a, b));
        System.out.println("the  difference of a and b is " + obj.sub(a, b));
        System.out.println("the multiplication  of a and b is " + obj.multi(a, b));
        System.out.println("the division of a and b is " +   obj.devi(a, b));
    }
}
 class Operator{
    int a , b;
    int add(int x, int y){
        a = x;
        b = y;
        return a+b;
    }
    int  sub(int x, int y){
        a = x;
        b = y;
        return a-b;
    }
    int multi(int x, int y){
        a = x;
        b = y;
      return a*b;
    }
    double devi(int x, int y){
        a = x;
        b = y;
      return a/b;
    }

}
