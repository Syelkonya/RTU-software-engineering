package adapterAndMediator;

import java.util.concurrent.TimeUnit;

public class PantsAdapter {

    public void castToNormalSize(String size) throws InterruptedException {
        System.out.println("Брюки изменяют до вашего размера " + size + "\nПОДОЖДИТЕ" );
        TimeUnit.SECONDS.sleep(3);
        System.out.println("Брюки изменили до нужного размера " + size);
    }
}
