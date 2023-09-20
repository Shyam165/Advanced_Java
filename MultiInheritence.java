class NewBox1{
    double length, breadth, height;

    NewBox1(){
        length=0;
        breadth=0;
        height=0;
    }
    NewBox1(NewBox1 B){
        length= B.length;
        breadth=B.breadth;
        height=B.height;
    }
    NewBox1(double x, double y, double z){
        length=x;
        breadth=y;
        height=z;
    }
    NewBox1(double x){
        length=x;
        breadth=x;
        height=x;
    }
    double Volume(){
        double c = length*breadth*height;
        return c;
    }
}
class BoxWeight1 extends NewBox1{
    double wt;
    BoxWeight1(){}
    BoxWeight1(BoxWeight1 B1){
        super(B1);
        wt=B1.wt;
    }

    BoxWeight1(double x, double y, double z , double w){
        super(x, y, z);
//        length = x;
//        breadth = y;
//        height = z;
        wt = w;
    }
}
class BoxColour extends BoxWeight1 {
    String colour;

    BoxColour(BoxColour B2) {
        super(B2);
        colour = B2.colour;
    }

    BoxColour(double x, double y, double z, double w, String a) {
        super(x, y, z, w);
//        length = x;
//        breadth = y;
//        height = z;
//        wt = w;
        colour = a;
    }
}

    public class MultiInheritence {
        public static void main(String [] args){
            BoxColour obj1 = new BoxColour(23, 45, 67, 78, "Red");
           // BoxColour obj2 = new BoxColour(34.67, 56.78, 76.7, 89, "blue");
            BoxColour obj2 = new BoxColour(obj1);
            double vol;
            vol = obj1.Volume();
            System.out.println(" the volume of box1 is "+ vol);
            System.out.println(" the weight of box1 is "+ obj1.wt+" kg");
            System.out.println(" the colour of box1 is "+ obj1.colour);
            vol=obj2.Volume();
            System.out.println(" the volume of box2 is "+ vol);
            System.out.println(" the weight of box2 is "+ obj2.wt+" kg");
            System.out.println(" the colour of box2 is "+ obj2.colour);
//            vol=obj3.Volume();
//            System.out.println(" the volume of box3 is "+ vol);
//            System.out.println(" the weight of box3 is "+ obj3.wt+" kg");
//            System.out.println(" the colour of box3 is "+ obj3.colour+" kg");


        }

    }

