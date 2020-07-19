import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        int temp;
        while (n > 0) {
            temp = n % 10;
            n = n / 10;
            sum = sum + temp;
        }
        System.out.println(sum);
    }
}