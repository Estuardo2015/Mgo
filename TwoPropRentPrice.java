/*
 Nick Soetaert

 Class for storing rent prices of property types that require
 two for a complete set (blue, brown, util)

Parent: RentPrice
Child:  N/A
*/

public class TwoPropRentPrice implements RentPrice { 
    private int[] prices = new int[4];
	//Pre: The color of a PropertySet is passed
	//Post: rent prices for length two PropertySets is declared.
    public TwoPropRentPrice(PropertyColor color){
	//The Great Switch Statement.
	//Thanks to vim, the creation of this was relatively painless.
	switch (color) {
	case BROWN:
	    prices[0] = 1;
	    prices[1] = 2;
	    prices[2] = prices[1] + 3; //With house
	    prices[3] = prices[7] + 7; //With house + hotel
	    break;

	case LIGHT_BLUE:
	    prices[0] = 1;
	    prices[1] = 2;
	    prices[2] = 3;
	    prices[3] = prices[2] + 3;  //house
	    prices[4] = prices[2] + 7;  //house + hotel
	    break;

	case PINK:
	    prices[0] = 1;
	    prices[1] = 2;
	    prices[2] = 4;
	    prices[3] = prices[2] + 3;  //house
	    prices[4] = prices[2] + 7;  //house + hotel    prices[4] = ;  //house + hotel
    break;

	case ORANGE:
	    prices[0] = 1;
	    prices[1] = 3;
	    prices[2] = 5;
	    prices[3] = prices[2] + 3;  //house
	    prices[4] = prices[2] + 7;  //house + hotel    prices[4] = ;  //house + hotel
	    break;
	   

	case RED:
	    prices[0] = 2;
	    prices[1] = 3;
	    prices[2] = 6;
	    prices[3] = prices[2] + 3;  //house
	    prices[4] = prices[2] + 7;  //house + hotel
	    break;
   
	case YELLOW:
	    prices[0] = 2;
	    prices[1] = 4;
	    prices[2] = 6;
	    prices[3] = prices[2] + 3;  //house
	    prices[4] = prices[2] + 7;  //house + hotel
	    break;

	case GREEN:
	    prices[0] = 2;
	    prices[1] = 4;
	    prices[2] = 7;
	    prices[3] = prices[2] + 3;  //house
	    prices[4] = prices[2] + 7;  //house + hotel
	    break;

	case BLUE:
	    prices[0] = 3;
	    prices[1] = 8;
	    prices[2] = prices[1] + 3; //house
	    prices[3] = prices[2] + 7; //house + hotel
	    break;

	//Rail and Util. NO HOUSES/HOTELS
	case BLACK:
            prices[0] = 1;
	    prices[1] = 2;
	    prices[2] = 3;
	    prices[3] = 4; 
	    break;

}
   }


	//Pre: Number of cards in set is passed
	//Post: Rent amount for given set is returned
    public int getRent(int numCards){
	return prices[numCards]
    }
}




