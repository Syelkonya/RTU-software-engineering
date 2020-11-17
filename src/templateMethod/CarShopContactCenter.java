package templateMethod;

public class CarShopContactCenter extends ContactCenter {

    @Override
    String sendDataToContactCenter(String userName, String userNumber) {
        return "Имя: " + userName + " номер: " + userNumber  + " отправлены по суперзащищеному соединению";
    }

    @Override
    public String sendHelloMessage() {
        return "Добро пожаловать в наш современный авто салон, как к вам обращаться?";
    }
}
