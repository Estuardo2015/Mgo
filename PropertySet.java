/*
 Nick Soetaert

 A PropertySet represents the set of cards that forms from stacking
 one or more cards of the same color together.
*/

public class PropertySet {
    private int _currentPropertiesInSet;//replace w/ a data structure of cards
    private int _fullSetSize;
    private RentPrice _rentPrice;

    //bool canBuildHouses
    //bool houseBuilt
    //bool hotelBuilt


    PropertySet(RentPrice RentPriceObject){
	_fullSetSize = RentPriceObject.getPropertyClass();
	_rentPrice = RentPriceObject;
    }

    public void addProperty(){
	_currentPropertiesInSet++;
    }

    public void removeProperty(){
	_currentPropertiesInSet--;
    }

    public int getRent(){
	return _rentPrice.getRent(_currentPropertiesInSet);
    }

}
