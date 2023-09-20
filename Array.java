import java.util.Scanner;
class Array {
    public static void main(String args[]){
        int result=0;
        int a[] = {3,4,5,6,7, 4, 56, 34, 22};
//        int a[] = new int[5];
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter the elements");
//        for(int i=0;i<5;i++){
//           a[i] = in.nextInt();
//        }
//        System.out.println("Elements are ");
        for(int i=0;i<9;i++){
            result = result + a[i];
        }
        System.out.println(result);

    }
}
