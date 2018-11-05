/*
 Nick Soetaert

 Player.java

 Parent: N/A
 Children: N/A
*/

import java.util.*;

public class Player{

    ArrayList<Card> hand = new ArrayList<Card>();
    ArrayList<PropertySet> properties = new ArrayList<PropertySet>();
    int bank;
    private int _movesLeft;

    public Player(Deck deck){
	for(int i = 0; i < 5; i++){
	    deck.drawCard();
	}
    }

	//Helper function while game is text-based
    void displayCards(){
	System.out.println("YOUR HAND:");
	int i = 0;
	for(Card c : hand){
	    i++;
	    System.out.println(i + ") " + c.getName());
	}
	System.out.println("YOUR PROPERTIES:");
	for(PropertySet p : properties){
	    p.displayCards();
	}
    }

    void startTurn(){
	_movesLeft = 3;
    }

	//get rid of while loop? (what if you win mid turn?)
    void useMove(){
	Scanner s = new Scanner(System.in);

	while(_movesLeft > 0){
	    System.out.println(" ");
	    System.out.println("Would you like to...");
	    System.out.println("a) Play a card from your hand");
	    System.out.println("b) Move a card already played on the table");
	    System.out.println("c) End your turn");
	
	    String input = s.nextLine();

	    switch(input){
	    case "a":
	        playCard();
	        break;
	    case "b":
	        endTurn();
	        break;
	    case "c":
	        moveCard();
	        break;
	    default:
	        System.out.println("Please only enter lower case letters a, b, or c.");
	    }
	}
	while(hand.size() > 7){
	    System.out.println("You have " + hand.size() 
				+ " cards left at the end of your turn.");
	    System.out.println("Select a card from your hand by index to discard:");
	    displayCards();
	    int input = s.nextInt();
	}
    }

    void playCard(){
	_movesLeft--;
    }

    void moveCard(){
	_movesLeft--;
    }

    void endTurn(){
	_movesLeft = 0;
    }

    void discard(int cardIndex){
	hand.remove(cardIndex);
    };




}

