import java.util.Scanner;
public class Sort {
    public static void main(String [] args){
        int a[] = new int[5];
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the elements");
        for(int i=0;i<5;i++){
            a[i] = in.nextInt();
        }
        Sort1 obj = new Sort1();
        obj.func1(a, 5);
        System.out.println(" After the sorting the array element");
        for(int i=0;i<5;i++){
            System.out.println(a[i]);
        }

    }
}
class Sort1 {
    void func1(int a[], int n) {
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }
}
