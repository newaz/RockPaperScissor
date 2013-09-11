package self.shahriar.rps;

import self.shahriar.models.Item;

import java.util.Iterator;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: shahriarnewaz
 */
public class Util {


    public static String wrongInputTypeGameItem() {
        StringBuilder builder = new StringBuilder();
        builder.append("You can pick only the numbers which are given in the menu \n ");
        return builder.toString();
    }


    public static void initialPromt() {

        StringBuilder builder = new StringBuilder().append("Welcome to the Rock, Paper" +
                " , Scissors game.\n")
                .append("Pick  -1  to quit from the game \n")
                .append("Pick  0 or 1 for a specific version \n")
                .append("QUIT: (-1) \n")
                .append("Classic version: (0) \n")
                .append("The Big Bang theory version :): (1) ")
                .append("\n-------------------------------------------\n");


        System.out.println(builder.toString());

    }


    public static boolean playAgainPromt(Scanner scanner) {

        while (true) {
            System.out.print("Wanna to play again ? (Y/N) ");

            String userInput = scanner.nextLine();
            userInput = userInput.toUpperCase();
            if (userInput.charAt(0) == 'Y' || userInput.charAt(0) == 'N')
                return userInput.charAt(0) == 'Y';
        }

    }


    public static void initialPromtVersion(BasicGame gameVersion) {

        System.out.println("Pick an item or go back to previous menu. put the number" +
                " enclosed in braces for an action (#)");
        System.out.println("(-1) Go Back ");

        Iterator iterator = gameVersion.getItems().iterator();
        int index = 1;
        while (iterator.hasNext()) {
            System.out.println("(" + index + ") " + ((Item) iterator.next()).getName());
            index++;
        }

    }


}
