package templateMethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        CarShopContactCenter carShopContactCenter = new CarShopContactCenter();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(carShopContactCenter.sendHelloMessage());
        carShopContactCenter.username = reader.readLine();

        System.out.println(carShopContactCenter.sendGiveMeYourNumberMessage());
        System.out.println(carShopContactCenter.sendDataToContactCenter(carShopContactCenter.username, reader.readLine()));

        System.out.println(carShopContactCenter.sendGoodbyeMessage());

        System.out.println("//////////////////////////////////////////////////////////////////////////////////");
///////////////////////////////////////////////////////////////////////////////////////////////////////////////

        RealEstateAgencyContactCenter realEstateContactCenter = new RealEstateAgencyContactCenter();

        System.out.println(realEstateContactCenter.sendHelloMessage());
        realEstateContactCenter.username = reader.readLine();

        System.out.println(realEstateContactCenter.sendGiveMeYourNumberMessage());
        System.out.println(realEstateContactCenter.sendDataToContactCenter( realEstateContactCenter.username, reader.readLine()));

        System.out.println(realEstateContactCenter.sendGoodbyeMessage());
    }





}
