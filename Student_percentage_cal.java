import java.util.Scanner;
public class
Student_percentage_cal {
    public static void main(String[] args){
        System.out.println("Enter the Marks of students of five subject:");
        Scanner S = new Scanner (System.in);
        int marks1 = S.nextInt();
        int marks2 = S.nextInt();
        int marks3 = S.nextInt();
        int marks4 = S.nextInt();
        int marks5 = S.nextInt();
       float percentage = (marks1+marks2+marks3+marks4+marks5)/5;
       System.out.print("the percentage of total marks of student is ");
       System.out.println(percentage);
    }
}