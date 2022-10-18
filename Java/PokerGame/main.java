package PokerGame;

public class main {
    public static void main(String[] args) {
        Deck myDeck = new Deck();
        myDeck.build();
        myDeck.shuffle();
        // myDeck.display();
        Dealer dealer = new Dealer();
        dealer.deal(myDeck);
        dealer.display();
    }

}
