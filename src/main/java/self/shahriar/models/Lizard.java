package self.shahriar.models;

/**
 * Created with IntelliJ IDEA.
 * User: shahriarnewaz
 */
public final  class Lizard extends Item {

    public Lizard(int order) {
        super("Lizard", order);
        LOOSES_TO.add(Rock.class);
        LOOSES_TO.add(Scissor.class);
    }

}
