import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];


        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int minValue = array[0];
        for (int i = 1; i < size; i++) {
            if (minValue > array[i]) {
                minValue = array[i];
            }
        }
        System.out.println(minValue);
    }
}