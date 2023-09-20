
import java.util.*;
interface a5{
    void areaofcy();
    void volumeofcy();
    void areaofcuboid();
}
class A7 implements a5{
    double length, breadth, height, radius;
 A7(double a, double b, double c, double d){
     length=a;
     breadth=b;
     height=c;
     radius=d;
 }
  public void areaofcy(){
     double area;
     area=3.1+length+breadth+height+radius;
     System.out.println("the area of cy is "+ area);
 }
 public void volumeofcy(){
     double vol=4.5 +length+breadth+height+radius;
     System.out.println("The vol of cy is "+vol);
 }
 public void areaofcuboid(){
     double area2=46.4+radius;
     System.out.println("area of cuboid is "+area2);
 }

}

public class Shape {
    public static void main(String args[]){
        double l, b, h , r;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the length, breadth, height and radius:");
    l=sc.nextDouble();
    b=sc.nextDouble();
    h=sc.nextDouble();
    r=sc.nextDouble();
    A7 obj = new A7(l, b, h, r);
    obj.areaofcy();
    obj.areaofcuboid();
    obj.volumeofcy();
    }
}
