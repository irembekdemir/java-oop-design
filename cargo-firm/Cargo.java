
public abstract class Cargo {
    // Encapsulation: Değişkenler private, doğrudan erişilemez
    private String trackingNumber;
    private double weight;
    private int distanceKm;

    // Constructor (Yapıcı Metot)
    public Cargo(String trackingNumber, double weight, int distanceKm) {
        this.trackingNumber = trackingNumber;
        this.weight = weight;
        this.distanceKm = distanceKm;
    }

    // Abstraction: Gövdesi olmayan, alt sınıfların doldurmak zorunda olduğu metot
    public abstract double calculatePrice();

    // Getter metotları (Alt sınıfların private verilere güvenli erişimi için)
    public String getTrackingNumber() { return trackingNumber; }
    public double getWeight() { return weight; }
    public int getDistanceKm() { return distanceKm; }
}