package Exercise;

import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {

        Map<String, List<String>> companies = new LinkedHashMap<>();

        fillTheMapWithCompaniesAndUserIds(companies);

        printOutput(companies);
    }

    private static void printOutput(Map<String, List<String>> companies) {
        for (var company : companies.entrySet()) {
            System.out.println(company.getKey());
            company.getValue().forEach(c -> System.out.printf("-- %s%n", c));
        }
    }

    private static void fillTheMapWithCompaniesAndUserIds(Map<String, List<String>> companies) {
        Scanner scanner = new Scanner(System.in);

        String input;

        while (!"End".equals(input = scanner.nextLine())) {
            String[] inputInfo = input.split(" -> ");
            String company = inputInfo[0];
            String userId = inputInfo[1];

            companies.putIfAbsent(company, new ArrayList<>());
            if (!companies.get(company).contains(userId)) {
                companies.get(company).add(userId);
            }
        }
    }
}
