import java.util.Scanner;

class MultiplesBelow1002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        if (number > 0 && number < 100) {
            int counter = number - 1;

            while (counter > 1) {
                if (number % counter == 0) {
                    System.out.println(counter);
                }
                counter--;
            }
        } else {
            System.out.println("The number " + number + " is not a valid input");
        }
    }
}
