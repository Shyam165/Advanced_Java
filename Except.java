class Except{

    public static void main(String args []){
        try{
            int marks[]= {1,2,3,4,5,6};
        //  System.out.println(marks[10]);
            int n = args.length;
            int a = 45/n;
            System.out.println(a);
        }
        catch (ArithmeticException ae){
            System.out.println(ae);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
       finally{
            System.out.println("hello");
        }
    }
}
