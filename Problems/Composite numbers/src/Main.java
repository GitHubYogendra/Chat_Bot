import java.util.Scanner;

public class Main {
    public static boolean isComposite(long number) {
        if (number <= 3) {
            return false;
        }
        if (number % 2 == 0 || number % 3 == 0) {
            return true;
        }
        for (int i = 5; i * i <= number; i = i + 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return true;
            }
        }
        return false;
    }
        /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final long number = scanner.nextLong();
        System.out.println(isComposite(number));
    }
}
