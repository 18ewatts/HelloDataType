
/**
 * Write a description of class HelloDataType here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
//import statement(s)
import java.util.Scanner; 

public class HelloDataType
{
    //fields
    //int x = 10;
    //double y = 2.1;
    //boolean really = true;
    //constructor(s)
    public HelloDataType() //default constructor. no practical use for now
    {
        
    }
    
    //methods
    public static void main(String[] args) 
    {
        double x = 20;
        double y = 10;
        
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter a number: ");
        x = reader.nextDouble(); // Scans the next token of the input as an int.
        System.out.println("Enter another number: ");
        y = reader.nextDouble();
        double result = x/ y;
        System.out.println("x/y: "+ (x/ y));
    }
    
}
