package adapterAndMediator;

public class ShopMediator {

    Pants pants;
    
    public void takeOrder(Pants pants){
        this.pants = pants;
    }

    public void givePantsToCustomer(){
        System.out.println( "Штаны размера " + pants.size + " направлены на выдачу");
    }
}
