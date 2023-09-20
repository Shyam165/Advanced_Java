//implements runnable
class A16 extends Thread{
    String name;
    A16(String S){
        name=S;
    }
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println(name + ":" + i);

        }
    }
}
public class Thread5 {
    public static void main(String args[]){
        A16 obj1 = new A16("India");
        A16 obj2 = new A16("Japan");

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        try{
            t2.join();
        }
        catch (InterruptedException e){
            System.out.println(e);
        }
        System.out.println(t2.isAlive());
        System.out.println(t1.isAlive());
        System.out.println(t2.isAlive());
        t1.start();
        t2.start();
        System.out.println(t1.isAlive());

    }
}
//what do you understand by multithreading programming in java . also explain various method of thread class.f
// write a program to create a thread using extend thread
// write a program to create a thread using implements runnable and also show the use of sleep method
// write a program to create two threads acting upon two different objects
// write a program to create two threads acting upon a single object and also show the user thread synchronization
// write a program to show the user isAlive and join method.