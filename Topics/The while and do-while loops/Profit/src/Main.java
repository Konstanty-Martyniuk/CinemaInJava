import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money = scanner.nextDouble();
        double percent = scanner.nextDouble();
        int desiredAmount = scanner.nextInt();
        int years = 0;
        while (money < desiredAmount) {
            money = money + money * (percent / 100);
            years++;
        }
        System.out.println(years);
    }
}