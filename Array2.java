import java.util.Scanner;
public class Array2 {
    public static void main(String args[]){
        int a[][]  = new int[2][2];
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the elements");
        for(int i=0; i<2 ;i++){
            for(int j=0; j<2; j++){
                a[i][j] = in.nextInt();
            }
        }
        for(int i=0; i<2 ;i++){
            for(int j=0; j<2; j++){
               System.out.print(a[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }
}
