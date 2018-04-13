public class Vehicule implements VehiculeInterface {

    private int nombreDeRoue;

    protected int puissance;

    @Override
    public int getNombreDeRoue() {
        return nombreDeRoue;
    }

    @Override
    public void setNombreDeRoue(int nombreDeRoue) {
        this.nombreDeRoue = nombreDeRoue;
    }

    @Override
    public int getPuissance() {
        return puissance;
    }

    @Override
    public void setPuissance(int puissance) {
        this.puissance = puissance;
    }
}
