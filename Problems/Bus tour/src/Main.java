import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int busHeight = scanner.nextInt();
        int noOfBridges = scanner.nextInt();
        int temp = 0;
        for (int i = 1; i <= noOfBridges; i++) {
            int bridgeHeight = scanner.nextInt();
            if (bridgeHeight <= busHeight) {
                System.out.println("Will crash on bridge " + i);
                break;
            }
            if (bridgeHeight > busHeight) {
                temp++;
                if (temp == noOfBridges) {
                    System.out.println("Will not crash");
                }
            }
        }
    }
}
