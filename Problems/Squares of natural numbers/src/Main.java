import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int uptoNum = sc.nextInt();
        int num = 1, increment = 0;
        while (num <= uptoNum) {
            increment++;
            num = increment * increment;
            if (num <= uptoNum) {
                System.out.println(num);
            }
        }
    }
}
