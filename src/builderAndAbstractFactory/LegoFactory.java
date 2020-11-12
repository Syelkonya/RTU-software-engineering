package builderAndAbstractFactory;

public class LegoFactory implements ToyFactory {
    @Override
    public Toy createToy() {
        return new Toy.Builder()
                .buildInFactory("LEGO")
                .build();

    }
}
