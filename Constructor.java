import java.awt.*;

public class Constructor {
    int a , b;
    double c;
     Constructor(){
        System.out.println(" The function without any argument");
    }
     Constructor( int x, int y){
        a = x;
        b = y;
        System.out.println(" the  value of a is " + a + " and b is " + b);
    }
    Constructor(int x, int y, double z){
        a = x;
        b = y;
        c = z;
        System.out.println(" the value of a is " + a + " and b is " + b + " and c is " + c);
    }
    Constructor(Constructor C){
        a = C.a;
        b = C.b;
        System.out.println(" the  value of a is " + a + " and b is " + b);
    }
    public static void main(String args[]){
        Constructor C1 = new Constructor();
        Constructor C2 = new Constructor(23, 45);
       Constructor C3 = new Constructor(23, 45, 34.56);
       Constructor C4 = new Constructor(C2);

    }
}
