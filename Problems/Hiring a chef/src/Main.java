import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        scanner.next();
        scanner.next();
        scanner.next();
        String cui = scanner.next();
        System.out.print("The form for " + name + " is completed. ");
        System.out.print("We will contact you if we need a chef that cooks " + cui + " dishes.");
    }
}
