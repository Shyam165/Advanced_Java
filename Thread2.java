//implements runnable
class A13 extends Thread{
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println(i);
            try{
                Thread.sleep((5000));
            }
            catch (InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
public class Thread2 {
    public static void main(String args[]){
        A13 obj = new A13();
        Thread t = new Thread(obj);
        t.start();
    }
}
