import java.awt.*;

public class Overloading {
    int a , b;
    double c;
    void func(){
        System.out.println(" The function without any argument");
    }
    void func( int x, int y){
        a = x;
        b = y;
        System.out.println(" the  value of a is " + a + " and b is " + b);
    }
    void func(int x, int y, double z){
        a = x;
         b = y;
       c = z;
       System.out.println(" the value of a is " + a + " and b is " + b + " and c is " + c);
    }
    public static void main(String args[]){
        Overloading O = new Overloading();
        O.func();
        O.func(23, 45);
        O.func(24, 56, 45.67);
    }
}
