class NewBox{
    double length, breadth, height;

    NewBox(){
        length=0;
        breadth=0;
        height=0;
    }
    NewBox(NewBox B){
        length= B.length;
        breadth=B.breadth;
        height=B.height;
    }
    NewBox(double x, double y, double z){
        length=x;
        breadth=y;
        height=z;
    }
    NewBox(double x){
        length=x;
        breadth=x;
        height=x;
    }
    double Volume(){
        double c = length*breadth*height;
        return c;
    }
}
class BoxWeight extends NewBox{
     double wt;
     BoxWeight(BoxWeight B1){
         super(B1);
         wt=B1.wt;
     }
   BoxWeight(double x, double y, double z , double w){
        length = x;
        breadth = y;
        height = z;
        wt = w;
    }
}

public class Inheritance {
    public static void main(String [] args){
        BoxWeight obj1 = new BoxWeight(23, 45, 67, 78);
       // BoxWeight obj2 = new BoxWeight(34.67, 56.78, 76.7, 89);
        BoxWeight obj2 = new BoxWeight(obj1);
        double vol;
        vol = obj1.Volume();
        System.out.println(" the volume of box1 is "+ vol);
        System.out.println(" the weight of box1 is "+ obj1.wt+" kg");
        vol=obj2.Volume();
        System.out.println(" the volume of box2 is "+ vol);
        System.out.println(" the weight of box2 is "+ obj2.wt+" kg");
//        vol=obj3.Volume();
//        System.out.println(" the volume of box3 is "+ vol);
//        System.out.println(" the weight of box3 is "+ obj3.wt+" kg");


    }



}
