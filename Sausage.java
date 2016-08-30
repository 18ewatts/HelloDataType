
/**
 * Write a description of class Sausage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sausage
{
    // instance variables - replace the example below with your own
    private String flavour;
    private int weight;  //grams
    private String color;
    private String ingredients;
    
    
    /**
     * Constructor for objects of class Sausage
     */
    public Sausage()
    {
        // initialise instance variables
        flavour = "salty";
        weight = 50;
        color = "red";
        ingredients = "blood";
    }
    
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String getFlavour()
    {
        // put your code here
        return this.flavour;
    }
    public String getColor()
    {
        return this.color;
    }
    public void setColor(String newColor)
    {
        this.color = newColor;
    }
    public void setFlavour(String newFlavour)
    {
        // put your code here
        this.flavour = newFlavour;
    }
}
