package Exercises;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        passwordValidator(password);
    }

    private static final String RANGE_MESSAGE = "Password must be between 6 and 10 characters";
    private static final String CONSIST_MESSAGE = "Password must consist only of letters and digits";
    private static final String DIGITS_MESSAGE = "Password must have at least 2 digits";
    private static final String VALID_MESSAGE = "Password is valid";

    private static void passwordValidator(String password) {
        int length = password.length();
        boolean isValid = true;

        if (length < 6 || length > 10) {
            System.out.println(RANGE_MESSAGE);
            isValid = false;
        }
        if (!consistOnlyLettersAndDigits(password)) {
            System.out.println(CONSIST_MESSAGE);
            isValid = false;
        }
        if (!haveTwoDigits(password)) {
            System.out.println(DIGITS_MESSAGE);
            isValid = false;
        }
        if (isValid) {
            System.out.println(VALID_MESSAGE);
        }
    }

    private static boolean haveTwoDigits(String password) {
        boolean isTrue = false;
        int count = 0;
        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) >= 48 && password.charAt(i) <= 57) {
                count ++;
            }
            if (count >= 2) {
                isTrue = true;
            }
        }
        return isTrue;
    }

    private static boolean consistOnlyLettersAndDigits(String password) {
        int digitsCount = 0;
        for (int i = 0; i < password.length(); i++) {
            char current = password.charAt(i);

            if (current >= 48 && current <= 57) {
                digitsCount++;
            }
            if (current < 48 || current > 122 || current > 90 && current < 97 || current > 57 && current < 65) {
                return false;
            }
        }
        return true;
    }
}
