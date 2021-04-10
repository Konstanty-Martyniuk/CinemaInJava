import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int busHeight = scanner.nextInt();
        int bridges = scanner.nextInt();
        int counter = 0;
        int bridgeNr = 0;

        for (int i = 0; i < bridges; i++) {
            if (scanner.nextInt() <= busHeight) {
                counter++;
                bridgeNr = ++i;
                break;
            }
        }
        System.out.println(counter < 1 ? "Will not crash" : "Will crash on bridge " + bridgeNr);
    }
}