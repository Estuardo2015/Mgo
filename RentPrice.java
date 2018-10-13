/*
 Nick Soetaert

 A general-purpose abstract class for storing the rent prices at for
 various PropertySets with varying amounts of properties
*/

//Parents: 	N/A
//Child:	TwoPropRentPrice, ThreePropRentPrice, FourPropRentPrice

public abstract class RentPrice {
    protected int _propertyClass; //2 for TwoProp, 3 for ThreeProp, etc.
    protected final int _noPropRent = 0; //Any set w/ 0 properties has 0 rent

    public int getRent(int numProp){
	return 0;
    }

    public int getPropertyClass(){
	return _propertyClass;
    }
}


