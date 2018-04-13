public class Main {

    public static void main(String[] args) {
        Voiture voiture = new Voiture<MoteurElectrique>(new MoteurElectrique(100));
        System.out.println(voiture.getMoteur().getPuissance());
        voiture.getMoteur().setPuissance(10);
        System.out.println(voiture.getMoteur().getPuissance());
    }

}
