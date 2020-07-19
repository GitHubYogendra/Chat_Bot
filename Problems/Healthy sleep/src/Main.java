import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int h = scanner.nextInt();
        int sleep = h;
        if (sleep <  a) {
            System.out.println("Deficiency");
        } else if (sleep > b) {
            System.out.println("Excess");
        } else if (sleep == h) {
            System.out.println("Normal");
        }
    }
}
