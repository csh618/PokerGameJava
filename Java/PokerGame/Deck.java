package PokerGame;
import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> deck;
    private String suit[] = {"Diamonds", "Clubs", "Hearts","Spades"};
    
    Deck(){
        deck = new ArrayList<Card>();
    }
    public void build(){
        for(int suits = 0; suits < suit.length; suits++){
            for(int value = 1; value < 14; value++){
                deck.add(new Card(suit[suits],value));
            }
        }
    }

    public void shuffle(){
        Collections.shuffle(deck);
    }

    public Card deal(){
        //deal card from the top
        Card card = deck.remove(0);
        return card;
    }

    public void display(){
        for(Card card: deck){
            System.out.println(card.display());
        }
    }


}
