import java.util.Scanner;

//Guess the number game:
class Game {
    int ramdomNumber;
    int userInput;
    int noOfGuesses;

    public Game() {
        while (ramdomNumber == 0) {
            ramdomNumber = (int) (Math.random() * 100);
        }
    }

    public int getRamdomNumber() {
        return ramdomNumber;
    }

    void setUserInput(int Input) {
        userInput = Input;
    }

    int getUserInput() {
        return userInput;
    }

    void setNoOfGuesses() {
        noOfGuesses++;
    }

    int getNoOfGuesses() {
        return noOfGuesses;
    }
}

public class T43_Exercise3 {


    public static void main(String[] args) {
        Game GuessTheNumber = new Game();
        Scanner userInput = new Scanner(System.in);

        while (true) {

            System.out.println("Guess a number from 0 to 100 :");
            GuessTheNumber.setUserInput(userInput.nextInt()) ;

            if (GuessTheNumber.getUserInput() > GuessTheNumber.getRamdomNumber()) {
                System.out.println("Guessed Number Is Big !");
                GuessTheNumber.setNoOfGuesses();
            } else if (GuessTheNumber.getUserInput() < GuessTheNumber.getRamdomNumber()) {
                System.out.println("Guessed Number Is Small !");
                GuessTheNumber.setNoOfGuesses();
            } else {
                GuessTheNumber.setNoOfGuesses();
                break;
            }
            System.out.printf("\n");
        }
        System.out.println("Guessed Number Is Correct !!!");
        System.out.println("Lesser the score, better the Game Play !");
        System.out.println("Score : " + GuessTheNumber.getNoOfGuesses());
    }
}

