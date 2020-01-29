import java.util.ArrayList;
/**
 * Write a description of class Promotions here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Promotions
{
    // instance variables - replace the example below with your own
    private int id;
    private int child;
    private int adult;
    private int senior; 

    /**
     * Constructor for objects of class Promotions
     */
    public Promotions(int id, int child, int adult, int senior)
    {
        // initialise instance variables
       this.id = id;
       this.child = child;
       this.adult = adult;
       this.senior = senior; 
        
    }

    public int  getChild()
    {
      return child;
        
    }
    
    public int getAdult()
    {
      return adult;
        
    }
    public int getSenior()
    {
      return senior;
        
    }
    public int getId()
    {
        return id;
    }
   
    
   public String getDetails()
    {
        return "ID: " + id + " | Child: £" + child + " | Adult: £" + adult + " | Senior: £" + senior;
          
    }
    
 
}
    






