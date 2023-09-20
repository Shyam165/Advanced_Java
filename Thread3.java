//implements runnable
class A14 extends Thread{
    String S;
    A14(String S){
        this.S=S;
    }
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println(S+":" + i);
            try{
                Thread.sleep((2000));
            }
            catch (InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
public class Thread3 {
    public static void main(String args[]){
        A14 obj1 = new A14("Cut the ticket");
        A14 obj2 = new A14("show the ticket");
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
    }
}
