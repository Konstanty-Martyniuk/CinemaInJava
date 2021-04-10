import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();
        long factorial = 1;
        int i = 1;
        while (factorial <= number) {
            factorial = factorial * i;
            i++;
        }
        System.out.println(i - 1);
    }
}