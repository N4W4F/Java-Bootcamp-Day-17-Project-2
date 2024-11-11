import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create Routes
        Route r1 = new Route("Munsiyah", "Taawun", 50);
        Route r2 = new Route("Alkhaleej", "Alquds", 30);
        Route r3 = new Route("Diriyah", "Kingdom Center", 60);
        Route r4 = new Route("Diplomatic Quarter", "Riyadh Gallery", 40);

        // Create Cars
        Car c1 = new Car("1001", r1, 5);
        Car c2 = new Car("2555", r2, 7);
        Car c3 = new Car("3020", r3, 3);
        Car c4 = new Car("4011", r4, 0);  // Zero capacity

        // Create Passengers
        ArrayList<Passenger> passengers = new ArrayList<>();
        passengers.add(new NonSubscribers("Nawaf", "1111", c1, c1.getFixed_route().getTripPrice(), true));
        passengers.add(new Subscribers("Osama", "2222", c2, c2.getFixed_route().getTripPrice()));
        passengers.add(new NonSubscribers("Sarah", "3333", c3, c3.getFixed_route().getTripPrice(), false));
        passengers.add(new Subscribers("Ahmed", "4444", c1, c1.getFixed_route().getTripPrice()));
        passengers.add(new NonSubscribers("Layla", "5555", c2, c2.getFixed_route().getTripPrice(), true));
        passengers.add(new Subscribers("Khalid", "6666", c4, c4.getFixed_route().getTripPrice())); // Zero capacity

        // Print Passenger Info
        printList(passengers);
    }

    // Helper method to print the passengers info
    public static void printList(ArrayList<Passenger> passengers) {
        for (Passenger p : passengers) {
            try {
                p.reserveCar(p.getReservedCar());
                p.displayInfo();
            } catch (Exception e) {
                System.out.println("Error reserving car for passenger " + p.getName() + ": " + e.getMessage());
            }
            System.out.println("---------------------------------");
        }
    }
}
