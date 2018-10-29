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
	_rentPrice = RentPrice(card.getCurrColor());
    }


//	Function: Add a card to the given PropertySet object (PropertyCard or Structure)
//	Pre: A PropertySet has been initialized, and a Card is passed
//	Post: A card has been added to PropertySet
    public void addCard(Card newCard){
	cardSet.add(newCard);
    }

//	Removes a Card from PropertySet
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
	return _rentPrice.getRent(_currentPropertiesInSet);
    }

}
