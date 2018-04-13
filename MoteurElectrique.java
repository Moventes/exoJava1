public class MoteurElectrique implements Moteur {

    protected int puissance;

    public MoteurElectrique(int puissance) {
        this.puissance = puissance;
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