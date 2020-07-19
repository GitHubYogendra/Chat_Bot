import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nTimes = scanner.nextInt();
        int grade;
        int A = 0, B = 0, C = 0, D = 0;
        for (int i = 0; i < nTimes; i++) {
            grade = scanner.nextInt();
            if (grade == 5)
                A++;
            if (grade == 4)
                B++;
            if (grade == 3)
                C++;
            if (grade == 2)
                D++;
        }
        System.out.print(D + " " + C + " " + B + " " + A);
    }
}


