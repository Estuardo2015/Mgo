/*
 Nick Soetaert

 Parent: PropertySet
 Child:  N/A
*/

//Class represents a property set that you can build houses
// or hotels on, such as the blue or green set.
// Railroad or Utils would NOT be of this set.
public class NormalPropertySet extends PropertySet{
    private boolean _hasHouse;
    private boolean _hasHotel;

    NormalPropertySet(RentPrice RentPriceObj){
	rentPrice = RentPriceObj;
	_hasHouse = false;
	_hasHotel = false; //You don't have a structure till you build one
    }

    //this function does not check if a house is being used to build
    // a house; it trusts the gameController to only tell it to build
    // houses under the correct condition
    //returns if attempt at build was successful or not
    public boolean buildHouse(){
	if(_hasHouse == false){
	    _hasHouse = true;
	    return true;
	}
	else return false; //if unable to build a house
    }

    public boolean buildHotel(){
	if((_hasHouse == true) && (_hasHotel == false)){
	    _hasHotel = true;
	    return true;
	}
	else return false; //if unable to build a hotel
    }
    @Override
    public int getRent(){
	int bonus = 0;
	if hasHotel
	    bonus += 4;
	if hasHouse
	    bonus += 3;
	return bonus + _rentPrice.getRent(_currentPropertiesInSet);
    }

    //When you must pay from a full set w/ properties, what happens?
    @Override
    public void removeProperty(){
	_currentPropertiesInSet--;
	if(currentPropertiesInSet < rentPrice.getFullSetSize())

}

