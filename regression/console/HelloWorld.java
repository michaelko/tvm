/**
* @author Zazzy
*/

public class HelloWorld {
    public static void main(String[] aArg) throws Exception {
        Console.write("What is your name?: ");        
        String name = Console.read();
        Console.write("Hello " + name + "\n");
    }
}
