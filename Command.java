public class Command {
    int a, b;
    public static void main(String [] args){
        Command C1 = new Command();
        C1.a = Integer.parseInt(args[0]);
        C1.b = Integer.parseInt(args[1]);
        System.out.println("the value of a is " + C1.a);
        System.out.println("the value of b is " + C1.b);
    }
}
