public class Max {
    public static void main(String args[]){
        int a = 12 , b =2 , c = 23;
        int max = a;
        if(b > max){
            max = b;
        }
        if(c > max){
            max = c;
        }
        System.out.println(" the maximum number is : " + max);
    }
}
