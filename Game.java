/*
 Nick Soetaert

 Game.java

 Parent: N/A
 Children: N/A

 This class represents a game.
*/

import java.util.*;


//will become main
public class Game {

    Player[] players;
    private int _turn;

    public Game(int numPlayers){
	Deck deck = new Deck();

	players = new Player[numPlayers];
	for(int i = 0; i < numPlayers; i++){
	    players[i] = new Player();
	}
	_turn = 0;
    }
}
