package PokerGame;

public class Card {
    private String suit;
    private int value;
    Card(String suit, int value){
        this.suit = suit;
        this.value = value;
    }

    public String display(){
        String CardValue = "";
        switch(value){
            case 1:
                CardValue = "Ace";
                break;
            case 11:
                CardValue = "Jack";
                break;
            case 12:
                CardValue = "Queen";
                break;
            case 13:
                CardValue = "King";
                break;
            default:
                CardValue = String.valueOf(value);
        }
        return (suit + " " + CardValue);
    }


    // public static void main(String[] args) {
    //     Card test = new Card("square",1);
    //     Card test2 = new Card("square",2);
    //     test.display();
    //     System.out.println(test.display());
    //     System.out.println(test2.display());
    // }
}
    