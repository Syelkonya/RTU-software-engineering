package templateMethod;

abstract public class ContactCenter {

    String username;

    public String sendHelloMessage() {
        return "Здравствуйте, как к вам обращаться?";
    }

    public String sendGiveMeYourNumberMessage() {
        return "Введите ваш номер: ";
    }

    abstract String sendDataToContactCenter(String userName, String userNumber);

    public String sendGoodbyeMessage() {
        if (!username.equals(""))
            return "Хорошего дня, " + username + "!";
        else
            return "Хорошего дня!";
    }
}
