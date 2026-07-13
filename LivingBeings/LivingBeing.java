public abstract class LivingBeing {

    private String name;

    private boolean canMove;

    private final Habitat habitat;

    private final String dnaStructure;
    private final boolean hasNucleus;
    private final boolean hasMembraneBoundOrganelles; 
    private final boolean hasDoubleMembraneOrganelles;
    private final boolean hasCellWall;

    //Common attributes of living things:
    public abstract void breathe(); 
    public abstract void feed();
    public abstract void grow();
    public abstract void reproduce();


    public LivingBeing(String name, boolean canMove, Habitat habitat, String dnaStructure, boolean hasNucleus, 
                       boolean hasMembraneBoundOrganelles, boolean hasDoubleMembraneOrganelles, boolean hasCellWall) {
        this.name = name;
        this.canMove = canMove;
        this.habitat = habitat;
        this.dnaStructure = dnaStructure;
        this.hasNucleus = hasNucleus;
        this.hasMembraneBoundOrganelles = hasMembraneBoundOrganelles;
        this.hasDoubleMembraneOrganelles = hasDoubleMembraneOrganelles;
        this.hasCellWall = hasCellWall;
    }

    public String getName() { return name; }
    public String getDnaStructure() { return dnaStructure; }
    public Habitat getHabitat() { return habitat;}

    public boolean hasNucleus() { return hasNucleus; }
    public boolean hasMembraneBoundOrganelles() { return hasMembraneBoundOrganelles; }
    public boolean hasDoubleMembraneOrganelles() { return hasDoubleMembraneOrganelles; }
    public boolean isCanMove() { return canMove; }
    public boolean hasCellWall() {return hasCellWall;}
}


