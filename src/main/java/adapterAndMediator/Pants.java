package adapterAndMediator;

public class Pants {
    final String size = "MEDIUM";
    private final PantsAdapter pantsAdapter = new PantsAdapter();

    public Pants(String size) throws InterruptedException {
        if (!this.size.equals(size))
            pantsAdapter.castToNormalSize(size);
    }
}
