public class FragileCargo extends Cargo {
    private static final double INSURANCE_FEE = 50.0;
    private static final double SPECIAL_HANDLING_MULTIPLIER = 1.8;

    public FragileCargo(String trackingNumber, double weight, int distanceKm) {
        super(trackingNumber, weight, distanceKm);
    }

    @Override
    public double calculatePrice() {

        return (getWeight() * 1.2 + getDistanceKm() * 0.4) * SPECIAL_HANDLING_MULTIPLIER + INSURANCE_FEE;
    }
}
