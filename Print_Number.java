import java.util.Scanner;
public class Print_Number {
    int num1;
    void get_Data(){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the value of num1 ");
        num1 = sc.nextInt();
    }
    void put_Data(){
        System.out.println(" The value of num1 is " + num1);
    }
    public static void main(String args[]){
        Print_Number N = new Print_Number();
        N.get_Data();
        N.put_Data();
    }
}
