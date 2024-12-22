public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println(" Домашнее задание №5");
        System.out.println(" Задача №1");
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println(" Задача №2 ");
        clientOS = 0;
        int clientDeviceYear = 2015;
        if (clientDeviceYear < 2015 && clientOS == 0) {
            System.out.println(" Установите облегченную версию приложения для iOS по ссылке");
        }else if (clientDeviceYear >= 2015 && clientOS == 0) {
            System.out.println(" Установите обычную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println(" Установите облегченную версию приложения для Android по ссылке ");
        }else{
            System.out.println(" Установите обычную версию приложения для Android по ссылке ");
        }

        System.out.println(" Задача №3");
        int year = 2015;
        if (year > 1584 && ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)){
        System.out.println(year + " год високосный ");
    }else {
            System.out.println(year + " год не является високосным");
        }

        System.out.println(" Задача №4");
        int deliveryDistance = 95;
        int days = 1;
        if (deliveryDistance <= 20) {
            System.out.println("потребуется дней " + days);
        } else if (deliveryDistance >= 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней " + (days + 1));
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней " + (days + 2));
        } else {
            System.out.println(" Доставки нет");
        }

        System.out.println(" Задача №5");
        int mounthNumber = 6;
        switch (mounthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println(" Зима ");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(" Весна ");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(" Лето ");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(" Осень ");
                break;
            default:
                System.out.println(" такого месяца нет ");
        }
        int mounthNumber1 = 14;
        switch (mounthNumber1) {
            case 12:
            case 1:
            case 2:
                System.out.println(" Зима ");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(" Весна ");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(" Лето ");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(" Осень ");
                break;
            default:
                System.out.println(" такого месяца нет ");

        }


    }
}





