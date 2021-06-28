package FinalDS.Q4;

public class Passenger implements Comparable<Passenger>{
    private String name,location;
    public Passenger() {
    }
    
    public void addPassenger(String name, String location) {
        this.name = name;
        this.location = location;
    }
    
    public double getDistance() {
         String[] split = location.split(" ");
         double locationnum = Double.parseDouble(split[1]);
         return locationnum;
    }
    
    public String getName() {
        return name;
    }
    
    public int compareTo(Passenger o) {
        if(this.getDistance()>o.getDistance()) {
            return 1;
        }else if(this.getDistance()<o.getDistance()) {
            return -1;
        }else return 0;
    }
}