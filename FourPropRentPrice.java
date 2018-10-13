/*
 Nick Soetaert

 Parent: RentPrice
 Child : N/A

*/

public class FourPropRentPrice extends RentPrice {
    private int _onePropRent;
    private int _twoPropRent;
    private int _threePropRent;
    private int _fourPropRent;

    public FourPropRentPrice(int onePropRent, int twoPropRent,
			     int threePropRent, int fourPropRent){
	_propertyClass = 4;
        _onePropRent = onePropRent;
        _twoPropRent = twoPropRent;
        _threePropRent = threePropRent;
        _fourPropRent = fourPropRent;
    }

    public int getRent(int numProp){
        if (numProp <= 0) return _noPropRent;
        else if (numProp == 1) return _onePropRent;
        else if (numProp == 2) return _twoPropRent;
        else if (numProp == 3) return _threePropRent; 
	else return _fourPropRent; //If >4 props, rent does not increase
    }
}
