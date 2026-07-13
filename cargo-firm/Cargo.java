
public abstract class Cargo {

    private String trackingNumber;
    private double weight;
    private int distanceKm;

    public Cargo(String trackingNumber, double weight, int distanceKm) {
        this.trackingNumber = trackingNumber;
        this.weight = weight;
        this.distanceKm = distanceKm;
    }

    public abstract double calculatePrice();

    public String getTrackingNumber() { return trackingNumber; }
    public double getWeight() { return weight; }
    public int getDistanceKm() { return distanceKm; }
}
