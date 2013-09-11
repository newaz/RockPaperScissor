package self.shahriar.rps;

import self.shahriar.models.Paper;
import self.shahriar.models.Rock;
import self.shahriar.models.Scissor;

/**
 * Created with IntelliJ IDEA.
 * User: shahriarnewaz
 * The classic Rock, Paper & Scissor Game
 */


public class FirstVersionRPS extends BasicGame {


    public FirstVersionRPS() {
        addItem(new Rock(1));
        addItem(new Paper(2));
        addItem(new Scissor(3));
    }



}
