/*
 Nick Soetaert

 Deck.java

 Parent: N/A
 Children: N/A
*/

import java.util.*;

public class Deck{

    static Deque<Card> deck = new ArrayDeque<Card>();

    //Initialize the deck of 106 cards
    public Deck(){

        for(int i = 0; i < 2; i++){
	    deck.push(new ForeclosureActionCard());
	    System.out.println(i);
        }

        for(int i = 0; i < 3; i++){
	    deck.push(new DebtCollectorActionCard());
        }
    }

    public Card draw(){
	return deck.pop();
    }

}
