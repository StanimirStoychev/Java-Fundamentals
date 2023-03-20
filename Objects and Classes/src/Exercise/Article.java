package Exercise;

import java.util.Scanner;

public class Article {

    private String title;
    private String content;
    private String author;

    public Article(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public Article setTitle(String title) {
        this.title = title;
        return this;
    }

    public Article setContent(String content) {
        this.content = content;
        return this;
    }

    public Article setAuthor(String author) {
        this.author = author;
        return this;
    }

    @Override
    public String toString() {
        return String.format("%s - %s: %s", title, content, author);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] info = scanner.nextLine().split(", ");
        String title = info[0];
        String content = info[1];
        String author = info[2];

        Article article = new Article(title, content, author);

        int n = Integer.parseInt(scanner.nextLine());

        mainAction(scanner, article, n);

        printArticle(article);
    }

    private static void printArticle(Article article) {
        System.out.println(article);
    }

    private static void mainAction(Scanner scanner, Article article, int n) {
        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split(": ");
            String command = data[0];
            String newData = data[1];

            switch (command) {
                case "Edit":
                    article.setContent(newData);
                    break;
                case "ChangeAuthor":
                    article.setAuthor(newData);
                    break;
                case "Rename":
                    article.setTitle(newData);
                    break;
            }
        }
    }
}
