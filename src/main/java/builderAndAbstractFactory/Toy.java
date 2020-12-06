package builderAndAbstractFactory;

class Toy {
    String name;
    String kind;
    int age;
    int weight;
    String factory;

    static class Builder {
        private Toy newToy;

        Builder() {
            newToy = new Toy();
        }

        Builder(Toy toy) {
            newToy = toy;
        }

        Builder withName(String name) {
            newToy.name = name;
            return this;
        }

        Builder withKind(String kind) {
            newToy.kind = kind;
            return this;
        }

        Builder withAge(int age) {
            newToy.age = age;
            return this;
        }

        Builder withWeight(int weight) {
            newToy.weight = weight;
            return this;
        }

        Builder buildInFactory(String factory) {
            newToy.factory = factory;
            return this;
        }

        Toy build() {
            return newToy;
        }
    }
}
