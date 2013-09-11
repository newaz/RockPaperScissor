package self.shahriar.rps;

import self.shahriar.models.*;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: shahriarnewaz
 * Class to play the two versioned Rock, Paper Scissor game.
 */


public final class RPSGame {

    private Scanner scanner;
    private static GameVersion version;
    private Item computerPicked;
    private Item youPicked;
    private int selectedIndex;
    private String currentLine;


    public RPSGame() {
        scanner = new Scanner(System.in);
    }


    public void startGame() {

        // initialize the two versions of the Game
        BasicGame rpsClassic = GameVersionFactory.createGameVersion(GameVersion.CLASSIC);
        BasicGame rpsBigBang = GameVersionFactory.createGameVersion(GameVersion.BIG_BANG);


        while (true) {
            Util.initialPromt();

            // reads the input form the user
            currentLine = scanner.nextLine();

            try {
                // validates if its an integer and stores it.
                selectedIndex = Integer.parseInt(currentLine);


                // exit condition
                if (selectedIndex == -1) {
                    System.out.println("Bye !!!! ");
                    if (scanner != null)
                        scanner.close();
                    return;
                }

                // either select CLASSIC VERSION = 0 or BIG BANG VERSION =1
                if (selectedIndex == 0 || selectedIndex == 1) {

                    version = GameVersion.values()[selectedIndex];
                    System.out.println("You have selected to play the :" + version + " version.");

                    switch (version) {
                        case CLASSIC:
                            loadGame(rpsClassic);
                            break;

                        case BIG_BANG:
                            loadGame(rpsBigBang);
                            break;
                    }

                } else {
                    System.out.println(" Nice Testing ! Now please put 0 or 1 to play :) \n ");

                }

            } catch (NumberFormatException ex) {
                System.out.println(Util.wrongInputTypeGameItem());
            }


        }


    }


    /**
     * @param rps Instance of BasicGame
     *            Loads the game
     */

    private void loadGame(BasicGame rps) {

        Util.initialPromtVersion(rps);

        // get all the available items for this verison of game
        Set<Item> itemSet = rps.getItems();

        while (true) {
            currentLine = scanner.nextLine();

            try {
                //your current picked item. Populates on valid index selection
                youPicked = null;

                // select an item from the menu
                selectedIndex = Integer.parseInt(currentLine);

                // computer picks a random item
                computerPicked = rps.getRandomOpponent();


                // denies any invalid range of item displayed in the menu
                if (selectedIndex < 1 || selectedIndex > rps.getItems().size()) {
                    youPicked = null;
                    if (selectedIndex == -1) {
                        return;   //return to main menu
                    } else
                        System.out.println(Util.wrongInputTypeGameItem());


                } else {

                    // look for an item in the game
                    // TODO needs further rafactoring ??

                    int iteratorIndex = 1;
                    Iterator iterator = itemSet.iterator();
                    while (iterator.hasNext()) {

                        if (iteratorIndex == selectedIndex)
                            youPicked = (Item) iterator.next();
                        else
                            iterator.next();

                        iteratorIndex++;
                    }
                }


                if (youPicked != null) {

                    play(rps, youPicked, computerPicked);

                    if (Util.playAgainPromt(scanner)) {
                        Util.initialPromtVersion(rps);
                    } else {
                        Util.initialPromt();
                        scanner.reset();
                        return;
                    }
                }

            } catch (NumberFormatException ex) {
                System.out.println(Util.wrongInputTypeGameItem());
            }
        }


    }


    /**
     * @param version        The game version (Classic or Extended)
     * @param youPicked      (item  picked by user)
     * @param computerPicked (item picked by the computer)
     *                       This class decides if you win, tie or loose
     */

    private void play(BasicGame version, Item youPicked, Item computerPicked) {

        System.out.println("you have picked:   " + youPicked.getName());
        if (!version.isValidItem(youPicked)) {
            System.out.println("Not a valid item for this version of the game from you");
            return;
        }


        System.out.println("computer has picked:   " + computerPicked.getName() + "\n");
        if (!version.isValidItem(computerPicked)) {
            System.out.println("Not a valid item for this version of the game form computer");
            return;
        }

        System.out.println("\nResult: You have -----> " + youPicked.beats(computerPicked) + "\n");


    }


}
