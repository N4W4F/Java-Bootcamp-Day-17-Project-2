public class Route {

    private String startAddress;
    private String destinationAddress;
    private double tripPrice;

    public Route(String startAddress, String destinationAddress, double tripPrice) {
        this.startAddress = startAddress;
        this.destinationAddress = destinationAddress;
        this.tripPrice = tripPrice;
    }

    public void setStartAddress(String startAddress) {
        this.startAddress = startAddress;
    }

    public void setDestinationAddress(String destinationAddress) {
        this.destinationAddress = destinationAddress;
    }

    public void setTripPrice(double tripPrice) {
        this.tripPrice = tripPrice;
    }

    public String getStartAddress() {
        return startAddress;
    }

    public String getDestinationAddress() {
        return destinationAddress;
    }

    public double getTripPrice() {
        return tripPrice;
    }

    public void displayInfo() {
        System.out.println("\nRoute Info:" +
                "\nPick Up Address: " + getStartAddress() +
                "\nDestination Address: " + getDestinationAddress() +
                "\nOriginal Trip Price: " + getTripPrice());
    }
}
