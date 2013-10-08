/**
 * @author Massimiliano Zattera
 */

public class Console {
    // private static BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
    public static void write(String s){
    	System.out.print(s);
    }
    
    public static void write(float f){
    	Console.write(Float.toString(f));
    }
    
    public static void write(double d){
    	Console.write(Double.toString(d));
    }
    
    public static void write(int i){
    	Console.write(Integer.toString(i));
    }
        
    public static void writeln(String s){
    	Console.write(s+"\n");
    }
    
    public static void writeln(float f){
    	Console.write(Float.toString(f)+"\n");
    }
    
    public static void writeln(double d){
    	Console.write(Double.toString(d)+"\n");
    }
    
    public static void writeln(int i){
    	Console.write(Integer.toString(i)+"\n");
    }
    
    public static String read(){
        //return buffer.readLine();
        return "asf";
    }
}
