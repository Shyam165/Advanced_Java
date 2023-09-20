import java.util.Scanner;
public class factorial {
    public static void main(String [] args){
        int n;
        System.out.println(" Enter the value that we want to find factorial");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        Fact1 obj = new Fact1();
        System.out.println(" The factorial of " + n + " is " + obj.find_fact(n));
    }
}
class Fact1{
    int find_fact(int x){
        if(x == 0 || x==1)
            return 1;
        return x * find_fact(x-1);
    }
}
