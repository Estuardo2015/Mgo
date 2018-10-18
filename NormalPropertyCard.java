/*
 Nick Soetaert
 October 10, 2018

 NormalPropertyCard.java

 Parent: PropertyCard
 Children: N/A
*/

public class NormalPropertyCard extends PropertyCard {
    //Pre: A card color is given. All cards of same color are same.
    //Post: A card is constructed with proper value
    public NormalPropertyCard(Property name){

	_canPutInBank = false;	//No NormalPropertyCard can be banked

	switch (name){
	case BALTIC_AVE:
	    _name = "Baltic Ave";
	    _value = 1;
	    currColor = PropertyColor.BROWN;
	    break;
	case BOARDWALK:
	    _name = "Boardwalk";
	    _value = 30;
	    currColor = PropertyColor.BLUE;
	    break;	
	}	    
    }

//    public getColor(){ 

//todo: Create switch statement for every single property (ugh...)
//include:
/*
 -name
 -value
 -canBank (always no - put before switch statement)
*/
//    }
}
