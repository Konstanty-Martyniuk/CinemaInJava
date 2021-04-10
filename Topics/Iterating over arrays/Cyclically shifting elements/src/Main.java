import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        int numberOfRotations = 1;
        int lastPos = size - 1;
        int lastElem;

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < numberOfRotations; i++) {
            lastElem = array[lastPos];
            System.arraycopy(array, 0, array, 1, lastPos);
            array[0] = lastElem;
        }
        for (int number: array) {
            System.out.print(number + " ");
        }
    }
}