import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        int[] numbersToCheck = new int[2];
        boolean result = true;

        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }
        for (int i = 0; i < 2; i++) {
            numbersToCheck[i] = scanner.nextInt();
        }

        for (int i = 1; i < size; i++) {
            if (numbers[i - 1] == numbersToCheck[0] && numbers[i] == numbersToCheck[1]
                    || numbers[i - 1] == numbersToCheck[1] && numbers[i] == numbersToCheck[0]) {
                result = false;
                break;
            }
        }
        System.out.println(result);
    }
}