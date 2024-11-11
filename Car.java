public class Car {

    private String code;
    private Route fixed_route;
    private final int capacity;

    public Car(String code, Route fixed_route, int capacity) {
        this.code = code;
        this.fixed_route = fixed_route;
        this.capacity = capacity;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setFixed_route(Route fixed_route) {
        this.fixed_route = fixed_route;
    }

    public String getCode() {
        return code;
    }

    public Route getFixed_route() {
        return fixed_route;
    }

    public int getCapacity() {
        return capacity;
    }

    public void displayInfo() {
        System.out.println("\nCar Info:" +
                "\nCar Code: " + getCode() +
                "\nCar Capacity: " + getCapacity());
    }
}
