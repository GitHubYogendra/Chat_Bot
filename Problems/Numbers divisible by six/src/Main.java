import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int count = 0;
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            num = scanner.nextInt();
            if (num % 6 == 0) {
            count += num;
            }
        }
        System.out.println(count);
    }
}
