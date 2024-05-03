public class Main {
    public static void main(String[] args) {

        {
            int clientOS = 1;
            if (clientOS == 1) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else if (clientOS == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        }
        {
            int clientOS = 0;
            int year = 2014;
            if (clientOS == 0 && year < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else if (clientOS == 0 && year >= 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else if (clientOS == 1 && year < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else if (clientOS == 1 && year >= 2015) {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
        {
            int year = 2024;
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println("Год " + year + " Високосный");
            } else {
                System.out.println("Год " + year + " не является високосным годом");
            }
        }
        {
            int distance = 90;
            int days = 1;
            if (distance > 100) {
                System.out.println("Доставки нет");
            } else {
                if (distance >= 20) {
                    days++;
                }
                if (distance >= 60) {
                    days++;
                }
                System.out.println("Потребуется дней: " + days + " срок доставки");
            }
        }
        {
            int month = 12;
            switch (month) {
                case 0:
                case 1:
                case 2:
                case 12:
                    System.out.println("Зима");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("Весна");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("Лето");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("Осень");
                default:
                    System.out.println("Не знаем такой месяц");
            }
        }
    }
}










