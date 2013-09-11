package self.shahriar.models;

/**
 * Created with IntelliJ IDEA.
 * User: shahriarnewaz
 * Date: 9/10/13
 * Time: 10:57 PM
 */


public final  class Scissor extends Item {


    public Scissor(int order) {
        super ("Scissor",order);
        LOOSES_TO.add(Rock.class);
    }


}
