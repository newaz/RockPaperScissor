package self.shahriar.models;

/**
 * Created with IntelliJ IDEA.
 * User: shahriarnewaz
 * Date: 9/10/13
 * Time: 10:57 PM
 */

public  final class Rock extends Item {

    public Rock(int order) {
        super("Rock",order);
        LOOSES_TO.add(Paper.class);
    }



}
