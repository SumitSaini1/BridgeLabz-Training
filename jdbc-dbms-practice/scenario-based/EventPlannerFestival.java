import java.util.*;
import java.time.*;

class Event {
    String name;
    String location;
    String date;

    public Event(String name, String location, String date) {
        this.name = name;
        this.location = location;
        this.date = date;
    }

}

class Music extends Event {
    String headliner;
    String musicGenre;
    int ticketPrice;

    public Music(String name, String location, String date, String headliner, String musicGenre, int ticketPrice) {
        super(name, location, date);
        this.headliner = headliner;
        this.musicGenre = musicGenre;
        this.ticketPrice = ticketPrice;
    }

}

class Food extends Event {
    String cuisine;
    int numStalls;
    int entryFee;

    public Food(String name, String location, String date, String cuisine, int numStalls, int entryFee) {
        super(name, location, date);
        this.cuisine = cuisine;
        this.numStalls = numStalls;
        this.entryFee = entryFee;
    }

}

class Art extends Event {
    String artType;
    int numArtist;
    int exhibitionFee;

    public Art(String name, String location, String date, String artType, int numArtist, int exhibitionFee) {
        super(name, location, date);
        this.artType = artType;
        this.numArtist = numArtist;
        this.exhibitionFee = exhibitionFee;
    }

}

class Service {
    private ArrayList<Event> events = new ArrayList<>();

    public void addEvent(Event e) {
        events.add(e);
    }

    public void displatyEventByName(String name) {
        if (events.isEmpty()) {
            System.out.println("EmptyString");
        }
        for (Event e : events) {
            if (e.name.equals(name)) {
                System.out.println("Festival Name: " + e.name);
                System.out.println("Location: " + e.location);
                System.out.println("Date: " + e.date);

                if (e instanceof Music) {
                    Music m = (Music) e;
                    System.out.println("Headliner: " + m.headliner);
                    System.out.println("Music Genre: " + m.musicGenre);
                    System.out.println("Ticket Price: " + m.ticketPrice);

                }
                else if (e instanceof Food) {
                    Food f = (Food) e;
                    System.out.println("Cuisine: " + f.cuisine);
                    System.out.println("Number of Stalls: " + f.numStalls);
                    System.out.println("Entry Fee: " + f.entryFee);
                } else if (e instanceof Art) {
                    Art a = (Art) e;
                    System.out.println("Art Type: " + a.artType);
                    System.out.println("Number of Artists: " + a.numArtist);
                    System.out.println("Exhibition Fee: " + a.exhibitionFee);
                }

            }
        }

    }

}

public class EventPlannerFestival {
    Service service = new Service();

    public void processData(String[] splitInput) {
        if (splitInput[0].equals("ADD_FESTIVAL")) {
            if (splitInput[1].equals("MUSIC")) {
                Event music = new Music(splitInput[2], splitInput[3], splitInput[4], splitInput[5], splitInput[6],
                        Integer.parseInt(splitInput[7]));
                service.addEvent(music);
            }
            if (splitInput[1].equals("FOOD")) {
                Event food = new Food(splitInput[2], splitInput[3], splitInput[4], splitInput[5],
                        Integer.parseInt(splitInput[6]), Integer.parseInt(splitInput[7]));
                service.addEvent(food);
            }
            if (splitInput[1].equals("ART")) {
                Event art = new Art(splitInput[2], splitInput[3], splitInput[4], splitInput[5],
                        Integer.parseInt(splitInput[6]), Integer.parseInt(splitInput[7]));
                service.addEvent(art);

            }

        }
        if (splitInput[0].equals("DISPLAY_DETAILS")) {
            if (splitInput[1].equals("Coachella")) {
                service.displatyEventByName(splitInput[1]);

            }
            if (splitInput[1].equals("TastyFest")) {
                service.displatyEventByName(splitInput[1]);

            }
            if (splitInput[1].equals(" ArtExpo")) {
                service.displatyEventByName(splitInput[1]);

            }
        }

    }

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            EventPlannerFestival event = new EventPlannerFestival();
            while (true) {
                String input = sc.nextLine();
                if (input.equals("EXIT")) {
                    return;
                }
                String[] splitInput = input.split(" ");
                event.processData(splitInput);

            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
