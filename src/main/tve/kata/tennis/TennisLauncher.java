package src.main.tve.kata.tennis;

import src.main.tve.kata.tennis.core.Match;

import java.util.Scanner;

/**
 * This is the main class to launch a tennis match
 *
 * @author Thibaut VESCOVI
 */
public class TennisLauncher {

    public static void main(String[] args) {
        String playerOneName = "Joueur 1";
        String playerTwoName = "Joueur 2";

        System.out.println("Press enter to start the game...");
        new Scanner(System.in).nextLine();
        Match match = new Match(playerOneName, playerTwoName);
        match.run();
    }
}
