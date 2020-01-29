import java.util.ArrayList;

/**
 * Write a description of class VenueManager here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class VenueManager
{
    private ArrayList<Show> shows;
    private ArrayList<Event> events;
    private ArrayList<Promotions> promotions;
    /**
     * Constructor for objects of class VenueManager
     */
    public VenueManager()
    {
        shows = new ArrayList<Show>();
        events = new ArrayList<Event>();
        promotions = new ArrayList<Promotions>();
        System.out.println("There are currently : " + getNumberOfShows() + 
        " shows.");
        System.out.println();
        
        System.out.println("There are currently : " + getNumberOfEvents() + 
        " events.");
        System.out.println();
    }

    public void listAllShows()
    {
        System.out.println("Shows under venue manager: ");

        for(Show show : shows) {
            System.out.println(show.getDetails());
        }
        listAllShowsOnEvents();
        System.out.println();
    }
    
    public void listAllShowsOnEvents()
    {
        System.out.println("Shows assigned to Events: ");

        for(Event event : events) {
            Show show = event.getShow();
            if(show != null)
            {
                System.out.println(show.getDetails());
            }
        }
        System.out.println();
    }
    
    public void listAllPromotionsOnShows()
    {
        System.out.println("Promotions assigned to Shows: ");

        for(Show show : shows) {
            Promotions promotion = show.getPromotion();
            if(promotion != null)
            {
                System.out.println(promotion.getDetails());
            }
        }
        System.out.println();
    }
    
    public void listAllEvents()
    {
        System.out.println("Events: ");

        for(Event event : events) {
            System.out.println(event.getDetails());
        }
        System.out.println();
    }
    
    public void listAllEventsAndShows()
    {
        System.out.println("Shows assigned to Events: ");

        for(Event event : events) {
            Show show = event.getShow();
            if(show != null)
            {
                System.out.println(event.getDetails() + " | " + show.getDetails());
            }
        }
        System.out.println();
    }
    public void listAllShowsAndPromotions()
    {
        System.out.println("Shows assigned to Promotions: ");

        for(Show show : shows) {
            Promotions promotion = show.getPromotion();
            if(promotion != null)
            {
                System.out.println(show.getDetails() + " | " + promotion.getDetails());
            }
        }
        System.out.println();
    }
    
    public void addShow(Show show)
    {
        shows.add(show);
    }
    
    public void addEvent(Event event)
    {
        events.add(event);
    }
    
    public void addPromotion(Promotions promotion)
    {
        promotions.add(promotion);
    }
    
    public void createShow(int id, String name, String duration, String seats)
    {
        Show show = new Show(id, name, duration, seats);
        shows.add(show);
    }
    
    public void createPromotion(int id, int child, int adult, int senior)
    {
        Promotions promotion = new Promotions(id, child, adult, senior);
        promotions.add(promotion);
    }
    
    public void createEvent(int id, String date, String time)
    {
        Event event = new Event(id, date, time);
        events.add(event);
    }
    
    public void addShowOnEvent(int eventId, int showId)
    {
        Event event = null;
        for(Event eventIteration : events) {
            if(eventIteration.getId() == eventId) {
                event = eventIteration;
            }
        }
        
        Show show = null;
        for(Show showIteration : shows) {
            if(showIteration.getId() == showId) {
                show = showIteration;
            }
        }
        
        if(show != null && event != null)
        {
            event.addShow(show);
        }
        else if (show == null)
        {
            System.out.println("Invalid show id");
        }
        else if (event == null)
        {
            System.out.println("Invalid event id");
        }
    }
    
    public void addPromotionOnShow(int showId, int promotionId)
    {
        Promotions promotion = null;
        for(Promotions promotionIteration : promotions) {
            if(promotionIteration.getId() == promotionId) {
                promotion = promotionIteration;
            }
        }
        
        Show show = null;
        for(Show showIteration : shows) {
            if(showIteration.getId() == showId) {
                show = showIteration;
            }
        }
        
        if(promotion != null && show != null)
        {
            show.addPromotion(promotion);
        }
        else if (promotion == null)
        {
            System.out.println("Invalid promotion id");
        }
        else if (show == null)
        {
            System.out.println("Invalid show id");
        }
    }
    
    public int getNumberOfShows()
    {
        return shows.size();
    }
    
    public int getNumberOfEvents()
    {
        return events.size();
    }
    
    public int getnNumberofPromotions()
    {
        return promotions.size();
    }
    
    public void removeShow(int index)
    {
        if(validIndex(index)) {
            shows.remove(index);
        }
    }
    
    public void removeEvent(int index)
    {
        if(validIndex(index)) {
            events.remove(index);
        }
    }
    
    public void removePromotions(int index)
    {
        if(validIndex(index)) {
            promotions.remove(index);
        }
    }
    
    private boolean validIndex(int index)
    {

        boolean valid;
        
        if(index < 0) {
            System.out.println("Index must be a positive value: " + index);
            valid = false;
        }
        else if(index >= shows.size()) {
            System.out.println("Outside Index size: " + index);
            valid = false;
        }
        else {
            valid = true;
        }
        return valid;
    }
    
}
