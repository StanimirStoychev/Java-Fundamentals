package Exercises;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String correctPassword = "";
        String password = scanner.nextLine();
        char ch;

        for (int i = 0; i < username.length(); i++) {
            ch = username.charAt(i);
            correctPassword = ch + correctPassword;
        }

        boolean isBlocked = false;
        int i = 0;
        while (!password.equals(correctPassword)){
            i += 1;
            if (i >= 4) {
                System.out.printf("User %s blocked!", username);
                isBlocked = true;
                break;
            }
            System.out.println("Incorrect password. Try again.");
            password = scanner.nextLine();
        }
        if (!isBlocked) {
            System.out.printf("User %s logged in.", username);
        }
    }
}
