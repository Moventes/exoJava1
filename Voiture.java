public class Voiture<MOTEUR extends Moteur> extends Vehicule {

    private boolean climatisation = false;

    private MOTEUR moteur;

    public Voiture(MOTEUR moteur) {
        this.setNombreDeRoue(4);
        this.moteur = moteur;
    }

    public boolean hasClimatisation() {
        return climatisation;
    }

    public void setClimatisation(boolean climatisation) {
        this.climatisation = climatisation;
    }

    public MOTEUR getMoteur() {
        return this.moteur;
    }
}
