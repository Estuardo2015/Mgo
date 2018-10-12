/*
 Nick Soetaert

 A general-purpose class for storing the rent prices at for
 various PropertySets with varying amounts of properties
*/


/*
	Idea/todo:
	Create a subclass for 2, 3, and 4 property sets.
	That way 5 cards in a set won't throw an error.
*/
public class RentPrice {
    private int _onePropRent;
    private int _twoPropRent;
    private int _threePropRent;
    private int _fourPropRent;

    //Args: Rent prices at each property enumeration
    public RentPrice(int onePropRent, int twoPropRent){
	_onePropRent = onePropRent;
	_twoPropRent = twoPropRent; //if more cards exist, rent is same
    }

    public RentPrice(int onePropRent, int twoPropRent, int threePropRent){
	_onePropRent = onePropRent;
	_twoPropRent = twoPropRent;
	_threePropRent = threePropRent;
    }

    public RentPrice(int onePropRent, int twoPropRent, int threePropRent, int fourPropRent){
	_onePropRent = onePropRent;
	_twoPropRent = twoPropRent;
	_threePropRent = threePropRent;
	_fourPropRent = fourPropRent;
    }

    public int getRent(int numProp){
	int toReturn = 0;
	switch(numProp){
	    case 1: toReturn = _onePropRent;
		break;
	    case 2: toReturn = _twoPropRent;
		break;
	    case 3: toReturn = _threePropRent;
		break;
	    case 4: toReturn = _fourPropRent;
		break;
	}

	return toReturn;
    }

}


