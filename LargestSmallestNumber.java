import java.util.Scanner;

public class LargestSmallestNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        while (true) {
            System.out.print("Enter a number (or type 'stop' to finish): ");
            if (input.hasNextInt()) {
                int number = input.nextInt();
                largest = Math.max(largest, number);
                smallest = Math.min(smallest, number);
            } else {
                String stop = input.next();
                if (stop.equalsIgnoreCase("stop")) {
                    break;
                } else {
                    System.out.println("Invalid input. Please try again.");
                }
            }
        }

        System.out.println("The largest number entered was: " + largest);
        System.out.println("The smallest number entered was: " + smallest);

        input.close();

    }

}
