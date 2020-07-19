import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String st1 = scanner.nextLine();
        String st2 = scanner.nextLine();
        String nospace1 = st1.replace(" ","");
        String nospace2 = st2.replace(" ","");

        System.out.println(nospace1.equalsIgnoreCase(nospace2));
    }
}