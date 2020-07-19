import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String letter = scanner.next();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        String ab = letter.substring(a, b + 1);
        System.out.println(ab);
    }
}
