public class Main {

    public static void main(String[] args) {
        Voiture voiture = new Voiture();
        System.out.println(voiture.getPuissance());
        voiture.setPuissance(10);
        System.out.println(voiture.getPuissance());
    }

}
