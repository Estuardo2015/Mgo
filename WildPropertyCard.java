/*
 Nick Soetaert
 October 27, 2018

 WildPropertyCard.java

 Parent: PropertyCard
 Children: N/A
*/
import java.util.Set;
import java.util.HashSet;

public class WildPropertyCard extends PropertyCard {

    public Set<PropertyColor> colors = new HashSet<>();

	//Pre: Two distinct card colors are given.
	//Post: A wild propertycard is constructed.
    public WildPropertyCard(PropertyColor color1, PropertyColor color2){

	_canPutInBank = true;

	colors.add(color1);
	colors.add(color2);

	//currColor stays null until played
        if(colors.contains(PropertyColor.BLUE) &&
	   colors.contains(PropertyColor.GREEN)){
            _name = "Blue/Green Property Wild Card";
            _value = 4;
        } 
	else if (colors.contains(PropertyColor.BROWN) &&
		 colors.contains(PropertyColor.BLUE)){
	    _name = "Light Blue/Brown Property Wild Card";
	    _value = 1;
        } 
	else if (colors.contains(PropertyColor.ORANGE) &&
		 colors.contains(PropertyColor.PINK)){
	    _name = "Orange/Pink Property Wild Card";
	    _value = 2;
        } 
	else if (colors.contains(PropertyColor.GREEN) && 
		 colors.contains(PropertyColor.RAIL)){
	    _name = "Green/Rail Property Wild Card";
	    _value = 4;
        }
	else if (colors.contains(PropertyColor.LIGHT_BLUE) && 
		 colors.contains(PropertyColor.RAIL)){
	    _name = "Light Blue/Rail Property Wild Card";
	    _value = 4;
	}
	else if (colors.contains(PropertyColor.RAIL) &&
		 colors.contains(PropertyColor.UTIL)){
	    _name = "Rail/Util Property Wild Card";
	    _value = 2;
        }
	else if (colors.contains(PropertyColor.YELLOW) &&
		 colors.contains(PropertyColor.RED)){
	    _name = "Yellow/Red Property Wild Card";
	    _value = 3;
        }
	else {
	    System.out.println("ERROR - Trying to create a bad property wild card.");
        }
    }

    public void setCurrColor(PropertyColor c){
	if(colors.contains(c)){
	    currColor = c;
	} else {
	    System.out.println("WildPropertyCard: Card does not contain color " + c);
	}
    }
}

