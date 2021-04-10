import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int previousNumber = scanner.nextInt();
        boolean isAscending = true;
        boolean isDescending = true;
        while (isAscending || isDescending) {
            int number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            if (previousNumber > number) {
                isAscending = false;
            } else if (previousNumber < number) {
                isDescending = false;
            }
            previousNumber = number;
        }
        System.out.println(isAscending || isDescending);
    }
}