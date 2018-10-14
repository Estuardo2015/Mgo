/*
 Nick Soetaert

 A PropertySet represents the set of cards that forms from stacking
 one or more cards of the same color together.

 Parent: N/A
 Children: NormalPropertySet, NoHousePropertySet

*/

public abstract class PropertySet {
    protected int _currentPropertiesInSet;//replace w/ a data structure of cards
    protected RentPrice _rentPrice;

    PropertySet(RentPrice RentPriceObject){
	_rentPrice = RentPriceObject;
    }

    public void addProperty(){
	_currentPropertiesInSet++;
    }

    public void removeProperty(){
	_currentPropertiesInSet--;
    }

    public int getFullSetSize(){
	return _rentPrice.getPropertyClass;
    }

    public int getRent(){
	return _rentPrice.getRent(_currentPropertiesInSet);
    }

}
