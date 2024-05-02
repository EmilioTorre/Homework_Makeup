package Chapter5; /**
 * 5.0
 * Emilio Torres
 * 3/26/2024
 * version 1.0
 * ITEC 2140 sec. 3 Spring 2024
 * Get Game Scores
 *
 * Create a class that allows users to enter
 * their name and their high score for the
 * game. You should enter the name in a method
 * which returns a String. You should pass the
 * \name to a method to allow the user to enter
 * a String. Print the name and score from a
 * method printScore. Allow the user to
 * continue to enter users and scores until
 * they do not enter a name.
 */

import java.util.Scanner;
public class GetGameScores {
    public void main(String[] args) {
        NameScore input = new NameScore();
    }
    public class NameScore{
        //will take the username and high score.
        String name;
        int highScore;
        Scanner E = new Scanner(System.in);
        public NameScore(){
            System.out.println("Please enter the name of your game.");
            highScore = 0;
            name = E.nextLine();
            System.out.println(printScore(name));
        }
        public String printScore(String answer){
            System.out.println("Please enter the score for " + name);
            highScore = E.nextInt();
            String result = name + " " + highScore;
            return result;
        }
    }
}
