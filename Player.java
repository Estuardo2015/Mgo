/*
 Nick Soetaert

 Player.java

 Parent: N/A
 Children: N/A
*/

import java.util.*;

public class Player{

    String name;
    ArrayList<Card> hand = new ArrayList<Card>();
    ArrayList<PropertySet> properties = new ArrayList<PropertySet>();
    int bank;
    int movesLeft;

    public Player(String name){
	name = name;
	
	/*
	for(int i = 0; i < 5; i++){
	    hand.drawCard();
	}*/
    }

	//Helper function while game is text-based
    public void displayCards(){
	System.out.println("YOUR HAND:");
	for(Card c : hand){
	    System.out.println(c.getName());
	}
	System.out.println("YOUR PROPERTIES:");
	for(Card c : properties){
	    System.out.println(c.getName());
	}

    public void startTurn(){
	movesLeft = 3;
    }

    public void useMove(){
	//Text output should be replaced by graphical buttons in final game
    }

}
