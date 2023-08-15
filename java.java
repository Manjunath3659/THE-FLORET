import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println("Welcome to Rock, Paper, Scissors!");
        System.out.print("Enter your choice (rock, paper, scissors): ");
        String userChoice = scanner.nextLine().toLowerCase();
        
        int computerChoiceNumber = random.nextInt(3); // Generates 0, 1, or 2
        String computerChoice = "";
        
        switch (computerChoiceNumber) {
            case 0:
                computerChoice = "rock";
                break;
            case 1:
                computerChoice = "paper";
                break;
            case 2:
                computerChoice = "scissors";
                break;
        }
        
        System.out.println("Computer chose: " + computerChoice);
        
        String result = "";
        
        if (userChoice.equals(computerChoice)) {
            result = "It's a tie!";
        } else if (
            (userChoice.equals("rock") && computerChoice.equals("scissors")) ||
            (userChoice.equals("paper") && computerChoice.equals("rock")) ||
            (userChoice.equals("scissors") && computerChoice.equals("paper"))
        ) {
            result = "You win!";
        } else {
            result = "Computer wins!";
        }
        
        System.out.println(result);
    }
}
