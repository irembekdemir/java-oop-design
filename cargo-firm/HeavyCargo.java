public class HeavyCargo extends Cargo {
    private static final double BASE_RATE = 2.5; // Named Constant
    private static final double EXTRA_FEE = 150.0;

    public HeavyCargo(String trackingNumber, double weight, int distanceKm) {
        super(trackingNumber, weight, distanceKm); // Üst sınıfın constructor'ını çağırır
    }

    @Override
    public double calculatePrice() {
        double price = getWeight() * BASE_RATE + (getDistanceKm() * 0.5);
        if (getWeight() > 30) { // 30 kg üstü ağır yüke girer
            price += EXTRA_FEE;
        }
        return price;
    }
}