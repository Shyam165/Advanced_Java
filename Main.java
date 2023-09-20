public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

/**** Explaination of this code
 *class - this keyword is used to define a new class in Java, which is a blueprint for creating objects
 *  that share the same properties and methods.
 *
 * HelloWorld - this is the name of the class being defined. The convention in Java is to use PascalCase for class names,
 * meaning that each word is capitalized and there are no spaces.
 *
 * {} - these curly braces are used to enclose the body of the class definition.
 * Everything between these braces is considered part of the class.
 *
 * public - this is an access modifier that determines the visibility of the method or variable it precedes.
 * In this case, public means that the method can be accessed from outside the class.
 *
 * static - this keyword indicates that the method or variable belongs to the class itself,
 * rather than to an instance of the class.
 *
 * void - this is the return type of the main method, indicating that it doesn't return any value.
 *
 * main - this is the name of the method that serves as the entry point for a Java program.
 * It's where the program begins executing.
 *
 * (String args[]) - this is the parameter list for the main method. In this case,
 * it's an array of strings named args, which is used to pass command-line arguments to the program.
 *
 * System.out.println - this is a method call that prints text to the console.
 * The println method adds a newline character at the end of the output,
 * so each subsequent call to println will print on a new line.
 *
 * "Hello, World" - this is a string literal, which is enclosed in double quotes.
 * It's the text that will be printed to the console when the program runs.
 *
 * In Java, the System keyword refers to a class in the Java standard library that provides access to
 * the system's standard input, output, and error streams, as well as to system properties and other resources.
 *The System class contains several static fields and methods that can be used to interact with the operating system
 * and its environment. Some of the most commonly used members of the System class include:
 *
 * out: a static field that represents the standard output stream,
 * which is typically used to display text output to the console.
 *
 * in: a static field that represents the standard input stream,
 * which is typically used to read user input from the console.
 *
 * err: a static field that represents the standard error stream,
 * which is typically used to display error messages or other diagnostic information.
 *
 * currentTimeMillis(): a static method that returns the current time in
 * milliseconds since the Unix epoch (January 1, 1970).
 *
 * getProperty(String key): a static method that retrieves the value of a system property specified by the given key.
 *
 * Overall, the System class is a powerful tool that allows Java programs to interact with
 * the underlying operating system and access various system resources.
 */