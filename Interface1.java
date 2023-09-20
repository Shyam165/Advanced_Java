
abstract class Vehicle{
    abstract void engine();
}

class Car extends Vehicle{
    void engine(){
        System.out.println("Car has good engine");
    }
}
class Truck extends Vehicle{
    void  engine(){
        System.out.println("Truck has good engine");
    }
}
public class Interface1 {
    public static void main(String [] args){
        Truck obj1 = new Truck();
        obj1.engine();
        Car obj2 = new Car();
        obj2.engine();
    }
}
