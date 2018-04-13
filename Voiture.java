public class Voiture extends Vehicule {

    private boolean climatisation = false;

    public Voiture() {
        this.setNombreDeRoue(4);
        this.puissance = 100;
    }

    public boolean hasClimatisation() {
        return climatisation;
    }

    public void setClimatisation(boolean climatisation) {
        this.climatisation = climatisation;
    }
}
