import java.util.Scanner;
public class Palindrome {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        //int number= 121;
        System.out.println("enter the number");
        int number = in.nextInt();
            int rem, rev=0;
            int temp=number;
            while (number!=0){
                
                
                rem= number%10;
                rev = (rev*10 + rem);
                number=number/10;
            }
            if(rev==temp){
                System.out.println("the given number is palindrome which is "+ temp);
            }
            else {
                System.out.println("the given number is not palindrome ");
            }
    }
}
