package self.shahriar.models;

/**
 * Created with IntelliJ IDEA.
 * User: shahriarnewaz
 * Date: 9/10/13
 * Time: 10:57 PM
 */


public final class Spock  extends Item{

    public Spock(int order) {
        super ("Spock",order);
        LOOSES_TO.add(Paper.class);
        LOOSES_TO.add(Lizard.class);
    }
}
