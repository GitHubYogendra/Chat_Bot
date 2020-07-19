import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i;
        int ase = 0;
        int dsc = 0;
        while ((i = scanner.nextInt()) != 0) {
            if (i > n) {
                ase++;
            }
            if (i < n) {
                dsc++;
            }
            n = i;
        }
        System.out.println(ase == 0 || dsc == 0);
    }
}




