import java.util.Scanner;
class Table{
    public static void main(String args[]){
        System.out.println("enter number of table:");
        Scanner in = new Scanner(System.in);
        int   n = in.nextInt();
        for(int i=1 ;i<=10; i++){
            System.out.println(n + "*" + i + "=" + (n*i) );
        }

    }
}