import java.util.ArrayList;

/**
 * Write a description of class Event here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Event
{
    private int id;
    private String date;
    private String time;
    private Show show;

    /**
     * Constructor for objects of class Event
     */
    
    public Event(int id, String date, String time)
    {
        this.id = id;
        this.date = date;
        this.time = time;
    }
    
    public Event(int id, String time, Show show)
    {
        this.id = id;
        this.date = date;
        this.time = time;
        this.show = show;
    }
    
    public String getDetails()
    {
        Show show = getShow();
        String showName = "";
        if (show != null)
        {
            showName = " : " + show.getShow();
        }
        
        return " ID: " + id + " | Event Date: " + date + " | Start Time: " + time + " | Show: " + showName;
    }
    
    public int getId()
    {
        return id;
    }
    
    public String getDate()
    {
        return date;
    }
    
    public String getTime()
    {
        return time;
    }  
    
    public Show getShow()
    {
        return show;
    }  
    
    public void addShow(Show show)
    {
        this.show = show;
    }
}

