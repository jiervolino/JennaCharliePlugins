package shoe;

import charlie.card.Card;
import charlie.plugin.IShoe;
import jenna.plugin.MyShoe02;
import junit.framework.TestCase;

public class MyShoe02Test extends TestCase {
    public void test(){
        IShoe shoe = new MyShoe02();
        shoe.init();
        System.out.println(shoe.size());
        assert shoe.size() == 10;
        Card card1 = shoe.next();
        assert card1.getRank() == 2;
        Card card2 = shoe.next();
        assert card2.getRank() == Card.QUEEN;
    }
}
