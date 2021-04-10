import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        boolean result = true;

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = 1; i < size; i++) {
            if (array[i - 1] > array[i]) {
                result = false;
                break;
            }
        }
        System.out.println(result);
    }
}