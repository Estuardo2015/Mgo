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

	_canPutInBank = false;	//No NormalPropertyCard can be banked

	switch (color){
	case BROWN:
	    _name = "Brown Property Card";
	    _value = 1;
	    currColor = PropertyColor.BROWN;
	    break;
	case LIGHT_BLUE:
	    _name = "Light Blue Property Card";
	    _value = 1;
	    currColor = PropertyColor.LIGHT_BLUE;
	    break;	
	case PINK:
	    _name = "Pink Property Card";
	    _value = 2;
	    currColor = PropertyColor.PINK;
	    break;	
	case ORANGE:
	    _name = "Orange Property Card";
	    _value = 2;
	    currColor = PropertyColor.ORANGE;
	    break;	
	case RED:
	    _name = "Red Property Card";
	    _value = 3;
	    currColor = PropertyColor.RED;
	    break;	
	case YELLOW:
	    _name = "Yellow Property Card";
	    _value = 3;
	    currColor = PropertyColor.YELLOW;
	    break;	
	case GREEN:
	    _name = "Green Property Card";
	    _value = 4;
	    currColor = PropertyColor.GREEN;
	    break;	
	case BLUE:
	    _name = "Blue Property Card";
	    _value = 4;
	    currColor = PropertyColor.BLUE;
	    break;	
	case RAIL:
	    _name = "Railroad Property Card";
	    _value = 1;
	    currColor = PropertyColor.RAIL;
	    break;
	case UTIL:
	    _name = "Utility Property Card";
	    _value = 2;
	    currColor = PropertyColor.UTIL;
	    break;
	}	    
    }
}
