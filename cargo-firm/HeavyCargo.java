public class HeavyCargo extends Cargo {
    private static final double BASE_RATE = 2.5; 
    private static final double EXTRA_FEE = 150.0;

    public HeavyCargo(String trackingNumber, double weight, int distanceKm) {
        super(trackingNumber, weight, distanceKm); 
    }

    @Override
    public double calculatePrice() {
        double price = getWeight() * BASE_RATE + (getDistanceKm() * 0.5);
        if (getWeight() > 30) { 
            price += EXTRA_FEE;
        }
        return price;
    }
}
