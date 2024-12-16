import java.time.LocalDate;

public class Main {
    public static void checkYear(int year) {
        if (year <= 1584) {
            System.out.println("Год должен быть больше, чем 1584");
        } else if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }

    public static void checkClientDevice(int clientDeviceYear, boolean clientOS) {
        int currentYear = LocalDate.now().getYear();

        if (clientDeviceYear < currentYear && clientOS) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
    }

    public static int countDeliveryDays(int deliveryDistance) {
        int deliveryDays;

        if (deliveryDistance <= 20) {
            deliveryDays = 1;
        } else if (deliveryDistance <= 60) {
            deliveryDays = 2;
        } else if (deliveryDistance <= 100) {
            deliveryDays = 3;
        } else {
            deliveryDays = 0;
        }

        return deliveryDays;
    }

    public static void main(String[] args) {
        System.out.println("Задание 1");

        int year = 1600;
        checkYear(year);

        System.out.println("Задание 2");

        int clientDeviceYear = 2014;
        boolean clientOS = true;
        checkClientDevice(clientDeviceYear, clientOS);

        System.out.println("Задание 3");

        int deliveryDistance = 15;
        System.out.println("Потребуется дней: " + countDeliveryDays(deliveryDistance));

    }
}