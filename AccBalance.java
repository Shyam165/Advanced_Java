package MyPack;

// for compile the this AccBalance file :- javac -d . AccBalance.java
// for run the file from the MyPack folder :- java Mypack.AccBalance
class Balance{
    String name;
    double bal;
    Balance(String n, double b){
        name=n;
        bal=b;

    }
    void show(){
        if (bal<0)
            System.out.println(name+";$"+bal);
    }
}
public class AccBalance{
    public static void main(String[]args){
        Balance current[]=new Balance[3];
        current[0]=new Balance("K.J.",123.23);
        current[1]=new Balance("will",153.23);
        current[2]=new Balance("tom",-12.23);
        for(int i=0;i<3;i++)
            current[i].show();

    }
}