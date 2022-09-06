package ua.andriy.danilevskyy.hillel.service;

/**
 * Класс, в котором реализованы методы из домашки №6.
 */
public class Services {

    /**
     * Это метод printThreeWords(), который при вызове должен отпечатать в столбец три слова: Orange, Banana, Apple.
     */
    public void printThreeWords() {
        System.out.println("Orange\n\nBanana\n\nApple");
    }

    /**
     * Это метод checkSumSign(), в теле которого объявите две int переменные a и b, и инициализируйте
     * их любыми значениями, которыми захотите. Далее метод должен просуммировать эти переменные, и если их сумма больше
     * или равна 0, то вывести в консоль сообщение “Сумма положительная”, в противном случае - “Сумма отрицательная”
     */
    public void checkSumSign() {
        int a = -7;
        int b = 7;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("The sum is positive.");
        } else {
            System.out.println("The sum is negative.");
        }
    }

    /**
     * Это метод printColor() в теле которого задайте int переменную value и инициализируйте ее любым значением.
     * Если value меньше 0 (0 включительно), то в консоль метод должен вывести сообщение “Красный”,
     * если лежит в пределах от 0 (0 исключительно) до 100 (100 включительно), то “Желтый”,
     * если больше 100 (100 исключительно) - “Зеленый”;
     */
    public void printColor() {
        int value = 101;
        if (value <= 0) {
            System.out.println("RED");
        } else if (value > 0 && value <= 100) {
            System.out.println("YELLOW");
        } else {
            System.out.println("GREEN");

        }
    }

    /**
     * Это метод compareNumbers(), в теле которого объявите две int переменные a и b, и инициализируйте их любыми
     * значениями, которыми захотите. Если a больше или равно b, то необходимо вывести в консоль сообщение “a >= b”,
     * в противном случае “a < b”;
     */
    public void compareNumbers() {
        int a = 6;
        int b = 7;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    /**
     * Это метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20
     * (включительно), если да – вернуть true, в противном случае – false.
     */
    public boolean sumRangeValidator(int a, int b) {
        int sum = a + b;
        return 10 < sum && sum <= 20;
    }

    /**
     * Это метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
     * положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
     */
    public void isNumberPositive(int number) {
        System.out.println(number >= 0);
    }

    /**
     * Это метод, которому в качестве параметра передается целое число. Метод должен вернуть true,
     * если число отрицательное, и вернуть false если положительное.
     */
    public boolean isNumberNegative(int number) {
        return number < 0;
    }

    /**
     * Это метод, которому в качестве аргументов передается строка и число, метод должен отпечатать в консоль
     * указанную строку, указанное количество раз;
     */
    public void printer(String text, int repeat) {
        for (int i = 0; i < repeat; i++) {
            System.out.println(text);
        }
    }

    /**
     * Это метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true,
     * не високосный - false). Каждый 4-й год является високосным, кроме каждого 100-го,
     * при этом каждый 400-й – високосный
     */
    public boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }
}
