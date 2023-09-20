interface s{
     void sum(double x, double y);
}
interface a{
     void add();
}
 class A2 implements s,a{
   public void sum(double x, double y){
        System.out.println("The sum of x and Y is "+ (x+y));
    }
    public void add(){
        System.out.println("the addition of x and y is "+ (445+45));
    }
 }
public class abstractExample {
    public static void main(String [] args){
        A2 obj = new A2();
        obj.sum(23.45, 98.67);
        obj.add();

    }

}
