
abstract class A1{
    abstract void print1();
//    void print2(){
//        System.out.println("the is class of abstract");
//    }
}
class B1 extends A1{
    void print1(){
        System.out.println("CAll me from B");
    }
}
public class abstract1 {
    public static void main(String [] args){
        B1 obj = new B1();
        obj.print1();
       // obj.print2(); // concrete class func. that is non-abstract func.
    }
}
