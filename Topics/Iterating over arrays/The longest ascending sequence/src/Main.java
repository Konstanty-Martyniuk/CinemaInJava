import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        int longestSequence = 0;
        int temp = 1;

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = 1; i < size; i++) {
            if (array[i - 1] < array[i]) {
                temp++;
            } else {
                if (temp > longestSequence) {
                    longestSequence = temp;
                    temp = 1;
                }
            }
        }
        if (temp > longestSequence) {
            longestSequence = temp;
        }

        System.out.println(longestSequence);
    }
}