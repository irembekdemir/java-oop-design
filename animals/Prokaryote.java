public abstract class Prokaryote extends LivingBeing {

    public Prokaryote (String name, boolean canMove, Habitat habitat, boolean hasCellWall) {
        super (
            name, 
            canMove, 
            habitat, 
            "Circular", 
            false, 
            false, 
            false,
            hasCellWall
        );
    }

    public abstract void conjugate();

}
