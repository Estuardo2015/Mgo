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
        if(color1 == PropertyColor.BLUE || color2 == PropertyColor.BLUE){
            _name = "Blue/Green Property Wild Card";
            _value = 4;
        } else if (color1 == PropertyColor.BROWN || color2 == PropertyColor.BROWN){
	    _name = "Light Blue/Brown Property Wild Card";
	    _value = 1;
        } else if (color1 == PropertyColor.ORANGE || color2 == PropertyColor.ORANGE){
	    _name = "Orange/Pink Property Wild Card";
	    _value = 2;
        } else if (color1 == PropertyColor.GREEN || color2 == PropertyColor.GREEN){
	    _name = "Green/Rail Property Wild Card";
	    _value = 4;
	    //we're leaving out light blue/rail
        } else if (color1 == PropertyColor.UTIL || color2 == PropertyColor.UTIL){
	    _name = "Rail/Util Property Wild Card";
	    _value = 2;
        } else if (color1 == PropertyColor.YELLOW || color2 == PropertyColor.YELLOW){
	    _name = "Yellow/Red Property Wild Card";
	    _value = 3;
        } else {
	    System.out.println("WildPropertyCard.java: Trying to create bad prop wild card.");
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

