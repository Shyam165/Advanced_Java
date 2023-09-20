//implements runnable
class A15 extends Thread {
    int available = 1;
    int wanted;

    A15(int a) {
        wanted = a;
    }

    public void run() {
        synchronized (this) {
            String name = Thread.currentThread().getName();
            if (available >= wanted) {
                System.out.println(wanted + "berth reserved for" + name);
                try {
                    Thread.sleep((2000));
                    available = available - wanted;
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            } else {
                System.out.println("Sorry ! no berth available");
            }
        }
    }
}
public class Thread4 {
    public static void main(String args[]){
        A15 obj1 = new A15(1);
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj1);
        t1.setName("first person");
        t2.setName("second person");
        t1.start();
        t2.start();
    }
}
