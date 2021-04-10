import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfCompanies = scanner.nextInt();
        int[] income = new int[numberOfCompanies];
        int[] taxes = new int[numberOfCompanies];
        int biggestTaxes = 0;
        int largestTaxpayer = 0;

        for (int i = 0; i < numberOfCompanies; i++) {
            income[i] = scanner.nextInt();
        }

        for (int i = 0; i < numberOfCompanies; i++) {
            taxes[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < numberOfCompanies; i++) {
            int tax = income[i] * taxes[i];
            if (tax > biggestTaxes) {
                largestTaxpayer = i;
                biggestTaxes = tax;
            }
        }
        System.out.println(largestTaxpayer + 1);
    }
}