package inversionOfControl;

public class Main {

    public static void main(String[] args) {
        Gamer gamer1 = new Gamer();
        gamer1.preferToPlayOn(new TVset());

        System.out.println("/////////////////////////////////");

        gamer1.preferToPlayOn(new Monitor());
    }
}
