public class Main {
    public static void main(String[] args) {
        task1();
        leapYear(2023);
        task2();
        clientOS(2022, 0);
        task3();
        int days = deliveryBankCard(100);
        if (days != -1) {
            System.out.println("Потребуется дней: " + days);
        }else{
            System.out.println("Доставки нет!");
        }
    }
    public static void task1() {
        System.out.println("Задача 1");
    }
    public static void leapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год - високосный год");
        } else {
            System.out.println(year + " год - невисокосный год");
        }
    }
    public static void task2() {
        System.out.println("Задача 2");
    }
    public static void clientOS(int clientDeviceYear, int clientOS) {
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
    public static void task3() {
        System.out.println("Задача 3");
    }
    public static int deliveryBankCard(int deliveryDistance) {
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