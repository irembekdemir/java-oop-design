public class LightExpressCargo extends Cargo {
    private static final double EXPRESS_SURCHARGE = 80.0;

    public LightExpressCargo(String trackingNumber, double weight, int distanceKm) {
        super(trackingNumber, weight, distanceKm);
    }

    @Override
    public double calculatePrice() {
        return (getDistanceKm() * 1.5) + EXPRESS_SURCHARGE;
    }
}