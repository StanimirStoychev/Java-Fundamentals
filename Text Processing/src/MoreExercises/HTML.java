package MoreExercises;

import java.util.Scanner;

public class HTML {

    private static final String H1_TAG = "h1";
    private static final String ARTICLE_TAG = "article";
    private static final String DIV_TAG = "div";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String title = scanner.nextLine();
        printHTMLFormat(title, H1_TAG);

        String content = scanner.nextLine();
        printHTMLFormat(content, ARTICLE_TAG);

        printCommentsInHTMLFormat(scanner);
        scanner.close();
    }

    private static void printCommentsInHTMLFormat(Scanner scanner) {
        String comment;

        while (!"end of comments".equals(comment = scanner.nextLine())) {
            printHTMLFormat(comment, DIV_TAG);
        }
    }

    private static void printHTMLFormat(String title, String tag) {
        System.out.printf("<%s>%n" +
                "%s%n" +
                "</%s>%n", tag, title, tag);
    }
}
