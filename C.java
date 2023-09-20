import java.util.Scanner;
class A {
   // int i=23;
    void PutData(int x){
        System.out.println("The value of a is "+ x);
    }
}
class B extends A{
  //  int j =24, k =56;
    void PutData1(int x, int y, int z){
        System.out.println("The value of a is "+ x + " and b is "+ y + " and c is "+ z);
    }
}



public class C {
    public static void main(String [] args){
        int a, b , c;
        System.out.println("Enter the value of a, b, c ");
        Scanner sc = new Scanner(System.in);
        a= sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        B obj1 = new B();
        obj1.PutData1(a, b, c);
        obj1.PutData(a);
    }
}
