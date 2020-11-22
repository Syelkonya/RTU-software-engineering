package builderAndAbstractFactory;

public class Main {
    public static void main(String[] args) {


        Toy legoToy = new LegoFactory().createToy();
        System.out.println(legoToy.factory);

        Toy hasbroToy = new HasbroFactory().createToy();
        System.out.println(hasbroToy.factory);

        hasbroToy = new Toy.Builder(hasbroToy)
                .withAge(3)
                .withKind("Pony")
                .build();
        System.out.println(hasbroToy.factory + "\n"
                + hasbroToy.age + "\n"
                + hasbroToy.kind);
    }
}
