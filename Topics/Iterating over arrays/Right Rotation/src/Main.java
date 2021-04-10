import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int[] numbers = Arrays.stream(input.split(" ")).mapToInt(Integer::parseInt).toArray();
        int numberOfRotations = scanner.nextInt();
        int lastPos = numbers.length - 1;
        int lastElem;
        if (numberOfRotations > numbers.length) {
            numberOfRotations = numberOfRotations % numbers.length;
        }

        for (int i = 0; i < numberOfRotations; i++) {
            lastElem = numbers[lastPos];
            System.arraycopy(numbers, 0, numbers, 1, lastPos);
            numbers[0] = lastElem;
        }

        for (int number: numbers) {
            System.out.print(number + " ");
        }
    }
}