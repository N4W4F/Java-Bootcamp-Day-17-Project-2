public class Subscribers extends Passenger {

    public Subscribers(String name, String ID, Car reservedCar, double tripCost) {
        super(name, ID, reservedCar, tripCost);
    }

    @Override
    public double reserveCar(Car car) throws Exception {
        if (car.getCapacity() == 0)
            throw new Exception("Car capacity is zero. Cannot reserve.");

        double cost = car.getFixed_route().getTripPrice();
        cost -= cost * 0.5;
        setTripCost(cost);
        return cost;
    }

    @Override
    public void displayInfo() {
        try {
            System.out.println("\nSubscriber Passenger Info:" +
                    "\nPassenger Name: " + getName() +
                    "\nPassenger ID: " + getID() +
                    "\nTrip Cost after subscriber's discount: " + reserveCar(getReservedCar()));

            getReservedCar().displayInfo();
            getReservedCar().getFixed_route().displayInfo();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
