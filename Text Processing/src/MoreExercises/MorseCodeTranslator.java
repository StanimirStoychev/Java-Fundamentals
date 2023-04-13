package MoreExercises;

import java.util.Scanner;

public class MorseCodeTranslator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] morseCode = scanner.nextLine().split(" \\| ");
        StringBuilder result = new StringBuilder();

        for (String s : morseCode) {
            String[] word = s.split("\\s+");
            for (String currentCharCode : word) {
                switch (currentCharCode) {
                    case ".-" -> result.append("A");
                    case "-..." -> result.append("B");
                    case "-.-." -> result.append("C");
                    case "-.." -> result.append("D");
                    case "." -> result.append("E");
                    case "..-." -> result.append("F");
                    case "--." -> result.append("G");
                    case "...." -> result.append("H");
                    case ".." -> result.append("I");
                    case ".---" -> result.append("J");
                    case "-.-" -> result.append("K");
                    case ".-.." -> result.append("L");
                    case "--" -> result.append("M");
                    case "-." -> result.append("N");
                    case "---" -> result.append("O");
                    case ".--." -> result.append("P");
                    case "--.-" -> result.append("Q");
                    case ".-." -> result.append("R");
                    case "..." -> result.append("S");
                    case "-" -> result.append("T");
                    case "..-" -> result.append("U");
                    case "...-" -> result.append("V");
                    case ".--" -> result.append("W");
                    case "-..-" -> result.append("X");
                    case "-.--" -> result.append("Y");
                    case "--.." -> result.append("Z");
                }
            }
            result.append(" ");
        }

        System.out.println(result);
    }
}
