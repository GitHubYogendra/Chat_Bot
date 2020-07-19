import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int num = sc.nextInt();
            if (num == 0) {
                break;
            }
            if (num != 0) {
                String temp = (num % 2 == 0) ? "even" : "odd";
                System.out.println(temp);
            }
        }
    }
}

