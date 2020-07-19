//import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;
import java.lang.Math;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        double slope = (double)Math.abs(y2 - y1) / Math.abs(x2 - x1);
        String output;
        output = slope == 1 || slope == 0 ? "YES" : "NO";
        System.out.println(output);
    }
}
