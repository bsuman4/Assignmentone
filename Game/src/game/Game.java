/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

/**
 *
 * @author suman
 */
import java.util.Scanner;

public class Game {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // rock beats scissors
        //scissors beats paper
        //paper beats rock
        Scanner console = new Scanner(System.in);
        String choice = console.nextLine();
        if (isValid(choice)) {
            int aiChoice = (int) (Math.random() * 3);
            int personChoice = getValue(choice);
            System.out.println("You picked " + choice);
            System.out.println("The computer picked " + getAIChoice(aiChoice));
            System.out.println("You " + didPersonWin(personChoice, aiChoice));
            //0=rock
            //1=paper
            //2=scissors
        } else {
            System.out.println("This is not a valid input!");
        }

    }

    public static String getAIChoice(int x) {
        if (x == 0) {
            return "Rock";
        }
        if (x == 1) {
            return "Paper";
        }
        if (x == 2) {
            return "Scissors";
        }
        return "IDK";
    }

    public static String didPersonWin(int pChoice, int computerChocie) {
        if (pChoice == 0) {
            if (computerChocie != 1) {
                if (computerChocie != 0) {
                    return "WIN";
                }
                return "Tie";
            }
            return "loose";
        }
        if (pChoice == 1) {
            if (computerChocie != 0) {
                if (computerChocie != 1) {
                    return "WIN";
                }
                return "Tie";
            }
            return "loose";
        }
        if (pChoice == 2) {
            if (computerChocie != 0) {
                if (computerChocie != 2) {
                    return "WIN";
                }
                return "Tie";
            }
            return "loose";
        }
        return "IDK";
    }

    public static boolean isValid(String string) {
        if (string.equalsIgnoreCase("rock")) {
            return true;
        }
        if (string.equalsIgnoreCase("paper")) {
            return true;
        }
        return string.equalsIgnoreCase("scissors");
    }

    public static int getValue(String string) {
        if (string.equalsIgnoreCase("rock")) {
            return 0;
        }
        if (string.equalsIgnoreCase("paper")) {
            return 1;
        } else {
            return 2;
        }
    }
}
