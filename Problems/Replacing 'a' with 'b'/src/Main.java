import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.next();
        String str = s1.replace("a", "b");
        System.out.println(str);
    }
}
