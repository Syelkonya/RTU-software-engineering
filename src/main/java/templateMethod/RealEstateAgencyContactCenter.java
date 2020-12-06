package main.java.templateMethod;

public class RealEstateAgencyContactCenter  extends ContactCenter {
    @Override
    String sendDataToContactCenter(String userName, String userNumber) {
        return "Текущие данные\nИмя: " + userName + "\nномер: " + userNumber  + "\nотправлены  ожидают оператора";
    }
}
