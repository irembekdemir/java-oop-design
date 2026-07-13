public abstract class Eukaryote extends LivingBeing{

    public Eukaryote(String name, boolean canMove, Habitat habitat, 
                     boolean hasDoubleMembraneOrganelles, boolean hasCellWall) {
        super(
            name, 
            canMove, 
            habitat, 
            "Linear", 
            true,     
            true, 
            hasDoubleMembraneOrganelles, 
            hasCellWall
        );
    }
    public abstract void performMitosis();
}
