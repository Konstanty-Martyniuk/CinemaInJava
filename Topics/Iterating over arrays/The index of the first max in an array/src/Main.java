import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        int biggestValue = 0;
        int position = 0;

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
            if (array[i] > biggestValue) {
                position = i;
                biggestValue = array[i];
            }
        }
        System.out.println(position);
    }
}