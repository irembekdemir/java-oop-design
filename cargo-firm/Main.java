import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Cargo> cargoList = new ArrayList<>();

        cargoList.add(new HeavyCargo("TR1001", 45.5, 350));    
        cargoList.add(new FragileCargo("TR1002", 2.0, 120));   
        cargoList.add(new LightExpressCargo("TR1003", 0.5, 20)); 

        System.out.println("--- CARGO BILL SYSTEM ---");
        
        for (Cargo c : cargoList) {
            System.out.printf("Track No: %s | Type: %s | Total: %.2f TL%n",
                    c.getTrackingNumber(), 
                    c.getClass().getSimpleName(), 
                    c.calculatePrice());
        }
    }
}
