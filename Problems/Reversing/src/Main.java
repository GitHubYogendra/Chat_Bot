import java.util.Scanner;

public class Main{

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();
            int rev = 0;

            while(num != 0) {
                int digit = num % 10;
                rev = rev * 10 + digit;
                num /= 10;
            }

            System.out.println(rev);
        }
    }
