package self.shahriar.rps;

import self.shahriar.models.Item;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: shahriarnewaz
 */
public  class BasicGame {

    private  Set<Item> items = new LinkedHashSet<Item>();

    boolean addItem(Item aGesture)
    {
        return items.add(aGesture);
    }



    Set<Item> getItems()
    {
        return items;
    }




    /**
     *
     * @param i input item to validate
     * @return  true if the item is valid fort that version fo the game
     */
     boolean isValidItem(Item i)
    {
        if(i==null) return false;

        for(Item item : items) {
          if (item.getClass() == i.getClass())
                return true;
        }
        return false;
    }


    /**
     *
     * @return  a random item for computer player
     */
    Item getRandomOpponent(){
        int itemToPick = new Random().nextInt(items.size());
         return (Item)items.toArray()[itemToPick];
    }
}
