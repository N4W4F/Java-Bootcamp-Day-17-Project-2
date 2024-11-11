public class NonSubscribers extends Passenger {

    private boolean discount_coupon;

    public NonSubscribers(String name, String ID, Car reservedCar, double tripCost, boolean discount_coupon) {
        super(name, ID, reservedCar, tripCost);
        this.discount_coupon = discount_coupon;
    }

    public void setDiscount_coupon(boolean discount_coupon) {
        this.discount_coupon = discount_coupon;
    }

    public boolean isDiscount_coupon() {
        return discount_coupon;
    }

    @Override
    public double reserveCar(Car car) throws Exception {
        if (car.getCapacity() == 0)
            throw new Exception("Car capacity is zero. Cannot reserve.");

        double cost = car.getFixed_route().getTripPrice();
        if (isDiscount_coupon()) {
            cost -= cost * 0.1;
        }
        setTripCost(cost);
        return cost;
    }

    @Override
    public void displayInfo() throws Exception {
        System.out.println("\nNon-Subscriber Passenger Info:" +
                "\nPassenger Name: " + getName() +
                "\nPassenger ID: " + getID());

        if (isDiscount_coupon())
            System.out.println("Trip Cost after discount coupon: " + reserveCar(getReservedCar()));

        getReservedCar().displayInfo();
        getReservedCar().getFixed_route().displayInfo();

    }
}
