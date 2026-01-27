import java.util.Scanner;

class Factorial2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n > 0) {
            int factorial = 1;

            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }

            System.out.println(factorial);
        } else {
            System.out.println("The number " + n + " is not a positive integer");
        }
    }
}
