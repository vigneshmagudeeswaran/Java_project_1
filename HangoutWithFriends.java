
import java.util.Scanner;

public class HangoutWithFriends {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hoursPassed = 0;
        boolean personBack = false;

        System.out.println("Someone just went out with friends for a couple of hours.");
        System.out.println("If they're not back in a couple of hours, please check again.");

        while (!personBack) {
            hoursPassed++;
            System.out.println("Hours passed: " + hoursPassed);
            System.out.println("Is the person back? (yes/no)");
            String userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase("yes")) {
                personBack = true;
            } else {
                System.out.println("babe just went to the outside with friends for couple of hours if I am not back in couple of hours please read this note again");
            }

          
        }

        System.out.println("Hooray! The person is back from hanging out with friends!");
    }
}

