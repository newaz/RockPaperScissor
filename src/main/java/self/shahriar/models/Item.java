package self.shahriar.models;

import self.shahriar.rps.Result;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: shahriarnewaz
 * base class of Item
 */
public class Item {

    String name;
    int order;

    /* LOOSES_TO variable is the game logic. Each extended class should define with
       whom he is going to loose. It should add a list of Items with which it will loose.
      */

    Set<Class<? extends Item>> LOOSES_TO = new LinkedHashSet<Class<? extends Item>>();


    public Item(String name, int order) {
        this.name = name;
        this.order = order;
    }

    public String getName() {
        return name;
    }

    public int getOrder() {
        return order;
    }

    /**
     * @param item
     * @return Result (WON,LOST,DRAWN)
     * The current object is compared with the item.
     *
     */

    public Result beats(Item item) {

        if (item==null)return Result.NO_RESULT;
        if (item.getClass().equals(this.getClass())) return Result.DRAWN;
        if (this.LOOSES_TO.contains(item.getClass())) return Result.LOST;
        if(item.LOOSES_TO.contains(this.getClass()))return Result.WON;
        if(item.getOrder()>this.getOrder())return Result.LOST;

        return Result.WON;

    }
}
