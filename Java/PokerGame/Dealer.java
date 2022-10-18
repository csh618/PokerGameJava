package PokerGame;

import java.util.ArrayList;

public class Dealer {
    private ArrayList <Card> hand;
    Dealer(){
        hand = new ArrayList<Card>();
    }

    public void deal(Deck deck){
        Card card1 = deck.deal();
        Card card2 = deck.deal();

        hand.add(card1);
        hand.add(card2);
    }

    public void display(){
        for(Card card: hand){
            System.out.println(card.display());
        }
    }
}
