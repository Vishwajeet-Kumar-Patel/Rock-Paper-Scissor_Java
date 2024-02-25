import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Let's play Rock-Paper-Scissors!");
        System.out.println("Enter your choice (Rock, Paper, or Scissors): ");
        String userChoice = scanner.nextLine().toLowerCase();

        if (!userChoice.equals("rock") && !userChoice.equals("paper") && !userChoice.equals("scissors")) {
            System.out.println("Invalid choice. Please choose Rock, Paper, or Scissors.");
            return;
        }

        int computerChoice = random.nextInt(3); // 0 for rock, 1 for paper, 2 for scissors
        String[] choices = {"rock", "paper", "scissors"};
        String computerChoiceString = choices[computerChoice];

        System.out.println("Computer chose: " + computerChoiceString);

        if (userChoice.equals(computerChoiceString)) {
            System.out.println("It's a tie!");
        } else if ((userChoice.equals("rock") && computerChoiceString.equals("scissors")) ||
                (userChoice.equals("paper") && computerChoiceString.equals("rock")) ||
                (userChoice.equals("scissors") && computerChoiceString.equals("paper"))) {
            System.out.println("You win!");
        } else {
            System.out.println("You lose!");
        }
    }
}
