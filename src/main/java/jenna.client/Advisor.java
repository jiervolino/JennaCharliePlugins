package jenna.client;


import charlie.card.Hand;
import charlie.card.Card;
import charlie.plugin.IAdvisor;
import charlie.util.Play;

public class Advisor implements IAdvisor {
    BasicStrategy bs = new BasicStrategy();

    public Play advise(Hand hand, Card upCard){
        return bs.getPlay(hand,upCard);

    }
}