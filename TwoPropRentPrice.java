/*
 Nick Soetaert

 Class for storing rent prices of property types that require
 two for a complete set (blue, brown, util)

Parent: RentPrice
Child:  N/A
*/

public class TwoPropRentPrice extends RentPrice { 
    private int _onePropRent;
    private int _twoPropRent;

    //Args: Rent prices at each property enumeration
    public TwoPropRentPrice(int onePropRent, int twoPropRent){
	_propertyClass = 2;
        _onePropRent = onePropRent;
        _twoPropRent = twoPropRent; //if more cards exist, rent is same
    }

    public int getRent(int numProp){
	if (numProp <= 0) return _noPropRent;
	else if (numProp == 1) return _onePropRent;
	else return _twoPropRent; //If >2 props, rent does not increase
    }
}




