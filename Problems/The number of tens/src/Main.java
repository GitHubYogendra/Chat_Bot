import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n >= 0 && n <= 1_000_000) {
            System.out.println((n % 100) / 10);
        }
    }
}
