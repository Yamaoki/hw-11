public class Main {
    public static void main(String[] args) {
        checkYear(2022);
        extraditeDevice(1, 2022);
        int checkDeliveryDay = deliveryDay(95);
        System.out.println("Необходимо дней доставки " + checkDeliveryDay);
    }

    //Задача 1

    public static void checkYear (int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    //Задача 2

    public static void extraditeDevice (int osType, int clientDeviceYear) {
        if (osType != 1 && osType != 0) {
            throw new IllegalArgumentException("Wrong OS type");
        }
        String osString = osType == 0 ? "IOS" : "Android";
        String versionString = clientDeviceYear > 2015 ? "обычную" : "облегченную";
        System.out.println("Установите " + versionString + " версию приложения для " + osString + " по ссылке");
    }

    //Задача 3

    public static int deliveryDay (int deliveryDistance){
        if (deliveryDistance <= 20) {
            return 1;
        } else {
            return (int) Math.round((double) deliveryDistance / 40) + 1;
        }
    }
}