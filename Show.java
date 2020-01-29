/**
 * store details of a show
 */
public class Show
{
    // instance variables - replace the example below with your own
    private int id;
    
    private String show;
    
    private String duration;
    
    private String seats;
    private Promotions promotion;

    /**
     * Constructor for objects of class Show
     */
    public Show(int id, String show, String duration, String seats)
    {
        this.id = id;
        this.show = show;
        this.duration = duration;
        this.seats = seats;
    }
    
    public int getId()
    {
        return id;
    }
    
    public String getShow()
    {
        return show;
    }
    
    public String getDuration()
    {
        return duration;
    }  
    
    public String getSeats()
    {
        return seats;
    }
    
    public String getDetails()
    {
        return "ID: " + id + " | Title: " + show + " | Duration: " + duration + " | Seats per Customer: " + seats;
    }
    
    public Promotions getPromotion()
    {
        return promotion;
    }  
    
     public void addPromotion(Promotions promotion)
    {
        this.promotion = promotion;
    }
}
