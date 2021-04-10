import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.print(number + " ");
        while (number != 1) {
            number = number % 2 == 0 ? number / 2 : number * 3 + 1;
            System.out.print(number + " ");
        }
    }
}