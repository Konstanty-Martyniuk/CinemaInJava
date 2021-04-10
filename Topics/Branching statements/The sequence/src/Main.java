import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int count = 0;
        boolean end = false;
        for (int i = 1; i < number + 1 && !end; i++) {
            for (int j = 1; j < i + 1; j++) {
                if (count < number) {
                    System.out.print(i + " ");
                    count++;
                } else {
                    end = true;
                    break;
                }
            }
        }
    }
}