package builderAndAbstractFactory;

public class HasbroFactory implements ToyFactory {
    @Override
    public Toy createToy() {
        return new Toy.Builder()
                .buildInFactory("Hasbro")
                .build();
    }
}
