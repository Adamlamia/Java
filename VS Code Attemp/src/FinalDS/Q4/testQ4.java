package FinalDS.Q4;

public class testQ4 {
    public static void main(String[] args) {
        Passenger Susan = new Passenger();
        Passenger Jack = new Passenger();
        Passenger Benjamin = new Passenger();
        Passenger Rachel = new Passenger();
        Passenger Samuel = new Passenger();
        Passenger Kenneth = new Passenger();

        Susan.addPassenger("Susan","Road 0.9");
        Jack.addPassenger("Jack","Road 5.5");
        Benjamin.addPassenger("Benjamin","Road 1.6");
        Rachel.addPassenger("Rachel","Road 3.8");
        Samuel.addPassenger("Samuel","Road 4.1");
        Kenneth.addPassenger("Kenneth","Road 2.6");
        
        priorityQueue<Passenger> bus = new priorityQueue<>();
        bus.enqueue(Susan);
        bus.enqueue(Jack);
        bus.enqueue(Benjamin);
        bus.enqueue(Rachel);
        bus.enqueue(Samuel);
        bus.enqueue(Kenneth);
        
        String[] busStop = {"A","B","C","D","E"};
        int stopCount = 0;
        double distance = 0.2;
        int i = -1;
        while(stopCount<5) {
            distance = distance+1.0;
            i++;
            double prevStopDist = distance-0.5;
            double nextStopDist = distance+0.5;
            
            for (int j = 0; j < bus.getSize(); j++) {
                Passenger check = bus.dequeue();
                if (check.getDistance()>prevStopDist) {
                    if(check.getDistance()<nextStopDist) {
                        System.out.println("Stop "+busStop[i]+": "+check.getName());
                        continue;
                    }
                }
                bus.enqueue(check);
            }
            stopCount++;
        }
    }
}
