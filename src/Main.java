public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        defineLeapYear(2023);
        System.out.println("Задача 2");
        checkClientOS(2022, 0);
        System.out.println("Задача 3");
        int days = defineQuantityDays(100);
        if (days != -1) {
            System.out.println("Потребуется дней: " + days);
        }else{
            System.out.println("Доставки нет!");
        }
    }
    public static void defineLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год - високосный год");
        } else {
            System.out.println(year + " год - невисокосный год");
        }
    }
    public static void checkClientOS(int clientDeviceYear, int clientOS) {
        if (clientDeviceYear < 2023 && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientDeviceYear < 2023 && clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientDeviceYear >= 2023 && clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");

        }
    }
    public static int defineQuantityDays(int deliveryDistance) {
        int days = 1;
        if (deliveryDistance > 20) {
            days++;
        }
        if (deliveryDistance > 60) {
            days++;
        }
        if (deliveryDistance > 100) {
            return - 1;
        }
        return days;
        }
    }