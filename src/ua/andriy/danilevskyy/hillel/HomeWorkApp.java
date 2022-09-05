package ua.andriy.danilevskyy.hillel;

import ua.andriy.danilevskyy.hillel.service.Services;

public class HomeWorkApp {
    public static void main(String[] args) {
        Services services = new Services();

        services.printThreeWords();                                   // Task №2

        services.checkSumSign();                                      // Task №3

        services.printColor();                                        // Task №4

        services.compareNumbers();                                    // Task №5

        System.out.println(services.sumRangeValidator(16, 5));  // Task №6

        services.isNumberPositive(-1);                                // Task №7

        System.out.println(services.isNumberNegative(-1));            // Task №8

        services.printer("hello", 5);                     // Task №9

        System.out.println(services.isLeapYear(400));                  // Task №10
    }
}
