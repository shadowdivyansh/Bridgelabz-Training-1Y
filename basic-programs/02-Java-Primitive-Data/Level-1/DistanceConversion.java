import java.util.Scanner;

public class DistanceConversion {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double distanceInFeet = input.nextDouble();

        double distanceInYards = distanceInFeet / 3;
        double distanceInMiles = distanceInYards / 1760;

        System.out.println(
                "The distance in feet is " + distanceInFeet +
                ", in yards is " + distanceInYards +
                ", and in miles is " + distanceInMiles
        );
    }
}
