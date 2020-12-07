package adapterAndMediator;

public class Main {

    public static void main(String[] args) throws InterruptedException {


        ShopMediator pantsShop = new ShopMediator();
        Pants pants = new Pants("MEDIUM");
        Customer customer1 = new Customer(pants, pantsShop);
        customer1.makeOrder();

        System.out.println("///////////////////////////////////////////////////");

        Customer customer2 = new Customer(new Pants("X_LARGE"), pantsShop);
        customer2.makeOrder();
    }
}
