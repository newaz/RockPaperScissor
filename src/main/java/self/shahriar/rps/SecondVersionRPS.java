package self.shahriar.rps;

import self.shahriar.models.*;

/**
 * Created with IntelliJ IDEA.
 * User: shahriarnewaz
 * The extended version of the  Rock, Paper & Scissor Game
 * with Spock and Lizard ase the addition
 */


public class SecondVersionRPS extends FirstVersionRPS {


    public SecondVersionRPS() {
        addItem(new Lizard(4));
        addItem(new Spock(5));

    }

}
