package adapterAndMediator;

public class Customer {

    Pants pants;
    ShopMediator shopMediator;

    public Customer(Pants pants, ShopMediator shopMediator) {
        this.pants = pants;
        this.shopMediator = shopMediator;
    }

    public void makeOrder(){
        this.shopMediator.takeOrder(pants);
        this.shopMediator.givePantsToCustomer();
    }
}
