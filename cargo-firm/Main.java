import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Polymorphism: Üst sınıf tipinde bir liste oluşturup alt sınıf nesnelerini dolduruyoruz
        List<Cargo> cargoList = new ArrayList<>();

        cargoList.add(new HeavyCargo("TR1001", 45.5, 350));    // 45kg Ağır Kargo
        cargoList.add(new FragileCargo("TR1002", 2.0, 120));   // Cam Eşya (Hassas)
        cargoList.add(new LightExpressCargo("TR1003", 0.5, 20)); // Evrak (Hafif/Hızlı)

        System.out.println("--- KARGO FATURA SİSTEMİ ---");
        
        // Tek döngüyle tüm kargoların kendine has ücret hesaplamasını tetikliyoruz
        for (Cargo c : cargoList) {
            System.out.printf("Takip No: %s | Türü: %s | Toplam Ücret: %.2f TL%n",
                    c.getTrackingNumber(), 
                    c.getClass().getSimpleName(), 
                    c.calculatePrice());
        }
    }
}