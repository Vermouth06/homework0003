public class Main {
    public static void main(String[] args) {
        int clientOs = 0;
        if (clientOs == 0) {
            System.out.println("У вас андроид");
        } else if (clientOs == 1) {
            System.out.println("У вас ОС");
        } else {
            System.out.println("ОС не найдена");

            int year = 205;
            if (clientOs == 0 && year > 2019) {
                System.out.println("установите обычную версию андроида");
            } else if (clientOs == 0 && year < 2019) {
                System.out.println("Установите лайт версию андроида");
            } else if (clientOs == 1 && clientOs > 2019) {
                System.out.println("Установите обычную версию IOS");
            } else if (clientOs == 1 && clientOs < 2019) {
                System.out.println("установите лайт версию IOS");
            } else {
                System.out.println("Ваше устройство не поддерживается");

            }
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.printf("год % не всокосный", year);
            } else {
                System.out.printf("год % не високосный", year);

            }
            int deLiveryDistance = 60;
            if (deLiveryDistance > 0 && deLiveryDistance < 20) {
                System.out.println("доставка за 1 день");
            } else if ( deLiveryDistance >= 20 && deLiveryDistance < 60) {
                System.out.println("доставка за 2 дня");
            } else if ( deLiveryDistance >= 60 && deLiveryDistance < 180) {
                System.out.println("доставка за 3 дня");
            } else {
                System.out.println("Сюда не доставляем");
            }


            int monthNumber = 12;
            switch (monthNumber) {
                case 12:
                case 1:
                case 2:
                    System.out.println("зимний номер месяца");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("весенний месяц");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("Летний месяц");
                case  9:
                case 10:
                case 11:
                    System.out.println("Осенний месяц");
                default:
                    System.out.println("Такого месяца не бывает");








            }



            }


        }

    }

}