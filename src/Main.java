public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");

        int accumulation = 15_000;
        int total = 0;
        int i = 0;
        while (total <= 2_459_000) {
            i++;
            total = total + accumulation;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int fertility = 17;
        int mortality = 8;
        int population = 12_000_000;
        int year = 2023;
        while (year < 2033) {
            year++;
            population = population + population / 1000 * (fertility - mortality);
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");

        int accumulation = 15000;
        int total = 15000;
        for (int i = 1; total <= 12_000_000; i++) {
            total = total + total * 7 / 100;
            total = total + accumulation;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int accumulation = 15000;
        int total = 15000;
        int i = 1;
        for (; total <= 12_000_000; i++) {
            total = total + total * 7 / 100;
            total = total + accumulation;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
            }
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int contribution = 15000;
        int total = 15000;
        int i = 1;
        int yaer = 0;
        for (; yaer < 9; i++) {
            total = total + total * 7 / 100;
            total = total + contribution;
            if (i % 12 == 0) {
                yaer++;
            }
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
            }
        }
    }
    public static void task7() {
        System.out.println("Задача 7");
        int dayFriday = 4;
        while (dayFriday <= 31) {
            System.out.println("Сегодня пятница " + dayFriday + "-е. Необходимо подготовить отчет.");
            dayFriday = dayFriday + 7;
            }
        }
    public static void task8() {
        System.out.println("Задача 8");
        int year = 0;
        while (year <= 2123) {
            year = year + 79;
            if (year>=1823 && year <=2123)
            System.out.println(year);
        }
    }
    }
