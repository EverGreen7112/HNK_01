package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    static int calculateDigitNumber(int correctFloor) {
        int DIGITS_PER_NUMBER_OPTIONS = 10; // Digits in 1, 11, 111, 1111, etc. : 1 + 2 + 3 + 4 = 10
        int seriesNum = correctFloor % 10 - 1; // How many sets of numbers before this one - 0 if numbered 1, 4 if numbered 5, etc.
        int place = String.valueOf(correctFloor).length(); // position in the current set of numbers (equal to the digit num)

        // Add all which came before the current set, plus all digits up to the current place in this set.
        return seriesNum * DIGITS_PER_NUMBER_OPTIONS + sum(place);
    }

    // Since the options are miniscule, we'll just keep the result for each of them, for O(1)
    static int sum(int num) {
        return switch (num) {
            case 1 -> 1;
            case 2 -> 3;
            case 3 -> 6;
            case 4 -> 10;
            default -> -1;
        };

    }
}
