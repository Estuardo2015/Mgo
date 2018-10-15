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
    public NormalPropertyCard(PropertyColor color){

	propertyColors.add(color);  //Record the card's color, regardless of color
	_canPutInBank = false;	//No NormalPropertyCard can be banked

	switch (color):
	case BROWN:
	    _name = "Brown Property Card";
	    _vale = 1;
	    break;
	case :
	    _name = ;
	    _value = ;
	    break;	
	    
    }

    public getColor(){
	return <F8> 

//todo: Create switch statement for every single property (ugh...)
//include:
/*
 -name
 -value
 -canBank (always no - put before switch statement)
*/
    }
}
