public class PrimeNumber {
    public static void main(String args[]){
        int i , number = 10;
       int status=0;
        for(i=2;i<number;i++){
            if(number%i==0){
                System.out.println("given number is not prime");
                status=1;
                break;
            }
        }
        if(status==0) {
            System.out.println("Given number is prime number");
        }
    }
}
