/*
 Nick Soetaert

 Parent: RentPrice
 Child : N/A

*/

public class ThreePropRentPrice extends RentPrice {
    private int _onePropRent;
    private int _twoPropRent;
    private int _threePropRent;

    public ThreePropRentPrice(int onePropRent, int twoPropRent, int threePropRent){
	_propertyClass = 3;
        _onePropRent = onePropRent;
        _twoPropRent = twoPropRent;
        _threePropRent = threePropRent;
    }

    public int getRent(int numProp){
        if (numProp <= 0) return _noPropRent;
        else if (numProp == 1) return _onePropRent;
        else if (numProp == 2) return _twoPropRent;
	else return _threePropRent; //If >3 props, rent does not increase
    }
    
}
