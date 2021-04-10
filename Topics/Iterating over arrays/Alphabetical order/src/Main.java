import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String[] array = text.split(" ");
        boolean result = false;

        for (int i = 1; i < array.length; i++) {
            if (array[i - 1].compareTo(array[i]) <= 0) {
                result = true;
            } else {
                result = false;
            }
        }
        System.out.println(result);
    }
}