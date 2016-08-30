
/**
 * Write a description of class SausageTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SausageTest
{
   public static void main(String [] args)
   {
       Sausage hotDog = new Sausage();
       System.out.println(hotDog.getFlavour());
       Sausage brutworst = new Sausage();
       brutworst.setFlavour("sweet!");
       System.out.println(brutworst.getFlavour());
       System.out.println(brutworst.getColor());
       brutworst.setColor("camoflauge");
       System.out.println(brutworst.getColor());
   }
}
