public abstract class Passenger {

    private String name;
    private String ID;
    private Car reservedCar;
    private double tripCost;

    public Passenger(String name, String ID, Car reservedCar, double tripCost) {
        this.name = name;
        this.ID = ID;
        this.reservedCar = reservedCar;
        this.tripCost = tripCost;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setReservedCar(Car reservedCar) {
        this.reservedCar = reservedCar;
    }

    public void setTripCost(double tripCost) {
        this.tripCost = tripCost;
    }

    public String getName() {
        return name;
    }

    public String getID() {
        return ID;
    }

    public Car getReservedCar() {
        return reservedCar;
    }

    public double getTripCost() {
        return tripCost;
    }

    public abstract double reserveCar(Car car) throws Exception;

    public abstract void displayInfo() throws Exception;
}
