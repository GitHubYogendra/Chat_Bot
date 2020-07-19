import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int num = 0;
        while ((num = scanner.nextInt()) != 0) { // nextInt() is called only once and value is cashed in num
            sum += num; // add this num to sum
        }
        System.out.println(sum);
    }
}

