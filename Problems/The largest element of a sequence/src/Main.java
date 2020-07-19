import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int num;
        int max;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        max = num;
        while (num != 0) {
            num = sc.nextInt();
            if (num > max) {
                max = num;
            }
        }
        System.out.println(max);

    }
}