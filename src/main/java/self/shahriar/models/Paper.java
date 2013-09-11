package self.shahriar.models;

/**
 * Created with IntelliJ IDEA.
 * User: shahriarnewaz
 * Date: 9/10/13
 * Time: 10:57 PM
 * To change this template use File | Settings | File Templates.
 */
public  final class Paper extends Item {


    public Paper(int order) {
        super( "Paper",order);
        LOOSES_TO.add(Scissor.class);
    }
}
