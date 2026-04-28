package jenna.plugin;

import charlie.card.Card;
import charlie.shoe.Shoe;

public class ShoeBug01 extends Shoe{
    @Override
    public void init() {
        cards.clear();
        cards.add(new Card(Card.ACE, Card.Suit.SPADES));
        cards.add(new Card(Card.QUEEN, Card.Suit.HEARTS));
        cards.add(new Card(Card.ACE, Card.Suit.HEARTS));
        cards.add(new Card(Card.KING, Card.Suit.SPADES));

        //player will split because they have two aces
        cards.add(new Card(Card.JACK, Card.Suit.CLUBS));
        cards.add(new Card(Card.JACK, Card.Suit.DIAMONDS));
    }
}
