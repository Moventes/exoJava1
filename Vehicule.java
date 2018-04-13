public class Vehicule implements VehiculeInterface {

    private int nombreDeRoue;

    @Override
    public int getNombreDeRoue() {
        return nombreDeRoue;
    }

    @Override
    public void setNombreDeRoue(int nombreDeRoue) {
        this.nombreDeRoue = nombreDeRoue;
    }
}
