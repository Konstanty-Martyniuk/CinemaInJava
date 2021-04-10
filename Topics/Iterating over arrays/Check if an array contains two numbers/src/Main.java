import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        int[] numbers = new int[2];
        boolean result = false;

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < 2; i++) {
            numbers[i] = scanner.nextInt();
        }

        for (int i = 1; i < size; i++) {
            if (array[i - 1] == numbers[0] && array[i] == numbers[1]
                || array[i - 1] == numbers[1] && array[i] == numbers[0]) {
                result = true;
                break;
            }
        }
        System.out.println(result);
    }
}