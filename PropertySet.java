/*
 Nick Soetaert

 A PropertySet represents the set of cards that forms from stacking
 one or more cards of the same color together.

 Parent: N/A
 Children: N/A

*/
import java.util.ArrayList;
import java.util.List;

public class PropertySet {

    private boolean _canBuild;
    private int _setSize;

//	Represents all cards in a given stack, including properties, wild, and structures.
    public ArrayList<Card> cardSet = new ArrayList<>();

//	Represents the possible rent prices that can apply to those cards.
    protected RentPrice _rentPrice;


//	Pre:	A propertyCard is being passed
//	Post:	A PropertySet is initialized
    PropertySet(PropertyCard card){
	_rentPrice = new RentPrice(card.getCurrColor());
    }

	//Helper function to display cards while game is text based
    public void displayCards(){
	System.out.println("~~~~~~Property Set~~~~~~");
	for(Card i : cardSet){
	    System.out.println(i.getName());
	}
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
    }

//	Pre: A PropertySet has been initialized, and a Card is passed
//	Post: A card has been added to PropertySet
    public void addCard(Card newCard){
	cardSet.add(newCard);
    }

    public void removeCard(Card oldCard){
	cardSet.remove(oldCard);
    }

    public int getCurrentSize(){
	return cardSet.size();
    }

    public int getFullSetSize(){
	return _setSize;
    }

    public int getRent(){
	return _rentPrice.getRent(cardSet.size());
    }

}
